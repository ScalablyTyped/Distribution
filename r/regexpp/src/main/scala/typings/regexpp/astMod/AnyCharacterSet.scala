package typings.regexpp.astMod

import typings.regexpp.regexppStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyCharacterSet
  extends CharacterSet
     with NodeBase {
  
  var kind: any = js.native
  
  @JSName("parent")
  var parent_AnyCharacterSet: Alternative | Quantifier = js.native
  
  @JSName("type")
  var type_AnyCharacterSet: typings.regexpp.regexppStrings.CharacterSet = js.native
}
object AnyCharacterSet {
  
  @scala.inline
  def apply(
    end: Double,
    kind: any,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet
  ): AnyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyCharacterSet]
  }
  
  @scala.inline
  implicit class AnyCharacterSetMutableBuilder[Self <: AnyCharacterSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: any): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.CharacterSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
