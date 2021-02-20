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
trait ManageOfferSuccessResult extends StObject {
  
  def offer(): ManageOfferSuccessResultOffer = js.native
  def offer(value: ManageOfferSuccessResultOffer): ManageOfferSuccessResultOffer = js.native
  
  def offersClaimed(): js.Array[ClaimOfferAtom] = js.native
  def offersClaimed(value: js.Array[ClaimOfferAtom]): js.Array[ClaimOfferAtom] = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
