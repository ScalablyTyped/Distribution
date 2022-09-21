package typings.reactNativeCommunityCliPlatformIos.anon

import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Examples extends StObject {
  
  var description: String
  
  var examples: js.Array[Cmd]
  
  def func(_underscore: js.Array[String], ctx: Config, args: Configuration): Unit | js.Promise[Unit]
  
  var name: String
  
  var options: js.Array[Default | Name | Parse | DefaultDescription]
}
object Examples {
  
  inline def apply(
    description: String,
    examples: js.Array[Cmd],
    func: (js.Array[String], Config, Configuration) => Unit | js.Promise[Unit],
    name: String,
    options: js.Array[Default | Name | Parse | DefaultDescription]
  ): Examples = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], func = js.Any.fromFunction3(func), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Examples]
  }
  
  extension [Self <: Examples](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExamples(value: js.Array[Cmd]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesVarargs(value: Cmd*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setFunc(value: (js.Array[String], Config, Configuration) => Unit | js.Promise[Unit]): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[Default | Name | Parse | DefaultDescription]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: (Default | Name | Parse | DefaultDescription)*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
