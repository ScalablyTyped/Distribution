package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetChanges extends js.Object {
  def AnyChanges(): scala.Boolean = js.native
  def ChangeKeySliceInfo(): js.Any = js.native
  def ChangeQuery(): js.Any = js.native
  def EventSliceInfo(): js.Any = js.native
  def GetChanges(
    optStartEvent: js.Any,
    optEndEvent: js.Any,
    optRecordKeys: js.Any,
    bFirstStartEvent: scala.Boolean,
    bStartInclusive: scala.Boolean,
    bEndInclusive: scala.Boolean,
    bIncludeInvalidPropUpdates: scala.Boolean,
    bLastEndEvent: scala.Boolean
  ): js.Any = js.native
  def GetChangesAsJson(changeQuery: js.Any): java.lang.String = js.native
  def GetChangesAsJson(changeQuery: js.Any, optfnPreProcessUpdateForSerialize: js.Any): java.lang.String = js.native
  def GetUniquePropertyChanges(changeQuery: js.Any): js.Any = js.native
  def GetUniquePropertyChanges(changeQuery: js.Any, optfnFilter: js.Any): js.Any = js.native
  def RegisterEvent(changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey, eventObject: js.Any): scala.Unit = js.native
  def UnregisterEvent(changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey, eventObject: js.Any): scala.Unit = js.native
}

