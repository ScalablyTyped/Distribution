package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxMetaTitleDescriptionTag width extend NxMetaTitleDescription
  */
@js.native
trait INxMetaTitleDescriptionTag extends INxMetaTitleDescription {
  /**
    * Array of String
    */
  var tags: js.Array[String] = js.native
}

object INxMetaTitleDescriptionTag {
  @scala.inline
  def apply(description: String, tags: js.Array[String], title: String): INxMetaTitleDescriptionTag = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMetaTitleDescriptionTag]
  }
  @scala.inline
  implicit class INxMetaTitleDescriptionTagOps[Self <: INxMetaTitleDescriptionTag] (val x: Self) extends AnyVal {
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
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

