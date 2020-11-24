package typings.reactReduxToastr.mod

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastrActionCreators extends js.Object {
  
  def add(toastr: AddToastPayload): Action[_] = js.native
  
  def clean(): Action[_] = js.native
  
  def hideConfirm(): Action[_] = js.native
  
  def remove(id: String): Action[_] = js.native
  
  def removeByType(`type`: toastType): Action[_] = js.native
  
  def showConfirm(confirm: ConfirmToastrCustomOptions): Action[_] = js.native
  def showConfirm(confirm: ConfirmToastrOptions): Action[_] = js.native
}
