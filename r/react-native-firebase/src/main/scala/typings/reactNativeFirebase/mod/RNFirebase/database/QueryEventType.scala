package typings.reactNativeFirebase.mod.RNFirebase.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeFirebase.reactNativeFirebaseStrings.value
  - typings.reactNativeFirebase.reactNativeFirebaseStrings.child_added
  - typings.reactNativeFirebase.reactNativeFirebaseStrings.child_removed
  - typings.reactNativeFirebase.reactNativeFirebaseStrings.child_changed
  - typings.reactNativeFirebase.reactNativeFirebaseStrings.child_moved
*/
trait QueryEventType extends js.Object

object QueryEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typings.reactNativeFirebase.reactNativeFirebaseStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typings.reactNativeFirebase.reactNativeFirebaseStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typings.reactNativeFirebase.reactNativeFirebaseStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typings.reactNativeFirebase.reactNativeFirebaseStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typings.reactNativeFirebase.reactNativeFirebaseStrings.value = this.cast("value")
}

