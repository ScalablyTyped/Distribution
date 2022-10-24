package typings.reactNativePaper

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Index
import typings.reactNativePaper.anon.TypeofView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsCardCardContentMod {
  
  /**
    * A component to show content inside a Card.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/card-content-example.png" />
    *   </figure>
    * </div>
    *
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Card, Title, Paragraph } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <Card>
    *     <Card.Content>
    *       <Title>Card title</Title>
    *       <Paragraph>Card content</Paragraph>
    *     </Card.Content>
    *   </Card>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object default {
    
    inline def apply(param0: Props): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Card/CardContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Card/CardContent", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentPropsWithRef[TypeofView] & Index
}
