package typings.reactDashNative.reactDashNativeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeStrings.`disk/memory`
import typings.reactDashNative.reactDashNativeStrings.disk
import typings.reactDashNative.reactDashNativeStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @JSImport("react-native", "ImageBackground")
@js.native
class ImageBackground ()
  extends Component[ImageBackgroundProps, js.Object, js.Any] {
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[String], 
      js.Promise[StringDictionary[memory | disk | `disk/memory`]]
    ]
  ] = js.native
  var resizeMode: ImageResizeMode = js.native
  def getSize(
    uri: String,
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ js.Any, Unit]
  ): js.Any = js.native
  def prefetch(url: String): js.Any = js.native
}

