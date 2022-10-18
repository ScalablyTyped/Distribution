package typings.sqlFormatter.libSrcParserAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType extends StObject
@JSImport("sql-formatter/lib/src/parser/ast", "NodeType")
@js.native
object NodeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NodeType & String] = js.native
  
  @js.native
  sealed trait all_columns_asterisk
    extends StObject
       with NodeType
  /* "all_columns_asterisk" */ val all_columns_asterisk: typings.sqlFormatter.libSrcParserAstMod.NodeType.all_columns_asterisk & String = js.native
  
  @js.native
  sealed trait array_subscript
    extends StObject
       with NodeType
  /* "array_subscript" */ val array_subscript: typings.sqlFormatter.libSrcParserAstMod.NodeType.array_subscript & String = js.native
  
  @js.native
  sealed trait between_predicate
    extends StObject
       with NodeType
  /* "between_predicate" */ val between_predicate: typings.sqlFormatter.libSrcParserAstMod.NodeType.between_predicate & String = js.native
  
  @js.native
  sealed trait block_comment
    extends StObject
       with NodeType
  /* "block_comment" */ val block_comment: typings.sqlFormatter.libSrcParserAstMod.NodeType.block_comment & String = js.native
  
  @js.native
  sealed trait case_else
    extends StObject
       with NodeType
  /* "case_else" */ val case_else: typings.sqlFormatter.libSrcParserAstMod.NodeType.case_else & String = js.native
  
  @js.native
  sealed trait case_expression
    extends StObject
       with NodeType
  /* "case_expression" */ val case_expression: typings.sqlFormatter.libSrcParserAstMod.NodeType.case_expression & String = js.native
  
  @js.native
  sealed trait case_when
    extends StObject
       with NodeType
  /* "case_when" */ val case_when: typings.sqlFormatter.libSrcParserAstMod.NodeType.case_when & String = js.native
  
  @js.native
  sealed trait clause
    extends StObject
       with NodeType
  /* "clause" */ val clause: typings.sqlFormatter.libSrcParserAstMod.NodeType.clause & String = js.native
  
  @js.native
  sealed trait comma
    extends StObject
       with NodeType
  /* "comma" */ val comma: typings.sqlFormatter.libSrcParserAstMod.NodeType.comma & String = js.native
  
  @js.native
  sealed trait function_call
    extends StObject
       with NodeType
  /* "function_call" */ val function_call: typings.sqlFormatter.libSrcParserAstMod.NodeType.function_call & String = js.native
  
  @js.native
  sealed trait identifier
    extends StObject
       with NodeType
  /* "identifier" */ val identifier: typings.sqlFormatter.libSrcParserAstMod.NodeType.identifier & String = js.native
  
  @js.native
  sealed trait keyword
    extends StObject
       with NodeType
  /* "keyword" */ val keyword: typings.sqlFormatter.libSrcParserAstMod.NodeType.keyword & String = js.native
  
  @js.native
  sealed trait limit_clause
    extends StObject
       with NodeType
  /* "limit_clause" */ val limit_clause: typings.sqlFormatter.libSrcParserAstMod.NodeType.limit_clause & String = js.native
  
  @js.native
  sealed trait line_comment
    extends StObject
       with NodeType
  /* "line_comment" */ val line_comment: typings.sqlFormatter.libSrcParserAstMod.NodeType.line_comment & String = js.native
  
  @js.native
  sealed trait literal
    extends StObject
       with NodeType
  /* "literal" */ val literal: typings.sqlFormatter.libSrcParserAstMod.NodeType.literal & String = js.native
  
  @js.native
  sealed trait operator
    extends StObject
       with NodeType
  /* "operator" */ val operator: typings.sqlFormatter.libSrcParserAstMod.NodeType.operator & String = js.native
  
  @js.native
  sealed trait parameter
    extends StObject
       with NodeType
  /* "parameter" */ val parameter: typings.sqlFormatter.libSrcParserAstMod.NodeType.parameter & String = js.native
  
  @js.native
  sealed trait parenthesis
    extends StObject
       with NodeType
  /* "parenthesis" */ val parenthesis: typings.sqlFormatter.libSrcParserAstMod.NodeType.parenthesis & String = js.native
  
  @js.native
  sealed trait property_access
    extends StObject
       with NodeType
  /* "property_access" */ val property_access: typings.sqlFormatter.libSrcParserAstMod.NodeType.property_access & String = js.native
  
  @js.native
  sealed trait set_operation
    extends StObject
       with NodeType
  /* "set_operation" */ val set_operation: typings.sqlFormatter.libSrcParserAstMod.NodeType.set_operation & String = js.native
  
  @js.native
  sealed trait statement
    extends StObject
       with NodeType
  /* "statement" */ val statement: typings.sqlFormatter.libSrcParserAstMod.NodeType.statement & String = js.native
}
