package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.schematicsAngular.typescriptMod.FlowStart
  - typings.schematicsAngular.typescriptMod.FlowLabel
  - typings.schematicsAngular.typescriptMod.FlowAssignment
  - typings.schematicsAngular.typescriptMod.FlowCondition
  - typings.schematicsAngular.typescriptMod.FlowSwitchClause
  - typings.schematicsAngular.typescriptMod.FlowArrayMutation
  - typings.schematicsAngular.typescriptMod.FlowCall
  - typings.schematicsAngular.typescriptMod.FlowReduceLabel
*/
trait FlowNode extends StObject
object FlowNode {
  
  inline def FlowArrayMutation(antecedent: FlowNode, flags: FlowFlags, node: CallExpression | BinaryExpression): typings.schematicsAngular.typescriptMod.FlowArrayMutation = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.FlowArrayMutation]
  }
  
  inline def FlowAssignment(antecedent: FlowNode, flags: FlowFlags, node: Expression | VariableDeclaration | BindingElement): typings.schematicsAngular.typescriptMod.FlowAssignment = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.FlowAssignment]
  }
  
  inline def FlowCall(antecedent: FlowNode, flags: FlowFlags, node: CallExpression): typings.schematicsAngular.typescriptMod.FlowCall = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.FlowCall]
  }
  
  inline def FlowCondition(antecedent: FlowNode, flags: FlowFlags, node: Expression): typings.schematicsAngular.typescriptMod.FlowCondition = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.FlowCondition]
  }
  
  inline def FlowLabel(flags: FlowFlags): typings.schematicsAngular.typescriptMod.FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.FlowLabel]
  }
  
  inline def FlowReduceLabel(antecedent: FlowNode, antecedents: js.Array[FlowNode], flags: FlowFlags, target: FlowLabel): typings.schematicsAngular.typescriptMod.FlowReduceLabel = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], antecedents = antecedents.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.FlowReduceLabel]
  }
  
  inline def FlowStart(flags: FlowFlags): typings.schematicsAngular.typescriptMod.FlowStart = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.FlowStart]
  }
  
  inline def FlowSwitchClause(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement
  ): typings.schematicsAngular.typescriptMod.FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.FlowSwitchClause]
  }
}
