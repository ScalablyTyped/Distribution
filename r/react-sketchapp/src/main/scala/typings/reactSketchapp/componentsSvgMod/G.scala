package typings.reactSketchapp.componentsSvgMod

import typings.reactSketchapp.anon.Fill
import typings.reactSketchapp.svgGMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "G")
@js.native
open class G protected ()
  extends typings.reactSketchapp.svgGMod.G {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object G {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "G")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "G.propTypes")
  @js.native
  def propTypes: Fill = js.native
  inline def propTypes_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
