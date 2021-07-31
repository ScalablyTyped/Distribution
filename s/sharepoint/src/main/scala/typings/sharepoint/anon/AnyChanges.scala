package typings.sharepoint.anon

import typings.sharepoint.SP.JsGrid.IChangeKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyChanges extends StObject {
  
  def AnyChanges(): Boolean = js.native
  
  def ChangeKeySliceInfo(): js.Any = js.native
  
  def ChangeQuery(): js.Any = js.native
  
  def EventSliceInfo(): js.Any = js.native
  
  def GetChanges(
    optStartEvent: js.Any,
    optEndEvent: js.Any,
    optRecordKeys: js.Any,
    bFirstStartEvent: Boolean,
    bStartInclusive: Boolean,
    bEndInclusive: Boolean,
    bIncludeInvalidPropUpdates: Boolean,
    bLastEndEvent: Boolean
  ): js.Any = js.native
  
  def GetChangesAsJson(changeQuery: js.Any): String = js.native
  def GetChangesAsJson(changeQuery: js.Any, optfnPreProcessUpdateForSerialize: js.Any): String = js.native
  
  def GetUniquePropertyChanges(changeQuery: js.Any): js.Any = js.native
  def GetUniquePropertyChanges(changeQuery: js.Any, optfnFilter: js.Any): js.Any = js.native
  
  def RegisterEvent(changeKey: IChangeKey, eventObject: js.Any): Unit = js.native
  
  def UnregisterEvent(changeKey: IChangeKey, eventObject: js.Any): Unit = js.native
}
