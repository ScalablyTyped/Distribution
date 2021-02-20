package typings.smartystreetsJavascriptSdk.mod

import typings.smartystreetsJavascriptSdk.anon.AddressCount
import typings.smartystreetsJavascriptSdk.anon.Addresses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usExtract {
  
  @JSImport("smartystreets-javascript-sdk", "usExtract.Lookup")
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
  
  @JSImport("smartystreets-javascript-sdk", "usExtract.Result")
  @js.native
  class Result protected () extends StObject {
    def this(x: Addresses) = this()
    
    var addressees: js.Array[_] = js.native
    
    var meta: AddressCount = js.native
  }
}
