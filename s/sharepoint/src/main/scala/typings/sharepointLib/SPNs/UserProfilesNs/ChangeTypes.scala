package typings
package sharepointLib.SPNs.UserProfilesNs

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
  sealed trait add
    extends sharepointLib.SPNs.UserProfilesNs.ChangeTypes
  
  /** Multiple operations were performed on an object */
  @js.native
  sealed trait all
    extends sharepointLib.SPNs.UserProfilesNs.ChangeTypes
  
  /** The metadata of an object was modified */
  @js.native
  sealed trait metadata
    extends sharepointLib.SPNs.UserProfilesNs.ChangeTypes
  
  /** An object was modified */
  @js.native
  sealed trait modify
    extends sharepointLib.SPNs.UserProfilesNs.ChangeTypes
  
  /** No change was made */
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.UserProfilesNs.ChangeTypes
  
  /** An object was removed */
  @js.native
  sealed trait remove
    extends sharepointLib.SPNs.UserProfilesNs.ChangeTypes
  
  /* 1 */ val add: add with scala.Double = js.native
  /* 5 */ val all: all with scala.Double = js.native
  /* 4 */ val metadata: metadata with scala.Double = js.native
  /* 2 */ val modify: modify with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val remove: remove with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.ChangeTypes with scala.Double] = js.native
}

