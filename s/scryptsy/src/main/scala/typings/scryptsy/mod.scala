package typings.scryptsy

import typings.node.Buffer
import typings.scryptsy.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scryptsy", JSImport.Namespace)
  @js.native
  def apply(key: String, salt: String, N: Double, r: Double, p: Double, dkLen: Double): Buffer = js.native
  @JSImport("scryptsy", JSImport.Namespace)
  @js.native
  def apply(
    key: String,
    salt: String,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ Current, Unit]
  ): Buffer = js.native
  @JSImport("scryptsy", JSImport.Namespace)
  @js.native
  def apply(key: String, salt: Buffer, N: Double, r: Double, p: Double, dkLen: Double): Buffer = js.native
  @JSImport("scryptsy", JSImport.Namespace)
  @js.native
  def apply(
    key: String,
    salt: Buffer,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ Current, Unit]
  ): Buffer = js.native
  @JSImport("scryptsy", JSImport.Namespace)
  @js.native
  def apply(key: Buffer, salt: String, N: Double, r: Double, p: Double, dkLen: Double): Buffer = js.native
  @JSImport("scryptsy", JSImport.Namespace)
  @js.native
  def apply(
    key: Buffer,
    salt: String,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ Current, Unit]
  ): Buffer = js.native
  @JSImport("scryptsy", JSImport.Namespace)
  @js.native
  def apply(key: Buffer, salt: Buffer, N: Double, r: Double, p: Double, dkLen: Double): Buffer = js.native
  @JSImport("scryptsy", JSImport.Namespace)
  @js.native
  def apply(
    key: Buffer,
    salt: Buffer,
    N: Double,
    r: Double,
    p: Double,
    dkLen: Double,
    progressCallback: js.Function1[/* status */ Current, Unit]
  ): Buffer = js.native
}
