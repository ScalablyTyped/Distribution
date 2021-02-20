package typings.sharepoint.global.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Internal {
  
  @JSGlobal("SP.JsGrid.Internal.DiffTracker")
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
  
  @JSGlobal("SP.JsGrid.Internal.PropertyUpdate")
  @js.native
  class PropertyUpdate protected ()
    extends typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate {
    def this(data: js.Any, localized: String) = this()
  }
}
