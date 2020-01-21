package typings.redux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispatch[Ext1] extends js.Object {
  var dispatch: Ext1
}

object AnonDispatch {
  @scala.inline
  def apply[Ext1](dispatch: Ext1): AnonDispatch[Ext1] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDispatch[Ext1]]
  }
}

