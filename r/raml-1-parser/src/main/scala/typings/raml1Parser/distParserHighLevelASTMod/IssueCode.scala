package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IssueCode extends StObject
@JSImport("raml-1-parser/dist/parser/highLevelAST", "IssueCode")
@js.native
object IssueCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueCode & Double] = js.native
  
  @js.native
  sealed trait ILLEGAL_PROPERTY
    extends StObject
       with IssueCode
  /* 12 */ val ILLEGAL_PROPERTY: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.ILLEGAL_PROPERTY & Double = js.native
  
  @js.native
  sealed trait ILLEGAL_PROPERTY_VALUE
    extends StObject
       with IssueCode
  /* 11 */ val ILLEGAL_PROPERTY_VALUE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.ILLEGAL_PROPERTY_VALUE & Double = js.native
  
  @js.native
  sealed trait INVALID_PROPERTY
    extends StObject
       with IssueCode
  /* 13 */ val INVALID_PROPERTY: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.INVALID_PROPERTY & Double = js.native
  
  @js.native
  sealed trait INVALID_VALUE_SCHEMA
    extends StObject
       with IssueCode
  /* 7 */ val INVALID_VALUE_SCHEMA: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.INVALID_VALUE_SCHEMA & Double = js.native
  
  @js.native
  sealed trait KEY_SHOULD_BE_UNIQUE_INTHISCONTEXT
    extends StObject
       with IssueCode
  /* 5 */ val KEY_SHOULD_BE_UNIQUE_INTHISCONTEXT: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.KEY_SHOULD_BE_UNIQUE_INTHISCONTEXT & Double = js.native
  
  @js.native
  sealed trait MISSED_CONTEXT_REQUIREMENT
    extends StObject
       with IssueCode
  /* 8 */ val MISSED_CONTEXT_REQUIREMENT: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.MISSED_CONTEXT_REQUIREMENT & Double = js.native
  
  @js.native
  sealed trait MISSING_REQUIRED_PROPERTY
    extends StObject
       with IssueCode
  /* 3 */ val MISSING_REQUIRED_PROPERTY: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.MISSING_REQUIRED_PROPERTY & Double = js.native
  
  @js.native
  sealed trait NODE_HAS_VALUE
    extends StObject
       with IssueCode
  /* 9 */ val NODE_HAS_VALUE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.NODE_HAS_VALUE & Double = js.native
  
  @js.native
  sealed trait ONLY_OVERRIDE_ALLOWED
    extends StObject
       with IssueCode
  /* 10 */ val ONLY_OVERRIDE_ALLOWED: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.ONLY_OVERRIDE_ALLOWED & Double = js.native
  
  @js.native
  sealed trait PROPERTY_EXPECT_TO_HAVE_SINGLE_VALUE
    extends StObject
       with IssueCode
  /* 4 */ val PROPERTY_EXPECT_TO_HAVE_SINGLE_VALUE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.PROPERTY_EXPECT_TO_HAVE_SINGLE_VALUE & Double = js.native
  
  @js.native
  sealed trait UNABLE_TO_RESOLVE_INCLUDE_FILE
    extends StObject
       with IssueCode
  /* 6 */ val UNABLE_TO_RESOLVE_INCLUDE_FILE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.UNABLE_TO_RESOLVE_INCLUDE_FILE & Double = js.native
  
  @js.native
  sealed trait UNKNOWN_NODE
    extends StObject
       with IssueCode
  /* 2 */ val UNKNOWN_NODE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.UNKNOWN_NODE & Double = js.native
  
  @js.native
  sealed trait UNRESOLVED_REFERENCE
    extends StObject
       with IssueCode
  /* 0 */ val UNRESOLVED_REFERENCE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.UNRESOLVED_REFERENCE & Double = js.native
  
  @js.native
  sealed trait YAML_ERROR
    extends StObject
       with IssueCode
  /* 1 */ val YAML_ERROR: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.YAML_ERROR & Double = js.native
}
