package typings.reactDashFns

import typings.react.reactMod.ComponentType
import typings.reactDashFns.distScrollScrollMod.ScrollConfig
import typings.reactDashFns.distScrollScrollMod.ScrollProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Scroll", JSImport.Namespace)
@js.native
object distScrollMod extends js.Object {
  @js.native
  class Scroll ()
    extends typings.reactDashFns.distScrollScrollMod.Scroll
  
  def withScroll[Props](Component: ComponentType[Props with ScrollProps]): ComponentType[Props] = js.native
  /* static members */
  @js.native
  object Scroll extends js.Object {
    var defaultProps: Partial[ScrollConfig] = js.native
  }
  
}

