package typings.reactNativeFirebase.mod.RNFirebase.firestore.Types

import typings.reactNativeFirebase.reactNativeFirebaseStrings.asc_
import typings.reactNativeFirebase.reactNativeFirebaseStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeFirebase.reactNativeFirebaseStrings.asc_
  - typings.reactNativeFirebase.reactNativeFirebaseStrings.ASC
  - typings.reactNativeFirebase.reactNativeFirebaseStrings.desc_
  - typings.reactNativeFirebase.reactNativeFirebaseStrings.DESC
*/
trait QueryDirection extends js.Object

object QueryDirection {
  @scala.inline
  def ASC: typings.reactNativeFirebase.reactNativeFirebaseStrings.ASC = this.cast("ASC")
  @scala.inline
  def DESC: typings.reactNativeFirebase.reactNativeFirebaseStrings.DESC = this.cast("DESC")
  @scala.inline
  def asc: asc_ = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: desc_ = this.cast("desc")
}

