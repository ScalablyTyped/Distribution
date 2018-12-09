package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped TsTypeConstructor() */ @JSImport("react-native", "Image")
@js.native
class Image () extends js.Object

/* RemoveDifficultInheritance: 
- Dropped TsTypeConstructor() */ @JSImport("react-native", "Image")
@js.native
object Image extends js.Object {
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ scala.Double, scala.Unit]] = js.native
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[java.lang.String], 
      js.Promise[
        stdLib.Map[
          java.lang.String, 
          reactDashNativeLib.reactDashNativeLibStrings.memory | reactDashNativeLib.reactDashNativeLibStrings.disk
        ]
      ]
    ]
  ] = js.native
  def getSize(
    uri: java.lang.String,
    success: js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit],
    failure: js.Function1[/* error */ js.Any, scala.Unit]
  ): js.Any = js.native
  def prefetch(url: java.lang.String): js.Any = js.native
  /**
       * @see https://facebook.github.io/react-native/docs/image.html#resolveassetsource
       */
  def resolveAssetSource(source: reactDashNativeLib.reactDashNativeMod.ImageSourcePropType): reactDashNativeLib.reactDashNativeMod.ImageResolvedAssetSource = js.native
}

