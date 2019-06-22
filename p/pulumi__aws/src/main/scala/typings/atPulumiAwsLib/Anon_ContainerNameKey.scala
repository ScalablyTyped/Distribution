package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerNameKey extends js.Object {
  var containerName: java.lang.String
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContainerNameKey {
  @scala.inline
  def apply(
    containerName: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    `type`: java.lang.String = null
  ): Anon_ContainerNameKey = {
    val __obj = js.Dynamic.literal(containerName = containerName)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ContainerNameKey]
  }
}

