package typings.setCookieParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("set-cookie-parser", "splitCookiesString")
@js.native
object splitCookiesString extends js.Object {
  
  /**
    * Set-Cookie header field-values are sometimes comma joined in one string. This splits them without choking on commas
    * that are within a single set-cookie field-value, such as in the Expires portion.
    * This is uncommon, but explicitly allowed - see https://tools.ietf.org/html/rfc2616#section-4.2
    * Node.js does this for every header *except* set-cookie - see https://github.com/nodejs/node/blob/d5e363b77ebaf1caf67cd7528224b651c86815c1/lib/_http_incoming.js#L128
    * React Native's fetch does this for *every* header, including set-cookie.
    * Based on: https://github.com/google/j2objc/commit/16820fdbc8f76ca0c33472810ce0cb03d20efe25
    * Credits to: https://github.com/tomball for original and https://github.com/chrusart for JavaScript implementation
    */
  def apply(): js.Array[String] = js.native
  def apply(input: String): js.Array[String] = js.native
  def apply(input: js.Array[String]): js.Array[String] = js.native
}
