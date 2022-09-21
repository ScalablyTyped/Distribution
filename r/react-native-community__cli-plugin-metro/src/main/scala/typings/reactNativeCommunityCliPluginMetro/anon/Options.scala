package typings.reactNativeCommunityCliPluginMetro.anon

import typings.reactNativeCommunityCliPluginMetro.bundleCommandLineArgsMod.CommandLineArgs
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var description: String
  
  var func: js.Function3[
    /* argv */ js.Array[String], 
    /* config */ Config, 
    /* args */ CommandLineArgs, 
    js.Promise[Any]
  ]
  
  var name: String
  
  var options: js.Array[
    Default | Description | Name | Parse | DefaultDescription | DescriptionName | NameParse
  ]
}
object Options {
  
  inline def apply(
    description: String,
    func: (/* argv */ js.Array[String], /* config */ Config, /* args */ CommandLineArgs) => js.Promise[Any],
    name: String,
    options: js.Array[
      Default | Description | Name | Parse | DefaultDescription | DescriptionName | NameParse
    ]
  ): Options = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], func = js.Any.fromFunction3(func), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFunc(
      value: (/* argv */ js.Array[String], /* config */ Config, /* args */ CommandLineArgs) => js.Promise[Any]
    ): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: js.Array[
          Default | Description | Name | Parse | DefaultDescription | DescriptionName | NameParse
        ]
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: (Default | Description | Name | Parse | DefaultDescription | DescriptionName | NameParse)*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
