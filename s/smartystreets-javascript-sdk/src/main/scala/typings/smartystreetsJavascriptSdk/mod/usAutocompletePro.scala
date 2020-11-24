package typings.smartystreetsJavascriptSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "usAutocompletePro")
@js.native
object usAutocompletePro extends js.Object {
  
  @js.native
  class Lookup protected ()
    extends typings.smartystreetsJavascriptSdk.mod.core.Lookup {
    def this(search: String) = this()
    
    var excludeStates: js.Array[_] = js.native
    
    var includeOnlyCities: js.Array[_] = js.native
    
    var includeOnlyStates: js.Array[_] = js.native
    
    var includeOnlyZIPCodes: js.Array[_] = js.native
    
    var maxResults: Double = js.native
    
    var preferCities: js.Array[_] = js.native
    
    var preferGeolocation: js.Any = js.native
    
    var preferRatio: js.Any = js.native
    
    var preferStates: js.Array[_] = js.native
    
    var preferZIPCodes: js.Array[_] = js.native
    
    var result: js.Array[_] = js.native
    
    var search: String = js.native
    
    var selected: js.Any = js.native
  }
  
  @js.native
  class Suggestion protected () extends js.Object {
    def this(responseData: js.Any) = this()
    
    var city: String = js.native
    
    var entries: Double = js.native
    
    var secondary: String = js.native
    
    var state: String = js.native
    
    var streetLine: String = js.native
    
    var zipcode: String = js.native
  }
}
