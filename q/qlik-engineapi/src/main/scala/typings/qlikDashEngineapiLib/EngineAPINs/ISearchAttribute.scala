package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchAttribute...
  */
trait ISearchAttribute extends js.Object {
  /**
    * String corresponding to
    * SearchObjectOptions.qAttributes
    * It will be qProperty for SearchObjectOptions.
    */
  var qKey: java.lang.String
  /**
    * String corresponding to qKey for the current SearchGroupItemMatch.
    * For example, if the match is Make by Price found in the title of a generic object, qValue will be qMetaDef/title.
    */
  var qValue: java.lang.String
}

object ISearchAttribute {
  @scala.inline
  def apply(qKey: java.lang.String, qValue: java.lang.String): ISearchAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qKey")(qKey)
    __obj.updateDynamic("qValue")(qValue)
    __obj.asInstanceOf[ISearchAttribute]
  }
}

