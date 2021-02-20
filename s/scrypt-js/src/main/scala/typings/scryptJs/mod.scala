package typings.scryptJs

import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scrypt-js", "scrypt")
  @js.native
  def scrypt(
    password: ArrayLike[Double],
    salt: ArrayLike[Double],
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double
  ): js.Promise[Uint8Array] = js.native
  @JSImport("scrypt-js", "scrypt")
  @js.native
  def scrypt(
    password: ArrayLike[Double],
    salt: ArrayLike[Double],
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    callback: ProgressCallback
  ): js.Promise[Uint8Array] = js.native
  
  @JSImport("scrypt-js", "syncScrypt")
  @js.native
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
