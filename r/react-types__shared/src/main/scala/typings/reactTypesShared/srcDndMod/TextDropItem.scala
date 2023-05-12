package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.text
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDropItem
  extends StObject
     with DropItem {
  
  /** Returns the data for the given type as a string. */
  def getText(`type`: String): js.Promise[String]
  
  /** The item kind. */
  var kind: text
  
  /**
    * The drag types available for this item.
    * These are often mime types, but may be custom app-specific types.
    */
  var types: Set[String]
}
object TextDropItem {
  
  inline def apply(getText: String => js.Promise[String], types: Set[String]): TextDropItem = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction1(getText), kind = "text", types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDropItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDropItem] (val x: Self) extends AnyVal {
    
    inline def setGetText(value: String => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
    
    inline def setKind(value: text): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: Set[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
