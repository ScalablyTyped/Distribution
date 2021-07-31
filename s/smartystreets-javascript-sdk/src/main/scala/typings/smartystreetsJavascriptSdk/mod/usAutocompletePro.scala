package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usAutocompletePro {
  
  @JSImport("smartystreets-javascript-sdk", "usAutocompletePro.Lookup")
  @js.native
  class Lookup protected ()
    extends StObject
       with typings.smartystreetsJavascriptSdk.mod.core.Lookup {
    def this(search: String) = this()
    
    var excludeStates: js.Array[js.Any] = js.native
    
    var includeOnlyCities: js.Array[js.Any] = js.native
    
    var includeOnlyStates: js.Array[js.Any] = js.native
    
    var includeOnlyZIPCodes: js.Array[js.Any] = js.native
    
    var maxResults: Double = js.native
    
    var preferCities: js.Array[js.Any] = js.native
    
    var preferGeolocation: js.Any = js.native
    
    var preferRatio: js.Any = js.native
    
    var preferStates: js.Array[js.Any] = js.native
    
    var preferZIPCodes: js.Array[js.Any] = js.native
    
    var result: js.Array[js.Any] = js.native
    
    var search: String = js.native
    
    var selected: js.Any = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usAutocompletePro.Suggestion")
  @js.native
  class Suggestion protected () extends StObject {
    def this(responseData: js.Any) = this()
    
    var city: String = js.native
    
    var entries: Double = js.native
    
    var secondary: String = js.native
    
    var state: String = js.native
    
    var streetLine: String = js.native
    
    var zipcode: String = js.native
  }
}
