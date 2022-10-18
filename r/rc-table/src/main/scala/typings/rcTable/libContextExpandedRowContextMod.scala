package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.libContextSelectorMod.ReturnCreateContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextExpandedRowContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/ExpandedRowContext", JSImport.Default)
  @js.native
  val default: ReturnCreateContext[ExpandedRowProps] = js.native
  
  trait ExpandedRowProps extends StObject {
    
    var componentWidth: Double
    
    var fixColumn: Boolean
    
    var fixHeader: Boolean
    
    var horizonScroll: Boolean
  }
  object ExpandedRowProps {
    
    inline def apply(componentWidth: Double, fixColumn: Boolean, fixHeader: Boolean, horizonScroll: Boolean): ExpandedRowProps = {
      val __obj = js.Dynamic.literal(componentWidth = componentWidth.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandedRowProps]
    }
    
    extension [Self <: ExpandedRowProps](x: Self) {
      
      inline def setComponentWidth(value: Double): Self = StObject.set(x, "componentWidth", value.asInstanceOf[js.Any])
      
      inline def setFixColumn(value: Boolean): Self = StObject.set(x, "fixColumn", value.asInstanceOf[js.Any])
      
      inline def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      inline def setHorizonScroll(value: Boolean): Self = StObject.set(x, "horizonScroll", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReturnCreateContext[ExpandedRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `libContextExpandedRowContextMod.foo` */
  override def _to: ReturnCreateContext[ExpandedRowProps] = default
}
