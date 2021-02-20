package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Character
  extends LeafNode
     with NodeBase
     with CharacterClassElement
     with QuantifiableElement {
  
  @JSName("parent")
  var parent_Character: Alternative | Quantifier | CharacterClass | CharacterClassRange = js.native
  
  @JSName("type")
  var type_Character: typings.regexpp.regexppStrings.Character = js.native
  
  var value: Double = js.native
}
object Character {
  
  @scala.inline
  def apply(
    end: Double,
    parent: Alternative | Quantifier | CharacterClass | CharacterClassRange,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Character,
    value: Double
  ): Character = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Character]
  }
  
  @scala.inline
  implicit class CharacterMutableBuilder[Self <: Character] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: Alternative | Quantifier | CharacterClass | CharacterClassRange): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Character): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
