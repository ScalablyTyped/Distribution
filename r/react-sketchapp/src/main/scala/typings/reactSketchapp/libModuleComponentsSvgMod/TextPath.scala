package typings.reactSketchapp.libModuleComponentsSvgMod

import typings.reactSketchapp.anon.BaselineShift
import typings.reactSketchapp.libModuleComponentsSvgTextPathMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "TextPath")
@js.native
open class TextPath protected ()
  extends typings.reactSketchapp.libModuleComponentsSvgTextPathMod.TextPath {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object TextPath {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "TextPath")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "TextPath.propTypes")
  @js.native
  def propTypes: BaselineShift = js.native
  inline def propTypes_=(x: BaselineShift): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
