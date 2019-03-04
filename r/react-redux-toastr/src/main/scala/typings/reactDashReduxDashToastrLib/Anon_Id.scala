package typings
package reactDashReduxDashToastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  var message: java.lang.String
  var options: reactDashReduxDashToastrLib.reactDashReduxDashToastrMod.ConfirmToastrOptions | reactDashReduxDashToastrLib.reactDashReduxDashToastrMod.ConfirmToastrCustomOptions
  var show: scala.Boolean
}

object Anon_Id {
  @scala.inline
  def apply(
    id: java.lang.String,
    message: java.lang.String,
    options: reactDashReduxDashToastrLib.reactDashReduxDashToastrMod.ConfirmToastrOptions | reactDashReduxDashToastrLib.reactDashReduxDashToastrMod.ConfirmToastrCustomOptions,
    show: scala.Boolean
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, message = message, options = options.asInstanceOf[js.Any], show = show)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

