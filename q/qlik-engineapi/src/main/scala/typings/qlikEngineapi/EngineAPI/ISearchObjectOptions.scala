package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchObjectOptions...
  */
@js.native
trait ISearchObjectOptions extends js.Object {
  /**
    * This array is either empty or contains qProperty.
    */
  var qAttributes: js.Array[String] = js.native
  /* add new member  */
  /**
    * Encoding used to compute qRanges of type SearchCharRange.
    * Possible values:
    * - Utf8 (default)
    * - Utf16
    *
    * Note: Only affects the computation of the ranges. It does not impact the encoding of the text.
    */
  var qCharEncoding: String = js.native
}

object ISearchObjectOptions {
  @scala.inline
  def apply(qAttributes: js.Array[String], qCharEncoding: String): ISearchObjectOptions = {
    val __obj = js.Dynamic.literal(qAttributes = qAttributes.asInstanceOf[js.Any], qCharEncoding = qCharEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchObjectOptions]
  }
  @scala.inline
  implicit class ISearchObjectOptionsOps[Self <: ISearchObjectOptions] (val x: Self) extends AnyVal {
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
    def setQAttributesVarargs(value: String*): Self = this.set("qAttributes", js.Array(value :_*))
    @scala.inline
    def setQAttributes(value: js.Array[String]): Self = this.set("qAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setQCharEncoding(value: String): Self = this.set("qCharEncoding", value.asInstanceOf[js.Any])
  }
  
}

