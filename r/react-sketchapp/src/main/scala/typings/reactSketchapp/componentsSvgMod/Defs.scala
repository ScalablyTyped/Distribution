package typings.reactSketchapp.componentsSvgMod

import typings.reactSketchapp.anon.ChildrenValidator
import typings.reactSketchapp.svgDefsMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Defs")
@js.native
open class Defs protected ()
  extends typings.reactSketchapp.svgDefsMod.Defs {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Defs {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Defs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Defs.propTypes")
  @js.native
  def propTypes: ChildrenValidator = js.native
  inline def propTypes_=(x: ChildrenValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
