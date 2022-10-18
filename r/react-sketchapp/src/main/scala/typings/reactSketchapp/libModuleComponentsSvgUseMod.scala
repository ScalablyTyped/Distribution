package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.OriginX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsSvgUseMod {
  
  @JSImport("react-sketchapp/lib/module/components/Svg/Use", "Use")
  @js.native
  open class Use protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Use {
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Use", "Use")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Svg/Use", "Use.propTypes")
    @js.native
    def propTypes: OriginX = js.native
    inline def propTypes_=(x: OriginX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[OriginX]
}
