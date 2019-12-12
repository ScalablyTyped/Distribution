package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.UserProfiles.ObjectTypes.all
import typings.sharepoint.SP.UserProfiles.ObjectTypes.anniversary
import typings.sharepoint.SP.UserProfiles.ObjectTypes.colleague
import typings.sharepoint.SP.UserProfiles.ObjectTypes.custom
import typings.sharepoint.SP.UserProfiles.ObjectTypes.dlMembership
import typings.sharepoint.SP.UserProfiles.ObjectTypes.multiValueProperty
import typings.sharepoint.SP.UserProfiles.ObjectTypes.none
import typings.sharepoint.SP.UserProfiles.ObjectTypes.organizationMembership
import typings.sharepoint.SP.UserProfiles.ObjectTypes.organizationProfile
import typings.sharepoint.SP.UserProfiles.ObjectTypes.personalizationSite
import typings.sharepoint.SP.UserProfiles.ObjectTypes.quickLink
import typings.sharepoint.SP.UserProfiles.ObjectTypes.singleValueProperty
import typings.sharepoint.SP.UserProfiles.ObjectTypes.siteMembership
import typings.sharepoint.SP.UserProfiles.ObjectTypes.userProfile
import typings.sharepoint.SP.UserProfiles.ObjectTypes.webLog
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectTypes with Double] = js.native
  /* 14 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 3 */ @js.native
  object anniversary extends TopLevel[anniversary with Double]
  
  /* 7 */ @js.native
  object colleague extends TopLevel[colleague with Double]
  
  /* 11 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 4 */ @js.native
  object dlMembership extends TopLevel[dlMembership with Double]
  
  /* 2 */ @js.native
  object multiValueProperty extends TopLevel[multiValueProperty with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 13 */ @js.native
  object organizationMembership extends TopLevel[organizationMembership with Double]
  
  /* 12 */ @js.native
  object organizationProfile extends TopLevel[organizationProfile with Double]
  
  /* 8 */ @js.native
  object personalizationSite extends TopLevel[personalizationSite with Double]
  
  /* 6 */ @js.native
  object quickLink extends TopLevel[quickLink with Double]
  
  /* 1 */ @js.native
  object singleValueProperty extends TopLevel[singleValueProperty with Double]
  
  /* 5 */ @js.native
  object siteMembership extends TopLevel[siteMembership with Double]
  
  /* 9 */ @js.native
  object userProfile extends TopLevel[userProfile with Double]
  
  /* 10 */ @js.native
  object webLog extends TopLevel[webLog with Double]
  
}

