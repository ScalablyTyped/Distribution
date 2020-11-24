package typings.setCookieParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("set-cookie-parser", "parseString")
@js.native
object parseString extends js.Object {
  
  /**
    * Parses a single set-cookie header value string.
    * Options default is `{decodeValues: true}`. Used under-the-hood by `parse()`
    */
  def apply(individualSetCookieHeader: String): Cookie = js.native
  def apply(individualSetCookieHeader: String, options: Options): Cookie = js.native
}
