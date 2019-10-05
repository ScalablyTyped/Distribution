package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - IT_SCRIPTLINE; the engine returns the statement that will be executed next.
  * - IT_MSGBOX; the engine returns a script execution error message. This type can only be returned if the parameter qInteractOnError was set to true when calling the ConfigureReload method.
  * - IT_BREAK; the engine breaks and waits for a response on what to do next.
  * - IT_END; the engine has finished to execute all statements in the script.
  */
/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.IT_SCRIPTLINE
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.IT_MSGBOX
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.IT_BREAK
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.IT_END
*/
trait InteractionType extends js.Object

