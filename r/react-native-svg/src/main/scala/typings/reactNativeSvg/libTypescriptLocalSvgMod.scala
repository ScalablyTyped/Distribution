package typings.reactNativeSvg

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import typings.reactNativeSvg.anon.Asset
import typings.reactNativeSvg.anon.Xml
import typings.reactNativeSvg.libTypescriptElementsSvgMod.SvgProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptLocalSvgMod {
  
  @JSImport("react-native-svg/lib/typescript/LocalSvg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: LocalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def LocalSvg(props: LocalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LocalSvg")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-native-svg/lib/typescript/LocalSvg", "WithLocalSvg")
  @js.native
  open class WithLocalSvg protected () extends Component[LocalProps, LocalState, Any] {
    def this(props: LocalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocalProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MWithLocalSvg(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MWithLocalSvg(prevProps: Asset): Unit = js.native
    
    def load(asset: ImageSourcePropType): js.Promise[Unit] = js.native
    
    @JSName("state")
    var state_WithLocalSvg: Xml = js.native
  }
  
  inline def getUriFromSource(source: ImageSourcePropType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUriFromSource")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isUriAnAndroidResourceIdentifier(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUriAnAndroidResourceIdentifier")().asInstanceOf[Boolean]
  inline def isUriAnAndroidResourceIdentifier(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUriAnAndroidResourceIdentifier")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadAndroidRawResource(uri: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAndroidRawResource")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  @JSImport("react-native-svg/lib/typescript/LocalSvg", "loadLocalRawResource")
  @js.native
  val loadLocalRawResource: js.Function1[/* source */ ImageSourcePropType, js.Promise[Any]] = js.native
  
  inline def loadLocalRawResourceAndroid(source: ImageSourcePropType): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLocalRawResourceAndroid")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def loadLocalRawResourceDefault(source: ImageSourcePropType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLocalRawResourceDefault")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait LocalProps
    extends StObject
       with SvgProps {
    
    var asset: ImageSourcePropType
    
    var `override`: js.UndefOr[js.Object] = js.undefined
  }
  object LocalProps {
    
    inline def apply(asset: ImageSourcePropType): LocalProps = {
      val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalProps]
    }
    
    extension [Self <: LocalProps](x: Self) {
      
      inline def setAsset(value: ImageSourcePropType): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
      
      inline def setAssetVarargs(value: ImageURISource*): Self = StObject.set(x, "asset", js.Array(value*))
      
      inline def setOverride(value: js.Object): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
  
  trait LocalState extends StObject {
    
    var xml: String | Null
  }
  object LocalState {
    
    inline def apply(): LocalState = {
      val __obj = js.Dynamic.literal(xml = null)
      __obj.asInstanceOf[LocalState]
    }
    
    extension [Self <: LocalState](x: Self) {
      
      inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
      
      inline def setXmlNull: Self = StObject.set(x, "xml", null)
    }
  }
}
