package typings.reactNativePaper

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.global.JSX.Element
import typings.reactNativePaper.anon.Style
import typings.reactNativePaper.anon.TypeofView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsCardCardActionsMod {
  
  /**
    * A component to show a list of actions inside a Card.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/card-actions.png" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Card, Button } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <Card>
    *     <Card.Actions>
    *       <Button>Cancel</Button>
    *       <Button>Ok</Button>
    *     </Card.Actions>
    *   </Card>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object default {
    
    inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Card/CardActions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Card/CardActions", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentPropsWithRef[TypeofView] & Style
}
