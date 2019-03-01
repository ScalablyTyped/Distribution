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
    confirmSiteSpecificTrackingException: js.Function1[ConfirmSiteSpecificExceptionsInformation, scala.Boolean],
    confirmWebWideTrackingException: js.Function1[ExceptionInformation, scala.Boolean],
    removeSiteSpecificTrackingException: js.Function1[ExceptionInformation, scala.Unit],
    removeWebWideTrackingException: js.Function1[ExceptionInformation, scala.Unit],
    storeSiteSpecificTrackingException: js.Function1[StoreSiteSpecificExceptionsInformation, scala.Unit],
    storeWebWideTrackingException: js.Function1[StoreExceptionsInformation, scala.Unit]
  ): MSNavigatorDoNotTrack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("confirmSiteSpecificTrackingException")(confirmSiteSpecificTrackingException)
    __obj.updateDynamic("confirmWebWideTrackingException")(confirmWebWideTrackingException)
    __obj.updateDynamic("removeSiteSpecificTrackingException")(removeSiteSpecificTrackingException)
    __obj.updateDynamic("removeWebWideTrackingException")(removeWebWideTrackingException)
    __obj.updateDynamic("storeSiteSpecificTrackingException")(storeSiteSpecificTrackingException)
    __obj.updateDynamic("storeWebWideTrackingException")(storeWebWideTrackingException)
    __obj.asInstanceOf[MSNavigatorDoNotTrack]
  }
}

