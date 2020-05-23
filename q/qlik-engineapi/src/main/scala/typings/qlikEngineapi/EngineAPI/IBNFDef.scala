package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BNFDef...
  */
trait IBNFDef extends js.Object {
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
  @scala.inline
  def apply(
    qBnf: js.Array[Double],
    qFG: FunctionGroupType,
    qHelpId: Double,
    qMT: MTType,
    qName: String,
    qNbr: Double,
    qPNbr: Double,
    qStr: String,
    qAggrFunc: js.UndefOr[Boolean] = js.undefined,
    qBnfLiteral: js.UndefOr[Boolean] = js.undefined,
    qControlStatement: js.UndefOr[Boolean] = js.undefined,
    qDepr: js.UndefOr[Boolean] = js.undefined,
    qFieldFlag: js.UndefOr[Boolean] = js.undefined,
    qIsBnfRule: js.UndefOr[Boolean] = js.undefined,
    qQvFunc: js.UndefOr[Boolean] = js.undefined,
    qScriptStatement: js.UndefOr[Boolean] = js.undefined
  ): IBNFDef = {
    val __obj = js.Dynamic.literal(qBnf = qBnf.asInstanceOf[js.Any], qFG = qFG.asInstanceOf[js.Any], qHelpId = qHelpId.asInstanceOf[js.Any], qMT = qMT.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNbr = qNbr.asInstanceOf[js.Any], qPNbr = qPNbr.asInstanceOf[js.Any], qStr = qStr.asInstanceOf[js.Any])
    if (!js.isUndefined(qAggrFunc)) __obj.updateDynamic("qAggrFunc")(qAggrFunc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qBnfLiteral)) __obj.updateDynamic("qBnfLiteral")(qBnfLiteral.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qControlStatement)) __obj.updateDynamic("qControlStatement")(qControlStatement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qDepr)) __obj.updateDynamic("qDepr")(qDepr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qFieldFlag)) __obj.updateDynamic("qFieldFlag")(qFieldFlag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qIsBnfRule)) __obj.updateDynamic("qIsBnfRule")(qIsBnfRule.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qQvFunc)) __obj.updateDynamic("qQvFunc")(qQvFunc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qScriptStatement)) __obj.updateDynamic("qScriptStatement")(qScriptStatement.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBNFDef]
  }
}

