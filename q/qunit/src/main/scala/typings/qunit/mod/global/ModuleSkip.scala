package typings.qunit.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleSkip extends StObject {
  
  def skip(name: String): Unit
  def skip(name: String, hooks: Unit, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
  def skip(name: String, hooks: Hooks): Unit
  def skip(name: String, hooks: Hooks, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
  def skip(name: String, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
  @JSName("skip")
  var skip_Original: moduleFunc1 & moduleFunc2
}
object ModuleSkip {
  
  inline def apply(skip: moduleFunc1 & moduleFunc2): ModuleSkip = {
    val __obj = js.Dynamic.literal(skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSkip]
  }
  
  extension [Self <: ModuleSkip](x: Self) {
    
    inline def setSkip(value: moduleFunc1 & moduleFunc2): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
  }
}
