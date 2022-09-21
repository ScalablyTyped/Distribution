package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryMethodType[RowType, Result] extends StObject {
  
  def apply(sql: TaggedTemplateLiteralInvocationType[RowType]): js.Promise[Result] = js.native
  def apply(sql: TaggedTemplateLiteralInvocationType[RowType], values: js.Array[PrimitiveValueExpressionType]): js.Promise[Result] = js.native
}
