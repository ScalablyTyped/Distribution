package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSNavigatorDoNotTrack extends StObject {
  
  def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean
  
  def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean
  
  def removeSiteSpecificTrackingException(args: ExceptionInformation): Unit
  
  def removeWebWideTrackingException(args: ExceptionInformation): Unit
  
  def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): Unit
  
  def storeWebWideTrackingException(args: StoreExceptionsInformation): Unit
}
object MSNavigatorDoNotTrack {
  
  inline def apply(
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
  
  extension [Self <: MSNavigatorDoNotTrack](x: Self) {
    
    inline def setConfirmSiteSpecificTrackingException(value: ConfirmSiteSpecificExceptionsInformation => scala.Boolean): Self = StObject.set(x, "confirmSiteSpecificTrackingException", js.Any.fromFunction1(value))
    
    inline def setConfirmWebWideTrackingException(value: ExceptionInformation => scala.Boolean): Self = StObject.set(x, "confirmWebWideTrackingException", js.Any.fromFunction1(value))
    
    inline def setRemoveSiteSpecificTrackingException(value: ExceptionInformation => Unit): Self = StObject.set(x, "removeSiteSpecificTrackingException", js.Any.fromFunction1(value))
    
    inline def setRemoveWebWideTrackingException(value: ExceptionInformation => Unit): Self = StObject.set(x, "removeWebWideTrackingException", js.Any.fromFunction1(value))
    
    inline def setStoreSiteSpecificTrackingException(value: StoreSiteSpecificExceptionsInformation => Unit): Self = StObject.set(x, "storeSiteSpecificTrackingException", js.Any.fromFunction1(value))
    
    inline def setStoreWebWideTrackingException(value: StoreExceptionsInformation => Unit): Self = StObject.set(x, "storeWebWideTrackingException", js.Any.fromFunction1(value))
  }
}
