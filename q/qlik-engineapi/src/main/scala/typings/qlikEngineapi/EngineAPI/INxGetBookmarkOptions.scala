package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxGetBookmarkOptions.
  */
@js.native
trait INxGetBookmarkOptions extends js.Object {
  /**
    * Set of data.
    */
  var qData: js.Any = js.native
  /**
    * List of object types..
    */
  var qTypes: js.Array[String] = js.native
}

object INxGetBookmarkOptions {
  @scala.inline
  def apply(qData: js.Any, qTypes: js.Array[String]): INxGetBookmarkOptions = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qTypes = qTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxGetBookmarkOptions]
  }
  @scala.inline
  implicit class INxGetBookmarkOptionsOps[Self <: INxGetBookmarkOptions] (val x: Self) extends AnyVal {
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
    def setQData(value: js.Any): Self = this.set("qData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTypesVarargs(value: String*): Self = this.set("qTypes", js.Array(value :_*))
    @scala.inline
    def setQTypes(value: js.Array[String]): Self = this.set("qTypes", value.asInstanceOf[js.Any])
  }
  
}

