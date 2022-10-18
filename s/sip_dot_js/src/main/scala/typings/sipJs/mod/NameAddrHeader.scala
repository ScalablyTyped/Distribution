package typings.sipJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "NameAddrHeader")
@js.native
open class NameAddrHeader protected ()
  extends typings.sipJs.libGrammarMod.NameAddrHeader {
  /**
    * Constructor
    * @param uri -
    * @param displayName -
    * @param parameters -
    */
  def this(uri: typings.sipJs.libGrammarUriMod.URI, displayName: String, parameters: StringDictionary[String]) = this()
}
