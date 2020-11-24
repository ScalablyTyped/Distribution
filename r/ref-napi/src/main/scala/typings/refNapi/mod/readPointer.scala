package typings.refNapi.mod

import typings.refNapi.mod.global.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ref-napi", "readPointer")
@js.native
object readPointer extends js.Object {
  
  def apply(buffer: Buffer): Buffer = js.native
  def apply(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Buffer = js.native
  def apply(buffer: Buffer, offset: Double): Buffer = js.native
  def apply(buffer: Buffer, offset: Double, length: Double): Buffer = js.native
}
