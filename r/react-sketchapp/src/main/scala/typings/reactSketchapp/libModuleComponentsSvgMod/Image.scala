package typings.reactSketchapp.libModuleComponentsSvgMod

import typings.reactSketchapp.anon.Href
import typings.reactSketchapp.anon.PreserveAspectRatio
import typings.reactSketchapp.libModuleComponentsSvgImageMod.Props
import typings.reactSketchapp.libModuleComponentsSvgImageMod.SVGImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Image")
@js.native
open class Image protected () extends SVGImage {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
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
