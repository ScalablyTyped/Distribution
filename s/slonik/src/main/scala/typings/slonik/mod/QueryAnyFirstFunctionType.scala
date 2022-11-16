package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type QueryAnyFirstFunctionType = <T>(args : slonik.slonik.QueryMethodParams<T>): std.Promise<std.Array<T[keyof T]>>
}}}
to avoid circular code involving: 
- slonik.slonik.PrimitiveValueExpressionType
- slonik.slonik.PrimitiveValueExpressionTypeArray
- slonik.slonik.QueryAnyFirstFunctionType
- slonik.slonik.QueryManyFirstFunctionType
- slonik.slonik.QueryMethodParams
- slonik.slonik.QueryMethodType
*/
@js.native
trait QueryAnyFirstFunctionType extends StObject {
  
  def apply[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
}
