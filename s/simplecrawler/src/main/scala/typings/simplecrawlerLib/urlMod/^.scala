package typings
package simplecrawlerLib.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def domainToASCII(domain: java.lang.String): java.lang.String = js.native
  def domainToUnicode(domain: java.lang.String): java.lang.String = js.native
  def format(URL: URL): java.lang.String = js.native
  def format(URL: URL, options: URLFormatOptions): java.lang.String = js.native
  def format(urlObject: java.lang.String): java.lang.String = js.native
  def format(urlObject: UrlObject): java.lang.String = js.native
  def parse(urlStr: java.lang.String): Url = js.native
  def parse(urlStr: java.lang.String, parseQueryString: scala.Boolean): Url = js.native
  def parse(urlStr: java.lang.String, parseQueryString: scala.Boolean, slashesDenoteHost: scala.Boolean): Url = js.native
  def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
}

