package typings.reactDashReduxDashToastr

import typings.reactDashReduxDashToastr.reactDashReduxDashToastrMod.ConfirmToastrCustomOptions
import typings.reactDashReduxDashToastr.reactDashReduxDashToastrMod.ConfirmToastrOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var message: String
  var options: ConfirmToastrOptions | ConfirmToastrCustomOptions
  var show: Boolean
}

object Anon_Id {
  @scala.inline
  def apply(
    id: String,
    message: String,
    options: ConfirmToastrOptions | ConfirmToastrCustomOptions,
    show: Boolean
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id]
  }
}

