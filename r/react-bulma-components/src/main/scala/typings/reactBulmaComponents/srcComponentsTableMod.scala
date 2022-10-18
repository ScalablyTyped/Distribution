package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Container
import typings.reactBulmaComponents.reactBulmaComponentsStrings.fullwidth
import typings.reactBulmaComponents.reactBulmaComponentsStrings.narrow
import typings.reactBulmaComponents.reactBulmaComponentsStrings.table
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponentWithoutRenderAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsTableMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/table", JSImport.Default)
  @js.native
  val default: (BulmaComponentWithoutRenderAs[TableProps, table]) & Container = js.native
  
  trait TableProps extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[fullwidth | narrow] = js.undefined
    
    var striped: js.UndefOr[Boolean] = js.undefined
  }
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    extension [Self <: TableProps](x: Self) {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setSize(value: fullwidth | narrow): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
      
      inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
    }
  }
  
  type _To = (BulmaComponentWithoutRenderAs[TableProps, table]) & Container
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsTableMod.foo` */
  override def _to: (BulmaComponentWithoutRenderAs[TableProps, table]) & Container = default
}
