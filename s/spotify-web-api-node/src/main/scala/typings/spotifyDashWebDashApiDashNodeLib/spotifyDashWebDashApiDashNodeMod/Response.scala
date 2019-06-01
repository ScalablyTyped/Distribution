package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var body: T
  var headers: stdLib.Record[java.lang.String, java.lang.String]
  var statusCode: scala.Double
}

object Response {
  @scala.inline
  def apply[T](body: T, headers: stdLib.Record[java.lang.String, java.lang.String], statusCode: scala.Double): Response[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, statusCode = statusCode)
  
    __obj.asInstanceOf[Response[T]]
  }
}

