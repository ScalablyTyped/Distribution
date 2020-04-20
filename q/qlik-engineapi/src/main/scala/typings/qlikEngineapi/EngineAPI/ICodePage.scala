package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CodePage...
  */
trait ICodePage extends js.Object {
  /**
    * Description of the code page
    */
  var qDescription: String
  /**
    * Name of the code page
    */
  var qName: String
  /**
    * Number of the code page
    */
  var qNumber: Double
}

object ICodePage {
  @scala.inline
  def apply(qDescription: String, qName: String, qNumber: Double): ICodePage = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumber = qNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodePage]
  }
}

