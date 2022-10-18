package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.PatternContentUnits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSvgPatternMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Pattern", "Pattern")
  @js.native
  open class Pattern protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Pattern {
    
    @JSImport("react-sketchapp/lib/components/Svg/Pattern", "Pattern")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/Pattern", "Pattern.propTypes")
    @js.native
    def propTypes: PatternContentUnits = js.native
    inline def propTypes_=(x: PatternContentUnits): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[PatternContentUnits]
}
