package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grammarMod {
  
  object Grammar {
    
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    @JSImport("sip.js/lib/grammar", "Grammar.URIParse")
    @js.native
    def URIParse(uri: String): js.UndefOr[typings.sipJs.uriMod.URI] = js.native
    
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    @JSImport("sip.js/lib/grammar", "Grammar.nameAddrHeaderParse")
    @js.native
    def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typings.sipJs.nameAddrHeaderMod.NameAddrHeader] = js.native
    
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    @JSImport("sip.js/lib/grammar", "Grammar.parse")
    @js.native
    def parse(input: String, startRule: String): js.Any = js.native
  }
  
  @JSImport("sip.js/lib/grammar", "NameAddrHeader")
  @js.native
  class NameAddrHeader protected ()
    extends typings.sipJs.nameAddrHeaderMod.NameAddrHeader {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(uri: typings.sipJs.uriMod.URI, displayName: String, parameters: StringDictionary[String]) = this()
  }
  
  @JSImport("sip.js/lib/grammar", "Parameters")
  @js.native
  class Parameters protected ()
    extends typings.sipJs.parametersMod.Parameters {
    def this(parameters: StringDictionary[String]) = this()
  }
  
  @JSImport("sip.js/lib/grammar", "URI")
  @js.native
  class URI protected ()
    extends typings.sipJs.uriMod.URI {
    /**
      * Constructor
      * @param scheme -
      * @param user -
      * @param host -
      * @param port -
      * @param parameters -
      * @param headers -
      */
    def this(scheme: String, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: String, user: String, host: String, port: js.UndefOr[scala.Nothing], parameters: js.Any) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      headers: js.Any
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: js.UndefOr[scala.Nothing],
      parameters: js.Any,
      headers: js.Any
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: js.UndefOr[scala.Nothing],
      headers: js.Any
    ) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any, headers: js.Any) = this()
  }
}
