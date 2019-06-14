package typings
package sharepointLib.SPNs.UserProfilesNs

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
  sealed trait created
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait deleted
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait enqueued
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorGeneralFailure
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorLanguageNotInstalled
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorManagedPathDoesNotExist
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorPartialCreate
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorPersonalSiteAlreadyExists
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorRootSiteNotPresent
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorSelfServiceSiteCreateCallFailed
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsEmptyHostUrl
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsGeneralFailure
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsHostFailedToInitializePersonalSiteContext
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsNoMySitesInPeopleLight
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsSelfServiceSiteCreationDisabled
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsUPANotGranted
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsUserNotLicensed
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  @js.native
  sealed trait uninitialized
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState
  
  /* 2 */ val created: created with scala.Double = js.native
  /* 3 */ val deleted: deleted with scala.Double = js.native
  /* 1 */ val enqueued: enqueued with scala.Double = js.native
  /* 11 */ val errorGeneralFailure: errorGeneralFailure with scala.Double = js.native
  /* 13 */ val errorLanguageNotInstalled: errorLanguageNotInstalled with scala.Double = js.native
  /* 12 */ val errorManagedPathDoesNotExist: errorManagedPathDoesNotExist with scala.Double = js.native
  /* 14 */ val errorPartialCreate: errorPartialCreate with scala.Double = js.native
  /* 15 */ val errorPersonalSiteAlreadyExists: errorPersonalSiteAlreadyExists with scala.Double = js.native
  /* 16 */ val errorRootSiteNotPresent: errorRootSiteNotPresent with scala.Double = js.native
  /* 17 */ val errorSelfServiceSiteCreateCallFailed: errorSelfServiceSiteCreateCallFailed with scala.Double = js.native
  /* 9 */ val permissionsEmptyHostUrl: permissionsEmptyHostUrl with scala.Double = js.native
  /* 4 */ val permissionsGeneralFailure: permissionsGeneralFailure with scala.Double = js.native
  /* 10 */ val permissionsHostFailedToInitializePersonalSiteContext: permissionsHostFailedToInitializePersonalSiteContext with scala.Double = js.native
  /* 8 */ val permissionsNoMySitesInPeopleLight: permissionsNoMySitesInPeopleLight with scala.Double = js.native
  /* 7 */ val permissionsSelfServiceSiteCreationDisabled: permissionsSelfServiceSiteCreationDisabled with scala.Double = js.native
  /* 5 */ val permissionsUPANotGranted: permissionsUPANotGranted with scala.Double = js.native
  /* 6 */ val permissionsUserNotLicensed: permissionsUserNotLicensed with scala.Double = js.native
  /* 0 */ val uninitialized: uninitialized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState with scala.Double
  ] = js.native
}

