package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationResource extends js.Object {
  var DeletionPolicy: js.UndefOr[String] = js.undefined
  var DependsOn: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
  var Properties: StringDictionary[js.Any]
  var Type: String
}

object CloudFormationResource {
  @scala.inline
  def apply(
    Properties: StringDictionary[js.Any],
    Type: String,
    DeletionPolicy: String = null,
    DependsOn: String | StringDictionary[js.Any] = null
  ): CloudFormationResource = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (DeletionPolicy != null) __obj.updateDynamic("DeletionPolicy")(DeletionPolicy.asInstanceOf[js.Any])
    if (DependsOn != null) __obj.updateDynamic("DependsOn")(DependsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationResource]
  }
}

