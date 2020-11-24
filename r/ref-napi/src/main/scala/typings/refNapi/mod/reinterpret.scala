package typings.refNapi.mod

import typings.refNapi.mod.global.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ref-napi", "reinterpret")
@js.native
object reinterpret extends js.Object {
  
  def apply(buffer: Buffer, size: Double): Buffer = js.native
  def apply(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
}
