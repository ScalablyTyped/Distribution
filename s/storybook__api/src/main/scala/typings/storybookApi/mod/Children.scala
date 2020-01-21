package typings.storybookApi.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: (Component[js.Object, js.Object, _]) | (js.Function1[/* props */ Combo, Component[js.Object, js.Object, _]])
}

object Children {
  @scala.inline
  def apply(
    children: (Component[js.Object, js.Object, _]) | (js.Function1[/* props */ Combo, Component[js.Object, js.Object, _]])
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Children]
  }
}

