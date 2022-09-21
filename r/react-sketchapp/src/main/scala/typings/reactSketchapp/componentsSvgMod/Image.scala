package typings.reactSketchapp.componentsSvgMod

import typings.reactSketchapp.anon.Href
import typings.reactSketchapp.anon.PreserveAspectRatio
import typings.reactSketchapp.componentsSvgImageMod.Props
import typings.reactSketchapp.componentsSvgImageMod.SVGImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Image")
@js.native
open class Image protected () extends SVGImage {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Image {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Image")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Image.defaultProps")
  @js.native
  def defaultProps: PreserveAspectRatio = js.native
  inline def defaultProps_=(x: PreserveAspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Image.propTypes")
  @js.native
  def propTypes: Href = js.native
  inline def propTypes_=(x: Href): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
