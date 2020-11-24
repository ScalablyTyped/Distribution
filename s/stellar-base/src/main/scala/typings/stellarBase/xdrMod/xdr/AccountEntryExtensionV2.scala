package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountEntryExtensionV2 extends js.Object {
  
  def ext(): AccountEntryExtensionV2Ext = js.native
  def ext(value: AccountEntryExtensionV2Ext): AccountEntryExtensionV2Ext = js.native
  
  def numSponsored(): Double = js.native
  def numSponsored(value: Double): Double = js.native
  
  def numSponsoring(): Double = js.native
  def numSponsoring(value: Double): Double = js.native
  
  def signerSponsoringIDs(): js.Array[SponsorshipDescriptor] = js.native
  def signerSponsoringIDs(value: js.Array[SponsorshipDescriptor]): js.Array[SponsorshipDescriptor] = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
