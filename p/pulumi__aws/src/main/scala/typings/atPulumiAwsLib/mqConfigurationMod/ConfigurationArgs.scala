package typings
package atPulumiAwsLib.mqConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationArgs extends js.Object {
  /**
    * The broker configuration in XML format.
    * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
    * for supported parameters and format of the XML.
    */
  val data: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The description of the configuration.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of broker engine.
    */
  val engineType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The version of the broker engine.
    */
  val engineVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the configuration
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

