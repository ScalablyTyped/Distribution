package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipPathMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/ClipPath", "ClipPath")
  @js.native
  open class ClipPath protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object ClipPath {
    
    @JSImport("react-sketchapp/lib/components/Svg/ClipPath", "ClipPath")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/ClipPath", "ClipPath.propTypes")
    @js.native
    def propTypes: Id = js.native
    inline def propTypes_=(x: Id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[Id]
}
