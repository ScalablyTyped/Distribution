package typings.reactNativeCommunityCliDoctor.anon

import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func extends StObject {
  
  var description: String
  
  def func(_argv: js.Array[String], ctx: Config): js.Promise[Unit]
  
  var name: String
}
object Func {
  
  inline def apply(description: String, func: (js.Array[String], Config) => js.Promise[Unit], name: String): Func = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], func = js.Any.fromFunction2(func), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Func]
  }
  
  extension [Self <: Func](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: (js.Array[String], Config) => js.Promise[Unit]): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
