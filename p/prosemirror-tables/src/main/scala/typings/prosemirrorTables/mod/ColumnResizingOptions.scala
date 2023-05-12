package typings.prosemirrorTables.mod

import org.scalablytyped.runtime.Instantiable3
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorView.mod.EditorView
import typings.prosemirrorView.mod.NodeView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait ColumnResizingOptions extends StObject {
  
  var View: js.UndefOr[
    Instantiable3[/* node */ Node, /* cellMinWidth */ Double, /* view */ EditorView, NodeView]
  ] = js.undefined
  
  var cellMinWidth: js.UndefOr[Double] = js.undefined
  
  var handleWidth: js.UndefOr[Double] = js.undefined
  
  var lastColumnResizable: js.UndefOr[Boolean] = js.undefined
}
object ColumnResizingOptions {
  
  inline def apply(): ColumnResizingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnResizingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnResizingOptions] (val x: Self) extends AnyVal {
    
    inline def setCellMinWidth(value: Double): Self = StObject.set(x, "cellMinWidth", value.asInstanceOf[js.Any])
    
    inline def setCellMinWidthUndefined: Self = StObject.set(x, "cellMinWidth", js.undefined)
    
    inline def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
    
    inline def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
    
    inline def setLastColumnResizable(value: Boolean): Self = StObject.set(x, "lastColumnResizable", value.asInstanceOf[js.Any])
    
    inline def setLastColumnResizableUndefined: Self = StObject.set(x, "lastColumnResizable", js.undefined)
    
    inline def setView(value: Instantiable3[/* node */ Node, /* cellMinWidth */ Double, /* view */ EditorView, NodeView]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
  }
}
