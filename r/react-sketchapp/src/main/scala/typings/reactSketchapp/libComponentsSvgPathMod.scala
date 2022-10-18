package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSvgPathMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Path", "Path")
  @js.native
  open class Path protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Path {
    
    @JSImport("react-sketchapp/lib/components/Svg/Path", "Path")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/Path", "Path.propTypes")
    @js.native
    def propTypes: D = js.native
    inline def propTypes_=(x: D): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[D]
}
