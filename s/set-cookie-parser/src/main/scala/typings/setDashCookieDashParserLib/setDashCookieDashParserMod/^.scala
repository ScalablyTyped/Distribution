package typings
package setDashCookieDashParserLib.setDashCookieDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("set-cookie-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: java.lang.String | js.Array[java.lang.String] | nodeLib.httpMod.IncomingMessage): js.Array[Cookie] = js.native
  def apply(
    input: java.lang.String | js.Array[java.lang.String] | nodeLib.httpMod.IncomingMessage,
    options: Options with setDashCookieDashParserLib.Anon_False
  ): js.Array[Cookie] = js.native
  def parse(input: java.lang.String): js.Array[Cookie] = js.native
  def parse(input: java.lang.String, options: Options with setDashCookieDashParserLib.Anon_False): js.Array[Cookie] = js.native
  def parse(input: js.Array[java.lang.String]): js.Array[Cookie] = js.native
  def parse(input: js.Array[java.lang.String], options: Options with setDashCookieDashParserLib.Anon_False): js.Array[Cookie] = js.native
  def parse(input: nodeLib.httpMod.IncomingMessage): js.Array[Cookie] = js.native
  def parse(
    input: nodeLib.httpMod.IncomingMessage,
    options: Options with setDashCookieDashParserLib.Anon_False
  ): js.Array[Cookie] = js.native
  @JSName("parse")
  def `parse_<union>`(input: java.lang.String): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def `parse_<union>`(input: java.lang.String, options: Options): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def `parse_<union>`(input: js.Array[java.lang.String]): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def `parse_<union>`(input: js.Array[java.lang.String], options: Options): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def `parse_<union>`(input: nodeLib.httpMod.IncomingMessage): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def `parse_<union>`(input: nodeLib.httpMod.IncomingMessage, options: Options): js.Array[Cookie] | CookieMap = js.native
  @JSName("parse")
  def parse_CookieMap(input: java.lang.String, options: Options with setDashCookieDashParserLib.Anon_Map): CookieMap = js.native
  @JSName("parse")
  def parse_CookieMap(input: js.Array[java.lang.String], options: Options with setDashCookieDashParserLib.Anon_Map): CookieMap = js.native
  @JSName("parse")
  def parse_CookieMap(input: nodeLib.httpMod.IncomingMessage, options: Options with setDashCookieDashParserLib.Anon_Map): CookieMap = js.native
  def splitCookiesString(input: java.lang.String): js.Array[java.lang.String] = js.native
  def splitCookiesString(input: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def splitCookiesString(input: scala.Unit): js.Array[java.lang.String] = js.native
}

