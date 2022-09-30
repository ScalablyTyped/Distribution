package typings.reduxObservable

import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMod {
  
  @JSImport("redux-observable/dist/types/operators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ofType[Input /* <: Action[Any] */, Type /* <: /* import warning: importer.ImportType#apply Failed type conversion: Input['type'] */ js.Any */, Output /* <: Input */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param types because its type [Type, ...Array<Type>] is not an array type */ types: Array[Type]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")(types.asInstanceOf[js.Any]).asInstanceOf[Any]
}
