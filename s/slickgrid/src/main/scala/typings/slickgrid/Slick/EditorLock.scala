package typings.slickgrid.Slick

import typings.slickgrid.Slick.Editors.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorLock[T /* <: SlickData */] extends StObject {
  
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
object EditorLock {
  
  @scala.inline
  def apply[T /* <: SlickData */](
    activate: Editor[T] => Unit,
    cancelCurrentEdit: () => Boolean,
    commitCurrentEdit: () => Boolean,
    deactivate: Editor[T] => Unit,
    isActive: Editor[T] => Boolean
  ): EditorLock[T] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit), deactivate = js.Any.fromFunction1(deactivate), isActive = js.Any.fromFunction1(isActive))
    __obj.asInstanceOf[EditorLock[T]]
  }
  
  @scala.inline
  implicit class EditorLockMutableBuilder[Self <: EditorLock[_], T /* <: SlickData */] (val x: Self with EditorLock[T]) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Editor[T] => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelCurrentEdit(value: () => Boolean): Self = StObject.set(x, "cancelCurrentEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommitCurrentEdit(value: () => Boolean): Self = StObject.set(x, "commitCurrentEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeactivate(value: Editor[T] => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsActive(value: Editor[T] => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction1(value))
  }
}
