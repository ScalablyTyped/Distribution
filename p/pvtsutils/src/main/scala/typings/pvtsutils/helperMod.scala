package typings.pvtsutils

import typings.std.ArrayBuffer
import typings.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvtsutils/build/types/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def combine(buf: ArrayBuffer*): ArrayBuffer | SharedArrayBuffer = js.native
  def isEqual(bytes1: ArrayBuffer, bytes2: ArrayBuffer): Boolean = js.native
}

