package typings.pullStream

import typings.pullStream.mod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pull-stream/sources/count", JSImport.Namespace)
@js.native
object countMod extends js.Object {
  
  /**
    * Create a stream that outputs 0 ... `max`. By default, `max` = `Infinity`.
    */
  def apply(): Source[Double] = js.native
  def apply(max: Double): Source[Double] = js.native
}
