package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSNavigatorDoNotTrack extends js.Object {
  def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean = js.native
  def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean = js.native
  def removeSiteSpecificTrackingException(args: ExceptionInformation): Unit = js.native
  def removeWebWideTrackingException(args: ExceptionInformation): Unit = js.native
  def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): Unit = js.native
  def storeWebWideTrackingException(args: StoreExceptionsInformation): Unit = js.native
}

object MSNavigatorDoNotTrack {
  @scala.inline
  def apply(
    confirmSiteSpecificTrackingException: ConfirmSiteSpecificExceptionsInformation => scala.Boolean,
    confirmWebWideTrackingException: ExceptionInformation => scala.Boolean,
    removeSiteSpecificTrackingException: ExceptionInformation => Unit,
    removeWebWideTrackingException: ExceptionInformation => Unit,
    storeSiteSpecificTrackingException: StoreSiteSpecificExceptionsInformation => Unit,
    storeWebWideTrackingException: StoreExceptionsInformation => Unit
  ): MSNavigatorDoNotTrack = {
    val __obj = js.Dynamic.literal(confirmSiteSpecificTrackingException = js.Any.fromFunction1(confirmSiteSpecificTrackingException), confirmWebWideTrackingException = js.Any.fromFunction1(confirmWebWideTrackingException), removeSiteSpecificTrackingException = js.Any.fromFunction1(removeSiteSpecificTrackingException), removeWebWideTrackingException = js.Any.fromFunction1(removeWebWideTrackingException), storeSiteSpecificTrackingException = js.Any.fromFunction1(storeSiteSpecificTrackingException), storeWebWideTrackingException = js.Any.fromFunction1(storeWebWideTrackingException))
    __obj.asInstanceOf[MSNavigatorDoNotTrack]
  }
  @scala.inline
  implicit class MSNavigatorDoNotTrackOps[Self <: MSNavigatorDoNotTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfirmSiteSpecificTrackingException(value: ConfirmSiteSpecificExceptionsInformation => scala.Boolean): Self = this.set("confirmSiteSpecificTrackingException", js.Any.fromFunction1(value))
    @scala.inline
    def setConfirmWebWideTrackingException(value: ExceptionInformation => scala.Boolean): Self = this.set("confirmWebWideTrackingException", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveSiteSpecificTrackingException(value: ExceptionInformation => Unit): Self = this.set("removeSiteSpecificTrackingException", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveWebWideTrackingException(value: ExceptionInformation => Unit): Self = this.set("removeWebWideTrackingException", js.Any.fromFunction1(value))
    @scala.inline
    def setStoreSiteSpecificTrackingException(value: StoreSiteSpecificExceptionsInformation => Unit): Self = this.set("storeSiteSpecificTrackingException", js.Any.fromFunction1(value))
    @scala.inline
    def setStoreWebWideTrackingException(value: StoreExceptionsInformation => Unit): Self = this.set("storeWebWideTrackingException", js.Any.fromFunction1(value))
  }
  
}

