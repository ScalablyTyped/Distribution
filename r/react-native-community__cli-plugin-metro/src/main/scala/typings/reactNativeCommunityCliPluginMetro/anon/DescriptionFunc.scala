package typings.reactNativeCommunityCliPluginMetro.anon

import typings.reactNativeCommunityCliPluginMetro.runServerMod.Args
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionFunc extends StObject {
  
  var description: String
  
  var func: js.Function3[/* _argv */ js.Array[String], /* ctx */ Config, /* args */ Args, js.Promise[Unit]]
  
  var name: String
  
  var options: js.Array[
    DefaultDescriptionName | DescriptionNameParse | NameParse | DefaultDescriptionNameParse | DefaultDescription | DefaultUndefined
  ]
}
object DescriptionFunc {
  
  inline def apply(
    description: String,
    func: (/* _argv */ js.Array[String], /* ctx */ Config, /* args */ Args) => js.Promise[Unit],
    name: String,
    options: js.Array[
      DefaultDescriptionName | DescriptionNameParse | NameParse | DefaultDescriptionNameParse | DefaultDescription | DefaultUndefined
    ]
  ): DescriptionFunc = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], func = js.Any.fromFunction3(func), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionFunc]
  }
  
  extension [Self <: DescriptionFunc](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: (/* _argv */ js.Array[String], /* ctx */ Config, /* args */ Args) => js.Promise[Unit]): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: js.Array[
          DefaultDescriptionName | DescriptionNameParse | NameParse | DefaultDescriptionNameParse | DefaultDescription | DefaultUndefined
        ]
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(
      value: (DefaultDescriptionName | DescriptionNameParse | NameParse | DefaultDescriptionNameParse | DefaultDescription | DefaultUndefined)*
    ): Self = StObject.set(x, "options", js.Array(value*))
  }
}
