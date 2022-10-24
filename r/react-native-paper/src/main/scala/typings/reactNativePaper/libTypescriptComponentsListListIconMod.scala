package typings.reactNativePaper

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.IconPropscolorstring
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsListListIconMod {
  
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
  object default {
    
    inline def apply(param0: Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/List/ListIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/List/ListIcon", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait Props extends StObject {
    
    /**
      * Color for the icon.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Icon to show.
      */
    var icon: IconSource
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object Props {
    
    inline def apply(icon: IconSource): Props = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
