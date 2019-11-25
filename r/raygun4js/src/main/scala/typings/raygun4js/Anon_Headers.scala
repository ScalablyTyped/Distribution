package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var Headers: Anon_Host
  var QueryString: String
  var Url: String
}

object Anon_Headers {
  @scala.inline
  def apply(Headers: Anon_Host, QueryString: String, Url: String): Anon_Headers = {
    val __obj = js.Dynamic.literal(Headers = Headers.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

