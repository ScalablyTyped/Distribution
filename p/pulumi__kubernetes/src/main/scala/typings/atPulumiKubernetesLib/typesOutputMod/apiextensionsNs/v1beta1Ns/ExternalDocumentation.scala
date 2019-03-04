package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalDocumentation allows referencing an external resource for extended documentation.
  */
trait ExternalDocumentation extends js.Object {
  val description: java.lang.String
  val url: java.lang.String
}

object ExternalDocumentation {
  @scala.inline
  def apply(description: java.lang.String, url: java.lang.String): ExternalDocumentation = {
    val __obj = js.Dynamic.literal(description = description, url = url)
  
    __obj.asInstanceOf[ExternalDocumentation]
  }
}

