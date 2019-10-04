package typings.atPulumiAws.typesOutputMod.ecsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionPlacementConstraint extends js.Object {
  /**
    * Cluster Query Language expression to apply to the constraint.
    * For more information, see [Cluster Query Language in the Amazon EC2 Container
    * Service Developer
    * Guide](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
    */
  var expression: js.UndefOr[String] = js.undefined
  /**
    * The proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
    */
  var `type`: String
}

object TaskDefinitionPlacementConstraint {
  @scala.inline
  def apply(`type`: String, expression: String = null): TaskDefinitionPlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[TaskDefinitionPlacementConstraint]
  }
}

