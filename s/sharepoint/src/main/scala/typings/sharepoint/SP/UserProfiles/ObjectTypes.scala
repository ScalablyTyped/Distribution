package typings.sharepoint.SP.UserProfiles

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
  sealed trait all extends ObjectTypes
  
  @js.native
  sealed trait anniversary extends ObjectTypes
  
  @js.native
  sealed trait colleague extends ObjectTypes
  
  @js.native
  sealed trait custom extends ObjectTypes
  
  @js.native
  sealed trait dlMembership extends ObjectTypes
  
  @js.native
  sealed trait multiValueProperty extends ObjectTypes
  
  @js.native
  sealed trait none extends ObjectTypes
  
  @js.native
  sealed trait organizationMembership extends ObjectTypes
  
  @js.native
  sealed trait organizationProfile extends ObjectTypes
  
  @js.native
  sealed trait personalizationSite extends ObjectTypes
  
  @js.native
  sealed trait quickLink extends ObjectTypes
  
  @js.native
  sealed trait singleValueProperty extends ObjectTypes
  
  @js.native
  sealed trait siteMembership extends ObjectTypes
  
  @js.native
  sealed trait userProfile extends ObjectTypes
  
  @js.native
  sealed trait webLog extends ObjectTypes
  
  /* 14 */ val all: typings.sharepoint.SP.UserProfiles.ObjectTypes.all with Double = js.native
  /* 3 */ val anniversary: typings.sharepoint.SP.UserProfiles.ObjectTypes.anniversary with Double = js.native
  /* 7 */ val colleague: typings.sharepoint.SP.UserProfiles.ObjectTypes.colleague with Double = js.native
  /* 11 */ val custom: typings.sharepoint.SP.UserProfiles.ObjectTypes.custom with Double = js.native
  /* 4 */ val dlMembership: typings.sharepoint.SP.UserProfiles.ObjectTypes.dlMembership with Double = js.native
  /* 2 */ val multiValueProperty: typings.sharepoint.SP.UserProfiles.ObjectTypes.multiValueProperty with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.UserProfiles.ObjectTypes.none with Double = js.native
  /* 13 */ val organizationMembership: typings.sharepoint.SP.UserProfiles.ObjectTypes.organizationMembership with Double = js.native
  /* 12 */ val organizationProfile: typings.sharepoint.SP.UserProfiles.ObjectTypes.organizationProfile with Double = js.native
  /* 8 */ val personalizationSite: typings.sharepoint.SP.UserProfiles.ObjectTypes.personalizationSite with Double = js.native
  /* 6 */ val quickLink: typings.sharepoint.SP.UserProfiles.ObjectTypes.quickLink with Double = js.native
  /* 1 */ val singleValueProperty: typings.sharepoint.SP.UserProfiles.ObjectTypes.singleValueProperty with Double = js.native
  /* 5 */ val siteMembership: typings.sharepoint.SP.UserProfiles.ObjectTypes.siteMembership with Double = js.native
  /* 9 */ val userProfile: typings.sharepoint.SP.UserProfiles.ObjectTypes.userProfile with Double = js.native
  /* 10 */ val webLog: typings.sharepoint.SP.UserProfiles.ObjectTypes.webLog with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectTypes with Double] = js.native
}

