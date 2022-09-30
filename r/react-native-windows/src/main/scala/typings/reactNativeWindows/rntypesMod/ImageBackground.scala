package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNativeWindows.reactNativeWindowsStrings.disk
import typings.reactNativeWindows.reactNativeWindowsStrings.diskSlashmemory
import typings.reactNativeWindows.reactNativeWindowsStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native-windows.react-native-windows/rntypes.NativeMethods */ @JSImport("react-native-windows/rntypes", "ImageBackground")
@js.native
open class ImageBackground ()
  extends Component[ImageBackgroundProps, js.Object, Any] {
  
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  
  def getSize(
    uri: String,
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ Any, Unit]
  ): Any = js.native
  
  def prefetch(url: String): Any = js.native
  
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[String], 
      js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
    ]
  ] = js.native
  
  var resizeMode: ImageResizeMode = js.native
}
