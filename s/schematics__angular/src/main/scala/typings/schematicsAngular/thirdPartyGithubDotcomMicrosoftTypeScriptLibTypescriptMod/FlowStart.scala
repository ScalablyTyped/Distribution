package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowStart
  extends StObject
     with FlowNodeBase
     with FlowNode {
  
  var node: js.UndefOr[
    FunctionExpression | ArrowFunction | MethodDeclaration | GetAccessorDeclaration | SetAccessorDeclaration
  ] = js.undefined
}
object FlowStart {
  
  inline def apply(flags: FlowFlags): FlowStart = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowStart] (val x: Self) extends AnyVal {
    
    inline def setNode(
      value: FunctionExpression | ArrowFunction | MethodDeclaration | GetAccessorDeclaration | SetAccessorDeclaration
    ): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
