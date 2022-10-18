package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowStart
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowLabel
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowAssignment
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowCondition
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowSwitchClause
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowArrayMutation
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowCall
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowReduceLabel
*/
trait FlowNode extends StObject
object FlowNode {
  
  inline def FlowArrayMutation(antecedent: FlowNode, flags: FlowFlags, node: CallExpression | BinaryExpression): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowArrayMutation = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowArrayMutation]
  }
  
  inline def FlowAssignment(antecedent: FlowNode, flags: FlowFlags, node: Expression | VariableDeclaration | BindingElement): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowAssignment = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowAssignment]
  }
  
  inline def FlowCall(antecedent: FlowNode, flags: FlowFlags, node: CallExpression): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowCall = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowCall]
  }
  
  inline def FlowCondition(antecedent: FlowNode, flags: FlowFlags, node: Expression): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowCondition = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowCondition]
  }
  
  inline def FlowLabel(flags: FlowFlags): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowLabel]
  }
  
  inline def FlowReduceLabel(antecedent: FlowNode, antecedents: js.Array[FlowNode], flags: FlowFlags, target: FlowLabel): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowReduceLabel = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], antecedents = antecedents.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowReduceLabel]
  }
  
  inline def FlowStart(flags: FlowFlags): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowStart = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowStart]
  }
  
  inline def FlowSwitchClause(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement
  ): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.FlowSwitchClause]
  }
}
