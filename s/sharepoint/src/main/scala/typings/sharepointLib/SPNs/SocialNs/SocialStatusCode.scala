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
  
  val OK: OK with java.lang.String = js.native
  val accessDenied: accessDenied with java.lang.String = js.native
  val attachmentError: attachmentError with java.lang.String = js.native
  val cacheReadError: cacheReadError with java.lang.String = js.native
  val cacheUpdateError: cacheUpdateError with java.lang.String = js.native
  val cannotCreatePersonalSite: cannotCreatePersonalSite with java.lang.String = js.native
  val failedToCreatePersonalSite: failedToCreatePersonalSite with java.lang.String = js.native
  val featureDisabled: featureDisabled with java.lang.String = js.native
  val internalError: internalError with java.lang.String = js.native
  val invalidOperation: invalidOperation with java.lang.String = js.native
  val invalidRequest: invalidRequest with java.lang.String = js.native
  val itemNotFound: itemNotFound with java.lang.String = js.native
  val itemNotModified: itemNotModified with java.lang.String = js.native
  val limitReached: limitReached with java.lang.String = js.native
  val notAuthorizedToCreatePersonalSite: notAuthorizedToCreatePersonalSite with java.lang.String = js.native
  val partialData: partialData with java.lang.String = js.native
  val personalSiteNotFound: personalSiteNotFound with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialStatusCode with java.lang.String] = js.native
}

