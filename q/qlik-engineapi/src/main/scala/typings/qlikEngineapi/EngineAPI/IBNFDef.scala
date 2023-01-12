package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BNFDef...
  */
trait IBNFDef extends StObject {
  
  /**
    * If set to true, it means that the definition is related to an aggregation function.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qAggrFunc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of token references that all together build up the definition of the current token.
    * If the array is not empty, it means that the definition is a BNF rule (qIsBnfRule is set to true).
    * There are a few exceptions where some BNF rules have an empty array (qBnf is empty).
    */
  var qBnf: js.Array[Double]
  
  /**
    * If set to true, it means that the definition specifies a literal token.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qBnfLiteral: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, it means that the definition specifies a control statement.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qControlStatement: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if a script statement, a chart or a script function is deprecated (not recommended to use).
    * If set to true, it means that the script statement or the function is not recommended for use in Qlik Sense.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qDepr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Group of the function.
    */
  var qFG: FunctionGroupType
  
  /**
    * If set to true, it means that the definition is related to a field.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qFieldFlag: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Reference identifier to a function described in the documentation.
    * The identifier is stored in the definition of the token containing the function name.
    * Is not used in Qlik Sense.
    */
  var qHelpId: Double
  
  /**
    * If set to true, it means that a list of related rule tokens is assigned to qBnf.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qIsBnfRule: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of the data.
    */
  var qMT: MTType
  
  /**
    * Token name.
    * One of:
    *               a rule name
    *               an identifier
    *               a literal value
    */
  var qName: String
  
  /**
    * Number of the current token definition.
    */
  var qNbr: Double
  
  /**
    * Number of the parent rule definition.    Integer
    */
  var qPNbr: Double
  
  /**
    * If set to true, it means that the definition is related to a Qlik Sense function.
    * It cannot be an aggregation function.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qQvFunc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, it means that the definition specifies a script statement.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qScriptStatement: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Literal string of the token.
    * Examples: 'Round' and '('.
    */
  var qStr: String
}
object IBNFDef {
  
  inline def apply(
    qBnf: js.Array[Double],
    qFG: FunctionGroupType,
    qHelpId: Double,
    qMT: MTType,
    qName: String,
    qNbr: Double,
    qPNbr: Double,
    qStr: String
  ): IBNFDef = {
    val __obj = js.Dynamic.literal(qBnf = qBnf.asInstanceOf[js.Any], qFG = qFG.asInstanceOf[js.Any], qHelpId = qHelpId.asInstanceOf[js.Any], qMT = qMT.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNbr = qNbr.asInstanceOf[js.Any], qPNbr = qPNbr.asInstanceOf[js.Any], qStr = qStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBNFDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBNFDef] (val x: Self) extends AnyVal {
    
    inline def setQAggrFunc(value: Boolean): Self = StObject.set(x, "qAggrFunc", value.asInstanceOf[js.Any])
    
    inline def setQAggrFuncUndefined: Self = StObject.set(x, "qAggrFunc", js.undefined)
    
    inline def setQBnf(value: js.Array[Double]): Self = StObject.set(x, "qBnf", value.asInstanceOf[js.Any])
    
    inline def setQBnfLiteral(value: Boolean): Self = StObject.set(x, "qBnfLiteral", value.asInstanceOf[js.Any])
    
    inline def setQBnfLiteralUndefined: Self = StObject.set(x, "qBnfLiteral", js.undefined)
    
    inline def setQBnfVarargs(value: Double*): Self = StObject.set(x, "qBnf", js.Array(value*))
    
    inline def setQControlStatement(value: Boolean): Self = StObject.set(x, "qControlStatement", value.asInstanceOf[js.Any])
    
    inline def setQControlStatementUndefined: Self = StObject.set(x, "qControlStatement", js.undefined)
    
    inline def setQDepr(value: Boolean): Self = StObject.set(x, "qDepr", value.asInstanceOf[js.Any])
    
    inline def setQDeprUndefined: Self = StObject.set(x, "qDepr", js.undefined)
    
    inline def setQFG(value: FunctionGroupType): Self = StObject.set(x, "qFG", value.asInstanceOf[js.Any])
    
    inline def setQFieldFlag(value: Boolean): Self = StObject.set(x, "qFieldFlag", value.asInstanceOf[js.Any])
    
    inline def setQFieldFlagUndefined: Self = StObject.set(x, "qFieldFlag", js.undefined)
    
    inline def setQHelpId(value: Double): Self = StObject.set(x, "qHelpId", value.asInstanceOf[js.Any])
    
    inline def setQIsBnfRule(value: Boolean): Self = StObject.set(x, "qIsBnfRule", value.asInstanceOf[js.Any])
    
    inline def setQIsBnfRuleUndefined: Self = StObject.set(x, "qIsBnfRule", js.undefined)
    
    inline def setQMT(value: MTType): Self = StObject.set(x, "qMT", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQNbr(value: Double): Self = StObject.set(x, "qNbr", value.asInstanceOf[js.Any])
    
    inline def setQPNbr(value: Double): Self = StObject.set(x, "qPNbr", value.asInstanceOf[js.Any])
    
    inline def setQQvFunc(value: Boolean): Self = StObject.set(x, "qQvFunc", value.asInstanceOf[js.Any])
    
    inline def setQQvFuncUndefined: Self = StObject.set(x, "qQvFunc", js.undefined)
    
    inline def setQScriptStatement(value: Boolean): Self = StObject.set(x, "qScriptStatement", value.asInstanceOf[js.Any])
    
    inline def setQScriptStatementUndefined: Self = StObject.set(x, "qScriptStatement", js.undefined)
    
    inline def setQStr(value: String): Self = StObject.set(x, "qStr", value.asInstanceOf[js.Any])
  }
}
