package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseNumbers.`4`
import typings.stellarBase.stellarBaseNumbers.`5`
import typings.stellarBase.stellarBaseNumbers.`6`
import typings.stellarBase.stellarBaseStrings.envelopeTypeAuth
import typings.stellarBase.stellarBaseStrings.envelopeTypeOpId
import typings.stellarBase.stellarBaseStrings.envelopeTypeScp
import typings.stellarBase.stellarBaseStrings.envelopeTypeScpvalue
import typings.stellarBase.stellarBaseStrings.envelopeTypeTx
import typings.stellarBase.stellarBaseStrings.envelopeTypeTxFeeBump
import typings.stellarBase.stellarBaseStrings.envelopeTypeTxV0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeType extends StObject {
  
  val name: envelopeTypeTxV0 | envelopeTypeScp | envelopeTypeTx | envelopeTypeAuth | envelopeTypeScpvalue | envelopeTypeTxFeeBump | envelopeTypeOpId = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` | `5` | `6` = js.native
}
object EnvelopeType {
  
  @scala.inline
  def apply(
    name: envelopeTypeTxV0 | envelopeTypeScp | envelopeTypeTx | envelopeTypeAuth | envelopeTypeScpvalue | envelopeTypeTxFeeBump | envelopeTypeOpId,
    value: `0` | `1` | `2` | `3` | `4` | `5` | `6`
  ): EnvelopeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopeType]
  }
  
  @scala.inline
  implicit class EnvelopeTypeMutableBuilder[Self <: EnvelopeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: envelopeTypeTxV0 | envelopeTypeScp | envelopeTypeTx | envelopeTypeAuth | envelopeTypeScpvalue | envelopeTypeTxFeeBump | envelopeTypeOpId
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
