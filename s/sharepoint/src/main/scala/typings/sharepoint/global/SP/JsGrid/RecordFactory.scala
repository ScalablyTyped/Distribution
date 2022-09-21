package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.RecordFactory")
@js.native
open class RecordFactory protected ()
  extends StObject
     with typings.sharepoint.SP.JsGrid.RecordFactory {
  def this(gridFieldMap: Any, keyColumnName: String, fnGetPropType: Any) = this()
  
  /** Create a new record */
  /* CompleteClass */
  override def MakeRecord(dataPropMap: Any, localizedPropMap: Any, bKeepRawData: Boolean): IRecord = js.native
  
  /* CompleteClass */
  var gridFieldMap: Any = js.native
}
