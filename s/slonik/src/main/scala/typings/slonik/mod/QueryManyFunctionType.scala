package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type QueryManyFunctionType = slonik.slonik.QueryAnyFunctionType
}}}
to avoid circular code involving: 
- slonik.slonik.PrimitiveValueExpressionType
- slonik.slonik.PrimitiveValueExpressionTypeArray
- slonik.slonik.QueryAnyFunctionType
- slonik.slonik.QueryManyFunctionType
- slonik.slonik.QueryMethodParams
- slonik.slonik.QueryMethodType
*/
@js.native
trait QueryManyFunctionType extends StObject {
  
  def apply[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type QueryMethodParams<T> is not an array type */ args: QueryMethodParams[T]
  ): js.Promise[js.Array[T]] = js.native
}
