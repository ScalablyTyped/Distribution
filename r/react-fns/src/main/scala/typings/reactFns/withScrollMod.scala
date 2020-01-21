package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.scrollScrollMod.ScrollProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Scroll/withScroll", JSImport.Namespace)
@js.native
object withScrollMod extends js.Object {
  def withScroll[Props](Component: ComponentType[Props with ScrollProps]): ComponentType[Props] = js.native
}

