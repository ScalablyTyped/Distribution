package typings
package sipDotJsLib.libCoreMessagesNameDashAddrDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/name-addr-header", "NameAddrHeader")
@js.native
class NameAddrHeader protected ()
  extends sipDotJsLib.libCoreMessagesParametersMod.Parameters {
  /**
    * Constructor
    * @param uri
    * @param displayName
    * @param parameters
    */
  def this(uri: sipDotJsLib.libCoreMessagesUriMod.URI, displayName: java.lang.String, parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  var _displayName: js.Any = js.native
  var displayName: java.lang.String = js.native
  val friendlyName: java.lang.String = js.native
  var uri: sipDotJsLib.libCoreMessagesUriMod.URI = js.native
}

