package typings.reactNativePaper

import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Call
import typings.reactNativePaper.anon.Description
import typings.reactNativePaper.anon.PickPropsstyletitlechildr
import typings.reactNativePaper.anon.PickRemoveChildrenComponeAccessibilityViewIsModal
import typings.reactNativePaper.anon.PickTouchableWithoutFeedb
import typings.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityValue
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAdjustsFontSizeToFit
import typings.reactNativePaper.anon.PickthemeDeepPartialThemeAllowFontScaling
import typings.reactNativePaper.anon.TouchableWithoutFeedbackP
import typings.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityState
import typings.reactNativePaper.anon.`19`
import typings.reactNativePaper.anon.`20`
import typings.reactNativePaper.anon.`21`
import typings.reactNativePaper.anon.`22`
import typings.reactNativePaper.libTypescriptComponentsListListAccordionMod.Props
import typings.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsListListMod {
  
  @JSImport("react-native-paper/lib/typescript/components/List/List", "Accordion")
  @js.native
  val Accordion: ComponentType[PickPropsstyletitlechildr] & (NonReactStatics[ComponentType[Props] & `19`, js.Object]) = js.native
  
  /**
    * List.AccordionGroup allows to control a group of List Accordions. `id` prop for List.Accordion is required in order for group to work.
    * List.AccordionGroup can be a controlled or uncontrolled component. The example shows the uncontrolled version.
    * At most one Accordion can be expanded at a given time.
    *
    * <div class="screenshots">
    *   <img class="medium" src="screenshots/list-accordion-group.png" />
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { View, Text } from 'react-native';
    * import { List } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <List.AccordionGroup>
    *     <List.Accordion title="Accordion 1" id="1">
    *       <List.Item title="Item 1" />
    *     </List.Accordion>
    *     <List.Accordion title="Accordion 2" id="2">
    *       <List.Item title="Item 2" />
    *     </List.Accordion>
    *     <View>
    *       <Text>
    *         List.Accordion can be wrapped because implementation uses React.Context.
    *       </Text>
    *       <List.Accordion title="Accordion 3" id="3">
    *         <List.Item title="Item 3" />
    *       </List.Accordion>
    *     </View>
    *   </List.AccordionGroup>
    * );
    *
    * export default MyComponent;
    *```
    */
  object AccordionGroup {
    
    inline def apply(param0: typings.reactNativePaper.libTypescriptComponentsListListAccordionGroupMod.Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/List/List", "AccordionGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/List/List", "AccordionGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /**
    * A component to show an icon in a list item.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/list-icon.png" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { List, Colors } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <>
    *     <List.Icon color={Colors.blue500} icon="folder" />
    *     <List.Icon color={Colors.blue500} icon="equal" />
    *     <List.Icon color={Colors.blue500} icon="calendar" />
    *   </>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object Icon {
    
    inline def apply(param0: typings.reactNativePaper.libTypescriptComponentsListListIconMod.Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/List/List", "Icon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/List/List", "Icon.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/List/List", "Item")
  @js.native
  val Item: ComponentType[PickRemoveChildrenComponeAccessibilityViewIsModal] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & Description
    ]) & `20`, 
    js.Object
  ]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/List/List", "Section")
  @js.native
  val Section: ComponentType[PickViewPropsRefAttributeAccessibilityValue] & (NonReactStatics[ComponentType[ViewPropsRefAttributesVieAccessibilityState] & `21`, js.Object]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/List/List", "Subheader")
  @js.native
  val Subheader: (ComponentType[
    PickthemeDeepPartialThemeAdjustsFontSizeToFit | PickthemeDeepPartialThemeAllowFontScaling
  ]) & (NonReactStatics[
    ComponentType[typings.reactNativePaper.libTypescriptComponentsListListSubheaderMod.Props] & `22`, 
    js.Object
  ]) = js.native
}
