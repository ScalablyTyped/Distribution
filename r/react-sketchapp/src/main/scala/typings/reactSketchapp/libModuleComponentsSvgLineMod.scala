package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.FillOpacity
import typings.reactSketchapp.anon.X1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsSvgLineMod {
  
  @JSImport("react-sketchapp/lib/module/components/Svg/Line", "Line")
  @js.native
  open class Line protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Line {
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Line", "Line")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Line", "Line.defaultProps")
    @js.native
    def defaultProps: X1 = js.native
    inline def defaultProps_=(x: X1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Line", "Line.propTypes")
    @js.native
    def propTypes: FillOpacity = js.native
    inline def propTypes_=(x: FillOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[FillOpacity]
}
