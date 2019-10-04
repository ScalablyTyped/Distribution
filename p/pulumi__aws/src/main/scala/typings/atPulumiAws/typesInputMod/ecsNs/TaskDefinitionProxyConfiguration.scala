package typings.atPulumiAws.typesInputMod.ecsNs

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionProxyConfiguration extends js.Object {
  /**
    * The name of the container that will serve as the App Mesh proxy.
    */
  var containerName: Input[String]
  /**
    * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
    */
  var properties: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * The proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object TaskDefinitionProxyConfiguration {
  @scala.inline
  def apply(
    containerName: Input[String],
    properties: Input[StringDictionary[Input[String]]] = null,
    `type`: Input[String] = null
  ): TaskDefinitionProxyConfiguration = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionProxyConfiguration]
  }
}

