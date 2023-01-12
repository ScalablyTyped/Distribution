package typings.reactNativeCommunityCliPluginMetro.anon

import typings.reactNativeCommunityCliPluginMetro.buildCommandsBundleBundleCommandLineArgsMod.CommandLineArgs
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func extends StObject {
  
  var description: String
  
  def func(_underscore: js.Array[String], config: Config, args: CommandLineArgs, output: Any): js.Promise[js.UndefOr[Unit]]
  
  var name: String
  
  var options: js.Array[
    Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
  ]
  
  def withOutput(_underscore: js.Array[String], config: Config, args: CommandLineArgs, output: Any): js.Promise[js.UndefOr[Unit]]
}
object Func {
  
  inline def apply(
    description: String,
    func: (js.Array[String], Config, CommandLineArgs, Any) => js.Promise[js.UndefOr[Unit]],
    name: String,
    options: js.Array[
      Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
    ],
    withOutput: (js.Array[String], Config, CommandLineArgs, Any) => js.Promise[js.UndefOr[Unit]]
  ): Func = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], func = js.Any.fromFunction4(func), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], withOutput = js.Any.fromFunction4(withOutput))
    __obj.asInstanceOf[Func]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Func] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: (js.Array[String], Config, CommandLineArgs, Any) => js.Promise[js.UndefOr[Unit]]): Self = StObject.set(x, "func", js.Any.fromFunction4(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: js.Array[
          Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName
        ]
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(
      value: (Default | Description | Parse | DefaultDescription | DescriptionName | NameParse | DefaultDescriptionName)*
    ): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setWithOutput(value: (js.Array[String], Config, CommandLineArgs, Any) => js.Promise[js.UndefOr[Unit]]): Self = StObject.set(x, "withOutput", js.Any.fromFunction4(value))
  }
}
