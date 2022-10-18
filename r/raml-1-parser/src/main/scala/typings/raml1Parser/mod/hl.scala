package typings.raml1Parser.mod

import typings.raml1Parser.distParserHighLevelASTMod.ASTAnnotationValidationPlugin
import typings.raml1Parser.distParserHighLevelASTMod.INodeValidationPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hl {
  
  @JSImport("raml-1-parser", "hl")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "hl.IssueCode")
  @js.native
  object IssueCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.raml1Parser.distParserHighLevelASTMod.IssueCode & Double] = js.native
    
    /* 12 */ val ILLEGAL_PROPERTY: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.ILLEGAL_PROPERTY & Double = js.native
    
    /* 11 */ val ILLEGAL_PROPERTY_VALUE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.ILLEGAL_PROPERTY_VALUE & Double = js.native
    
    /* 13 */ val INVALID_PROPERTY: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.INVALID_PROPERTY & Double = js.native
    
    /* 7 */ val INVALID_VALUE_SCHEMA: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.INVALID_VALUE_SCHEMA & Double = js.native
    
    /* 5 */ val KEY_SHOULD_BE_UNIQUE_INTHISCONTEXT: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.KEY_SHOULD_BE_UNIQUE_INTHISCONTEXT & Double = js.native
    
    /* 8 */ val MISSED_CONTEXT_REQUIREMENT: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.MISSED_CONTEXT_REQUIREMENT & Double = js.native
    
    /* 3 */ val MISSING_REQUIRED_PROPERTY: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.MISSING_REQUIRED_PROPERTY & Double = js.native
    
    /* 9 */ val NODE_HAS_VALUE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.NODE_HAS_VALUE & Double = js.native
    
    /* 10 */ val ONLY_OVERRIDE_ALLOWED: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.ONLY_OVERRIDE_ALLOWED & Double = js.native
    
    /* 4 */ val PROPERTY_EXPECT_TO_HAVE_SINGLE_VALUE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.PROPERTY_EXPECT_TO_HAVE_SINGLE_VALUE & Double = js.native
    
    /* 6 */ val UNABLE_TO_RESOLVE_INCLUDE_FILE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.UNABLE_TO_RESOLVE_INCLUDE_FILE & Double = js.native
    
    /* 2 */ val UNKNOWN_NODE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.UNKNOWN_NODE & Double = js.native
    
    /* 0 */ val UNRESOLVED_REFERENCE: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.UNRESOLVED_REFERENCE & Double = js.native
    
    /* 1 */ val YAML_ERROR: typings.raml1Parser.distParserHighLevelASTMod.IssueCode.YAML_ERROR & Double = js.native
  }
  
  @JSImport("raml-1-parser", "hl.NodeKind")
  @js.native
  object NodeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.raml1Parser.distParserHighLevelASTMod.NodeKind & Double] = js.native
    
    /* 2 */ val ATTRIBUTE: typings.raml1Parser.distParserHighLevelASTMod.NodeKind.ATTRIBUTE & Double = js.native
    
    /* 0 */ val BASIC: typings.raml1Parser.distParserHighLevelASTMod.NodeKind.BASIC & Double = js.native
    
    /* 1 */ val NODE: typings.raml1Parser.distParserHighLevelASTMod.NodeKind.NODE & Double = js.native
  }
  
  @JSImport("raml-1-parser", "hl.RAMLVersion")
  @js.native
  object RAMLVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.raml1Parser.distParserHighLevelASTMod.RAMLVersion & Double] = js.native
    
    /* 1 */ val RAML08: typings.raml1Parser.distParserHighLevelASTMod.RAMLVersion.RAML08 & Double = js.native
    
    /* 0 */ val RAML10: typings.raml1Parser.distParserHighLevelASTMod.RAMLVersion.RAML10 & Double = js.native
  }
  
  inline def getNodeAnnotationValidationPlugins(): js.Array[ASTAnnotationValidationPlugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAnnotationValidationPlugins")().asInstanceOf[js.Array[ASTAnnotationValidationPlugin]]
  
  inline def getNodeValidationPlugins(): js.Array[INodeValidationPlugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeValidationPlugins")().asInstanceOf[js.Array[INodeValidationPlugin]]
  
  inline def isParseResult(`object`: Any): /* is raml-1-parser.raml-1-parser/dist/parser/highLevelAST.IParseResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParseResult")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/highLevelAST.IParseResult */ Boolean]
}
