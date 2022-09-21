package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNative.reactNativeStrings.disk
import typings.reactNative.reactNativeStrings.diskSlashmemory
import typings.reactNative.reactNativeStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("react-native", "Image")
@js.native
open class Image ()
  extends Component[ImageProps, js.Object, Any]
/* static members */
object Image {
  
  @JSImport("react-native", "Image")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "Image.abortPrefetch")
  @js.native
  def abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  inline def abortPrefetch_=(x: js.UndefOr[js.Function1[/* requestId */ Double, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abortPrefetch")(x.asInstanceOf[js.Any])
  
  inline def getSize(uri: String, success: js.Function2[/* width */ Double, /* height */ Double, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(uri.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getSize(
    uri: String,
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ Any, Unit]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(uri.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getSizeWithHeaders(
    uri: String,
    headers: StringDictionary[String],
    success: js.Function2[/* width */ Double, /* height */ Double, Unit]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSizeWithHeaders")(uri.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getSizeWithHeaders(
    uri: String,
    headers: StringDictionary[String],
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ Any, Unit]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSizeWithHeaders")(uri.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def prefetch(url: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def prefetchWithMetadata(url: String, queryRootName: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("prefetchWithMetadata")(url.asInstanceOf[js.Any], queryRootName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def prefetchWithMetadata(url: String, queryRootName: String, rootTag: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("prefetchWithMetadata")(url.asInstanceOf[js.Any], queryRootName.asInstanceOf[js.Any], rootTag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("react-native", "Image.queryCache")
  @js.native
  def queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[String], 
      js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
    ]
  ] = js.native
  inline def queryCache_=(
    x: js.UndefOr[
      js.Function1[
        /* urls */ js.Array[String], 
        js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryCache")(x.asInstanceOf[js.Any])
  
  /**
    * @see https://reactnative.dev/docs/image#resolveassetsource
    */
  inline def resolveAssetSource(source: ImageSourcePropType): ImageResolvedAssetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAssetSource")(source.asInstanceOf[js.Any]).asInstanceOf[ImageResolvedAssetSource]
}
