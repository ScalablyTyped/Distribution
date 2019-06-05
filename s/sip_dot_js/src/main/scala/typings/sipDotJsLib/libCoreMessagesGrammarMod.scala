package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/grammar", JSImport.Namespace)
@js.native
object libCoreMessagesGrammarMod extends js.Object {
  @JSName("Grammar")
  @js.native
  object GrammarNs extends js.Object {
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    def URIParse(uri: java.lang.String): js.UndefOr[sipDotJsLib.libCoreMessagesUriMod.URI] = js.native
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    def nameAddrHeaderParse(nameAddrHeader: java.lang.String): js.UndefOr[sipDotJsLib.libCoreMessagesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    def parse(input: java.lang.String, startRule: java.lang.String): js.Any = js.native
  }
  
}

