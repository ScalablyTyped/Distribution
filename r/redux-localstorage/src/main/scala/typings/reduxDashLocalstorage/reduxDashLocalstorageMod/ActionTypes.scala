package typings.reduxDashLocalstorage.reduxDashLocalstorageMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionTypes extends js.Object {
  var INIT: String
}

object ActionTypes {
  @scala.inline
  def apply(INIT: String): ActionTypes = {
    val __obj = js.Dynamic.literal(INIT = INIT.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionTypes]
  }
}

@JSImport("redux-localstorage", "actionTypes")
@js.native
object actionTypes extends TopLevel[ActionTypes]

