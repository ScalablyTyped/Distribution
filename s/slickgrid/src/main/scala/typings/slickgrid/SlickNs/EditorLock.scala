package typings.slickgrid.SlickNs

import typings.slickgrid.SlickNs.EditorsNs.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.EditorLock")
@js.native
class EditorLock[T /* <: SlickData */] () extends js.Object {
  /***
  		* Sets the specified edit controller as the active edit controller (acquire edit lock).
  		* If another edit controller is already active, and exception will be thrown.
  		* @method activate
  		* @param editController {EditController} edit controller acquiring the lock
  		*/
  def activate(editController: Editor[T]): Unit = js.native
  /***
  		* Attempts to cancel the current edit by calling "cancelCurrentEdit" method on the active edit
  		* controller and returns whether the edit was successfully cancelled.  If no edit controller is
  		* active, returns true.
  		* @method cancelCurrentEdit
  		* @return {Boolean}
  		*/
  def cancelCurrentEdit(): Boolean = js.native
  /***
  		* Attempts to commit the current edit by calling "commitCurrentEdit" method on the active edit
  		* controller and returns whether the commit attempt was successful (commit may fail due to validation
  		* errors, etc.).  Edit controller's "commitCurrentEdit" must return true if the commit has succeeded
  		* and false otherwise.  If no edit controller is active, returns true.
  		* @method commitCurrentEdit
  		* @return {Boolean}
  		*/
  def commitCurrentEdit(): Boolean = js.native
  /***
  		* Unsets the specified edit controller as the active edit controller (release edit lock).
  		* If the specified edit controller is not the active one, an exception will be thrown.
  		* @method deactivate
  		* @param editController {EditController} edit controller releasing the lock
  		*/
  def deactivate(editController: Editor[T]): Unit = js.native
  /***
  		* Returns true if a specified edit controller is active (has the edit lock).
  		* If the parameter is not specified, returns true if any edit controller is active.
  		* @method isActive
  		* @param editController {EditController}
  		* @return {Boolean}
  		*/
  def isActive(editController: Editor[T]): Boolean = js.native
}

