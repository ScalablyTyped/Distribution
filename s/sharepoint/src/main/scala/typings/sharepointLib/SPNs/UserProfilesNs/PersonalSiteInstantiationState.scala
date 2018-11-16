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
  
  val created: created with java.lang.String = js.native
  val deleted: deleted with java.lang.String = js.native
  val enqueued: enqueued with java.lang.String = js.native
  val errorGeneralFailure: errorGeneralFailure with java.lang.String = js.native
  val errorLanguageNotInstalled: errorLanguageNotInstalled with java.lang.String = js.native
  val errorManagedPathDoesNotExist: errorManagedPathDoesNotExist with java.lang.String = js.native
  val errorPartialCreate: errorPartialCreate with java.lang.String = js.native
  val errorPersonalSiteAlreadyExists: errorPersonalSiteAlreadyExists with java.lang.String = js.native
  val errorRootSiteNotPresent: errorRootSiteNotPresent with java.lang.String = js.native
  val errorSelfServiceSiteCreateCallFailed: errorSelfServiceSiteCreateCallFailed with java.lang.String = js.native
  val permissionsEmptyHostUrl: permissionsEmptyHostUrl with java.lang.String = js.native
  val permissionsGeneralFailure: permissionsGeneralFailure with java.lang.String = js.native
  val permissionsHostFailedToInitializePersonalSiteContext: permissionsHostFailedToInitializePersonalSiteContext with java.lang.String = js.native
  val permissionsNoMySitesInPeopleLight: permissionsNoMySitesInPeopleLight with java.lang.String = js.native
  val permissionsSelfServiceSiteCreationDisabled: permissionsSelfServiceSiteCreationDisabled with java.lang.String = js.native
  val permissionsUPANotGranted: permissionsUPANotGranted with java.lang.String = js.native
  val permissionsUserNotLicensed: permissionsUserNotLicensed with java.lang.String = js.native
  val uninitialized: uninitialized with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.SPNs.UserProfilesNs.PersonalSiteInstantiationState with java.lang.String
  ] = js.native
}

