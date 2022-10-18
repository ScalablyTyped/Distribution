package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGrammarMod {
  
  @JSImport("sip.js/lib/grammar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Grammar {
    
    @JSImport("sip.js/lib/grammar", "Grammar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    inline def URIParse(uri: String): js.UndefOr[typings.sipJs.libGrammarUriMod.URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("URIParse")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.sipJs.libGrammarUriMod.URI]]
    
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    inline def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typings.sipJs.libGrammarNameAddrHeaderMod.NameAddrHeader] = ^.asInstanceOf[js.Dynamic].applyDynamic("nameAddrHeaderParse")(nameAddrHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.sipJs.libGrammarNameAddrHeaderMod.NameAddrHeader]]
    
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    inline def parse(input: String, startRule: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], startRule.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("sip.js/lib/grammar", "NameAddrHeader")
  @js.native
  open class NameAddrHeader protected ()
    extends typings.sipJs.libGrammarNameAddrHeaderMod.NameAddrHeader {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(uri: typings.sipJs.libGrammarUriMod.URI, displayName: String, parameters: StringDictionary[String]) = this()
  }
  
  @JSImport("sip.js/lib/grammar", "Parameters")
  @js.native
  open class Parameters protected ()
    extends typings.sipJs.libGrammarParametersMod.Parameters {
    def this(parameters: StringDictionary[js.UndefOr[String | Double | Null]]) = this()
  }
  
  @JSImport("sip.js/lib/grammar", "URI")
  @js.native
  open class URI protected ()
    extends typings.sipJs.libGrammarUriMod.URI {
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
    def this(scheme: Unit, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: Unit, user: String, host: String, port: Double) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Unit,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Double,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Unit,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
  }
  
  inline def equivalentURI(a: typings.sipJs.libGrammarUriMod.URI, b: typings.sipJs.libGrammarUriMod.URI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equivalentURI")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
