package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyBag
  extends StObject
     with /**
  * Additional Properties
  */
/* key */ StringDictionary[js.Any] {
  
  /**
    * A set of distinct strings that provide additional information.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object PropertyBag {
  
  inline def apply(): PropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyBag]
  }
  
  extension [Self <: PropertyBag](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
