package typings.storybookPreviewWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgNames extends StObject {
  
  var argNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var storyId: String
}
object ArgNames {
  
  inline def apply(storyId: String): ArgNames = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgNames] (val x: Self) extends AnyVal {
    
    inline def setArgNames(value: js.Array[String]): Self = StObject.set(x, "argNames", value.asInstanceOf[js.Any])
    
    inline def setArgNamesUndefined: Self = StObject.set(x, "argNames", js.undefined)
    
    inline def setArgNamesVarargs(value: String*): Self = StObject.set(x, "argNames", js.Array(value*))
    
    inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
  }
}
