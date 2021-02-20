package typings.riotjsDomBindings.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expression[Scope] extends StObject {
  
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
  implicit class ExpressionMutableBuilder[Self <: Expression[_], Scope] (val x: Self with Expression[Scope]) extends AnyVal {
    
    @scala.inline
    def setMount(value: Scope => Expression[_]): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExpressionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmount(value: Scope => Expression[_]): Self = StObject.set(x, "unmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: Scope => Expression[_]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
