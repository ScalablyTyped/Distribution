package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URL extends js.Object {
  var hash: java.lang.String
  var host: java.lang.String
  var hostname: java.lang.String
  var href: java.lang.String
  val origin: java.lang.String
  var password: java.lang.String
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var search: java.lang.String
  val searchParams: URLSearchParams
  var username: java.lang.String
  def toJSON(): java.lang.String
}

@JSGlobal("URL")
@js.native
object URL
  extends org.scalablytyped.runtime.Instantiable2[/* url */ java.lang.String, (/* base */ java.lang.String) | (/* base */ URL), URL]
     with org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, URL] {
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  def revokeObjectURL(url: java.lang.String): scala.Unit = js.native
}

