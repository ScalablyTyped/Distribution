package typings.sharepoint.anon

import typings.sharepoint.SP.JsGrid.IChangeKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyChanges extends StObject {
  
  def AnyChanges(): Boolean = js.native
  
  def ChangeKeySliceInfo(): Any = js.native
  
  def ChangeQuery(): Any = js.native
  
  def EventSliceInfo(): Any = js.native
  
  def GetChanges(
    optStartEvent: Any,
    optEndEvent: Any,
    optRecordKeys: Any,
    bFirstStartEvent: Boolean,
    bStartInclusive: Boolean,
    bEndInclusive: Boolean,
    bIncludeInvalidPropUpdates: Boolean,
    bLastEndEvent: Boolean
  ): Any = js.native
  
  def GetChangesAsJson(changeQuery: Any): String = js.native
  def GetChangesAsJson(changeQuery: Any, optfnPreProcessUpdateForSerialize: Any): String = js.native
  
  def GetUniquePropertyChanges(changeQuery: Any): Any = js.native
  def GetUniquePropertyChanges(changeQuery: Any, optfnFilter: Any): Any = js.native
  
  def RegisterEvent(changeKey: IChangeKey, eventObject: Any): Unit = js.native
  
  def UnregisterEvent(changeKey: IChangeKey, eventObject: Any): Unit = js.native
}
