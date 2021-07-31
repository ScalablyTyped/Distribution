package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.anon.AnyChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Internal {
  
  @JSGlobal("SP.JsGrid.Internal.DiffTracker")
  @js.native
  class DiffTracker protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.Internal.DiffTracker {
    def this(
      objBag: js.Any,
      fnGetChange: js.Function4[
            /* version */ js.Any, 
            /* keys */ js.Array[js.Any], 
            /* synchronized */ Boolean, 
            /* includeInvalidPropUpdates */ Boolean, 
            js.Any
          ]
    ) = this()
    
    /* CompleteClass */
    override def Clear(): Unit = js.native
    
    /* CompleteClass */
    var ExternalAPI: AnyChanges = js.native
    
    /* CompleteClass */
    override def NotifyRollbackChange(changeKey: IChangeKey): Unit = js.native
    
    /* CompleteClass */
    override def NotifySynchronizeToChange(changeKey: IChangeKey): Unit = js.native
    
    /* CompleteClass */
    override def NotifyVacateChange(changeKey: IChangeKey): Unit = js.native
  }
  
  @JSGlobal("SP.JsGrid.Internal.PropertyUpdate")
  @js.native
  class PropertyUpdate protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate {
    def this(data: js.Any, localized: String) = this()
    
    /* CompleteClass */
    @JSName("localized")
    var localized_PropertyUpdate: String = js.native
  }
}
