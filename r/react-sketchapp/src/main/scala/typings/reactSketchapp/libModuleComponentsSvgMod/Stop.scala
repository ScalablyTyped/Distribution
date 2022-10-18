package typings.reactSketchapp.libModuleComponentsSvgMod

import typings.reactSketchapp.anon.StopColor
import typings.reactSketchapp.anon.StopOpacity
import typings.reactSketchapp.libModuleComponentsSvgStopMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Stop")
@js.native
open class Stop protected ()
  extends typings.reactSketchapp.libModuleComponentsSvgStopMod.Stop {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Stop {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Stop")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Stop.defaultProps")
  @js.native
  def defaultProps: StopOpacity = js.native
  inline def defaultProps_=(x: StopOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Stop.propTypes")
  @js.native
  def propTypes: StopColor = js.native
  inline def propTypes_=(x: StopColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
