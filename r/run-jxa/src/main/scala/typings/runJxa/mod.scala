package typings.runJxa

import typings.typeFest.sourceBasicMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("run-jxa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runJxa[ReturnType /* <: JsonValue */, ArgumentsType /* <: js.Array[JsonValue] */](input: String): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("runJxa")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def runJxa[ReturnType /* <: JsonValue */, ArgumentsType /* <: js.Array[JsonValue] */](input: String, arguments: ArgumentsType): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("runJxa")(input.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def runJxa[ReturnType /* <: JsonValue */, ArgumentsType /* <: js.Array[JsonValue] */](input: js.Function1[/* args */ ArgumentsType, ReturnType]): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("runJxa")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def runJxa[ReturnType /* <: JsonValue */, ArgumentsType /* <: js.Array[JsonValue] */](input: js.Function1[/* args */ ArgumentsType, ReturnType], arguments: ArgumentsType): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("runJxa")(input.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  
  inline def runJxaSync[ReturnType /* <: JsonValue */, ArgumentsType /* <: js.Array[JsonValue] */](input: String): ReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("runJxaSync")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnType]
  inline def runJxaSync[ReturnType /* <: JsonValue */, ArgumentsType /* <: js.Array[JsonValue] */](input: String, arguments: ArgumentsType): ReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("runJxaSync")(input.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[ReturnType]
  inline def runJxaSync[ReturnType /* <: JsonValue */, ArgumentsType /* <: js.Array[JsonValue] */](input: js.Function1[/* args */ ArgumentsType, ReturnType]): ReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("runJxaSync")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnType]
  inline def runJxaSync[ReturnType /* <: JsonValue */, ArgumentsType /* <: js.Array[JsonValue] */](input: js.Function1[/* args */ ArgumentsType, ReturnType], arguments: ArgumentsType): ReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("runJxaSync")(input.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[ReturnType]
}
