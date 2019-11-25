package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: String
  var method: js.Array[String]
  var rel: String
}

object Anon_Href {
  @scala.inline
  def apply(href: String, method: js.Array[String], rel: String): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Href]
  }
}

