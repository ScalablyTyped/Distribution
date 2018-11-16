package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ObjectTypes extends js.Object

/** Specifies types of user-related objects that can be changed in the user profile store. */
@JSGlobal("SP.UserProfiles.ObjectTypes")
@js.native
object ObjectTypes extends js.Object {
  @js.native
  sealed trait all
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait anniversary
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait colleague
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait custom
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait dlMembership
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait multiValueProperty
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait organizationMembership
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait organizationProfile
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait personalizationSite
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait quickLink
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait singleValueProperty
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait siteMembership
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait userProfile
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  @js.native
  sealed trait webLog
    extends sharepointLib.SPNs.UserProfilesNs.ObjectTypes
  
  val all: all with java.lang.String = js.native
  val anniversary: anniversary with java.lang.String = js.native
  val colleague: colleague with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val dlMembership: dlMembership with java.lang.String = js.native
  val multiValueProperty: multiValueProperty with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val organizationMembership: organizationMembership with java.lang.String = js.native
  val organizationProfile: organizationProfile with java.lang.String = js.native
  val personalizationSite: personalizationSite with java.lang.String = js.native
  val quickLink: quickLink with java.lang.String = js.native
  val singleValueProperty: singleValueProperty with java.lang.String = js.native
  val siteMembership: siteMembership with java.lang.String = js.native
  val userProfile: userProfile with java.lang.String = js.native
  val webLog: webLog with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.ObjectTypes with java.lang.String] = js.native
}

