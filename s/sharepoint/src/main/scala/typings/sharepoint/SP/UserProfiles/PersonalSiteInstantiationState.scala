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
  
}

