package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeTypes extends js.Object

/** Specifies types of changes made in the user profile store. */
@JSGlobal("SP.UserProfiles.ChangeTypes")
@js.native
object ChangeTypes extends js.Object {
  /** An object was added */
  @js.native
  sealed trait add extends ChangeTypes
  
  /** Multiple operations were performed on an object */
  @js.native
  sealed trait all extends ChangeTypes
  
  /** The metadata of an object was modified */
  @js.native
  sealed trait metadata extends ChangeTypes
  
  /** An object was modified */
  @js.native
  sealed trait modify extends ChangeTypes
  
  /** No change was made */
  @js.native
  sealed trait none extends ChangeTypes
  
  /** An object was removed */
  @js.native
  sealed trait remove extends ChangeTypes
  
}

