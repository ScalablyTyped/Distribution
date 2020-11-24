package typings.smartystreetsJavascriptSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "internationalStreet")
@js.native
object internationalStreet extends js.Object {
  
  @js.native
  class Candidate protected () extends js.Object {
    def this(reponseData: js.Any) = this()
    
    var address1: String = js.native
    
    var address10: String = js.native
    
    var address11: String = js.native
    
    var address12: String = js.native
    
    var address2: String = js.native
    
    var address3: String = js.native
    
    var address4: String = js.native
    
    var address5: String = js.native
    
    var address6: String = js.native
    
    var address7: String = js.native
    
    var address8: String = js.native
    
    var address9: String = js.native
    
    var analysis: js.Any = js.native
    
    var components: js.Any = js.native
    
    var metadata: js.Any = js.native
    
    var organization: String = js.native
  }
  
  @js.native
  class Lookup protected ()
    extends typings.smartystreetsJavascriptSdk.mod.core.Lookup {
    def this(country: String, freeform: String) = this()
    
    var address1: String = js.native
    
    var address2: String = js.native
    
    var address3: String = js.native
    
    var address4: String = js.native
    
    var administrativeArea: String = js.native
    
    var country: String = js.native
    
    val ensureEnoughInfo: Boolean = js.native
    
    val ensureValidData: Boolean = js.native
    
    var freeform: String = js.native
    
    var geocode: String = js.native
    
    var inputId: String = js.native
    
    var language: String = js.native
    
    var locality: String = js.native
    
    var organization: String = js.native
    
    var postalCode: String = js.native
    
    var result: js.Array[_] = js.native
  }
}
