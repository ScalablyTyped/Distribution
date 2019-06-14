package typings
package sharepointLib.SPNs.SocialNs

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
  sealed trait OK
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that access was denied to the current user. */
  @js.native
  sealed trait accessDenied
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that the operation failed because there was an error handling an attachment. */
  @js.native
  sealed trait attachmentError
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that there was an error reading the cache. */
  @js.native
  sealed trait cacheReadError
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that there was an error updating the cache. */
  @js.native
  sealed trait cacheUpdateError
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  @js.native
  sealed trait cannotCreatePersonalSite
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  @js.native
  sealed trait failedToCreatePersonalSite
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that the operation failed because a required server feature was disabled by administrative action. */
  @js.native
  sealed trait featureDisabled
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  @js.native
  sealed trait internalError
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that an invalid operation was attempted. */
  @js.native
  sealed trait invalidOperation
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that an invalid request was encountered. */
  @js.native
  sealed trait invalidRequest
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  @js.native
  sealed trait itemNotFound
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that the item was not changed by the operation. */
  @js.native
  sealed trait itemNotModified
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that a server limit was reached. */
  @js.native
  sealed trait limitReached
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  @js.native
  sealed trait notAuthorizedToCreatePersonalSite
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /** This value specifies that the operation completed with recoverable errors and that the returned data is incomplete. */
  @js.native
  sealed trait partialData
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  @js.native
  sealed trait personalSiteNotFound
    extends sharepointLib.SPNs.SocialNs.SocialStatusCode
  
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 2 */ val accessDenied: accessDenied with scala.Double = js.native
  /* 14 */ val attachmentError: attachmentError with scala.Double = js.native
  /* 7 */ val cacheReadError: cacheReadError with scala.Double = js.native
  /* 8 */ val cacheUpdateError: cacheUpdateError with scala.Double = js.native
  /* 12 */ val cannotCreatePersonalSite: cannotCreatePersonalSite with scala.Double = js.native
  /* 10 */ val failedToCreatePersonalSite: failedToCreatePersonalSite with scala.Double = js.native
  /* 16 */ val featureDisabled: featureDisabled with scala.Double = js.native
  /* 6 */ val internalError: internalError with scala.Double = js.native
  /* 4 */ val invalidOperation: invalidOperation with scala.Double = js.native
  /* 1 */ val invalidRequest: invalidRequest with scala.Double = js.native
  /* 3 */ val itemNotFound: itemNotFound with scala.Double = js.native
  /* 5 */ val itemNotModified: itemNotModified with scala.Double = js.native
  /* 13 */ val limitReached: limitReached with scala.Double = js.native
  /* 11 */ val notAuthorizedToCreatePersonalSite: notAuthorizedToCreatePersonalSite with scala.Double = js.native
  /* 15 */ val partialData: partialData with scala.Double = js.native
  /* 9 */ val personalSiteNotFound: personalSiteNotFound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialStatusCode with scala.Double] = js.native
}

