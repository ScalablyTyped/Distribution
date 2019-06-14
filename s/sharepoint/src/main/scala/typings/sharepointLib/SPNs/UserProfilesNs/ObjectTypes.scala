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
  
  /* 14 */ val all: all with scala.Double = js.native
  /* 3 */ val anniversary: anniversary with scala.Double = js.native
  /* 7 */ val colleague: colleague with scala.Double = js.native
  /* 11 */ val custom: custom with scala.Double = js.native
  /* 4 */ val dlMembership: dlMembership with scala.Double = js.native
  /* 2 */ val multiValueProperty: multiValueProperty with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 13 */ val organizationMembership: organizationMembership with scala.Double = js.native
  /* 12 */ val organizationProfile: organizationProfile with scala.Double = js.native
  /* 8 */ val personalizationSite: personalizationSite with scala.Double = js.native
  /* 6 */ val quickLink: quickLink with scala.Double = js.native
  /* 1 */ val singleValueProperty: singleValueProperty with scala.Double = js.native
  /* 5 */ val siteMembership: siteMembership with scala.Double = js.native
  /* 9 */ val userProfile: userProfile with scala.Double = js.native
  /* 10 */ val webLog: webLog with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.ObjectTypes with scala.Double] = js.native
}

