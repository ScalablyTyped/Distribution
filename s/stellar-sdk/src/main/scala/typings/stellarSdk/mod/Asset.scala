package typings.stellarSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Asset")
@js.native
class Asset protected ()
  extends typings.stellarBase.mod.Asset {
  def this(code: String) = this()
  def this(code: String, issuer: String) = this()
}
/* static members */
object Asset {
  
  @JSImport("stellar-sdk", "Asset.fromOperation")
  @js.native
  def fromOperation(xdr: typings.stellarBase.xdrMod.default.Asset): typings.stellarBase.mod.Asset = js.native
  
  @JSImport("stellar-sdk", "Asset.native")
  @js.native
  def native(): typings.stellarBase.mod.Asset = js.native
}
