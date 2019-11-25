package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxMetaTitleDescriptionTag width extend NxMetaTitleDescription
  */
trait INxMetaTitleDescriptionTag extends INxMetaTitleDescription {
  /**
    * Array of String
    */
  var tags: js.Array[String]
}

object INxMetaTitleDescriptionTag {
  @scala.inline
  def apply(description: String, tags: js.Array[String], title: String, qName: String = null): INxMetaTitleDescriptionTag = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (qName != null) __obj.updateDynamic("qName")(qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMetaTitleDescriptionTag]
  }
}

