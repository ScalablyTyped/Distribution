package typings.reactSketchapp.componentsSvgMod

import typings.reactSketchapp.anon.OriginX
import typings.reactSketchapp.svgUseMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "Use")
@js.native
open class Use protected ()
  extends typings.reactSketchapp.svgUseMod.Use {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object Use {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Use")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "Use.propTypes")
  @js.native
  def propTypes: OriginX = js.native
  inline def propTypes_=(x: OriginX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
