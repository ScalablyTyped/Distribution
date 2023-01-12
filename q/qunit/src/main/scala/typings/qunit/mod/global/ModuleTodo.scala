package typings.qunit.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleTodo extends StObject {
  
  def todo(name: String): Unit
  def todo(name: String, hooks: Unit, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
  def todo(name: String, hooks: Hooks): Unit
  def todo(name: String, hooks: Hooks, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
  def todo(name: String, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
  @JSName("todo")
  var todo_Original: moduleFunc1 & moduleFunc2
}
object ModuleTodo {
  
  inline def apply(todo: moduleFunc1 & moduleFunc2): ModuleTodo = {
    val __obj = js.Dynamic.literal(todo = todo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleTodo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleTodo] (val x: Self) extends AnyVal {
    
    inline def setTodo(value: moduleFunc1 & moduleFunc2): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
  }
}
