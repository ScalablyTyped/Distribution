package typings.storybookComponents

import typings.react.mod.FunctionComponent
import typings.storybookComponents.actionBarMod.ActionItem
import typings.storybookComponents.sourceMod.SourceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait PreviewProps extends StObject {
    
    var additionalActions: js.UndefOr[js.Array[ActionItem]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var columns: js.UndefOr[Double] = js.native
    
    var isColumn: js.UndefOr[Boolean] = js.native
    
    var isExpanded: js.UndefOr[Boolean] = js.native
    
    var withSource: js.UndefOr[SourceProps] = js.native
    
    var withToolbar: js.UndefOr[Boolean] = js.native
  }
  object PreviewProps {
    
    @scala.inline
    def apply(): PreviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewProps]
    }
    
    @scala.inline
    implicit class PreviewPropsMutableBuilder[Self <: PreviewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalActions(value: js.Array[ActionItem]): Self = StObject.set(x, "additionalActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalActionsUndefined: Self = StObject.set(x, "additionalActions", js.undefined)
      
      @scala.inline
      def setAdditionalActionsVarargs(value: ActionItem*): Self = StObject.set(x, "additionalActions", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setIsColumn(value: Boolean): Self = StObject.set(x, "isColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsColumnUndefined: Self = StObject.set(x, "isColumn", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setWithSource(value: SourceProps): Self = StObject.set(x, "withSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithSourceUndefined: Self = StObject.set(x, "withSource", js.undefined)
      
      @scala.inline
      def setWithToolbar(value: Boolean): Self = StObject.set(x, "withToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithToolbarUndefined: Self = StObject.set(x, "withToolbar", js.undefined)
    }
  }
}
