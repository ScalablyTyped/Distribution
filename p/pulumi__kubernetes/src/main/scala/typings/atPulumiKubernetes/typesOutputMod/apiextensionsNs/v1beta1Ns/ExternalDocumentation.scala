package typings.atPulumiKubernetes.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalDocumentation allows referencing an external resource for extended documentation.
  */
trait ExternalDocumentation extends js.Object {
  val description: String
  val url: String
}

object ExternalDocumentation {
  @scala.inline
  def apply(description: String, url: String): ExternalDocumentation = {
    val __obj = js.Dynamic.literal(description = description, url = url)
  
    __obj.asInstanceOf[ExternalDocumentation]
  }
}

