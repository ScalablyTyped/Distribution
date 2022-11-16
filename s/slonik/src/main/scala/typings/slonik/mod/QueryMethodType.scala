package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type QueryMethodType = (sql : slonik.slonik.TaggedTemplateLiteralInvocationType<RowType>, values : std.Array<slonik.slonik.PrimitiveValueExpressionType> | undefined): std.Promise<Result>
}}}
to avoid circular code involving: 
- slonik.slonik.PrimitiveValueExpressionType
- slonik.slonik.PrimitiveValueExpressionTypeArray
- slonik.slonik.QueryAnyFunctionType
- slonik.slonik.QueryExistsFunctionType
- slonik.slonik.QueryFunctionType
- slonik.slonik.QueryMaybeOneFirstFunctionType
- slonik.slonik.QueryMaybeOneFunctionType
- slonik.slonik.QueryMethodParams
- slonik.slonik.QueryMethodType
- slonik.slonik.QueryOneFirstFunctionType
- slonik.slonik.QueryOneFunctionType
*/
@js.native
trait QueryMethodType[RowType, Result] extends StObject {
  
  def apply(sql: TaggedTemplateLiteralInvocationType[RowType]): js.Promise[Result] = js.native
  def apply(sql: TaggedTemplateLiteralInvocationType[RowType], values: js.Array[PrimitiveValueExpressionType]): js.Promise[Result] = js.native
}
