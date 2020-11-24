package typings.smartystreetsJavascriptSdk.mod

import typings.smartystreetsJavascriptSdk.anon.AddressCount
import typings.smartystreetsJavascriptSdk.anon.Addresses
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "usExtract")
@js.native
object usExtract extends js.Object {
  
  @js.native
  class Lookup protected ()
    extends typings.smartystreetsJavascriptSdk.mod.core.Lookup {
    def this(text: String) = this()
    
    var addressesHaveLineBreaks: js.Any = js.native
    
    var addressesPerLine: js.Any = js.native
    
    var aggressive: js.Any = js.native
    
    var html: js.Any = js.native
    
    var result: Addresses = js.native
    
    var text: String = js.native
  }
  
  @js.native
  class Result protected () extends js.Object {
    def this(x: Addresses) = this()
    
    var addressees: js.Array[_] = js.native
    
    var meta: AddressCount = js.native
  }
}
