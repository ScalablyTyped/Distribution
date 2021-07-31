package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionPlacementConstraint extends StObject {
  
  /**
    * Cluster Query Language expression to apply to the constraint.
    * For more information, see [Cluster Query Language in the Amazon EC2 Container
    * Service Developer
    * Guide](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
    */
  var expression: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
    */
  var `type`: Input[String]
}
object TaskDefinitionPlacementConstraint {
  
  @scala.inline
  def apply(`type`: Input[String]): TaskDefinitionPlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionPlacementConstraint]
  }
  
  @scala.inline
  implicit class TaskDefinitionPlacementConstraintMutableBuilder[Self <: TaskDefinitionPlacementConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Input[String]): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
