package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericVariableLayout width extend GenericObjectLayout
  */
@js.native
trait IGenericVariableListLayout extends IGenericBaseLayout {
  
  var qVariableListObject: IVariableList = js.native
}
object IGenericVariableListLayout {
  
  @scala.inline
  def apply(qInfo: INxInfo, qMeta: INxMeta, qVariableListObject: IVariableList): IGenericVariableListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qVariableListObject = qVariableListObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableListLayout]
  }
  
  @scala.inline
  implicit class IGenericVariableListLayoutMutableBuilder[Self <: IGenericVariableListLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQVariableListObject(value: IVariableList): Self = StObject.set(x, "qVariableListObject", value.asInstanceOf[js.Any])
  }
}
