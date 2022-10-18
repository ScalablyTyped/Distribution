package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.CallHasChildrenThemeStyleRest
import typings.reactNativePaper.anon.PickchildrenReactNodestylAccessibilityActions
import typings.reactNativePaper.anon.StyleTheme
import typings.reactNativePaper.anon.childrenReactNodestyleSty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDialogDialogTitleMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Dialog/DialogTitle", JSImport.Default)
  @js.native
  val default: ComponentType[PickchildrenReactNodestylAccessibilityActions] & (NonReactStatics[
    ComponentType[childrenReactNodestyleSty] & CallHasChildrenThemeStyleRest, 
    js.Object
  ]) = js.native
  
  /**
    * A component to show a title in a Dialog.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/dialog-title.png" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Paragraph, Dialog, Portal } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [visible, setVisible] = React.useState(false);
    *
    *   const hideDialog = () => setVisible(false);
    *
    *   return (
    *     <Portal>
    *       <Dialog visible={visible} onDismiss={hideDialog}>
    *         <Dialog.Title>This is a title</Dialog.Title>
    *         <Dialog.Content>
    *           <Paragraph>This is simple dialog</Paragraph>
    *         </Dialog.Content>
    *       </Dialog>
    *     </Portal>
    *   );
    * };
    *
    * export default MyComponent;
    * ```
    */
  object DialogTitle {
    
    inline def apply(hasChildrenThemeStyleRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenThemeStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Dialog/DialogTitle", "DialogTitle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Dialog/DialogTitle", "DialogTitle.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = (ComponentPropsWithRef[
    js.Function1[
      /* props */ typings.reactNativePaper.libTypescriptComponentsTypographyTitleMod.Props, 
      Element
    ]
  ]) & StyleTheme
  
  type _To = ComponentType[PickchildrenReactNodestylAccessibilityActions] & (NonReactStatics[
    ComponentType[childrenReactNodestyleSty] & CallHasChildrenThemeStyleRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsDialogDialogTitleMod.foo` */
  override def _to: ComponentType[PickchildrenReactNodestylAccessibilityActions] & (NonReactStatics[
    ComponentType[childrenReactNodestyleSty] & CallHasChildrenThemeStyleRest, 
    js.Object
  ]) = default
}
