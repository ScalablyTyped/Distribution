package typings.reactSketchapp.libModuleComponentsSvgMod

import typings.reactSketchapp.anon.Id
import typings.reactSketchapp.libModuleComponentsSvgClipPathMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/module/components/Svg", "ClipPath")
@js.native
open class ClipPath protected ()
  extends typings.reactSketchapp.libModuleComponentsSvgClipPathMod.ClipPath {
  def this(props: Props) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: Props, context: Any) = this()
}
/* static members */
object ClipPath {
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "ClipPath")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/module/components/Svg", "ClipPath.propTypes")
  @js.native
  def propTypes: Id = js.native
  inline def propTypes_=(x: Id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
