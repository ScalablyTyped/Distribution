package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asset extends StObject {
  
  def alphaNum12(): AssetAlphaNum12 = js.native
  def alphaNum12(value: AssetAlphaNum12): AssetAlphaNum12 = js.native
  
  def alphaNum4(): AssetAlphaNum4 = js.native
  def alphaNum4(value: AssetAlphaNum4): AssetAlphaNum4 = js.native
  
  def switch(): AssetType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): AssetAlphaNum4 | AssetAlphaNum12 | Unit = js.native
}
