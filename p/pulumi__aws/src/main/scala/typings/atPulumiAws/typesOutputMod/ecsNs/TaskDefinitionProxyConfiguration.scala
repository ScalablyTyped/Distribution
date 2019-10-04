package typings.atPulumiAws.typesOutputMod.ecsNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionProxyConfiguration extends js.Object {
  /**
    * The name of the container that will serve as the App Mesh proxy.
    */
  var containerName: String
  /**
    * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TaskDefinitionProxyConfiguration {
  @scala.inline
  def apply(containerName: String, properties: StringDictionary[String] = null, `type`: String = null): TaskDefinitionProxyConfiguration = {
    val __obj = js.Dynamic.literal(containerName = containerName)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TaskDefinitionProxyConfiguration]
  }
}

