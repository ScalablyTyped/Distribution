package typings.reactNativeCommunityCliPlatformIos.anon

import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func extends StObject {
  
  var description: String
  
  def func(_argv: js.Array[String], _ctx: Config, args: Interactive): js.Promise[Unit]
  
  var name: String
  
  var options: js.Array[DescriptionName]
}
object Func {
  
  inline def apply(
    description: String,
    func: (js.Array[String], Config, Interactive) => js.Promise[Unit],
    name: String,
    options: js.Array[DescriptionName]
  ): Func = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], func = js.Any.fromFunction3(func), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Func]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Func] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: (js.Array[String], Config, Interactive) => js.Promise[Unit]): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[DescriptionName]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: DescriptionName*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
