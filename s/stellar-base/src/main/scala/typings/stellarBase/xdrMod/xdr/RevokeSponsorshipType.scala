package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseStrings.revokeSponsorshipLedgerEntry
import typings.stellarBase.stellarBaseStrings.revokeSponsorshipSigner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSponsorshipType extends StObject {
  
  val name: revokeSponsorshipLedgerEntry | revokeSponsorshipSigner = js.native
  
  val value: `0` | `1` = js.native
}
object RevokeSponsorshipType {
  
  @scala.inline
  def apply(name: revokeSponsorshipLedgerEntry | revokeSponsorshipSigner, value: `0` | `1`): RevokeSponsorshipType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSponsorshipType]
  }
  
  @scala.inline
  implicit class RevokeSponsorshipTypeMutableBuilder[Self <: RevokeSponsorshipType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: revokeSponsorshipLedgerEntry | revokeSponsorshipSigner): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
