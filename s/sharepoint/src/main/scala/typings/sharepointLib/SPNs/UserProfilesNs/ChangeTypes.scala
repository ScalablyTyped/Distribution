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
  
  val add: add with java.lang.String = js.native
  val all: all with java.lang.String = js.native
  val metadata: metadata with java.lang.String = js.native
  val modify: modify with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val remove: remove with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.ChangeTypes with java.lang.String] = js.native
}

