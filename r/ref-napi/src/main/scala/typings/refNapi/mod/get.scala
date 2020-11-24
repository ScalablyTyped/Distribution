package typings.refNapi.mod

import typings.refNapi.mod.global.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ref-napi", "get")
@js.native
object get extends js.Object {
  
  def apply(buffer: Buffer): js.Any = js.native
  def apply(buffer: Buffer, offset: js.UndefOr[scala.Nothing], `type`: String): js.Any = js.native
  def apply(buffer: Buffer, offset: js.UndefOr[scala.Nothing], `type`: Type): js.Any = js.native
  def apply(buffer: Buffer, offset: Double): js.Any = js.native
  def apply(buffer: Buffer, offset: Double, `type`: String): js.Any = js.native
  def apply(buffer: Buffer, offset: Double, `type`: Type): js.Any = js.native
}
