package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var description: java.lang.String
  /**
    * Set a title.
    */
  var title: java.lang.String
}

object INxMetaTitleDescription {
  @scala.inline
  def apply(description: java.lang.String, title: java.lang.String, qName: java.lang.String = null): INxMetaTitleDescription = {
    val __obj = js.Dynamic.literal(description = description, title = title)
    if (qName != null) __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[INxMetaTitleDescription]
  }
}

