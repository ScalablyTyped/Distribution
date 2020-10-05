package typings.reactAddonsLinkedStateMixin.mod

import typings.react.mod.Mixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedStateMixin
  extends Mixin[js.Any, js.Any] {
  def linkState[T](key: String): ReactLink[T] = js.native
}

object LinkedStateMixin {
  @scala.inline
  def apply(linkState: String => ReactLink[js.Any]): LinkedStateMixin = {
    val __obj = js.Dynamic.literal(linkState = js.Any.fromFunction1(linkState))
    __obj.asInstanceOf[LinkedStateMixin]
  }
  @scala.inline
  implicit class LinkedStateMixinOps[Self <: LinkedStateMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLinkState(value: String => ReactLink[js.Any]): Self = this.set("linkState", js.Any.fromFunction1(value))
  }
  
}

