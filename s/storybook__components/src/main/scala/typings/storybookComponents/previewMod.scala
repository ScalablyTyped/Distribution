package typings.storybookComponents

import typings.react.mod.FunctionComponent
import typings.storybookComponents.actionBarMod.ActionItem
import typings.storybookComponents.sourceMod.SourceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  /**
    * A preview component for showing one or more component `Story`
    * items. The preview also shows the source for the component
    * as a drop-down.
    */
  @JSImport("@storybook/components/dist/blocks/Preview", "Preview")
  @js.native
  val Preview: FunctionComponent[PreviewProps] = js.native
  
  trait PreviewProps extends StObject {
    
    var additionalActions: js.UndefOr[js.Array[ActionItem]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columns: js.UndefOr[Double] = js.undefined
    
    var isColumn: js.UndefOr[Boolean] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var withSource: js.UndefOr[SourceProps] = js.undefined
    
    var withToolbar: js.UndefOr[Boolean] = js.undefined
  }
  object PreviewProps {
    
    inline def apply(): PreviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewProps]
    }
    
    extension [Self <: PreviewProps](x: Self) {
      
      inline def setAdditionalActions(value: js.Array[ActionItem]): Self = StObject.set(x, "additionalActions", value.asInstanceOf[js.Any])
      
      inline def setAdditionalActionsUndefined: Self = StObject.set(x, "additionalActions", js.undefined)
      
      inline def setAdditionalActionsVarargs(value: ActionItem*): Self = StObject.set(x, "additionalActions", js.Array(value :_*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setIsColumn(value: Boolean): Self = StObject.set(x, "isColumn", value.asInstanceOf[js.Any])
      
      inline def setIsColumnUndefined: Self = StObject.set(x, "isColumn", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setWithSource(value: SourceProps): Self = StObject.set(x, "withSource", value.asInstanceOf[js.Any])
      
      inline def setWithSourceUndefined: Self = StObject.set(x, "withSource", js.undefined)
      
      inline def setWithToolbar(value: Boolean): Self = StObject.set(x, "withToolbar", value.asInstanceOf[js.Any])
      
      inline def setWithToolbarUndefined: Self = StObject.set(x, "withToolbar", js.undefined)
    }
  }
}
