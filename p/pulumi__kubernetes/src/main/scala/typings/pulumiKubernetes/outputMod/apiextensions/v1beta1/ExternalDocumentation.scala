package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExternalDocumentation]
  }
}

