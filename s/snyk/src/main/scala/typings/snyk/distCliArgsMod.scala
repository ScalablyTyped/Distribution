package typings.snyk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.node.anon.TypeofURL
import typings.node.urlMod.URLSearchParams
import typings.node.urlMod.URL_
import typings.snyk.distCliCommandsTypesMod.MethodResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliArgsMod {
  
  @JSImport("snyk/dist/cli/args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def args(rawArgv: js.Array[String]): Args_ = ^.asInstanceOf[js.Dynamic].applyDynamic("args")(rawArgv.asInstanceOf[js.Any]).asInstanceOf[Args_]
  
  trait ArgsOptions
    extends StObject
       with /* key */ StringDictionary[Boolean | String | Double | MethodArgs | js.Array[String]] {
    
    var _doubleDashArgs: js.Array[String]
    
    @JSName("_")
    var _underscore: MethodArgs
  }
  object ArgsOptions {
    
    inline def apply(_doubleDashArgs: js.Array[String], _underscore: MethodArgs): ArgsOptions = {
      val __obj = js.Dynamic.literal(_doubleDashArgs = _doubleDashArgs.asInstanceOf[js.Any])
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArgsOptions] (val x: Self) extends AnyVal {
      
      inline def set_doubleDashArgs(value: js.Array[String]): Self = StObject.set(x, "_doubleDashArgs", value.asInstanceOf[js.Any])
      
      inline def set_doubleDashArgsVarargs(value: String*): Self = StObject.set(x, "_doubleDashArgs", js.Array(value*))
      
      inline def set_underscore(value: MethodArgs): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreVarargs(value: (String | ArgsOptions)*): Self = StObject.set(x, "_", js.Array(value*))
    }
  }
  
  trait Args_ extends StObject {
    
    var command: String
    
    def method(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MethodArgs is not an array type */ args: MethodArgs
    ): js.Promise[MethodResult]
    
    var options: ArgsOptions
  }
  object Args_ {
    
    inline def apply(command: String, method: MethodArgs => js.Promise[MethodResult], options: ArgsOptions): Args_ = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], method = js.Any.fromFunction1(method), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args_] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: MethodArgs => js.Promise[MethodResult]): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setOptions(value: ArgsOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Global
    extends StObject
       with typings.node.urlMod.global.Global {
    
    var ignoreUnknownCA: Boolean
  }
  object Global {
    
    inline def apply(
      URL: TypeofURL & (Instantiable2[/* input */ String, /* base */ js.UndefOr[String | URL_], URL_]),
      URLSearchParams: Instantiable1[
          /* init */ js.UndefOr[
            URLSearchParams | String | (Record[String, String | js.Array[String]]) | (js.Iterable[js.Tuple2[String, String]]) | (js.Array[js.Tuple2[String, String]])
          ], 
          URLSearchParams
        ],
      ignoreUnknownCA: Boolean
    ): Global = {
      val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], URLSearchParams = URLSearchParams.asInstanceOf[js.Any], ignoreUnknownCA = ignoreUnknownCA.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
      
      inline def setIgnoreUnknownCA(value: Boolean): Self = StObject.set(x, "ignoreUnknownCA", value.asInstanceOf[js.Any])
    }
  }
  
  type MethodArgs = js.Array[String | ArgsOptions]
}
