package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PersonalSiteInstantiationState extends js.Object

/** Specifies an exception or status code for the state of a personal site instantiation. */
@JSGlobal("SP.UserProfiles.PersonalSiteInstantiationState")
@js.native
object PersonalSiteInstantiationState extends js.Object {
  @js.native
  sealed trait created extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait deleted extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait enqueued extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorGeneralFailure extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorLanguageNotInstalled extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorManagedPathDoesNotExist extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorPartialCreate extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorPersonalSiteAlreadyExists extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorRootSiteNotPresent extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorSelfServiceSiteCreateCallFailed extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsEmptyHostUrl extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsGeneralFailure extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsHostFailedToInitializePersonalSiteContext extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsNoMySitesInPeopleLight extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsSelfServiceSiteCreationDisabled extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsUPANotGranted extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsUserNotLicensed extends PersonalSiteInstantiationState
  
  @js.native
  sealed trait uninitialized extends PersonalSiteInstantiationState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonalSiteInstantiationState with Double] = js.native
  /* 2 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 3 */ @js.native
  object deleted extends TopLevel[deleted with Double]
  
  /* 1 */ @js.native
  object enqueued extends TopLevel[enqueued with Double]
  
  /* 11 */ @js.native
  object errorGeneralFailure extends TopLevel[errorGeneralFailure with Double]
  
  /* 13 */ @js.native
  object errorLanguageNotInstalled extends TopLevel[errorLanguageNotInstalled with Double]
  
  /* 12 */ @js.native
  object errorManagedPathDoesNotExist extends TopLevel[errorManagedPathDoesNotExist with Double]
  
  /* 14 */ @js.native
  object errorPartialCreate extends TopLevel[errorPartialCreate with Double]
  
  /* 15 */ @js.native
  object errorPersonalSiteAlreadyExists extends TopLevel[errorPersonalSiteAlreadyExists with Double]
  
  /* 16 */ @js.native
  object errorRootSiteNotPresent extends TopLevel[errorRootSiteNotPresent with Double]
  
  /* 17 */ @js.native
  object errorSelfServiceSiteCreateCallFailed extends TopLevel[errorSelfServiceSiteCreateCallFailed with Double]
  
  /* 9 */ @js.native
  object permissionsEmptyHostUrl extends TopLevel[permissionsEmptyHostUrl with Double]
  
  /* 4 */ @js.native
  object permissionsGeneralFailure extends TopLevel[permissionsGeneralFailure with Double]
  
  /* 10 */ @js.native
  object permissionsHostFailedToInitializePersonalSiteContext extends TopLevel[permissionsHostFailedToInitializePersonalSiteContext with Double]
  
  /* 8 */ @js.native
  object permissionsNoMySitesInPeopleLight extends TopLevel[permissionsNoMySitesInPeopleLight with Double]
  
  /* 7 */ @js.native
  object permissionsSelfServiceSiteCreationDisabled extends TopLevel[permissionsSelfServiceSiteCreationDisabled with Double]
  
  /* 5 */ @js.native
  object permissionsUPANotGranted extends TopLevel[permissionsUPANotGranted with Double]
  
  /* 6 */ @js.native
  object permissionsUserNotLicensed extends TopLevel[permissionsUserNotLicensed with Double]
  
  /* 0 */ @js.native
  object uninitialized extends TopLevel[uninitialized with Double]
  
}

