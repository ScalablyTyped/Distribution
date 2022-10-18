package typings.reactSketchapp.libModuleComponentsSvgMod

import typings.reactSketchapp.anon.D
import typings.reactSketchapp.libModuleComponentsSvgPathMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Path")
@js.native
open class Path protected ()
  extends typings.reactSketchapp.libModuleComponentsSvgPathMod.Path {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Path {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Path")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Path.propTypes")
  @js.native
  def propTypes: D = js.native
  inline def propTypes_=(x: D): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
