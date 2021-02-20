package typings.requireDir

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("require-dir", JSImport.Namespace)
  @js.native
  def apply(directory: String): StringDictionary[js.Any] = js.native
  @JSImport("require-dir", JSImport.Namespace)
  @js.native
  def apply(directory: String, options: options): StringDictionary[js.Any] = js.native
  
  @js.native
  trait options extends StObject {
    
    var duplicates: js.UndefOr[Boolean] = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    var filter: js.UndefOr[js.Any] = js.native
    
    var mapKey: js.UndefOr[js.Any] = js.native
    
    var mapValue: js.UndefOr[js.Any] = js.native
    
    var recurse: js.UndefOr[Boolean] = js.native
  }
  object options {
    
    @scala.inline
    def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit class optionsMutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuplicates(value: Boolean): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplicatesUndefined: Self = StObject.set(x, "duplicates", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setMapKey(value: js.Any): Self = StObject.set(x, "mapKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapKeyUndefined: Self = StObject.set(x, "mapKey", js.undefined)
      
      @scala.inline
      def setMapValue(value: js.Any): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapValueUndefined: Self = StObject.set(x, "mapValue", js.undefined)
      
      @scala.inline
      def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    }
  }
}
