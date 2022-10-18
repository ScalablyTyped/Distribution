package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.Fx
import typings.reactSketchapp.anon.Fy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSvgRadialGradientMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/RadialGradient", "RadialGradient")
  @js.native
  open class RadialGradient protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object RadialGradient {
    
    @JSImport("react-sketchapp/lib/components/Svg/RadialGradient", "RadialGradient")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/RadialGradient", "RadialGradient.defaultProps")
    @js.native
    def defaultProps: Fy = js.native
    inline def defaultProps_=(x: Fy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/Svg/RadialGradient", "RadialGradient.propTypes")
    @js.native
    def propTypes: Fx = js.native
    inline def propTypes_=(x: Fx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[Fx]
}
