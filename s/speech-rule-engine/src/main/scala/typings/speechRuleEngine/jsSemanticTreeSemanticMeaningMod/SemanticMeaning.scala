package typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticMeaning extends StObject {
  
  var font: SemanticFont
  
  var role: SemanticRole
  
  var `type`: SemanticType
}
object SemanticMeaning {
  
  inline def apply(font: SemanticFont, role: SemanticRole, `type`: SemanticType): SemanticMeaning = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticMeaning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticMeaning] (val x: Self) extends AnyVal {
    
    inline def setFont(value: SemanticFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setRole(value: SemanticRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setType(value: SemanticType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
