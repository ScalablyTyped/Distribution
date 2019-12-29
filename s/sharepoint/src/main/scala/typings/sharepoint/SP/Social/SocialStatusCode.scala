package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialStatusCode extends js.Object

/** Specifies a status or error code. */
@JSGlobal("SP.Social.SocialStatusCode")
@js.native
object SocialStatusCode extends js.Object {
  @js.native
  sealed trait OK extends SocialStatusCode
  
  /** This value specifies that access was denied to the current user. */
  @js.native
  sealed trait accessDenied extends SocialStatusCode
  
  /** This value specifies that the operation failed because there was an error handling an attachment. */
  @js.native
  sealed trait attachmentError extends SocialStatusCode
  
  /** This value specifies that there was an error reading the cache. */
  @js.native
  sealed trait cacheReadError extends SocialStatusCode
  
  /** This value specifies that there was an error updating the cache. */
  @js.native
  sealed trait cacheUpdateError extends SocialStatusCode
  
  @js.native
  sealed trait cannotCreatePersonalSite extends SocialStatusCode
  
  @js.native
  sealed trait failedToCreatePersonalSite extends SocialStatusCode
  
  /** This value specifies that the operation failed because a required server feature was disabled by administrative action. */
  @js.native
  sealed trait featureDisabled extends SocialStatusCode
  
  @js.native
  sealed trait internalError extends SocialStatusCode
  
  /** This value specifies that an invalid operation was attempted. */
  @js.native
  sealed trait invalidOperation extends SocialStatusCode
  
  /** This value specifies that an invalid request was encountered. */
  @js.native
  sealed trait invalidRequest extends SocialStatusCode
  
  @js.native
  sealed trait itemNotFound extends SocialStatusCode
  
  /** This value specifies that the item was not changed by the operation. */
  @js.native
  sealed trait itemNotModified extends SocialStatusCode
  
  /** This value specifies that a server limit was reached. */
  @js.native
  sealed trait limitReached extends SocialStatusCode
  
  @js.native
  sealed trait notAuthorizedToCreatePersonalSite extends SocialStatusCode
  
  /** This value specifies that the operation completed with recoverable errors and that the returned data is incomplete. */
  @js.native
  sealed trait partialData extends SocialStatusCode
  
  @js.native
  sealed trait personalSiteNotFound extends SocialStatusCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialStatusCode with Double] = js.native
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 2 */ @js.native
  object accessDenied extends TopLevel[accessDenied with Double]
  
  /* 14 */ @js.native
  object attachmentError extends TopLevel[attachmentError with Double]
  
  /* 7 */ @js.native
  object cacheReadError extends TopLevel[cacheReadError with Double]
  
  /* 8 */ @js.native
  object cacheUpdateError extends TopLevel[cacheUpdateError with Double]
  
  /* 12 */ @js.native
  object cannotCreatePersonalSite extends TopLevel[cannotCreatePersonalSite with Double]
  
  /* 10 */ @js.native
  object failedToCreatePersonalSite extends TopLevel[failedToCreatePersonalSite with Double]
  
  /* 16 */ @js.native
  object featureDisabled extends TopLevel[featureDisabled with Double]
  
  /* 6 */ @js.native
  object internalError extends TopLevel[internalError with Double]
  
  /* 4 */ @js.native
  object invalidOperation extends TopLevel[invalidOperation with Double]
  
  /* 1 */ @js.native
  object invalidRequest extends TopLevel[invalidRequest with Double]
  
  /* 3 */ @js.native
  object itemNotFound extends TopLevel[itemNotFound with Double]
  
  /* 5 */ @js.native
  object itemNotModified extends TopLevel[itemNotModified with Double]
  
  /* 13 */ @js.native
  object limitReached extends TopLevel[limitReached with Double]
  
  /* 11 */ @js.native
  object notAuthorizedToCreatePersonalSite extends TopLevel[notAuthorizedToCreatePersonalSite with Double]
  
  /* 15 */ @js.native
  object partialData extends TopLevel[partialData with Double]
  
  /* 9 */ @js.native
  object personalSiteNotFound extends TopLevel[personalSiteNotFound with Double]
  
}

