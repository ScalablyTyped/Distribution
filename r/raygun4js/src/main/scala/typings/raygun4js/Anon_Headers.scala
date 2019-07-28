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
    val __obj = js.Dynamic.literal(Headers = Headers, QueryString = QueryString, Url = Url)
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

