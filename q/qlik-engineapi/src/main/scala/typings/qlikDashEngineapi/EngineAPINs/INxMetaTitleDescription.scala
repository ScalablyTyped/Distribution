package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxMetaTitleDescription width extend NxMeta
  */
trait INxMetaTitleDescription extends INxMeta {
  /**
    * Set a description.
    */
  var description: String
  /**
    * Set a title.
    */
  var title: String
}

object INxMetaTitleDescription {
  @scala.inline
  def apply(description: String, title: String, qName: String = null): INxMetaTitleDescription = {
    val __obj = js.Dynamic.literal(description = description, title = title)
    if (qName != null) __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[INxMetaTitleDescription]
  }
}

