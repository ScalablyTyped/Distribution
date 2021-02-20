package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcSelect.interfaceMod.RenderDOMFunc
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectTriggerMod extends Shortcut {
  
  @JSImport("rc-select/lib/SelectTrigger", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SelectTriggerProps with RefAttributes[RefTriggerProps]] = js.native
  
  @js.native
  trait RefTriggerProps extends StObject {
    
    def getPopupElement(): HTMLDivElement = js.native
  }
  object RefTriggerProps {
    
    @scala.inline
    def apply(getPopupElement: () => HTMLDivElement): RefTriggerProps = {
      val __obj = js.Dynamic.literal(getPopupElement = js.Any.fromFunction0(getPopupElement))
      __obj.asInstanceOf[RefTriggerProps]
    }
    
    @scala.inline
    implicit class RefTriggerPropsMutableBuilder[Self <: RefTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPopupElement(value: () => HTMLDivElement): Self = StObject.set(x, "getPopupElement", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SelectTriggerProps extends StObject {
    
    var animation: js.UndefOr[String] = js.native
    
    var children: ReactElement = js.native
    
    var containerWidth: Double = js.native
    
    var direction: String = js.native
    
    var disabled: Boolean = js.native
    
    var dropdownAlign: js.Object = js.native
    
    var dropdownClassName: String = js.native
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.native
    
    var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.native
    
    var dropdownStyle: CSSProperties = js.native
    
    var empty: Boolean = js.native
    
    var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.native
    
    def getTriggerDOMNode(): HTMLElement = js.native
    
    var popupElement: ReactElement = js.native
    
    var prefixCls: String = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var visible: Boolean = js.native
  }
  object SelectTriggerProps {
    
    @scala.inline
    def apply(
      children: ReactElement,
      containerWidth: Double,
      direction: String,
      disabled: Boolean,
      dropdownAlign: js.Object,
      dropdownClassName: String,
      dropdownStyle: CSSProperties,
      empty: Boolean,
      getTriggerDOMNode: () => HTMLElement,
      popupElement: ReactElement,
      prefixCls: String,
      visible: Boolean
    ): SelectTriggerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdownAlign = dropdownAlign.asInstanceOf[js.Any], dropdownClassName = dropdownClassName.asInstanceOf[js.Any], dropdownStyle = dropdownStyle.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], getTriggerDOMNode = js.Any.fromFunction0(getTriggerDOMNode), popupElement = popupElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectTriggerProps]
    }
    
    @scala.inline
    implicit class SelectTriggerPropsMutableBuilder[Self <: SelectTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlign(value: js.Object): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidth(value: Boolean | Double): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      @scala.inline
      def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      @scala.inline
      def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPopupContainer(value: /* props */ js.Any => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setGetTriggerDOMNode(value: () => HTMLElement): Self = StObject.set(x, "getTriggerDOMNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPopupElement(value: ReactElement): Self = StObject.set(x, "popupElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[SelectTriggerProps with RefAttributes[RefTriggerProps]]
  
  /* This means you don't have to write `default`, but can instead just say `selectTriggerMod.foo` */
  override def _to: ForwardRefExoticComponent[SelectTriggerProps with RefAttributes[RefTriggerProps]] = default
}
