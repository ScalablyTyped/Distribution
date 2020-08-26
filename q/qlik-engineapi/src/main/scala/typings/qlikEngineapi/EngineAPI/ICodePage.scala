package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CodePage...
  */
@js.native
trait ICodePage extends js.Object {
  /**
    * Description of the code page
    */
  var qDescription: String = js.native
  /**
    * Name of the code page
    */
  var qName: String = js.native
  /**
    * Number of the code page
    */
  var qNumber: Double = js.native
}

object ICodePage {
  @scala.inline
  def apply(qDescription: String, qName: String, qNumber: Double): ICodePage = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumber = qNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodePage]
  }
  @scala.inline
  implicit class ICodePageOps[Self <: ICodePage] (val x: Self) extends AnyVal {
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
    def setQDescription(value: String): Self = this.set("qDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNumber(value: Double): Self = this.set("qNumber", value.asInstanceOf[js.Any])
  }
  
}

