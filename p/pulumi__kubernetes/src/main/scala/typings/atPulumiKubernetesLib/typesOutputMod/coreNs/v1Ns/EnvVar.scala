package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvVar represents an environment variable present in a Container.
  */
trait EnvVar extends js.Object {
  /**
    * Name of the environment variable. Must be a C_IDENTIFIER.
    */
  val name: java.lang.String
  /**
    * Variable references $(VAR_NAME) are expanded using the previous defined environment
    * variables in the container and any service environment variables. If a variable cannot be
    * resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can
    * be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
    * regardless of whether the variable exists or not. Defaults to "".
    */
  val value: java.lang.String
  /**
    * Source for the environment variable's value. Cannot be used if value is not empty.
    */
  val valueFrom: EnvVarSource
}

object EnvVar {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String, valueFrom: EnvVarSource): EnvVar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("valueFrom")(valueFrom)
    __obj.asInstanceOf[EnvVar]
  }
}

