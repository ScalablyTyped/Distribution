package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - Cleared: In this mode, the first step is to clear any current selections in the app.
  *            The second step is to search for one or more terms in the values of the app.
  * - LockedFieldsOnly: In this mode, the search applies only to the values associated with
  *                     the selections made in locked fields, ignoring selections in any unlocked field.
  *                     If no locked fields, the behavior is identical to the Cleared context.
  *                     You cannot make any new selections in a locked field. You can get search hits for
  *                     the associated values of a locked field but you cannot get the search hits for the non associative values.
  * - CurrentSelections: In this mode, the current selections are kept (if any). Search for one or more terms in the values of the app.
  *                      New selections are made on top of the current selections. If no selections were made before the search,
  *                      this mode is identical to the Cleared context.
  */
/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.Cleared
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.LockedFieldsOnly
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.CurrentSelections
*/
trait ContextType extends js.Object

object ContextType {
  @scala.inline
  def Cleared: typings.qlikDashEngineapi.qlikDashEngineapiStrings.Cleared = this.cast("Cleared")
  @scala.inline
  def CurrentSelections: typings.qlikDashEngineapi.qlikDashEngineapiStrings.CurrentSelections = this.cast("CurrentSelections")
  @scala.inline
  def LockedFieldsOnly: typings.qlikDashEngineapi.qlikDashEngineapiStrings.LockedFieldsOnly = this.cast("LockedFieldsOnly")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

