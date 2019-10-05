package typings.sipDotJs.sipDotJsMod.Core

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.NameAddrHeader")
@js.native
class NameAddrHeader protected ()
  extends typings.sipDotJs.libCoreMod.NameAddrHeader {
  /**
    * Constructor
    * @param uri -
    * @param displayName -
    * @param parameters -
    */
  def this(
    uri: typings.sipDotJs.libCoreMessagesUriMod.URI,
    displayName: String,
    parameters: StringDictionary[String]
  ) = this()
}

