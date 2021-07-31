package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialStatusCode extends StObject
/** Specifies a status or error code. */
@JSGlobal("SP.Social.SocialStatusCode")
@js.native
object SocialStatusCode extends StObject {
  
  @js.native
  sealed trait OK
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that access was denied to the current user. */
  @js.native
  sealed trait accessDenied
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that the operation failed because there was an error handling an attachment. */
  @js.native
  sealed trait attachmentError
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that there was an error reading the cache. */
  @js.native
  sealed trait cacheReadError
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that there was an error updating the cache. */
  @js.native
  sealed trait cacheUpdateError
    extends StObject
       with SocialStatusCode
  
  @js.native
  sealed trait cannotCreatePersonalSite
    extends StObject
       with SocialStatusCode
  
  @js.native
  sealed trait failedToCreatePersonalSite
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that the operation failed because a required server feature was disabled by administrative action. */
  @js.native
  sealed trait featureDisabled
    extends StObject
       with SocialStatusCode
  
  @js.native
  sealed trait internalError
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that an invalid operation was attempted. */
  @js.native
  sealed trait invalidOperation
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that an invalid request was encountered. */
  @js.native
  sealed trait invalidRequest
    extends StObject
       with SocialStatusCode
  
  @js.native
  sealed trait itemNotFound
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that the item was not changed by the operation. */
  @js.native
  sealed trait itemNotModified
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that a server limit was reached. */
  @js.native
  sealed trait limitReached
    extends StObject
       with SocialStatusCode
  
  @js.native
  sealed trait notAuthorizedToCreatePersonalSite
    extends StObject
       with SocialStatusCode
  
  /** This value specifies that the operation completed with recoverable errors and that the returned data is incomplete. */
  @js.native
  sealed trait partialData
    extends StObject
       with SocialStatusCode
  
  @js.native
  sealed trait personalSiteNotFound
    extends StObject
       with SocialStatusCode
}
