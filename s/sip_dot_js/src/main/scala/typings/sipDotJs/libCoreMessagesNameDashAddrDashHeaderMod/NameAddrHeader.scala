package typings.sipDotJs.libCoreMessagesNameDashAddrDashHeaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.sipDotJs.libCoreMessagesParametersMod.Parameters
import typings.sipDotJs.libCoreMessagesUriMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/name-addr-header", "NameAddrHeader")
@js.native
class NameAddrHeader protected () extends Parameters {
  /**
    * Constructor
    * @param uri -
    * @param displayName -
    * @param parameters -
    */
  def this(uri: URI, displayName: String, parameters: StringDictionary[String]) = this()
  var _displayName: js.Any = js.native
  var displayName: String = js.native
  val friendlyName: String = js.native
  var uri: URI = js.native
}

