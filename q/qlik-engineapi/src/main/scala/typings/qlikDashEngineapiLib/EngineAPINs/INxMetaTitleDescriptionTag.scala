package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var tags: js.Array[java.lang.String]
}

object INxMetaTitleDescriptionTag {
  @scala.inline
  def apply(
    description: java.lang.String,
    tags: js.Array[java.lang.String],
    title: java.lang.String,
    qName: java.lang.String = null
  ): INxMetaTitleDescriptionTag = {
    val __obj = js.Dynamic.literal(description = description, tags = tags, title = title)
    if (qName != null) __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[INxMetaTitleDescriptionTag]
  }
}

