package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.anon.AnyChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Internal")
@js.native
object Internal extends js.Object {
  @js.native
  class DiffTracker protected ()
    extends typings.sharepoint.SP.JsGrid.Internal.DiffTracker {
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
    /* CompleteClass */
    override var ExternalAPI: AnyChanges = js.native
    /* CompleteClass */
    override def Clear(): Unit = js.native
    /* CompleteClass */
    override def NotifyRollbackChange(changeKey: IChangeKey): Unit = js.native
    /* CompleteClass */
    override def NotifySynchronizeToChange(changeKey: IChangeKey): Unit = js.native
    /* CompleteClass */
    override def NotifyVacateChange(changeKey: IChangeKey): Unit = js.native
  }
  
  @js.native
  class PropertyUpdate protected ()
    extends typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate {
    def this(data: js.Any, localized: String) = this()
    /* CompleteClass */
    @JSName("localized")
    override var localized_PropertyUpdate: String = js.native
  }
  
}

