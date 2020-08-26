package typings.sharepoint.global.SP.JsGrid

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
  }
  
  @js.native
  class PropertyUpdate protected ()
    extends typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate {
    def this(data: js.Any, localized: String) = this()
  }
  
}

