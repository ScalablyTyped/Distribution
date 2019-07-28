package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerNameKeyProperties extends js.Object {
  var containerName: Input[String]
  var properties: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ContainerNameKeyProperties {
  @scala.inline
  def apply(
    containerName: Input[String],
    properties: Input[StringDictionary[Input[String]]] = null,
    `type`: Input[String] = null
  ): Anon_ContainerNameKeyProperties = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerNameKeyProperties]
  }
}

