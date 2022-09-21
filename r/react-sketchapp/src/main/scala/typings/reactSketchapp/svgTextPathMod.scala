package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.BaselineShift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgTextPathMod {
  
  @JSImport("react-sketchapp/lib/module/components/Svg/TextPath", "TextPath")
  @js.native
  open class TextPath protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object TextPath {
    
    @JSImport("react-sketchapp/lib/module/components/Svg/TextPath", "TextPath")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Svg/TextPath", "TextPath.propTypes")
    @js.native
    def propTypes: BaselineShift = js.native
    inline def propTypes_=(x: BaselineShift): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[BaselineShift]
}
