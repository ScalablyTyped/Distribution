package typings.reactSelect.distDeclarationsSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupBase[Option] extends StObject {
  
  val label: js.UndefOr[String] = js.undefined
  
  val options: js.Array[Option]
}
object GroupBase {
  
  inline def apply[Option](options: js.Array[Option]): GroupBase[Option] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupBase[Option]]
  }
  
  extension [Self <: GroupBase[?], Option](x: Self & GroupBase[Option]) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
