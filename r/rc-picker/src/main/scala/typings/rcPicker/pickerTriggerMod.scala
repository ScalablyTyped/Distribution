package typings.rcPicker

import typings.rcPicker.rcPickerStrings.ltr
import typings.rcPicker.rcPickerStrings.rtl
import typings.rcTrigger.interfaceMod.AlignType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerTriggerMod {
  
  @JSImport("rc-picker/es/PickerTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    hasPrefixClsPopupElementPopupStyleVisibleDropdownClassNameDropdownAlignTransitionNameGetPopupContainerChildrenRangePopupPlacementDirection: PickerTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsPopupElementPopupStyleVisibleDropdownClassNameDropdownAlignTransitionNameGetPopupContainerChildrenRangePopupPlacementDirection.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PickerTriggerProps extends StObject {
    
    var children: ReactElement
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var dropdownAlign: js.UndefOr[AlignType] = js.undefined
    
    var dropdownClassName: js.UndefOr[String] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var popupElement: ReactElement
    
    var popupPlacement: js.UndefOr[Placement] = js.undefined
    
    var popupStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: String
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var visible: Boolean
  }
  object PickerTriggerProps {
    
    @scala.inline
    def apply(children: ReactElement, popupElement: ReactElement, prefixCls: String, visible: Boolean): PickerTriggerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], popupElement = popupElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerTriggerProps]
    }
    
    @scala.inline
    implicit class PickerTriggerPropsMutableBuilder[Self <: PickerTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setPopupElement(value: ReactElement): Self = StObject.set(x, "popupElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPlacement(value: Placement): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcPicker.rcPickerStrings.bottomLeft
    - typings.rcPicker.rcPickerStrings.bottomRight
    - typings.rcPicker.rcPickerStrings.topLeft
    - typings.rcPicker.rcPickerStrings.topRight
  */
  trait Placement extends StObject
  object Placement {
    
    @scala.inline
    def bottomLeft: typings.rcPicker.rcPickerStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.rcPicker.rcPickerStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: typings.rcPicker.rcPickerStrings.bottomRight = "bottomRight".asInstanceOf[typings.rcPicker.rcPickerStrings.bottomRight]
    
    @scala.inline
    def topLeft: typings.rcPicker.rcPickerStrings.topLeft = "topLeft".asInstanceOf[typings.rcPicker.rcPickerStrings.topLeft]
    
    @scala.inline
    def topRight: typings.rcPicker.rcPickerStrings.topRight = "topRight".asInstanceOf[typings.rcPicker.rcPickerStrings.topRight]
  }
}
