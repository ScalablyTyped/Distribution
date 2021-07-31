package typings.qhistory

import typings.history.mod.History
import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qhistory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    history: History[LocationState],
    stringify: js.Function1[/* query */ js.Object, String],
    parse: js.Function1[/* search */ String, js.Object]
  ): History[LocationState] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(history.asInstanceOf[js.Any], stringify.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[History[LocationState]]
  
  // augments the 'history' types when used
  /* augmented module */
  object historyAugmentingMod {
    
    trait Location extends StObject {
      
      // actually a complicated nested object/array system, but giving it a type
      // makes _actually_ using it (or even casting to a known structure) much harder.
      var query: js.Any
    }
    object Location {
      
      @scala.inline
      def apply(query: js.Any): Location = {
        val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
        __obj.asInstanceOf[Location]
      }
      
      @scala.inline
      implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      }
    }
    
    trait LocationDescriptorObject extends StObject {
      
      var query: js.UndefOr[js.Object] = js.undefined
    }
    object LocationDescriptorObject {
      
      @scala.inline
      def apply(): LocationDescriptorObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocationDescriptorObject]
      }
      
      @scala.inline
      implicit class LocationDescriptorObjectMutableBuilder[Self <: LocationDescriptorObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      }
    }
  }
}
