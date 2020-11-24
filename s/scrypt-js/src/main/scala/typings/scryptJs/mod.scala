package typings.scryptJs

import typings.std.ArrayLike
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrypt-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def scrypt(
    password: ArrayLike[Double],
    salt: ArrayLike[Double],
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double
  ): js.Promise[Uint8Array] = js.native
  def scrypt(
    password: ArrayLike[Double],
    salt: ArrayLike[Double],
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    callback: ProgressCallback
  ): js.Promise[Uint8Array] = js.native
  
  def syncScrypt(
    password: ArrayLike[Double],
    salt: ArrayLike[Double],
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double
  ): Uint8Array = js.native
  
  type ProgressCallback = js.Function1[/* progress */ Double, Boolean | Unit]
}
