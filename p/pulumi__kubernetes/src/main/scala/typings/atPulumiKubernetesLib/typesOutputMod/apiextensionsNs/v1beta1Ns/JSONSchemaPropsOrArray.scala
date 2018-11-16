package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of
         * JSONSchemaProps. Mainly here for serialization purposes.
         */

trait JSONSchemaPropsOrArray extends js.Object {
  val JSONSchemas: js.Array[JSONSchemaProps]
  val Schema: JSONSchemaProps
}

