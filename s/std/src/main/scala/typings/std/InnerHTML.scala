package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerHTML extends js.Object {
  var innerHTML: java.lang.String
}

object InnerHTML {
  @scala.inline
  def apply(innerHTML: java.lang.String): InnerHTML = {
    val __obj = js.Dynamic.literal(innerHTML = innerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerHTML]
  }
}

