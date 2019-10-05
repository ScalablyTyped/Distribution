package typings.sharepoint.SP.JsGrid

import typings.sharepoint.Anon_AnyChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Internal")
@js.native
object Internal extends js.Object {
  @js.native
  class DiffTracker protected () extends js.Object {
    def this(
      objBag: js.Any,
      fnGetChange: js.Function4[
            /* version */ js.Any, 
            /* keys */ js.Array[_], 
            /* synchronized */ Boolean, 
            /* includeInvalidPropUpdates */ Boolean, 
            _
          ]
    ) = this()
    var ExternalAPI: Anon_AnyChanges = js.native
    def Clear(): Unit = js.native
    def NotifyRollbackChange(changeKey: IChangeKey): Unit = js.native
    def NotifySynchronizeToChange(changeKey: IChangeKey): Unit = js.native
    def NotifyVacateChange(changeKey: IChangeKey): Unit = js.native
  }
  
  @js.native
  class PropertyUpdate protected () extends IValue {
    def this(data: js.Any, localized: String) = this()
    @JSName("localized")
    var localized_PropertyUpdate: String = js.native
  }
  
}

