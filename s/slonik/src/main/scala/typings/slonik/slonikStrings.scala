package typings.slonik

import typings.slonik.mod.ComparisonOperatorType
import typings.slonik.mod.ConnectionTypeType
import typings.slonik.mod.LogicalBooleanOperatorType
import typings.slonik.mod.TypeNameIdentifierType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slonikStrings {
  
  @js.native
  sealed trait AND
    extends StObject
       with LogicalBooleanOperatorType
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait DELETE extends StObject
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait DISABLE_TIMEOUT extends StObject
  @scala.inline
  def DISABLE_TIMEOUT: DISABLE_TIMEOUT = "DISABLE_TIMEOUT".asInstanceOf[DISABLE_TIMEOUT]
  
  @js.native
  sealed trait EXPLICIT
    extends StObject
       with ConnectionTypeType
  @scala.inline
  def EXPLICIT: EXPLICIT = "EXPLICIT".asInstanceOf[EXPLICIT]
  
  @js.native
  sealed trait Equalssign
    extends StObject
       with ComparisonOperatorType
  @scala.inline
  def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  
  @js.native
  sealed trait ExclamationmarkEqualssign
    extends StObject
       with ComparisonOperatorType
  @scala.inline
  def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with ComparisonOperatorType
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with ComparisonOperatorType
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait IMPLICIT_QUERY
    extends StObject
       with ConnectionTypeType
  @scala.inline
  def IMPLICIT_QUERY: IMPLICIT_QUERY = "IMPLICIT_QUERY".asInstanceOf[IMPLICIT_QUERY]
  
  @js.native
  sealed trait IMPLICIT_TRANSACTION
    extends StObject
       with ConnectionTypeType
  @scala.inline
  def IMPLICIT_TRANSACTION: IMPLICIT_TRANSACTION = "IMPLICIT_TRANSACTION".asInstanceOf[IMPLICIT_TRANSACTION]
  
  @js.native
  sealed trait INSERT extends StObject
  @scala.inline
  def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with ComparisonOperatorType
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with ComparisonOperatorType
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait LessthansignGreaterthansign
    extends StObject
       with ComparisonOperatorType
  @scala.inline
  def LessthansignGreaterthansign: LessthansignGreaterthansign = "<>".asInstanceOf[LessthansignGreaterthansign]
  
  @js.native
  sealed trait OR
    extends StObject
       with LogicalBooleanOperatorType
  @scala.inline
  def OR: OR = "OR".asInstanceOf[OR]
  
  @js.native
  sealed trait QueryResultRowType extends StObject
  @scala.inline
  def QueryResultRowType: QueryResultRowType = "QueryResultRowType".asInstanceOf[QueryResultRowType]
  
  @js.native
  sealed trait SELECT extends StObject
  @scala.inline
  def SELECT: SELECT = "SELECT".asInstanceOf[SELECT]
  
  @js.native
  sealed trait UPDATE extends StObject
  @scala.inline
  def UPDATE: UPDATE = "UPDATE".asInstanceOf[UPDATE]
  
  @js.native
  sealed trait bool
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  
  @js.native
  sealed trait bytea
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def bytea: bytea = "bytea".asInstanceOf[bytea]
  
  @js.native
  sealed trait float4
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def float4: float4 = "float4".asInstanceOf[float4]
  
  @js.native
  sealed trait float8
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def float8: float8 = "float8".asInstanceOf[float8]
  
  @js.native
  sealed trait int2
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def int2: int2 = "int2".asInstanceOf[int2]
  
  @js.native
  sealed trait int4
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def int4: int4 = "int4".asInstanceOf[int4]
  
  @js.native
  sealed trait json
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait text
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait timestamptz
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def timestamptz: timestamptz = "timestamptz".asInstanceOf[timestamptz]
  
  @js.native
  sealed trait uuid
    extends StObject
       with TypeNameIdentifierType
  @scala.inline
  def uuid: uuid = "uuid".asInstanceOf[uuid]
}
