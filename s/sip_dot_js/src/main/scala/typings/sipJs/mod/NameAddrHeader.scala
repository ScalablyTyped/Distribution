package typings.sipJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "NameAddrHeader")
@js.native
class NameAddrHeader protected ()
  extends typings.sipJs.grammarMod.NameAddrHeader {
  /**
    * Constructor
    * @param uri -
    * @param displayName -
    * @param parameters -
    */
  def this(uri: typings.sipJs.uriMod.URI, displayName: String, parameters: StringDictionary[String]) = this()
}

