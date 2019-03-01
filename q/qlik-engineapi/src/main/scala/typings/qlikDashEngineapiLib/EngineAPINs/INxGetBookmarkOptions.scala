package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qTypes: js.Array[java.lang.String]
}

object INxGetBookmarkOptions {
  @scala.inline
  def apply(qData: js.Any, qTypes: js.Array[java.lang.String]): INxGetBookmarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qData")(qData)
    __obj.updateDynamic("qTypes")(qTypes)
    __obj.asInstanceOf[INxGetBookmarkOptions]
  }
}

