package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.anon.PartialScrollConfig
import typings.reactFns.scrollScrollMod.ScrollProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Scroll", JSImport.Namespace)
@js.native
object scrollMod extends js.Object {
  @js.native
  class Scroll ()
    extends typings.reactFns.scrollScrollMod.Scroll
  
  def withScroll[Props](Component: ComponentType[Props with ScrollProps]): ComponentType[Props] = js.native
  /* static members */
  @js.native
  object Scroll extends js.Object {
    var defaultProps: PartialScrollConfig = js.native
  }
  
}

