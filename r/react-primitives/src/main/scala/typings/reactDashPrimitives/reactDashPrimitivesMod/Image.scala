package typings.reactDashPrimitives.reactDashPrimitivesMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.ImageResolvedAssetSource
import typings.reactDashNative.reactDashNativeMod.ImageSourcePropType
import typings.reactDashPrimitives.reactDashPrimitivesStrings.disk
import typings.reactDashPrimitives.reactDashPrimitivesStrings.diskSlashmemory
import typings.reactDashPrimitives.reactDashPrimitivesStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @JSImport("react-primitives", "Image")
@js.native
class Image ()
  extends typings.reactDashNative.reactDashNativeMod.Image

/* static members */
@JSImport("react-primitives", "Image")
@js.native
object Image extends js.Object {
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[String], 
      js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
    ]
  ] = js.native
  def getSize(
    uri: String,
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ js.Any, Unit]
  ): js.Any = js.native
  def prefetch(url: String): js.Any = js.native
  /**
    * @see https://facebook.github.io/react-native/docs/image.html#resolveassetsource
    */
  def resolveAssetSource(source: ImageSourcePropType): ImageResolvedAssetSource = js.native
}

