package typings.setLink.mod.expressAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  def setLink(link: String, rel: String): Unit
}

object Response {
  @scala.inline
  def apply(setLink: (String, String) => Unit): Response = {
    val __obj = js.Dynamic.literal(setLink = js.Any.fromFunction2(setLink))
  
    __obj.asInstanceOf[Response]
  }
}

