package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usAutocomplete {
  
  @JSImport("smartystreets-javascript-sdk", "usAutocomplete.Lookup")
  @js.native
  class Lookup protected ()
    extends StObject
       with typings.smartystreetsJavascriptSdk.mod.core.Lookup {
    def this(prefix: String) = this()
    
    var cityFilter: js.Array[js.Any] = js.native
    
    var geolocate: js.Any = js.native
    
    var geolocatePrecision: js.Any = js.native
    
    var maxSuggestions: Double = js.native
    
    var prefer: js.Array[js.Any] = js.native
    
    var preferRatio: js.Any = js.native
    
    var prefix: String = js.native
    
    var result: js.Array[js.Any] = js.native
    
    var stateFilter: js.Array[js.Any] = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usAutocomplete.Suggestion")
  @js.native
  class Suggestion protected () extends StObject {
    def this(responseData: js.Any) = this()
    
    var city: String = js.native
    
    var state: String = js.native
    
    var streetLine: String = js.native
    
    var text: String = js.native
  }
}
