package typings.reactNativePaper

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Style
import typings.reactNativePaper.anon.TypeofView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogScrollAreaMod {
  
  /**
    * A component to show a scrollable content in a Dialog. The component only provides appropriate styling.
    * For the scrollable content you can use `ScrollView`, `FlatList` etc. depending on your requirement.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/dialog-scroll-area.gif" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { ScrollView } from 'react-native';
    * import { Dialog, Portal, Text } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [visible, setVisible] = React.useState(false);
    *
    *   const hideDialog = () => setVisible(false);
    *
    *   return (
    *     <Portal>
    *       <Dialog visible={visible} onDismiss={hideDialog}>
    *         <Dialog.ScrollArea>
    *           <ScrollView contentContainerStyle={{paddingHorizontal: 24}}>
    *             <Text>This is a scrollable area</Text>
    *           </ScrollView>
    *         </Dialog.ScrollArea>
    *       </Dialog>
    *     </Portal>
    *   );
    * };
    *
    * export default MyComponent;
    * ```
    */
  object default {
    
    inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Dialog/DialogScrollArea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Dialog/DialogScrollArea", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentPropsWithRef[TypeofView] & Style
}
