package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.ViewBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgSymbolMod {
  
  @JSImport("react-sketchapp/lib/module/components/Svg/Symbol", "Symbol")
  @js.native
  open class Symbol protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Symbol {
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Symbol", "Symbol")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Symbol", "Symbol.propTypes")
    @js.native
    def propTypes: ViewBox = js.native
    inline def propTypes_=(x: ViewBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[ViewBox]
}
