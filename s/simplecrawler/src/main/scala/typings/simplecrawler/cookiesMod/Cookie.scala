package typings.simplecrawler.cookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplecrawler/cookies", "Cookie")
@js.native
class Cookie protected () extends js.Object {
  def this(name: String, value: String, expires: String) = this()
  def this(name: String, value: String, expires: Double) = this()
  def this(name: String, value: String, expires: String, path: String) = this()
  def this(name: String, value: String, expires: Double, path: String) = this()
  def this(name: String, value: String, expires: String, path: String, domain: String) = this()
  def this(name: String, value: String, expires: Double, path: String, domain: String) = this()
  def this(name: String, value: String, expires: String, path: String, domain: String, httponly: Boolean) = this()
  def this(name: String, value: String, expires: Double, path: String, domain: String, httponly: Boolean) = this()
  var domain: js.UndefOr[String] = js.native
  var expires: String | Double = js.native
  var httponly: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var path: js.UndefOr[String] = js.native
  var value: String = js.native
  def isExpired(): Boolean = js.native
  def matchDomain(domain: String): Boolean = js.native
  def matchPath(path: String): Boolean = js.native
  def toOutboundString(): String = js.native
  def toString(includeHeader: Boolean): String = js.native
}

/* static members */
@JSImport("simplecrawler/cookies", "Cookie")
@js.native
object Cookie extends js.Object {
  def fromString(content: String): Cookie = js.native
}

