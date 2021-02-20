package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseStrings.passiveFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferEntryFlags extends StObject {
  
  val name: passiveFlag = js.native
  
  val value: `1` = js.native
}
object OfferEntryFlags {
  
  @scala.inline
  def apply(name: passiveFlag, value: `1`): OfferEntryFlags = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferEntryFlags]
  }
  
  @scala.inline
  implicit class OfferEntryFlagsMutableBuilder[Self <: OfferEntryFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: passiveFlag): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
