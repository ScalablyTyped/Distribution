package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Source
import typings.pullDashStream.pullDashStreamMod.Through
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/flatten", JSImport.Namespace)
@js.native
object throughsFlattenMod extends js.Object {
  /**
    * Turn a stream of streams or a stream of arrays into a stream of their items, (undoes group).
    */
  def apply[Out](): Through[js.Array[Out | Source[Out] | (Through[_, Out])], Out] = js.native
}

