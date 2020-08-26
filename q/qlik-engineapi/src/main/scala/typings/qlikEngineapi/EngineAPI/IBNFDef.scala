package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BNFDef...
  */
@js.native
trait IBNFDef extends js.Object {
  /**
    * If set to true, it means that the definition is related to an aggregation function.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qAggrFunc: js.UndefOr[Boolean] = js.native
  /**
    * Array of token references that all together build up the definition of the current token.
    * If the array is not empty, it means that the definition is a BNF rule (qIsBnfRule is set to true).
    * There are a few exceptions where some BNF rules have an empty array (qBnf is empty).
    */
  var qBnf: js.Array[Double] = js.native
  /**
    * If set to true, it means that the definition specifies a literal token.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qBnfLiteral: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it means that the definition specifies a control statement.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qControlStatement: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if a script statement, a chart or a script function is deprecated (not recommended to use).
    * If set to true, it means that the script statement or the function is not recommended for use in Qlik Sense.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qDepr: js.UndefOr[Boolean] = js.native
  /**
    * Group of the function.
    */
  var qFG: FunctionGroupType = js.native
  /**
    * If set to true, it means that the definition is related to a field.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qFieldFlag: js.UndefOr[Boolean] = js.native
  /**
    * Reference identifier to a function described in the documentation.
    * The identifier is stored in the definition of the token containing the function name.
    * Is not used in Qlik Sense.
    */
  var qHelpId: Double = js.native
  /**
    * If set to true, it means that a list of related rule tokens is assigned to qBnf.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qIsBnfRule: js.UndefOr[Boolean] = js.native
  /**
    * Type of the data.
    */
  var qMT: MTType = js.native
  /**
    * Token name.
    * One of:
    *               a rule name
    *               an identifier
    *               a literal value
    */
  var qName: String = js.native
  /**
    * Number of the current token definition.
    */
  var qNbr: Double = js.native
  /**
    * Number of the parent rule definition.    Integer
    */
  var qPNbr: Double = js.native
  /**
    * If set to true, it means that the definition is related to a Qlik Sense function.
    * It cannot be an aggregation function.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qQvFunc: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, it means that the definition specifies a script statement.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qScriptStatement: js.UndefOr[Boolean] = js.native
  /**
    * Literal string of the token.
    * Examples: 'Round' and '('.
    */
  var qStr: String = js.native
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
    qStr: String
  ): IBNFDef = {
    val __obj = js.Dynamic.literal(qBnf = qBnf.asInstanceOf[js.Any], qFG = qFG.asInstanceOf[js.Any], qHelpId = qHelpId.asInstanceOf[js.Any], qMT = qMT.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNbr = qNbr.asInstanceOf[js.Any], qPNbr = qPNbr.asInstanceOf[js.Any], qStr = qStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBNFDef]
  }
  @scala.inline
  implicit class IBNFDefOps[Self <: IBNFDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQBnfVarargs(value: Double*): Self = this.set("qBnf", js.Array(value :_*))
    @scala.inline
    def setQBnf(value: js.Array[Double]): Self = this.set("qBnf", value.asInstanceOf[js.Any])
    @scala.inline
    def setQFG(value: FunctionGroupType): Self = this.set("qFG", value.asInstanceOf[js.Any])
    @scala.inline
    def setQHelpId(value: Double): Self = this.set("qHelpId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMT(value: MTType): Self = this.set("qMT", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNbr(value: Double): Self = this.set("qNbr", value.asInstanceOf[js.Any])
    @scala.inline
    def setQPNbr(value: Double): Self = this.set("qPNbr", value.asInstanceOf[js.Any])
    @scala.inline
    def setQStr(value: String): Self = this.set("qStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setQAggrFunc(value: Boolean): Self = this.set("qAggrFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQAggrFunc: Self = this.set("qAggrFunc", js.undefined)
    @scala.inline
    def setQBnfLiteral(value: Boolean): Self = this.set("qBnfLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQBnfLiteral: Self = this.set("qBnfLiteral", js.undefined)
    @scala.inline
    def setQControlStatement(value: Boolean): Self = this.set("qControlStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQControlStatement: Self = this.set("qControlStatement", js.undefined)
    @scala.inline
    def setQDepr(value: Boolean): Self = this.set("qDepr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQDepr: Self = this.set("qDepr", js.undefined)
    @scala.inline
    def setQFieldFlag(value: Boolean): Self = this.set("qFieldFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQFieldFlag: Self = this.set("qFieldFlag", js.undefined)
    @scala.inline
    def setQIsBnfRule(value: Boolean): Self = this.set("qIsBnfRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQIsBnfRule: Self = this.set("qIsBnfRule", js.undefined)
    @scala.inline
    def setQQvFunc(value: Boolean): Self = this.set("qQvFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQQvFunc: Self = this.set("qQvFunc", js.undefined)
    @scala.inline
    def setQScriptStatement(value: Boolean): Self = this.set("qScriptStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQScriptStatement: Self = this.set("qScriptStatement", js.undefined)
  }
  
}

