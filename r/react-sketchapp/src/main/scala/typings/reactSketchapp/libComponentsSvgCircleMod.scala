package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.ClipPath
import typings.reactSketchapp.anon.Cx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSvgCircleMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Circle", "Circle")
  @js.native
  open class Circle protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Circle {
    
    @JSImport("react-sketchapp/lib/components/Svg/Circle", "Circle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/Circle", "Circle.defaultProps")
    @js.native
    def defaultProps: Cx = js.native
    inline def defaultProps_=(x: Cx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/Svg/Circle", "Circle.propTypes")
    @js.native
    def propTypes: ClipPath = js.native
    inline def propTypes_=(x: ClipPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[ClipPath]
}
