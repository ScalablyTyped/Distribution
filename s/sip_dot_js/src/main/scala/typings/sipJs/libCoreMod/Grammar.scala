package typings.sipJs.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grammar {
  
  @JSImport("sip.js/lib/core", "Grammar")
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
