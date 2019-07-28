package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeaderName extends js.Object {
  var headerName: String
  var headerValue: String
  var position: Double
}

object Anon_HeaderName {
  @scala.inline
  def apply(headerName: String, headerValue: String, position: Double): Anon_HeaderName = {
    val __obj = js.Dynamic.literal(headerName = headerName, headerValue = headerValue, position = position)
  
    __obj.asInstanceOf[Anon_HeaderName]
  }
}

