package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[CommandOptions] extends StObject {
  
  var options: typings.snyk.distLibTypesMod.Options & CommandOptions
  
  var paths: js.Array[String]
}
object Options {
  
  inline def apply[CommandOptions](options: typings.snyk.distLibTypesMod.Options & CommandOptions, paths: js.Array[String]): Options[CommandOptions] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[CommandOptions]]
  }
  
  extension [Self <: Options[?], CommandOptions](x: Self & Options[CommandOptions]) {
    
    inline def setOptions(value: typings.snyk.distLibTypesMod.Options & CommandOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
