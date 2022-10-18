package typings.reactNativeCommunityCliPluginMetro.anon

import typings.reactNativeCommunityCliPluginMetro.buildCommandsStartRunServerMod.Args
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionFunc extends StObject {
  
  var description: String
  
  def func(_argv: js.Array[String], ctx: Config, args: Args): js.Promise[Unit]
  @JSName("func")
  var func_Original: js.Function3[/* _argv */ js.Array[String], /* ctx */ Config, /* args */ Args, js.Promise[Unit]]
  
  var name: String
  
  var options: js.Array[
    DescriptionNameParse | DefaultDescriptionNameParse | DefaultDescriptionName | DefaultUndefined | DescriptionName | DescriptionString
  ]
}
object DescriptionFunc {
  
  inline def apply(
    description: String,
    func: (/* _argv */ js.Array[String], /* ctx */ Config, /* args */ Args) => js.Promise[Unit],
    name: String,
    options: js.Array[
      DescriptionNameParse | DefaultDescriptionNameParse | DefaultDescriptionName | DefaultUndefined | DescriptionName | DescriptionString
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
          DescriptionNameParse | DefaultDescriptionNameParse | DefaultDescriptionName | DefaultUndefined | DescriptionName | DescriptionString
        ]
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(
      value: (DescriptionNameParse | DefaultDescriptionNameParse | DefaultDescriptionName | DefaultUndefined | DescriptionName | DescriptionString)*
    ): Self = StObject.set(x, "options", js.Array(value*))
  }
}
