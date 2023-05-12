package typings.reactSketchapp.libComponentsSvgMod

import typings.reactSketchapp.anon.FillRule
import typings.reactSketchapp.anon.Points
import typings.reactSketchapp.libComponentsSvgPolylineMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/components/Svg", "Polyline")
@js.native
open class Polyline protected ()
  extends typings.reactSketchapp.libComponentsSvgPolylineMod.Polyline {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Polyline {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Polyline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/components/Svg", "Polyline.defaultProps")
  @js.native
  def defaultProps: Points = js.native
  inline def defaultProps_=(x: Points): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/components/Svg", "Polyline.propTypes")
  @js.native
  def propTypes: FillRule = js.native
  inline def propTypes_=(x: FillRule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
