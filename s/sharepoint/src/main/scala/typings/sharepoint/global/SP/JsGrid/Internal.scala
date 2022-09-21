package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.anon.AnyChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Internal {
  
  @JSGlobal("SP.JsGrid.Internal.DiffTracker")
  @js.native
  open class DiffTracker protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.Internal.DiffTracker {
    def this(
      objBag: Any,
      fnGetChange: js.Function4[
            /* version */ Any, 
            /* keys */ js.Array[Any], 
            /* synchronized */ Boolean, 
            /* includeInvalidPropUpdates */ Boolean, 
            Any
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
  open class PropertyUpdate protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate {
    def this(data: Any, localized: String) = this()
    
    /* CompleteClass */
    @JSName("localized")
    var localized_PropertyUpdate: String = js.native
  }
}
