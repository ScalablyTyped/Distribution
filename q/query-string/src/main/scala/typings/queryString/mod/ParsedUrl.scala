package typings.queryString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedUrl extends js.Object {
  val query: ParsedQuery[String]
  val url: String
}

object ParsedUrl {
  @scala.inline
  def apply(query: ParsedQuery[String], url: String): ParsedUrl = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedUrl]
  }
}

