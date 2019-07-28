package typings.setDashCookieDashParser.setDashCookieDashParserMod

import typings.node.httpMod.IncomingMessage
import typings.setDashCookieDashParser.Anon_False
import typings.setDashCookieDashParser.Anon_Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("set-cookie-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: String | js.Array[String] | IncomingMessage): js.Array[Cookie] = js.native
  def apply(input: String | js.Array[String] | IncomingMessage, options: Options with Anon_False): js.Array[Cookie] = js.native
  def parse(input: String): js.Array[Cookie] = js.native
  def parse(input: String, options: Options with Anon_False): js.Array[Cookie] = js.native
  def parse(input: js.Array[String]): js.Array[Cookie] = js.native
  def parse(input: js.Array[String], options: Options with Anon_False): js.Array[Cookie] = js.native
  def parse(input: IncomingMessage): js.Array[Cookie] = js.native
  def parse(input: IncomingMessage, options: Options with Anon_False): js.Array[Cookie] = js.native
  @JSName("parse")
  def parse_CookieMap(input: String, options: Options with Anon_Map): CookieMap = js.native
  @JSName("parse")
  def parse_CookieMap(input: js.Array[String], options: Options with Anon_Map): CookieMap = js.native
  @JSName("parse")
  def parse_CookieMap(input: IncomingMessage, options: Options with Anon_Map): CookieMap = js.native
  @JSName("parse")
  def parse_Union(input: String): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def parse_Union(input: String, options: Options): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def parse_Union(input: js.Array[String]): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def parse_Union(input: js.Array[String], options: Options): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def parse_Union(input: IncomingMessage): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def parse_Union(input: IncomingMessage, options: Options): js.Array[Cookie] | CookieMap = js.native
  def splitCookiesString(input: String): js.Array[String] = js.native
  def splitCookiesString(input: js.Array[String]): js.Array[String] = js.native
  def splitCookiesString(input: Unit): js.Array[String] = js.native
}

