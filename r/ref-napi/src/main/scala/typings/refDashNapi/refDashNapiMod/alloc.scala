package typings.refDashNapi.refDashNapiMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-napi", "alloc")
@js.native
object alloc extends js.Object {
  def apply(`type`: String): Buffer = js.native
  def apply(`type`: String, value: js.Any): Buffer = js.native
  def apply(`type`: Type): Buffer = js.native
  def apply(`type`: Type, value: js.Any): Buffer = js.native
}

