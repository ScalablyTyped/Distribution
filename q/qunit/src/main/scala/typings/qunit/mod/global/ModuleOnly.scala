package typings.qunit.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleOnly extends StObject {
  
  def only(name: String): Unit
  def only(name: String, hooks: Unit, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
  def only(name: String, hooks: Hooks): Unit
  def only(name: String, hooks: Hooks, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
  def only(name: String, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
  @JSName("only")
  var only_Original: moduleFunc1 & moduleFunc2
}
object ModuleOnly {
  
  inline def apply(only: moduleFunc1 & moduleFunc2): ModuleOnly = {
    val __obj = js.Dynamic.literal(only = only.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOnly]
  }
  
  extension [Self <: ModuleOnly](x: Self) {
    
    inline def setOnly(value: moduleFunc1 & moduleFunc2): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
  }
}
