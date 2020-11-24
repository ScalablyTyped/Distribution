package typings.reactNativeSafeAreaContext

import org.scalablytyped.runtime.Instantiable0
import typings.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-safe-area-context/lib/typescript/src/SafeAreaView.macos", JSImport.Namespace)
@js.native
object safeAreaViewMacosMod extends js.Object {
  
  @js.native
  class SafeAreaView () extends View
  @js.native
  object SafeAreaView extends Instantiable0[View] {
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    var forceTouchAvailable: Boolean = js.native
  }
}
