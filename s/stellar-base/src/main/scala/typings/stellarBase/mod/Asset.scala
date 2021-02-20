package typings.stellarBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "Asset")
@js.native
class Asset protected () extends StObject {
  def this(code: String) = this()
  def this(code: String, issuer: String) = this()
  
  var code: String = js.native
  
  def equals(other: Asset): Boolean = js.native
  
  def getAssetType(): AssetType = js.native
  
  def getCode(): String = js.native
  
  def getIssuer(): String = js.native
  
  def isNative(): Boolean = js.native
  
  var issuer: String = js.native
  
  def toXDRObject(): typings.stellarBase.xdrMod.default.Asset = js.native
}
/* static members */
object Asset {
  
  @JSImport("stellar-base", "Asset.fromOperation")
  @js.native
  def fromOperation(xdr: typings.stellarBase.xdrMod.default.Asset): Asset = js.native
  
  @JSImport("stellar-base", "Asset.native")
  @js.native
  def native(): Asset = js.native
}
