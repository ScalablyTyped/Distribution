package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import typings.sipJs.parametersMod.Parameters
import typings.sipJs.uriMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameAddrHeaderMod {
  
  @JSImport("sip.js/lib/grammar/name-addr-header", "NameAddrHeader")
  @js.native
  open class NameAddrHeader protected () extends Parameters {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(uri: URI, displayName: String, parameters: StringDictionary[String]) = this()
    
    /* private */ var _displayName: Any = js.native
    
    def displayName: String = js.native
    def displayName_=(value: String): Unit = js.native
    
    def friendlyName: String = js.native
    
    var uri: URI = js.native
  }
}
