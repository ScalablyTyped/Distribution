package typings.reactSketchapp.libModuleComponentsSvgMod

import typings.reactSketchapp.anon.Cx
import typings.reactSketchapp.libModuleComponentsSvgCircleMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Circle")
@js.native
open class Circle protected ()
  extends typings.reactSketchapp.libModuleComponentsSvgCircleMod.Circle {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Circle {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Circle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Circle.defaultProps")
  @js.native
  def defaultProps: Cx = js.native
  inline def defaultProps_=(x: Cx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Circle.propTypes")
  @js.native
  def propTypes: typings.reactSketchapp.anon.ClipPath = js.native
  inline def propTypes_=(x: typings.reactSketchapp.anon.ClipPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
