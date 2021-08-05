package typings.stringArgv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-argv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def default(value: String, env: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def default(value: String, env: String, file: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], env.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def default(value: String, env: Unit, file: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], env.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def parseArgsStringToArgv(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgsStringToArgv")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def parseArgsStringToArgv(value: String, env: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgsStringToArgv")(value.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def parseArgsStringToArgv(value: String, env: String, file: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgsStringToArgv")(value.asInstanceOf[js.Any], env.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def parseArgsStringToArgv(value: String, env: Unit, file: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgsStringToArgv")(value.asInstanceOf[js.Any], env.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
