package typings.retextEquality

import typings.retextEquality.retextEqualityStrings.basic
import typings.retextEquality.retextEqualityStrings.or
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEnMod {
  
  @JSImport("retext-equality/lib/en", "patterns")
  @js.native
  val patterns: js.Array[Pattern] = js.native
  
  trait Pattern extends StObject {
    
    var apostrophe: js.UndefOr[Boolean] = js.undefined
    
    var categories: js.Array[String]
    
    var condition: js.UndefOr[String] = js.undefined
    
    var considerate: js.UndefOr[Record[String, String]] = js.undefined
    
    var id: String
    
    var inconsiderate: Record[String, String]
    
    var note: js.UndefOr[String] = js.undefined
    
    var `type`: or | basic
  }
  object Pattern {
    
    inline def apply(
      categories: js.Array[String],
      id: String,
      inconsiderate: Record[String, String],
      `type`: or | basic
    ): Pattern = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inconsiderate = inconsiderate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setApostrophe(value: Boolean): Self = StObject.set(x, "apostrophe", value.asInstanceOf[js.Any])
      
      inline def setApostropheUndefined: Self = StObject.set(x, "apostrophe", js.undefined)
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setConsiderate(value: Record[String, String]): Self = StObject.set(x, "considerate", value.asInstanceOf[js.Any])
      
      inline def setConsiderateUndefined: Self = StObject.set(x, "considerate", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInconsiderate(value: Record[String, String]): Self = StObject.set(x, "inconsiderate", value.asInstanceOf[js.Any])
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      
      inline def setType(value: or | basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
