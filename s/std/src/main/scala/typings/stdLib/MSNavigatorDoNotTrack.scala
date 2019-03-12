package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSNavigatorDoNotTrack extends js.Object {
  def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean
  def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean
  def removeSiteSpecificTrackingException(args: ExceptionInformation): scala.Unit
  def removeWebWideTrackingException(args: ExceptionInformation): scala.Unit
  def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): scala.Unit
  def storeWebWideTrackingException(args: StoreExceptionsInformation): scala.Unit
}

object MSNavigatorDoNotTrack {
  @scala.inline
  def apply(
    confirmSiteSpecificTrackingException: ConfirmSiteSpecificExceptionsInformation => scala.Boolean,
    confirmWebWideTrackingException: ExceptionInformation => scala.Boolean,
    removeSiteSpecificTrackingException: ExceptionInformation => scala.Unit,
    removeWebWideTrackingException: ExceptionInformation => scala.Unit,
    storeSiteSpecificTrackingException: StoreSiteSpecificExceptionsInformation => scala.Unit,
    storeWebWideTrackingException: StoreExceptionsInformation => scala.Unit
  ): MSNavigatorDoNotTrack = {
    val __obj = js.Dynamic.literal(confirmSiteSpecificTrackingException = js.Any.fromFunction1(confirmSiteSpecificTrackingException), confirmWebWideTrackingException = js.Any.fromFunction1(confirmWebWideTrackingException), removeSiteSpecificTrackingException = js.Any.fromFunction1(removeSiteSpecificTrackingException), removeWebWideTrackingException = js.Any.fromFunction1(removeWebWideTrackingException), storeSiteSpecificTrackingException = js.Any.fromFunction1(storeSiteSpecificTrackingException), storeWebWideTrackingException = js.Any.fromFunction1(storeWebWideTrackingException))
  
    __obj.asInstanceOf[MSNavigatorDoNotTrack]
  }
}

