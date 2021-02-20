package typings.searchParams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("search-params/dist/utils", "getSearch")
  @js.native
  def getSearch(path: String): String = js.native
  
  @JSImport("search-params/dist/utils", "isSerialisable")
  @js.native
  def isSerialisable(`val`: js.Any): Boolean = js.native
  
  @JSImport("search-params/dist/utils", "parseName")
  @js.native
  def parseName(name: String): IParsedName = js.native
  
  @js.native
  trait IParsedName extends StObject {
    
    var hasBrackets: Boolean = js.native
    
    var name: String = js.native
  }
  object IParsedName {
    
    @scala.inline
    def apply(hasBrackets: Boolean, name: String): IParsedName = {
      val __obj = js.Dynamic.literal(hasBrackets = hasBrackets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedName]
    }
    
    @scala.inline
    implicit class IParsedNameMutableBuilder[Self <: IParsedName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasBrackets(value: Boolean): Self = StObject.set(x, "hasBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
