package typings.riotjsDomBindings.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expression[Scope] extends StObject {
  
  def mount(scope: Scope): Expression[Scope]
  
  var node: HTMLElement
  
  var `type`: ExpressionType
  
  def unmount(scope: Scope): Expression[Scope]
  
  def update(scope: Scope): Expression[Scope]
  
  var value: Any
}
object Expression {
  
  inline def apply[Scope](
    mount: Scope => Expression[Scope],
    node: HTMLElement,
    `type`: ExpressionType,
    unmount: Scope => Expression[Scope],
    update: Scope => Expression[Scope],
    value: Any
  ): Expression[Scope] = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), node = node.asInstanceOf[js.Any], unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction1(update), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression[Scope]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expression[?], Scope] (val x: Self & Expression[Scope]) extends AnyVal {
    
    inline def setMount(value: Scope => Expression[Scope]): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
    
    inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExpressionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnmount(value: Scope => Expression[Scope]): Self = StObject.set(x, "unmount", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: Scope => Expression[Scope]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
