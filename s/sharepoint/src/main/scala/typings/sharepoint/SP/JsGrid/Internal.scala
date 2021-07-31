package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.AnyChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Internal {
  
  trait DiffTracker extends StObject {
    
    def Clear(): Unit
    
    var ExternalAPI: AnyChanges
    
    def NotifyRollbackChange(changeKey: IChangeKey): Unit
    
    def NotifySynchronizeToChange(changeKey: IChangeKey): Unit
    
    def NotifyVacateChange(changeKey: IChangeKey): Unit
  }
  object DiffTracker {
    
    @scala.inline
    def apply(
      Clear: () => Unit,
      ExternalAPI: AnyChanges,
      NotifyRollbackChange: IChangeKey => Unit,
      NotifySynchronizeToChange: IChangeKey => Unit,
      NotifyVacateChange: IChangeKey => Unit
    ): DiffTracker = {
      val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), ExternalAPI = ExternalAPI.asInstanceOf[js.Any], NotifyRollbackChange = js.Any.fromFunction1(NotifyRollbackChange), NotifySynchronizeToChange = js.Any.fromFunction1(NotifySynchronizeToChange), NotifyVacateChange = js.Any.fromFunction1(NotifyVacateChange))
      __obj.asInstanceOf[DiffTracker]
    }
    
    @scala.inline
    implicit class DiffTrackerMutableBuilder[Self <: DiffTracker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExternalAPI(value: AnyChanges): Self = StObject.set(x, "ExternalAPI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyRollbackChange(value: IChangeKey => Unit): Self = StObject.set(x, "NotifyRollbackChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifySynchronizeToChange(value: IChangeKey => Unit): Self = StObject.set(x, "NotifySynchronizeToChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyVacateChange(value: IChangeKey => Unit): Self = StObject.set(x, "NotifyVacateChange", js.Any.fromFunction1(value))
    }
  }
  
  trait PropertyUpdate
    extends StObject
       with IValue {
    
    @JSName("localized")
    var localized_PropertyUpdate: String
  }
  object PropertyUpdate {
    
    @scala.inline
    def apply(localized: String): PropertyUpdate = {
      val __obj = js.Dynamic.literal(localized = localized.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyUpdate]
    }
    
    @scala.inline
    implicit class PropertyUpdateMutableBuilder[Self <: PropertyUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalized(value: String): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    }
  }
}
