package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  - typings.qlikEngineapi.qlikEngineapiStrings.Cleared
  - typings.qlikEngineapi.qlikEngineapiStrings.LockedFieldsOnly
  - typings.qlikEngineapi.qlikEngineapiStrings.CurrentSelections
*/
trait ContextType extends StObject
object ContextType {
  
  inline def Cleared: typings.qlikEngineapi.qlikEngineapiStrings.Cleared = "Cleared".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.Cleared]
  
  inline def CurrentSelections: typings.qlikEngineapi.qlikEngineapiStrings.CurrentSelections = "CurrentSelections".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.CurrentSelections]
  
  inline def LockedFieldsOnly: typings.qlikEngineapi.qlikEngineapiStrings.LockedFieldsOnly = "LockedFieldsOnly".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.LockedFieldsOnly]
}
