package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Grammar")
@js.native
object GrammarNs extends js.Object {
  /**
    * Parse the given string and returns a SIP.URI instance or undefined if
    * it is an invalid URI.
    * @public
    * @param {String} uri
    */
  def URIParse(uri: java.lang.String): js.UndefOr[sipDotJsLib.libURIMod.URI] = js.native
  /**
    * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
    * it is an invalid NameAddrHeader.
    * @public
    * @param {String} name_addr_header
    */
  def nameAddrHeaderParse(nameAddrHeader: java.lang.String): js.UndefOr[sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader] = js.native
  def parse(input: java.lang.String, startRule: java.lang.String): js.Any = js.native
}

