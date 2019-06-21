package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedUrl extends js.Object {
  val query: ParsedQuery[java.lang.String]
  val url: java.lang.String
}

object ParsedUrl {
  @scala.inline
  def apply(query: ParsedQuery[java.lang.String], url: java.lang.String): ParsedUrl = {
    val __obj = js.Dynamic.literal(query = query, url = url)
  
    __obj.asInstanceOf[ParsedUrl]
  }
}

