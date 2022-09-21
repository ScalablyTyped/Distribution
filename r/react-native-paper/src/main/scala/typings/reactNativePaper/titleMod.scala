package typings.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Text
import typings.reactNativePaper.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("react-native-paper/lib/typescript/components/Typography/Title", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Typography component for showing a title.
    *
    * <div class="screenshots">
    *   <img src="screenshots/title.png" />
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Title } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <Title>Title</Title>
    * );
    *
    * export default MyComponent;
    * ```
    */
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type Props = ComponentProps[Instantiable0[Text]] & `1`
}
