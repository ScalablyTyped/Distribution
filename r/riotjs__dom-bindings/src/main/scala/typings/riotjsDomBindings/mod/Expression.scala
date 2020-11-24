package typings.riotjsDomBindings.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expression[Scope] extends js.Object {
  
  def mount(scope: Scope): Expression[_] = js.native
  
  var node: HTMLElement = js.native
  
  var `type`: ExpressionType = js.native
  
  def unmount(scope: Scope): Expression[_] = js.native
  
  def update(scope: Scope): Expression[_] = js.native
  
  var value: js.Any = js.native
}
object Expression {
  
  @scala.inline
  def apply[Scope](
    mount: Scope => Expression[_],
    node: HTMLElement,
    `type`: ExpressionType,
    unmount: Scope => Expression[_],
    update: Scope => Expression[_],
    value: js.Any
  ): Expression[Scope] = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), node = node.asInstanceOf[js.Any], unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction1(update), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression[Scope]]
  }
  
  @scala.inline
  implicit class ExpressionOps[Self <: Expression[_], Scope] (val x: Self with Expression[Scope]) extends AnyVal {
    
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
    def setMount(value: Scope => Expression[_]): Self = this.set("mount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExpressionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmount(value: Scope => Expression[_]): Self = this.set("unmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: Scope => Expression[_]): Self = this.set("update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
