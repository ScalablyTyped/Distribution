package typings.sourceMapSupport.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-map-support", "getErrorSource")
@js.native
object getErrorSource extends js.Object {
  def apply(error: Error): String | Null = js.native
}

