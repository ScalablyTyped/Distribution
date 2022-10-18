package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.anon.ButtonGroupPropsPartialTh
import typings.reactNativeElements.anon.ForwardRefExoticComponentAccordion
import typings.reactNativeElements.anon.FunctionComponentPickTouc
import typings.reactNativeElements.anon.PartialIconPropsPartialThAccessibilityActions
import typings.reactNativeElements.anon.PickButtonGroupPropsParti
import typings.reactNativeElements.anon.PickPartialIconPropsPartiAccessibilityActions
import typings.reactNativeElements.anon.PickTextInputPropsRefAttrAccessibilityActions
import typings.reactNativeElements.anon.PickTextPropsrightboolean
import typings.reactNativeElements.anon.PickTouchableOpacityPropsAccessibilityElementsHidden
import typings.reactNativeElements.anon.PickcontainerStyleStylePrAccessibilityActions
import typings.reactNativeElements.anon.PickstyleStylePropTextSty
import typings.reactNativeElements.anon.TextInputPropsRefAttributAccessibilityElementsHidden
import typings.reactNativeElements.anon.TextPropsrightbooleanundeAccessibilityActions
import typings.reactNativeElements.anon.TextPropsrightbooleanundeAccessibilityElementsHidden
import typings.reactNativeElements.anon.TouchableOpacityPropsChecAccessibilityElementsHidden
import typings.reactNativeElements.anon.containerStyleStylePropViAccessibilityActions
import typings.reactNativeElements.anon.styleStylePropTextStyleunAccessibilityActions
import typings.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import typings.reactNativeElements.distListListItemBaseMod.ListItemProps
import typings.reactNativeElements.distListListItemSwipeableMod.ListItemSwipeableProps
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListListItemMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/list/ListItem", JSImport.Default)
  @js.native
  val default: FunctionComponentPickTouc | ForwardRefExoticComponentAccordion = js.native
  
  @js.native
  trait ListItem
    extends StObject
       with FunctionComponent[ListItemProps & Partial[ThemeProps[ListItemProps]]] {
    
    var Accordion: FunctionComponent[PickcontainerStyleStylePrAccessibilityActions] | ForwardRefExoticComponent[containerStyleStylePropViAccessibilityActions] = js.native
    
    var ButtonGroup: FunctionComponent[PickButtonGroupPropsParti] | ForwardRefExoticComponent[ButtonGroupPropsPartialTh] = js.native
    
    var CheckBox: FunctionComponent[PickTouchableOpacityPropsAccessibilityElementsHidden] | ForwardRefExoticComponent[TouchableOpacityPropsChecAccessibilityElementsHidden] = js.native
    
    var Chevron: FunctionComponent[PickPartialIconPropsPartiAccessibilityActions] | ForwardRefExoticComponent[PartialIconPropsPartialThAccessibilityActions] = js.native
    
    var Content: FunctionComponent[PickstyleStylePropTextSty] | ForwardRefExoticComponent[styleStylePropTextStyleunAccessibilityActions] = js.native
    
    var Input: FunctionComponent[PickTextInputPropsRefAttrAccessibilityActions] | ForwardRefExoticComponent[TextInputPropsRefAttributAccessibilityElementsHidden] = js.native
    
    var Subtitle: FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityElementsHidden] = js.native
    
    var Swipeable: RneFunctionComponent[ListItemSwipeableProps] = js.native
    
    var Title: FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityActions] = js.native
  }
  @JSImport("react-native-elements/dist/list/ListItem", "ListItem")
  @js.native
  val ListItem: typings.reactNativeElements.distListListItemMod.ListItem = js.native
  
  type _To = FunctionComponentPickTouc | ForwardRefExoticComponentAccordion
  
  /* This means you don't have to write `default`, but can instead just say `distListListItemMod.foo` */
  override def _to: FunctionComponentPickTouc | ForwardRefExoticComponentAccordion = default
}
