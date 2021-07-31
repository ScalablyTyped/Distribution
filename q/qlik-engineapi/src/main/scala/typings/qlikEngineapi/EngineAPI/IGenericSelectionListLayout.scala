package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericSelectionListLayout width extend GenericObjectLayout
  */
trait IGenericSelectionListLayout
  extends StObject
     with IGenericObjectLayout {
  
  var qSelectionObject: ISelectionListObject
}
object IGenericSelectionListLayout {
  
  @scala.inline
  def apply(
    qExtendsId: String,
    qHasSoftPatches: Boolean,
    qInfo: INxInfo,
    qMeta: INxMeta,
    qSelectionInfo: INxSelectionInfo,
    qSelectionObject: ISelectionListObject,
    qStateName: String
  ): IGenericSelectionListLayout = {
    val __obj = js.Dynamic.literal(qExtendsId = qExtendsId.asInstanceOf[js.Any], qHasSoftPatches = qHasSoftPatches.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any], qSelectionObject = qSelectionObject.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericSelectionListLayout]
  }
  
  @scala.inline
  implicit class IGenericSelectionListLayoutMutableBuilder[Self <: IGenericSelectionListLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQSelectionObject(value: ISelectionListObject): Self = StObject.set(x, "qSelectionObject", value.asInstanceOf[js.Any])
  }
}
