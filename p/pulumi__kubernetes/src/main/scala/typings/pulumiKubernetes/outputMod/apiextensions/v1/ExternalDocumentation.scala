package typings.pulumiKubernetes.outputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalDocumentation allows referencing an external resource for extended documentation.
  */
@js.native
trait ExternalDocumentation extends js.Object {
  var description: String = js.native
  var url: String = js.native
}

object ExternalDocumentation {
  @scala.inline
  def apply(description: String, url: String): ExternalDocumentation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDocumentation]
  }
  @scala.inline
  implicit class ExternalDocumentationOps[Self <: ExternalDocumentation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

