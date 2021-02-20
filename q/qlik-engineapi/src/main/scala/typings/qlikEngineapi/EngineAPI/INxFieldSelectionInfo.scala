package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxFieldSelectionInfo...
  */
@js.native
trait INxFieldSelectionInfo extends StObject {
  
  /**
    * Selection mode.
    */
  var qFieldSelectionMode: FieldSelectionModeType = js.native
  
  /**
    * Name of the field.
    */
  var qName: String = js.native
}
object INxFieldSelectionInfo {
  
  @scala.inline
  def apply(qFieldSelectionMode: FieldSelectionModeType, qName: String): INxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal(qFieldSelectionMode = qFieldSelectionMode.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxFieldSelectionInfo]
  }
  
  @scala.inline
  implicit class INxFieldSelectionInfoMutableBuilder[Self <: INxFieldSelectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFieldSelectionMode(value: FieldSelectionModeType): Self = StObject.set(x, "qFieldSelectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
