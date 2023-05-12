package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.react.mod.Component
import typings.reactSketchapp.anon.Href
import typings.reactSketchapp.anon.PreserveAspectRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSvgImageMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Image", "SVGImage")
  @js.native
  open class SVGImage protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object SVGImage {
    
    @JSImport("react-sketchapp/lib/components/Svg/Image", "SVGImage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/Svg/Image", "SVGImage.defaultProps")
    @js.native
    def defaultProps: PreserveAspectRatio = js.native
    inline def defaultProps_=(x: PreserveAspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/Svg/Image", "SVGImage.propTypes")
    @js.native
    def propTypes: Href = js.native
    inline def propTypes_=(x: Href): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[Href]
}
