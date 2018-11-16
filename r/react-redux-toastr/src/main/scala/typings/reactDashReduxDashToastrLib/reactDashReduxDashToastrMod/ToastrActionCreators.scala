package typings
package reactDashReduxDashToastrLib.reactDashReduxDashToastrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastrActionCreators extends js.Object {
  def add(toastr: AddToastPayload): reduxLib.reduxMod.Action[_] = js.native
  def clean(): reduxLib.reduxMod.Action[_] = js.native
  def hideConfirm(): reduxLib.reduxMod.Action[_] = js.native
  def remove(id: java.lang.String): reduxLib.reduxMod.Action[_] = js.native
  def removeByType(`type`: toastType): reduxLib.reduxMod.Action[_] = js.native
  def showConfirm(confirm: ConfirmToastrCustomOptions): reduxLib.reduxMod.Action[_] = js.native
  def showConfirm(confirm: ConfirmToastrOptions): reduxLib.reduxMod.Action[_] = js.native
}

