package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DoReloadExResult...
  */
trait IDoReloadExResult extends js.Object {
  /**
    * Path to the script log file.
    */
  var qScriptLogFile: String
  /**
    * The operation is successful if qSuccess is set to True.
    */
  var qSuccess: Boolean
}

object IDoReloadExResult {
  @scala.inline
  def apply(qScriptLogFile: String, qSuccess: Boolean): IDoReloadExResult = {
    val __obj = js.Dynamic.literal(qScriptLogFile = qScriptLogFile.asInstanceOf[js.Any], qSuccess = qSuccess.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDoReloadExResult]
  }
}

