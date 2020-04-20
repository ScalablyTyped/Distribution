package typings.roads.responseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: String
  var headers: StringDictionary[js.Any]
  var status: Double
}

object Response {
  @scala.inline
  def apply(body: String, headers: StringDictionary[js.Any], status: Double): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

