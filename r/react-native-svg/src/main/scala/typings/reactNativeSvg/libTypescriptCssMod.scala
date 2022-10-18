package typings.reactNativeSvg

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNativeSvg.anon.Ast
import typings.reactNativeSvg.anon.Uri
import typings.reactNativeSvg.anon.Xml
import typings.reactNativeSvg.anon.`0`
import typings.reactNativeSvg.libTypescriptXmlMod.Middleware
import typings.reactNativeSvg.libTypescriptXmlMod.UriProps
import typings.reactNativeSvg.libTypescriptXmlMod.UriState
import typings.reactNativeSvg.libTypescriptXmlMod.XmlProps
import typings.reactNativeSvg.libTypescriptXmlMod.XmlState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptCssMod {
  
  @JSImport("react-native-svg/lib/typescript/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SvgCss(props: XmlProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgCss")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SvgCssUri(props: UriProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SvgCssUri")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-native-svg/lib/typescript/css", "SvgWithCss")
  @js.native
  open class SvgWithCss protected () extends Component[XmlProps, XmlState, Any] {
    def this(props: XmlProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: XmlProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MSvgWithCss(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSvgWithCss(prevProps: `0`): Unit = js.native
    
    def parse(): Unit = js.native
    def parse(xml: String): Unit = js.native
    
    @JSName("state")
    var state_SvgWithCss: Ast = js.native
  }
  
  @JSImport("react-native-svg/lib/typescript/css", "SvgWithCssUri")
  @js.native
  open class SvgWithCssUri protected () extends Component[UriProps, UriState, Any] {
    def this(props: UriProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UriProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MSvgWithCssUri(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSvgWithCssUri(prevProps: Uri): Unit = js.native
    
    def fetch(): js.Promise[Unit] = js.native
    def fetch(uri: String): js.Promise[Unit] = js.native
    
    @JSName("state")
    var state_SvgWithCssUri: Xml = js.native
  }
  
  @JSImport("react-native-svg/lib/typescript/css", "inlineStyles")
  @js.native
  val inlineStyles: Middleware = js.native
}
