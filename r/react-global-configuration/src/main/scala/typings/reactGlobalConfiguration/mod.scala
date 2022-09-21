package typings.reactGlobalConfiguration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-global-configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Any]
  inline def get(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def get[Value](key: String, fallbackValue: Value): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], fallbackValue.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def serialize(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[String]
  
  inline def set(newConfiguration: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(newConfiguration.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def set(newConfiguration: Any, newOptions: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(newConfiguration.asInstanceOf[js.Any], newOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var assign: Boolean
    
    var freeze: Boolean
  }
  object Options {
    
    inline def apply(assign: Boolean, freeze: Boolean): Options = {
      val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], freeze = freeze.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAssign(value: Boolean): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
      
      inline def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
    }
  }
}
