package typings.rxjs

import typings.rxjs.anon.Args
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalUtilArgsArgArrayOrObjectMod {
  
  @JSImport("rxjs/dist/types/internal/util/argsArgArrayOrObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argsArgArrayOrObject[T, O /* <: Record[String, T] */](args: js.Array[js.Array[T] | O | T]): Args[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("argsArgArrayOrObject")(args.asInstanceOf[js.Any]).asInstanceOf[Args[T]]
}
