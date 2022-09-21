package typings.reactSketchapp.svgMod

import typings.reactSketchapp.anon.ClipRule
import typings.reactSketchapp.anon.Cy
import typings.reactSketchapp.ellipseMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/components/Svg", "Ellipse")
@js.native
open class Ellipse protected ()
  extends typings.reactSketchapp.ellipseMod.Ellipse {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Ellipse {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Ellipse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/components/Svg", "Ellipse.defaultProps")
  @js.native
  def defaultProps: Cy = js.native
  inline def defaultProps_=(x: Cy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/components/Svg", "Ellipse.propTypes")
  @js.native
  def propTypes: ClipRule = js.native
  inline def propTypes_=(x: ClipRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
