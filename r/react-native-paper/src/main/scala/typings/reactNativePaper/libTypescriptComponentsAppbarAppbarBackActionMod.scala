package typings.reactNativePaper

import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Disabled
import typings.reactNativePaper.anon.DisplayName
import typings.reactNativePaper.libTypescriptTypesMod.Omit
import typings.reactNativePaper.reactNativePaperStrings.icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsAppbarAppbarBackActionMod {
  
  /**
    * A component used to display a back button in the appbar.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/appbar-backaction-android.png" />
    *     <figcaption>Android</figcaption>
    *   </figure>
    * </div>
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/appbar-backaction-ios.png" />
    *     <figcaption>iOS</figcaption>
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Appbar } from 'react-native-paper';
    *
    *
    * const MyComponent = () => (
    *     <Appbar.Header>
    *       <Appbar.BackAction onPress={() => {}} />
    *     </Appbar.Header>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object default {
    
    inline def apply(hasAccessibilityLabelRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasAccessibilityLabelRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarBackAction", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarBackAction", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /**
    * A component used to display a back button in the appbar.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/appbar-backaction-android.png" />
    *     <figcaption>Android</figcaption>
    *   </figure>
    * </div>
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/appbar-backaction-ios.png" />
    *     <figcaption>iOS</figcaption>
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Appbar } from 'react-native-paper';
    *
    *
    * const MyComponent = () => (
    *     <Appbar.Header>
    *       <Appbar.BackAction onPress={() => {}} />
    *     </Appbar.Header>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object AppbarBackAction {
    
    inline def apply(hasAccessibilityLabelRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasAccessibilityLabelRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarBackAction", "AppbarBackAction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarBackAction", "AppbarBackAction.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = (Omit[ComponentPropsWithoutRef[DisplayName], icon]) & Disabled
}
