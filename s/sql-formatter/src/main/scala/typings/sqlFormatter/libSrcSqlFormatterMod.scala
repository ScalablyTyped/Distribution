package typings.sqlFormatter

import typings.sqlFormatter.libSrcDialectMod.DialectOptions
import typings.sqlFormatter.libSrcFormatOptionsMod.CommaPosition
import typings.sqlFormatter.libSrcFormatOptionsMod.IndentStyle
import typings.sqlFormatter.libSrcFormatOptionsMod.KeywordCase
import typings.sqlFormatter.libSrcFormatOptionsMod.LogicalOperatorNewline
import typings.sqlFormatter.libSrcFormatterParamsMod.ParamItems
import typings.sqlFormatter.libSrcLexerTokenizerOptionsMod.ParamTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcSqlFormatterMod {
  
  @JSImport("sql-formatter/lib/src/sqlFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(query: String, cfg: FormatOptionsWithLanguage): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDialect(query: String, param1: FormatOptionsWithDialect): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDialect")(query.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("sql-formatter/lib/src/sqlFormatter", "supportedDialects")
  @js.native
  val supportedDialects: js.Array[String] = js.native
  
  type FormatFn = js.Function2[/* query */ String, /* cfg */ js.UndefOr[FormatOptionsWithLanguage], String]
  
  /* Inlined std.Partial<sql-formatter.sql-formatter/lib/src/FormatOptions.FormatOptions> & {  dialect :sql-formatter.sql-formatter/lib/src/dialect.DialectOptions} */
  trait FormatOptionsWithDialect extends StObject {
    
    var commaPosition: js.UndefOr[CommaPosition] = js.undefined
    
    var denseOperators: js.UndefOr[Boolean] = js.undefined
    
    var dialect: DialectOptions
    
    var expressionWidth: js.UndefOr[Double] = js.undefined
    
    var indentStyle: js.UndefOr[IndentStyle] = js.undefined
    
    var keywordCase: js.UndefOr[KeywordCase] = js.undefined
    
    var linesBetweenQueries: js.UndefOr[Double] = js.undefined
    
    var logicalOperatorNewline: js.UndefOr[LogicalOperatorNewline] = js.undefined
    
    var newlineBeforeSemicolon: js.UndefOr[Boolean] = js.undefined
    
    var paramTypes: js.UndefOr[ParamTypes] = js.undefined
    
    var params: js.UndefOr[ParamItems | js.Array[String]] = js.undefined
    
    var tabWidth: js.UndefOr[Double] = js.undefined
    
    var tabulateAlias: js.UndefOr[Boolean] = js.undefined
    
    var useTabs: js.UndefOr[Boolean] = js.undefined
  }
  object FormatOptionsWithDialect {
    
    inline def apply(dialect: DialectOptions): FormatOptionsWithDialect = {
      val __obj = js.Dynamic.literal(dialect = dialect.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptionsWithDialect]
    }
    
    extension [Self <: FormatOptionsWithDialect](x: Self) {
      
      inline def setCommaPosition(value: CommaPosition): Self = StObject.set(x, "commaPosition", value.asInstanceOf[js.Any])
      
      inline def setCommaPositionUndefined: Self = StObject.set(x, "commaPosition", js.undefined)
      
      inline def setDenseOperators(value: Boolean): Self = StObject.set(x, "denseOperators", value.asInstanceOf[js.Any])
      
      inline def setDenseOperatorsUndefined: Self = StObject.set(x, "denseOperators", js.undefined)
      
      inline def setDialect(value: DialectOptions): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
      
      inline def setExpressionWidth(value: Double): Self = StObject.set(x, "expressionWidth", value.asInstanceOf[js.Any])
      
      inline def setExpressionWidthUndefined: Self = StObject.set(x, "expressionWidth", js.undefined)
      
      inline def setIndentStyle(value: IndentStyle): Self = StObject.set(x, "indentStyle", value.asInstanceOf[js.Any])
      
      inline def setIndentStyleUndefined: Self = StObject.set(x, "indentStyle", js.undefined)
      
      inline def setKeywordCase(value: KeywordCase): Self = StObject.set(x, "keywordCase", value.asInstanceOf[js.Any])
      
      inline def setKeywordCaseUndefined: Self = StObject.set(x, "keywordCase", js.undefined)
      
      inline def setLinesBetweenQueries(value: Double): Self = StObject.set(x, "linesBetweenQueries", value.asInstanceOf[js.Any])
      
      inline def setLinesBetweenQueriesUndefined: Self = StObject.set(x, "linesBetweenQueries", js.undefined)
      
      inline def setLogicalOperatorNewline(value: LogicalOperatorNewline): Self = StObject.set(x, "logicalOperatorNewline", value.asInstanceOf[js.Any])
      
      inline def setLogicalOperatorNewlineUndefined: Self = StObject.set(x, "logicalOperatorNewline", js.undefined)
      
      inline def setNewlineBeforeSemicolon(value: Boolean): Self = StObject.set(x, "newlineBeforeSemicolon", value.asInstanceOf[js.Any])
      
      inline def setNewlineBeforeSemicolonUndefined: Self = StObject.set(x, "newlineBeforeSemicolon", js.undefined)
      
      inline def setParamTypes(value: ParamTypes): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
      
      inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
      
      inline def setParams(value: ParamItems | js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      inline def setTabulateAlias(value: Boolean): Self = StObject.set(x, "tabulateAlias", value.asInstanceOf[js.Any])
      
      inline def setTabulateAliasUndefined: Self = StObject.set(x, "tabulateAlias", js.undefined)
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      inline def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sql-formatter.sql-formatter/lib/src/FormatOptions.FormatOptions> & {  language :sql-formatter.sql-formatter/lib/src/sqlFormatter.SqlLanguage | undefined} */
  trait FormatOptionsWithLanguage extends StObject {
    
    var commaPosition: js.UndefOr[CommaPosition] = js.undefined
    
    var denseOperators: js.UndefOr[Boolean] = js.undefined
    
    var expressionWidth: js.UndefOr[Double] = js.undefined
    
    var indentStyle: js.UndefOr[IndentStyle] = js.undefined
    
    var keywordCase: js.UndefOr[KeywordCase] = js.undefined
    
    var language: js.UndefOr[SqlLanguage] = js.undefined
    
    var linesBetweenQueries: js.UndefOr[Double] = js.undefined
    
    var logicalOperatorNewline: js.UndefOr[LogicalOperatorNewline] = js.undefined
    
    var newlineBeforeSemicolon: js.UndefOr[Boolean] = js.undefined
    
    var paramTypes: js.UndefOr[ParamTypes] = js.undefined
    
    var params: js.UndefOr[ParamItems | js.Array[String]] = js.undefined
    
    var tabWidth: js.UndefOr[Double] = js.undefined
    
    var tabulateAlias: js.UndefOr[Boolean] = js.undefined
    
    var useTabs: js.UndefOr[Boolean] = js.undefined
  }
  object FormatOptionsWithLanguage {
    
    inline def apply(): FormatOptionsWithLanguage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptionsWithLanguage]
    }
    
    extension [Self <: FormatOptionsWithLanguage](x: Self) {
      
      inline def setCommaPosition(value: CommaPosition): Self = StObject.set(x, "commaPosition", value.asInstanceOf[js.Any])
      
      inline def setCommaPositionUndefined: Self = StObject.set(x, "commaPosition", js.undefined)
      
      inline def setDenseOperators(value: Boolean): Self = StObject.set(x, "denseOperators", value.asInstanceOf[js.Any])
      
      inline def setDenseOperatorsUndefined: Self = StObject.set(x, "denseOperators", js.undefined)
      
      inline def setExpressionWidth(value: Double): Self = StObject.set(x, "expressionWidth", value.asInstanceOf[js.Any])
      
      inline def setExpressionWidthUndefined: Self = StObject.set(x, "expressionWidth", js.undefined)
      
      inline def setIndentStyle(value: IndentStyle): Self = StObject.set(x, "indentStyle", value.asInstanceOf[js.Any])
      
      inline def setIndentStyleUndefined: Self = StObject.set(x, "indentStyle", js.undefined)
      
      inline def setKeywordCase(value: KeywordCase): Self = StObject.set(x, "keywordCase", value.asInstanceOf[js.Any])
      
      inline def setKeywordCaseUndefined: Self = StObject.set(x, "keywordCase", js.undefined)
      
      inline def setLanguage(value: SqlLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLinesBetweenQueries(value: Double): Self = StObject.set(x, "linesBetweenQueries", value.asInstanceOf[js.Any])
      
      inline def setLinesBetweenQueriesUndefined: Self = StObject.set(x, "linesBetweenQueries", js.undefined)
      
      inline def setLogicalOperatorNewline(value: LogicalOperatorNewline): Self = StObject.set(x, "logicalOperatorNewline", value.asInstanceOf[js.Any])
      
      inline def setLogicalOperatorNewlineUndefined: Self = StObject.set(x, "logicalOperatorNewline", js.undefined)
      
      inline def setNewlineBeforeSemicolon(value: Boolean): Self = StObject.set(x, "newlineBeforeSemicolon", value.asInstanceOf[js.Any])
      
      inline def setNewlineBeforeSemicolonUndefined: Self = StObject.set(x, "newlineBeforeSemicolon", js.undefined)
      
      inline def setParamTypes(value: ParamTypes): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
      
      inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
      
      inline def setParams(value: ParamItems | js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      inline def setTabulateAlias(value: Boolean): Self = StObject.set(x, "tabulateAlias", value.asInstanceOf[js.Any])
      
      inline def setTabulateAliasUndefined: Self = StObject.set(x, "tabulateAlias", js.undefined)
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      inline def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
    }
  }
  
  type SqlLanguage = /* keyof std.Record<string, keyof typeof allDialects> */ String
}
