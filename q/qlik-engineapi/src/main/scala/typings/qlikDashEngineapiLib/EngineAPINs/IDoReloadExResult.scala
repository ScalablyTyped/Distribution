package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qScriptLogFile: java.lang.String
  /**
    * The operation is successful if qSuccess is set to True.
    */
  var qSuccess: scala.Boolean
}

object IDoReloadExResult {
  @scala.inline
  def apply(qScriptLogFile: java.lang.String, qSuccess: scala.Boolean): IDoReloadExResult = {
    val __obj = js.Dynamic.literal(qScriptLogFile = qScriptLogFile, qSuccess = qSuccess)
  
    __obj.asInstanceOf[IDoReloadExResult]
  }
}

