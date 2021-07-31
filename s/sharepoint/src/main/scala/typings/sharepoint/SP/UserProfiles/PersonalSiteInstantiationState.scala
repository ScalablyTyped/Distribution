package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonalSiteInstantiationState extends StObject
/** Specifies an exception or status code for the state of a personal site instantiation. */
@JSGlobal("SP.UserProfiles.PersonalSiteInstantiationState")
@js.native
object PersonalSiteInstantiationState extends StObject {
  
  @js.native
  sealed trait created
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait deleted
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait enqueued
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorGeneralFailure
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorLanguageNotInstalled
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorManagedPathDoesNotExist
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorPartialCreate
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorPersonalSiteAlreadyExists
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorRootSiteNotPresent
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait errorSelfServiceSiteCreateCallFailed
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsEmptyHostUrl
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsGeneralFailure
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsHostFailedToInitializePersonalSiteContext
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsNoMySitesInPeopleLight
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsSelfServiceSiteCreationDisabled
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsUPANotGranted
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait permissionsUserNotLicensed
    extends StObject
       with PersonalSiteInstantiationState
  
  @js.native
  sealed trait uninitialized
    extends StObject
       with PersonalSiteInstantiationState
}
