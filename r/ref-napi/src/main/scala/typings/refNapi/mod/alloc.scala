package typings.refNapi.mod

import typings.refNapi.mod.global.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ref-napi", "alloc")
@js.native
object alloc extends js.Object {
  
  def apply(`type`: String): Buffer = js.native
  def apply(`type`: String, value: js.Any): Buffer = js.native
  def apply(`type`: Type): Buffer = js.native
  def apply(`type`: Type, value: js.Any): Buffer = js.native
}
