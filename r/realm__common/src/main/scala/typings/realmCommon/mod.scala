package typings.realmCommon

import typings.realmCommon.anon.ArgsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@realm/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deprecationWarning(deprecatedItem: String, suggestedReplacement: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecationWarning")(deprecatedItem.asInstanceOf[js.Any], suggestedReplacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def handleDeprecatedPositionalArgs[T /* <: js.Object */](args: Array[T | Any], methodName: String, argNames: js.Array[/* keyof T */ String]): ArgsObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleDeprecatedPositionalArgs")(args.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], argNames.asInstanceOf[js.Any])).asInstanceOf[ArgsObject[T]]
  inline def handleDeprecatedPositionalArgs[T /* <: js.Object */](
    args: Array[T | Any],
    methodName: String,
    argNames: js.Array[/* keyof T */ String],
    hasRestArgs: Boolean
  ): ArgsObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleDeprecatedPositionalArgs")(args.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], argNames.asInstanceOf[js.Any], hasRestArgs.asInstanceOf[js.Any])).asInstanceOf[ArgsObject[T]]
  /**
    * Helper function for migrating from positional arguments to a single dictionary argument.
    * Check the arguments passed to a function, if the first argument is not an object (i.e. it
    * is presumed to be a deprecated positional-style call), shows a deprecation warning and
    * converts the positional arguments into an object matching the expected "new" shape.
    *
    * @param args Array of arguments passed to the function (captured with `...args`).
    * @param methodName The name of the method, used to show the deprecation warning.
    * @param argNames The list of positional argument names, used to covert them into
    * an object if a deprecated call is made and to show the deprecation warning.
    * @param hasRestArgs Optional flag indicating that the function's final argument is
    * `...args` (to capture any extra arguments), in which case we capture them and return
    * as the second element of the return array.
    *
    * @returns An object containing:
    *
    * argsObject: a dictionary of function arguments, either passed through from args[0] if
    * args[0] is an object, or created from `args` and `argNames` if the args are a
    * deprecated positional argument call.
    *
    * restArgs: an array of the "...args" passed to the function if `hasRestArgs` is true;
    * otherwise it is `undefined`.
    */
  inline def handleDeprecatedPositionalArgs[T /* <: js.Object */](args: js.Array[Any], methodName: String, argNames: js.Array[/* keyof T */ String]): ArgsObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleDeprecatedPositionalArgs")(args.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], argNames.asInstanceOf[js.Any])).asInstanceOf[ArgsObject[T]]
  inline def handleDeprecatedPositionalArgs[T /* <: js.Object */](
    args: js.Array[Any],
    methodName: String,
    argNames: js.Array[/* keyof T */ String],
    hasRestArgs: Boolean
  ): ArgsObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleDeprecatedPositionalArgs")(args.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], argNames.asInstanceOf[js.Any], hasRestArgs.asInstanceOf[js.Any])).asInstanceOf[ArgsObject[T]]
  
  @JSImport("@realm/common", "safeGlobalThis")
  @js.native
  val safeGlobalThis: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ Any = js.native
}
