package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler extends js.Object {
  var dom: js.Any
  var response: js.Any
}

object Handler {
  @scala.inline
  def apply(dom: js.Any, response: js.Any): Handler = {
    val __obj = js.Dynamic.literal(dom = dom, response = response)
  
    __obj.asInstanceOf[Handler]
  }
}

