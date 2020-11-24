package typings.rusha.mod

import typings.node.Buffer
import typings.rusha.rushaStrings.hex
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends js.Object {
  
  def digest(encoding: js.UndefOr[scala.Nothing]): ArrayBuffer = js.native
  @JSName("digest")
  def digest_hex(encoding: hex): String = js.native
  
  def update(value: String): Hash = js.native
  def update(value: js.Array[Double]): Hash = js.native
  def update(value: Buffer): Hash = js.native
  def update(value: ArrayBuffer): Hash = js.native
}
