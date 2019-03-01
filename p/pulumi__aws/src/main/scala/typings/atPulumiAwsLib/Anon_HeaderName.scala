package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeaderName extends js.Object {
  var headerName: java.lang.String
  var headerValue: java.lang.String
  var position: scala.Double
}

object Anon_HeaderName {
  @scala.inline
  def apply(headerName: java.lang.String, headerValue: java.lang.String, position: scala.Double): Anon_HeaderName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headerName")(headerName)
    __obj.updateDynamic("headerValue")(headerValue)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_HeaderName]
  }
}

