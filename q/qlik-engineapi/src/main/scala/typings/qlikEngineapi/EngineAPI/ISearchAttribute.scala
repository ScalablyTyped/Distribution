package typings.qlikEngineapi.EngineAPI

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
  var qKey: String
  /**
    * String corresponding to qKey for the current SearchGroupItemMatch.
    * For example, if the match is Make by Price found in the title of a generic object, qValue will be qMetaDef/title.
    */
  var qValue: String
}

object ISearchAttribute {
  @scala.inline
  def apply(qKey: String, qValue: String): ISearchAttribute = {
    val __obj = js.Dynamic.literal(qKey = qKey.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAttribute]
  }
}

