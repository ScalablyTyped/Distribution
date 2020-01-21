package typings.scryptsy

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scryptsy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(key: String, salt: String, N: Double, r: Double, p: Double, dkLen: Double): Buffer = js.native
  def apply(
    key: String,
    salt: String,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ AnonCurrent, Unit]
  ): Buffer = js.native
  def apply(key: String, salt: Buffer, N: Double, r: Double, p: Double, dkLen: Double): Buffer = js.native
  def apply(
    key: String,
    salt: Buffer,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ AnonCurrent, Unit]
  ): Buffer = js.native
  def apply(key: Buffer, salt: String, N: Double, r: Double, p: Double, dkLen: Double): Buffer = js.native
  def apply(
    key: Buffer,
    salt: String,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ AnonCurrent, Unit]
  ): Buffer = js.native
  def apply(key: Buffer, salt: Buffer, N: Double, r: Double, p: Double, dkLen: Double): Buffer = js.native
  def apply(
    key: Buffer,
    salt: Buffer,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ AnonCurrent, Unit]
  ): Buffer = js.native
}

