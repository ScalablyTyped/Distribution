package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerNameKey extends js.Object {
  var containerName: String
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_ContainerNameKey {
  @scala.inline
  def apply(containerName: String, properties: StringDictionary[String] = null, `type`: String = null): Anon_ContainerNameKey = {
    val __obj = js.Dynamic.literal(containerName = containerName)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ContainerNameKey]
  }
}

