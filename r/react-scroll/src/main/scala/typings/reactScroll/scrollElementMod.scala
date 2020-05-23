package typings.reactScroll

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactScroll.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-scroll/modules/mixins/scroll-element", JSImport.Namespace)
@js.native
object scrollElementMod extends js.Object {
  def default[P](component: ComponentType[P]): ComponentClass[ScrollElementProps[P], ComponentState] = js.native
  type ScrollElementProps[P] = P with Id
}

