package typings.searchParams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("search-params/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSearch(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSearch")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isSerialisable(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSerialisable")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseName(name: String): IParsedName = ^.asInstanceOf[js.Dynamic].applyDynamic("parseName")(name.asInstanceOf[js.Any]).asInstanceOf[IParsedName]
  
  trait IParsedName extends StObject {
    
    var hasBrackets: Boolean
    
    var name: String
  }
  object IParsedName {
    
    inline def apply(hasBrackets: Boolean, name: String): IParsedName = {
      val __obj = js.Dynamic.literal(hasBrackets = hasBrackets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParsedName] (val x: Self) extends AnyVal {
      
      inline def setHasBrackets(value: Boolean): Self = StObject.set(x, "hasBrackets", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
