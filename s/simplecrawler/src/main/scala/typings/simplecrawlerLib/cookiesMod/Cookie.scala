package typings
package simplecrawlerLib.cookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplecrawler/cookies", "Cookie")
@js.native
class Cookie protected () extends js.Object {
  def this(name: java.lang.String, value: java.lang.String, expires: java.lang.String) = this()
  def this(name: java.lang.String, value: java.lang.String, expires: scala.Double) = this()
  def this(name: java.lang.String, value: java.lang.String, expires: java.lang.String, path: java.lang.String) = this()
  def this(name: java.lang.String, value: java.lang.String, expires: scala.Double, path: java.lang.String) = this()
  def this(name: java.lang.String, value: java.lang.String, expires: java.lang.String, path: java.lang.String, domain: java.lang.String) = this()
  def this(name: java.lang.String, value: java.lang.String, expires: scala.Double, path: java.lang.String, domain: java.lang.String) = this()
  def this(name: java.lang.String, value: java.lang.String, expires: java.lang.String, path: java.lang.String, domain: java.lang.String, httponly: scala.Boolean) = this()
  def this(name: java.lang.String, value: java.lang.String, expires: scala.Double, path: java.lang.String, domain: java.lang.String, httponly: scala.Boolean) = this()
  var domain: js.UndefOr[java.lang.String] = js.native
  var expires: java.lang.String | scala.Double = js.native
  var httponly: js.UndefOr[scala.Boolean] = js.native
  var name: java.lang.String = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  var value: java.lang.String = js.native
  def isExpired(): scala.Boolean = js.native
  def matchDomain(domain: java.lang.String): scala.Boolean = js.native
  def matchPath(path: java.lang.String): scala.Boolean = js.native
  def toOutboundString(): java.lang.String = js.native
  def toString(includeHeader: scala.Boolean): java.lang.String = js.native
}

/* static members */
@JSImport("simplecrawler/cookies", "Cookie")
@js.native
object Cookie extends js.Object {
  def fromString(content: java.lang.String): simplecrawlerLib.cookiesMod.Cookie = js.native
}

