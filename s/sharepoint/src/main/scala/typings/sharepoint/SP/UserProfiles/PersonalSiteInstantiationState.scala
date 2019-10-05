package typings.sharepoint.SP.UserProfiles

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
  
  /* 2 */ val created: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.created with Double = js.native
  /* 3 */ val deleted: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.deleted with Double = js.native
  /* 1 */ val enqueued: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.enqueued with Double = js.native
  /* 11 */ val errorGeneralFailure: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorGeneralFailure with Double = js.native
  /* 13 */ val errorLanguageNotInstalled: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorLanguageNotInstalled with Double = js.native
  /* 12 */ val errorManagedPathDoesNotExist: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorManagedPathDoesNotExist with Double = js.native
  /* 14 */ val errorPartialCreate: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorPartialCreate with Double = js.native
  /* 15 */ val errorPersonalSiteAlreadyExists: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorPersonalSiteAlreadyExists with Double = js.native
  /* 16 */ val errorRootSiteNotPresent: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorRootSiteNotPresent with Double = js.native
  /* 17 */ val errorSelfServiceSiteCreateCallFailed: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.errorSelfServiceSiteCreateCallFailed with Double = js.native
  /* 9 */ val permissionsEmptyHostUrl: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsEmptyHostUrl with Double = js.native
  /* 4 */ val permissionsGeneralFailure: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsGeneralFailure with Double = js.native
  /* 10 */ val permissionsHostFailedToInitializePersonalSiteContext: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsHostFailedToInitializePersonalSiteContext with Double = js.native
  /* 8 */ val permissionsNoMySitesInPeopleLight: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsNoMySitesInPeopleLight with Double = js.native
  /* 7 */ val permissionsSelfServiceSiteCreationDisabled: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsSelfServiceSiteCreationDisabled with Double = js.native
  /* 5 */ val permissionsUPANotGranted: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsUPANotGranted with Double = js.native
  /* 6 */ val permissionsUserNotLicensed: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.permissionsUserNotLicensed with Double = js.native
  /* 0 */ val uninitialized: typings.sharepoint.SP.UserProfiles.PersonalSiteInstantiationState.uninitialized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonalSiteInstantiationState with Double] = js.native
}

