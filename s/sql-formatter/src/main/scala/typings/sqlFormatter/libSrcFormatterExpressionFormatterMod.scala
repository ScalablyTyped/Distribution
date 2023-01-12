package typings.sqlFormatter

import typings.sqlFormatter.libSrcFormatOptionsMod.FormatOptions
import typings.sqlFormatter.libSrcParserAstMod.AstNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterExpressionFormatterMod {
  
  @JSImport("sql-formatter/lib/src/formatter/ExpressionFormatter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ExpressionFormatter {
    def this(param0: ExpressionFormatterParams) = this()
    
    /* private */ /* CompleteClass */
    var cfg: Any = js.native
    
    /* private */ /* CompleteClass */
    var dialectCfg: Any = js.native
    
    /* CompleteClass */
    override def format(nodes: js.Array[AstNode]): typings.sqlFormatter.libSrcFormatterLayoutMod.default = js.native
    
    /* private */ /* CompleteClass */
    var formatAllColumnsAsterisk: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatArraySubscript: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatBetweenPredicate: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatBlockComment: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatCaseElse: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatCaseExpression: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatCaseWhen: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatClause: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatClauseInIndentedStyle: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatClauseInOnelineStyle: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatClauseInTabularStyle: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatComma: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatComments: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatFunctionCall: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatIdentifier: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatInlineExpression: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatJoin: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatKeyword: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatKeywordNode: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatLimitClause: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatLineComment: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatLiteral: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatLogicalOperator: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatNode: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatNodeWithoutComments: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatOperator: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatParameter: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatParenthesis: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatPropertyAccess: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatSetOperation: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatSubExpression: Any = js.native
    
    /* private */ /* CompleteClass */
    var index: Any = js.native
    
    /* private */ /* CompleteClass */
    var `inline`: Any = js.native
    
    /* private */ /* CompleteClass */
    var isMultilineBlockComment: Any = js.native
    
    /* private */ /* CompleteClass */
    var isOnelineClause: Any = js.native
    
    /* private */ /* CompleteClass */
    var layout: Any = js.native
    
    /* private */ /* CompleteClass */
    var nodes: Any = js.native
    
    /* private */ /* CompleteClass */
    var params: Any = js.native
    
    /* private */ /* CompleteClass */
    var showKw: Any = js.native
    
    /* private */ /* CompleteClass */
    var showNonTabularKw: Any = js.native
    
    /* private */ /* CompleteClass */
    var splitBlockComment: Any = js.native
    
    /* private */ /* CompleteClass */
    var withComments: Any = js.native
  }
  
  trait DialectFormatOptions extends StObject {
    
    var alwaysDenseOperators: js.UndefOr[js.Array[String]] = js.undefined
    
    var onelineClauses: js.Array[String]
  }
  object DialectFormatOptions {
    
    inline def apply(onelineClauses: js.Array[String]): DialectFormatOptions = {
      val __obj = js.Dynamic.literal(onelineClauses = onelineClauses.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialectFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialectFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setAlwaysDenseOperators(value: js.Array[String]): Self = StObject.set(x, "alwaysDenseOperators", value.asInstanceOf[js.Any])
      
      inline def setAlwaysDenseOperatorsUndefined: Self = StObject.set(x, "alwaysDenseOperators", js.undefined)
      
      inline def setAlwaysDenseOperatorsVarargs(value: String*): Self = StObject.set(x, "alwaysDenseOperators", js.Array(value*))
      
      inline def setOnelineClauses(value: js.Array[String]): Self = StObject.set(x, "onelineClauses", value.asInstanceOf[js.Any])
      
      inline def setOnelineClausesVarargs(value: String*): Self = StObject.set(x, "onelineClauses", js.Array(value*))
    }
  }
  
  trait ExpressionFormatter extends StObject {
    
    /* private */ var cfg: Any
    
    /* private */ var dialectCfg: Any
    
    def format(nodes: js.Array[AstNode]): typings.sqlFormatter.libSrcFormatterLayoutMod.default
    
    /* private */ var formatAllColumnsAsterisk: Any
    
    /* private */ var formatArraySubscript: Any
    
    /* private */ var formatBetweenPredicate: Any
    
    /* private */ var formatBlockComment: Any
    
    /* private */ var formatCaseElse: Any
    
    /* private */ var formatCaseExpression: Any
    
    /* private */ var formatCaseWhen: Any
    
    /* private */ var formatClause: Any
    
    /* private */ var formatClauseInIndentedStyle: Any
    
    /* private */ var formatClauseInOnelineStyle: Any
    
    /* private */ var formatClauseInTabularStyle: Any
    
    /* private */ var formatComma: Any
    
    /* private */ var formatComments: Any
    
    /* private */ var formatFunctionCall: Any
    
    /* private */ var formatIdentifier: Any
    
    /* private */ var formatInlineExpression: Any
    
    /* private */ var formatJoin: Any
    
    /* private */ var formatKeyword: Any
    
    /* private */ var formatKeywordNode: Any
    
    /* private */ var formatLimitClause: Any
    
    /* private */ var formatLineComment: Any
    
    /* private */ var formatLiteral: Any
    
    /* private */ var formatLogicalOperator: Any
    
    /* private */ var formatNode: Any
    
    /* private */ var formatNodeWithoutComments: Any
    
    /* private */ var formatOperator: Any
    
    /* private */ var formatParameter: Any
    
    /* private */ var formatParenthesis: Any
    
    /* private */ var formatPropertyAccess: Any
    
    /* private */ var formatSetOperation: Any
    
    /* private */ var formatSubExpression: Any
    
    /* private */ var index: Any
    
    /* private */ var `inline`: Any
    
    /* private */ var isMultilineBlockComment: Any
    
    /* private */ var isOnelineClause: Any
    
    /* private */ var layout: Any
    
    /* private */ var nodes: Any
    
    /* private */ var params: Any
    
    /* private */ var showKw: Any
    
    /* private */ var showNonTabularKw: Any
    
    /* private */ var splitBlockComment: Any
    
    /* private */ var withComments: Any
  }
  object ExpressionFormatter {
    
    inline def apply(
      cfg: Any,
      dialectCfg: Any,
      format: js.Array[AstNode] => typings.sqlFormatter.libSrcFormatterLayoutMod.default,
      formatAllColumnsAsterisk: Any,
      formatArraySubscript: Any,
      formatBetweenPredicate: Any,
      formatBlockComment: Any,
      formatCaseElse: Any,
      formatCaseExpression: Any,
      formatCaseWhen: Any,
      formatClause: Any,
      formatClauseInIndentedStyle: Any,
      formatClauseInOnelineStyle: Any,
      formatClauseInTabularStyle: Any,
      formatComma: Any,
      formatComments: Any,
      formatFunctionCall: Any,
      formatIdentifier: Any,
      formatInlineExpression: Any,
      formatJoin: Any,
      formatKeyword: Any,
      formatKeywordNode: Any,
      formatLimitClause: Any,
      formatLineComment: Any,
      formatLiteral: Any,
      formatLogicalOperator: Any,
      formatNode: Any,
      formatNodeWithoutComments: Any,
      formatOperator: Any,
      formatParameter: Any,
      formatParenthesis: Any,
      formatPropertyAccess: Any,
      formatSetOperation: Any,
      formatSubExpression: Any,
      index: Any,
      `inline`: Any,
      isMultilineBlockComment: Any,
      isOnelineClause: Any,
      layout: Any,
      nodes: Any,
      params: Any,
      showKw: Any,
      showNonTabularKw: Any,
      splitBlockComment: Any,
      withComments: Any
    ): ExpressionFormatter = {
      val __obj = js.Dynamic.literal(cfg = cfg.asInstanceOf[js.Any], dialectCfg = dialectCfg.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), formatAllColumnsAsterisk = formatAllColumnsAsterisk.asInstanceOf[js.Any], formatArraySubscript = formatArraySubscript.asInstanceOf[js.Any], formatBetweenPredicate = formatBetweenPredicate.asInstanceOf[js.Any], formatBlockComment = formatBlockComment.asInstanceOf[js.Any], formatCaseElse = formatCaseElse.asInstanceOf[js.Any], formatCaseExpression = formatCaseExpression.asInstanceOf[js.Any], formatCaseWhen = formatCaseWhen.asInstanceOf[js.Any], formatClause = formatClause.asInstanceOf[js.Any], formatClauseInIndentedStyle = formatClauseInIndentedStyle.asInstanceOf[js.Any], formatClauseInOnelineStyle = formatClauseInOnelineStyle.asInstanceOf[js.Any], formatClauseInTabularStyle = formatClauseInTabularStyle.asInstanceOf[js.Any], formatComma = formatComma.asInstanceOf[js.Any], formatComments = formatComments.asInstanceOf[js.Any], formatFunctionCall = formatFunctionCall.asInstanceOf[js.Any], formatIdentifier = formatIdentifier.asInstanceOf[js.Any], formatInlineExpression = formatInlineExpression.asInstanceOf[js.Any], formatJoin = formatJoin.asInstanceOf[js.Any], formatKeyword = formatKeyword.asInstanceOf[js.Any], formatKeywordNode = formatKeywordNode.asInstanceOf[js.Any], formatLimitClause = formatLimitClause.asInstanceOf[js.Any], formatLineComment = formatLineComment.asInstanceOf[js.Any], formatLiteral = formatLiteral.asInstanceOf[js.Any], formatLogicalOperator = formatLogicalOperator.asInstanceOf[js.Any], formatNode = formatNode.asInstanceOf[js.Any], formatNodeWithoutComments = formatNodeWithoutComments.asInstanceOf[js.Any], formatOperator = formatOperator.asInstanceOf[js.Any], formatParameter = formatParameter.asInstanceOf[js.Any], formatParenthesis = formatParenthesis.asInstanceOf[js.Any], formatPropertyAccess = formatPropertyAccess.asInstanceOf[js.Any], formatSetOperation = formatSetOperation.asInstanceOf[js.Any], formatSubExpression = formatSubExpression.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isMultilineBlockComment = isMultilineBlockComment.asInstanceOf[js.Any], isOnelineClause = isOnelineClause.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], showKw = showKw.asInstanceOf[js.Any], showNonTabularKw = showNonTabularKw.asInstanceOf[js.Any], splitBlockComment = splitBlockComment.asInstanceOf[js.Any], withComments = withComments.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpressionFormatter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpressionFormatter] (val x: Self) extends AnyVal {
      
      inline def setCfg(value: Any): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setDialectCfg(value: Any): Self = StObject.set(x, "dialectCfg", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: js.Array[AstNode] => typings.sqlFormatter.libSrcFormatterLayoutMod.default): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatAllColumnsAsterisk(value: Any): Self = StObject.set(x, "formatAllColumnsAsterisk", value.asInstanceOf[js.Any])
      
      inline def setFormatArraySubscript(value: Any): Self = StObject.set(x, "formatArraySubscript", value.asInstanceOf[js.Any])
      
      inline def setFormatBetweenPredicate(value: Any): Self = StObject.set(x, "formatBetweenPredicate", value.asInstanceOf[js.Any])
      
      inline def setFormatBlockComment(value: Any): Self = StObject.set(x, "formatBlockComment", value.asInstanceOf[js.Any])
      
      inline def setFormatCaseElse(value: Any): Self = StObject.set(x, "formatCaseElse", value.asInstanceOf[js.Any])
      
      inline def setFormatCaseExpression(value: Any): Self = StObject.set(x, "formatCaseExpression", value.asInstanceOf[js.Any])
      
      inline def setFormatCaseWhen(value: Any): Self = StObject.set(x, "formatCaseWhen", value.asInstanceOf[js.Any])
      
      inline def setFormatClause(value: Any): Self = StObject.set(x, "formatClause", value.asInstanceOf[js.Any])
      
      inline def setFormatClauseInIndentedStyle(value: Any): Self = StObject.set(x, "formatClauseInIndentedStyle", value.asInstanceOf[js.Any])
      
      inline def setFormatClauseInOnelineStyle(value: Any): Self = StObject.set(x, "formatClauseInOnelineStyle", value.asInstanceOf[js.Any])
      
      inline def setFormatClauseInTabularStyle(value: Any): Self = StObject.set(x, "formatClauseInTabularStyle", value.asInstanceOf[js.Any])
      
      inline def setFormatComma(value: Any): Self = StObject.set(x, "formatComma", value.asInstanceOf[js.Any])
      
      inline def setFormatComments(value: Any): Self = StObject.set(x, "formatComments", value.asInstanceOf[js.Any])
      
      inline def setFormatFunctionCall(value: Any): Self = StObject.set(x, "formatFunctionCall", value.asInstanceOf[js.Any])
      
      inline def setFormatIdentifier(value: Any): Self = StObject.set(x, "formatIdentifier", value.asInstanceOf[js.Any])
      
      inline def setFormatInlineExpression(value: Any): Self = StObject.set(x, "formatInlineExpression", value.asInstanceOf[js.Any])
      
      inline def setFormatJoin(value: Any): Self = StObject.set(x, "formatJoin", value.asInstanceOf[js.Any])
      
      inline def setFormatKeyword(value: Any): Self = StObject.set(x, "formatKeyword", value.asInstanceOf[js.Any])
      
      inline def setFormatKeywordNode(value: Any): Self = StObject.set(x, "formatKeywordNode", value.asInstanceOf[js.Any])
      
      inline def setFormatLimitClause(value: Any): Self = StObject.set(x, "formatLimitClause", value.asInstanceOf[js.Any])
      
      inline def setFormatLineComment(value: Any): Self = StObject.set(x, "formatLineComment", value.asInstanceOf[js.Any])
      
      inline def setFormatLiteral(value: Any): Self = StObject.set(x, "formatLiteral", value.asInstanceOf[js.Any])
      
      inline def setFormatLogicalOperator(value: Any): Self = StObject.set(x, "formatLogicalOperator", value.asInstanceOf[js.Any])
      
      inline def setFormatNode(value: Any): Self = StObject.set(x, "formatNode", value.asInstanceOf[js.Any])
      
      inline def setFormatNodeWithoutComments(value: Any): Self = StObject.set(x, "formatNodeWithoutComments", value.asInstanceOf[js.Any])
      
      inline def setFormatOperator(value: Any): Self = StObject.set(x, "formatOperator", value.asInstanceOf[js.Any])
      
      inline def setFormatParameter(value: Any): Self = StObject.set(x, "formatParameter", value.asInstanceOf[js.Any])
      
      inline def setFormatParenthesis(value: Any): Self = StObject.set(x, "formatParenthesis", value.asInstanceOf[js.Any])
      
      inline def setFormatPropertyAccess(value: Any): Self = StObject.set(x, "formatPropertyAccess", value.asInstanceOf[js.Any])
      
      inline def setFormatSetOperation(value: Any): Self = StObject.set(x, "formatSetOperation", value.asInstanceOf[js.Any])
      
      inline def setFormatSubExpression(value: Any): Self = StObject.set(x, "formatSubExpression", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInline(value: Any): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setIsMultilineBlockComment(value: Any): Self = StObject.set(x, "isMultilineBlockComment", value.asInstanceOf[js.Any])
      
      inline def setIsOnelineClause(value: Any): Self = StObject.set(x, "isOnelineClause", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setShowKw(value: Any): Self = StObject.set(x, "showKw", value.asInstanceOf[js.Any])
      
      inline def setShowNonTabularKw(value: Any): Self = StObject.set(x, "showNonTabularKw", value.asInstanceOf[js.Any])
      
      inline def setSplitBlockComment(value: Any): Self = StObject.set(x, "splitBlockComment", value.asInstanceOf[js.Any])
      
      inline def setWithComments(value: Any): Self = StObject.set(x, "withComments", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpressionFormatterParams extends StObject {
    
    var cfg: FormatOptions
    
    var dialectCfg: ProcessedDialectFormatOptions
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var layout: typings.sqlFormatter.libSrcFormatterLayoutMod.default
    
    var params: typings.sqlFormatter.libSrcFormatterParamsMod.default
  }
  object ExpressionFormatterParams {
    
    inline def apply(
      cfg: FormatOptions,
      dialectCfg: ProcessedDialectFormatOptions,
      layout: typings.sqlFormatter.libSrcFormatterLayoutMod.default,
      params: typings.sqlFormatter.libSrcFormatterParamsMod.default
    ): ExpressionFormatterParams = {
      val __obj = js.Dynamic.literal(cfg = cfg.asInstanceOf[js.Any], dialectCfg = dialectCfg.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpressionFormatterParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpressionFormatterParams] (val x: Self) extends AnyVal {
      
      inline def setCfg(value: FormatOptions): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setDialectCfg(value: ProcessedDialectFormatOptions): Self = StObject.set(x, "dialectCfg", value.asInstanceOf[js.Any])
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setLayout(value: typings.sqlFormatter.libSrcFormatterLayoutMod.default): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setParams(value: typings.sqlFormatter.libSrcFormatterParamsMod.default): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessedDialectFormatOptions extends StObject {
    
    var alwaysDenseOperators: js.Array[String]
    
    var onelineClauses: Record[String, Boolean]
  }
  object ProcessedDialectFormatOptions {
    
    inline def apply(alwaysDenseOperators: js.Array[String], onelineClauses: Record[String, Boolean]): ProcessedDialectFormatOptions = {
      val __obj = js.Dynamic.literal(alwaysDenseOperators = alwaysDenseOperators.asInstanceOf[js.Any], onelineClauses = onelineClauses.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessedDialectFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessedDialectFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setAlwaysDenseOperators(value: js.Array[String]): Self = StObject.set(x, "alwaysDenseOperators", value.asInstanceOf[js.Any])
      
      inline def setAlwaysDenseOperatorsVarargs(value: String*): Self = StObject.set(x, "alwaysDenseOperators", js.Array(value*))
      
      inline def setOnelineClauses(value: Record[String, Boolean]): Self = StObject.set(x, "onelineClauses", value.asInstanceOf[js.Any])
    }
  }
}
