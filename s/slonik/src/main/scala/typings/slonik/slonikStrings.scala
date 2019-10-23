package typings.slonik

import typings.slonik.slonikMod.ComparisonOperatorType
import typings.slonik.slonikMod.ConnectionTypeType
import typings.slonik.slonikMod.LogicalBooleanOperatorType
import typings.slonik.slonikMod.TypeNameIdentifierType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object slonikStrings {
  @js.native
  sealed trait `!=` extends ComparisonOperatorType
  
  @js.native
  sealed trait `<` extends ComparisonOperatorType
  
  @js.native
  sealed trait `<=` extends ComparisonOperatorType
  
  @js.native
  sealed trait `<>` extends ComparisonOperatorType
  
  @js.native
  sealed trait `=` extends ComparisonOperatorType
  
  @js.native
  sealed trait `>` extends ComparisonOperatorType
  
  @js.native
  sealed trait `>=` extends ComparisonOperatorType
  
  @js.native
  sealed trait AND extends LogicalBooleanOperatorType
  
  @js.native
  sealed trait DELETE extends js.Object
  
  @js.native
  sealed trait EXPLICIT extends ConnectionTypeType
  
  @js.native
  sealed trait IMPLICIT_QUERY extends ConnectionTypeType
  
  @js.native
  sealed trait IMPLICIT_TRANSACTION extends ConnectionTypeType
  
  @js.native
  sealed trait INSERT extends js.Object
  
  @js.native
  sealed trait OR extends LogicalBooleanOperatorType
  
  @js.native
  sealed trait QueryResultRowType extends js.Object
  
  @js.native
  sealed trait SELECT extends js.Object
  
  @js.native
  sealed trait UPDATE extends js.Object
  
  @js.native
  sealed trait bool extends TypeNameIdentifierType
  
  @js.native
  sealed trait bytea extends TypeNameIdentifierType
  
  @js.native
  sealed trait float4 extends TypeNameIdentifierType
  
  @js.native
  sealed trait float8 extends TypeNameIdentifierType
  
  @js.native
  sealed trait int2 extends TypeNameIdentifierType
  
  @js.native
  sealed trait int4 extends TypeNameIdentifierType
  
  @js.native
  sealed trait json extends TypeNameIdentifierType
  
  @js.native
  sealed trait text extends TypeNameIdentifierType
  
  @js.native
  sealed trait timestamptz extends TypeNameIdentifierType
  
  @scala.inline
  def `!=`: `!=` = "!=".asInstanceOf[`!=`]
  @scala.inline
  def `<`: `<` = "<".asInstanceOf[`<`]
  @scala.inline
  def `<=`: `<=` = "<=".asInstanceOf[`<=`]
  @scala.inline
  def `<>`: `<>` = "<>".asInstanceOf[`<>`]
  @scala.inline
  def `=`: `=` = "=".asInstanceOf[`=`]
  @scala.inline
  def `>`: `>` = ">".asInstanceOf[`>`]
  @scala.inline
  def `>=`: `>=` = ">=".asInstanceOf[`>=`]
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def EXPLICIT: EXPLICIT = "EXPLICIT".asInstanceOf[EXPLICIT]
  @scala.inline
  def IMPLICIT_QUERY: IMPLICIT_QUERY = "IMPLICIT_QUERY".asInstanceOf[IMPLICIT_QUERY]
  @scala.inline
  def IMPLICIT_TRANSACTION: IMPLICIT_TRANSACTION = "IMPLICIT_TRANSACTION".asInstanceOf[IMPLICIT_TRANSACTION]
  @scala.inline
  def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  @scala.inline
  def OR: OR = "OR".asInstanceOf[OR]
  @scala.inline
  def QueryResultRowType: QueryResultRowType = "QueryResultRowType".asInstanceOf[QueryResultRowType]
  @scala.inline
  def SELECT: SELECT = "SELECT".asInstanceOf[SELECT]
  @scala.inline
  def UPDATE: UPDATE = "UPDATE".asInstanceOf[UPDATE]
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  @scala.inline
  def bytea: bytea = "bytea".asInstanceOf[bytea]
  @scala.inline
  def float4: float4 = "float4".asInstanceOf[float4]
  @scala.inline
  def float8: float8 = "float8".asInstanceOf[float8]
  @scala.inline
  def int2: int2 = "int2".asInstanceOf[int2]
  @scala.inline
  def int4: int4 = "int4".asInstanceOf[int4]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def timestamptz: timestamptz = "timestamptz".asInstanceOf[timestamptz]
}

