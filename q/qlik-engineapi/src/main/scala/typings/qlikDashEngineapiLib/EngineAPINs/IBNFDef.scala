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

