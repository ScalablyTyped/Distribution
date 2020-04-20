package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxGetBookmarkOptions.
  */
trait INxGetBookmarkOptions extends js.Object {
  /**
    * Set of data.
    */
  var qData: js.Any
  /**
    * List of object types..
    */
  var qTypes: js.Array[String]
}

object INxGetBookmarkOptions {
  @scala.inline
  def apply(qData: js.Any, qTypes: js.Array[String]): INxGetBookmarkOptions = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qTypes = qTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxGetBookmarkOptions]
  }
}

