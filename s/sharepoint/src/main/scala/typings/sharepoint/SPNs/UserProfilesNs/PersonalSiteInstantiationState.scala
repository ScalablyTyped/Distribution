package typings.sharepoint.SPNs.UserProfilesNs

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
  
  /* 2 */ val created: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.created with Double = js.native
  /* 3 */ val deleted: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.deleted with Double = js.native
  /* 1 */ val enqueued: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.enqueued with Double = js.native
  /* 11 */ val errorGeneralFailure: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.errorGeneralFailure with Double = js.native
  /* 13 */ val errorLanguageNotInstalled: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.errorLanguageNotInstalled with Double = js.native
  /* 12 */ val errorManagedPathDoesNotExist: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.errorManagedPathDoesNotExist with Double = js.native
  /* 14 */ val errorPartialCreate: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.errorPartialCreate with Double = js.native
  /* 15 */ val errorPersonalSiteAlreadyExists: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.errorPersonalSiteAlreadyExists with Double = js.native
  /* 16 */ val errorRootSiteNotPresent: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.errorRootSiteNotPresent with Double = js.native
  /* 17 */ val errorSelfServiceSiteCreateCallFailed: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.errorSelfServiceSiteCreateCallFailed with Double = js.native
  /* 9 */ val permissionsEmptyHostUrl: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.permissionsEmptyHostUrl with Double = js.native
  /* 4 */ val permissionsGeneralFailure: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.permissionsGeneralFailure with Double = js.native
  /* 10 */ val permissionsHostFailedToInitializePersonalSiteContext: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.permissionsHostFailedToInitializePersonalSiteContext with Double = js.native
  /* 8 */ val permissionsNoMySitesInPeopleLight: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.permissionsNoMySitesInPeopleLight with Double = js.native
  /* 7 */ val permissionsSelfServiceSiteCreationDisabled: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.permissionsSelfServiceSiteCreationDisabled with Double = js.native
  /* 5 */ val permissionsUPANotGranted: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.permissionsUPANotGranted with Double = js.native
  /* 6 */ val permissionsUserNotLicensed: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.permissionsUserNotLicensed with Double = js.native
  /* 0 */ val uninitialized: typings.sharepoint.SPNs.UserProfilesNs.PersonalSiteInstantiationState.uninitialized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonalSiteInstantiationState with Double] = js.native
}

