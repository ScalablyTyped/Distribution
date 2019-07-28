package typings.sharepoint.SPNs.UserProfilesNs

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
  
  /* 1 */ val add: typings.sharepoint.SPNs.UserProfilesNs.ChangeTypes.add with Double = js.native
  /* 5 */ val all: typings.sharepoint.SPNs.UserProfilesNs.ChangeTypes.all with Double = js.native
  /* 4 */ val metadata: typings.sharepoint.SPNs.UserProfilesNs.ChangeTypes.metadata with Double = js.native
  /* 2 */ val modify: typings.sharepoint.SPNs.UserProfilesNs.ChangeTypes.modify with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.UserProfilesNs.ChangeTypes.none with Double = js.native
  /* 3 */ val remove: typings.sharepoint.SPNs.UserProfilesNs.ChangeTypes.remove with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeTypes with Double] = js.native
}

