package typings.qlik.qlikMod

import typings.qlik.Anon_QIsNum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var qContent: Anon_QIsNum
}

object Variable {
  @scala.inline
  def apply(qContent: Anon_QIsNum): Variable = {
    val __obj = js.Dynamic.literal(qContent = qContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Variable]
  }
}

