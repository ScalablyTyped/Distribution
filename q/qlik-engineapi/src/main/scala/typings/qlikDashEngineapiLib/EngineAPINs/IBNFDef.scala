package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qAggrFunc: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array of token references that all together build up the definition of the current token.
    * If the array is not empty, it means that the definition is a BNF rule (qIsBnfRule is set to true).
    * There are a few exceptions where some BNF rules have an empty array (qBnf is empty).
    */
  var qBnf: js.Array[scala.Double]
  /**
    * If set to true, it means that the definition specifies a literal token.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qBnfLiteral: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, it means that the definition specifies a control statement.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qControlStatement: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if a script statement, a chart or a script function is deprecated (not recommended to use).
    * If set to true, it means that the script statement or the function is not recommended for use in Qlik Sense.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qDepr: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Group of the function.
    */
  var qFG: FunctionGroupType
  /**
    * If set to true, it means that the definition is related to a field.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qFieldFlag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Reference identifier to a function described in the documentation.
    * The identifier is stored in the definition of the token containing the function name.
    * Is not used in Qlik Sense.
    */
  var qHelpId: scala.Double
  /**
    * If set to true, it means that a list of related rule tokens is assigned to qBnf.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qIsBnfRule: js.UndefOr[scala.Boolean] = js.undefined
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
  var qName: java.lang.String
  /**
    * Number of the current token definition.
    */
  var qNbr: scala.Double
  /**
    * Number of the parent rule definition.	Integer
    */
  var qPNbr: scala.Double
  /**
    * If set to true, it means that the definition is related to a Qlik Sense function.
    * It cannot be an aggregation function.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qQvFunc: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, it means that the definition specifies a script statement.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qScriptStatement: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Literal string of the token.
    * Examples: 'Round' and '('.
    */
  var qStr: java.lang.String
}

object IBNFDef {
  @scala.inline
  def apply(
    qBnf: js.Array[scala.Double],
    qFG: FunctionGroupType,
    qHelpId: scala.Double,
    qMT: MTType,
    qName: java.lang.String,
    qNbr: scala.Double,
    qPNbr: scala.Double,
    qStr: java.lang.String,
    qAggrFunc: js.UndefOr[scala.Boolean] = js.undefined,
    qBnfLiteral: js.UndefOr[scala.Boolean] = js.undefined,
    qControlStatement: js.UndefOr[scala.Boolean] = js.undefined,
    qDepr: js.UndefOr[scala.Boolean] = js.undefined,
    qFieldFlag: js.UndefOr[scala.Boolean] = js.undefined,
    qIsBnfRule: js.UndefOr[scala.Boolean] = js.undefined,
    qQvFunc: js.UndefOr[scala.Boolean] = js.undefined,
    qScriptStatement: js.UndefOr[scala.Boolean] = js.undefined
  ): IBNFDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qBnf")(qBnf)
    __obj.updateDynamic("qFG")(qFG)
    __obj.updateDynamic("qHelpId")(qHelpId)
    __obj.updateDynamic("qMT")(qMT)
    __obj.updateDynamic("qName")(qName)
    __obj.updateDynamic("qNbr")(qNbr)
    __obj.updateDynamic("qPNbr")(qPNbr)
    __obj.updateDynamic("qStr")(qStr)
    if (!js.isUndefined(qAggrFunc)) __obj.updateDynamic("qAggrFunc")(qAggrFunc)
    if (!js.isUndefined(qBnfLiteral)) __obj.updateDynamic("qBnfLiteral")(qBnfLiteral)
    if (!js.isUndefined(qControlStatement)) __obj.updateDynamic("qControlStatement")(qControlStatement)
    if (!js.isUndefined(qDepr)) __obj.updateDynamic("qDepr")(qDepr)
    if (!js.isUndefined(qFieldFlag)) __obj.updateDynamic("qFieldFlag")(qFieldFlag)
    if (!js.isUndefined(qIsBnfRule)) __obj.updateDynamic("qIsBnfRule")(qIsBnfRule)
    if (!js.isUndefined(qQvFunc)) __obj.updateDynamic("qQvFunc")(qQvFunc)
    if (!js.isUndefined(qScriptStatement)) __obj.updateDynamic("qScriptStatement")(qScriptStatement)
    __obj.asInstanceOf[IBNFDef]
  }
}

