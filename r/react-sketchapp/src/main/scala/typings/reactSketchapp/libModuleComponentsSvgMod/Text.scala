package typings.reactSketchapp.libModuleComponentsSvgMod

import typings.reactSketchapp.anon.AlignmentBaseline
import typings.reactSketchapp.anon.IsInAParentText
import typings.reactSketchapp.libModuleComponentsSvgTextMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Text")
@js.native
open class Text protected ()
  extends typings.reactSketchapp.libModuleComponentsSvgTextMod.Text {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Text {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Text.childContextTypes")
  @js.native
  def childContextTypes: IsInAParentText = js.native
  inline def childContextTypes_=(x: IsInAParentText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Text.propTypes")
  @js.native
  def propTypes: AlignmentBaseline = js.native
  inline def propTypes_=(x: AlignmentBaseline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
