package typings.sharepoint.SPNs.SocialNs

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
  
  /* 0 */ val OK: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.OK with Double = js.native
  /* 2 */ val accessDenied: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.accessDenied with Double = js.native
  /* 14 */ val attachmentError: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.attachmentError with Double = js.native
  /* 7 */ val cacheReadError: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.cacheReadError with Double = js.native
  /* 8 */ val cacheUpdateError: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.cacheUpdateError with Double = js.native
  /* 12 */ val cannotCreatePersonalSite: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.cannotCreatePersonalSite with Double = js.native
  /* 10 */ val failedToCreatePersonalSite: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.failedToCreatePersonalSite with Double = js.native
  /* 16 */ val featureDisabled: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.featureDisabled with Double = js.native
  /* 6 */ val internalError: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.internalError with Double = js.native
  /* 4 */ val invalidOperation: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.invalidOperation with Double = js.native
  /* 1 */ val invalidRequest: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.invalidRequest with Double = js.native
  /* 3 */ val itemNotFound: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.itemNotFound with Double = js.native
  /* 5 */ val itemNotModified: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.itemNotModified with Double = js.native
  /* 13 */ val limitReached: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.limitReached with Double = js.native
  /* 11 */ val notAuthorizedToCreatePersonalSite: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.notAuthorizedToCreatePersonalSite with Double = js.native
  /* 15 */ val partialData: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.partialData with Double = js.native
  /* 9 */ val personalSiteNotFound: typings.sharepoint.SPNs.SocialNs.SocialStatusCode.personalSiteNotFound with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialStatusCode with Double] = js.native
}

