package typings.queryDashString.queryDashStringMod

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
    val __obj = js.Dynamic.literal(query = query, url = url)
  
    __obj.asInstanceOf[ParsedUrl]
  }
}

