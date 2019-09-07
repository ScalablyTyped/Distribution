package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sources/empty", JSImport.Namespace)
@js.native
object sourcesEmptyMod extends js.Object {
  /**
    * Create a stream with no contents (it just ends immediately).
    */
  def apply(): Source[scala.Nothing] = js.native
}

