package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericFieldLayout width extend GenericObjectLayout
  */
trait IGenericFieldLayout
  extends StObject
     with IGenericBaseLayout {
  
  /**
    * FieldListObject...
    */
  var qFieldListObject: IFieldList
}
object IGenericFieldLayout {
  
  @scala.inline
  def apply(qFieldListObject: IFieldList, qInfo: INxInfo, qMeta: INxMeta): IGenericFieldLayout = {
    val __obj = js.Dynamic.literal(qFieldListObject = qFieldListObject.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericFieldLayout]
  }
  
  @scala.inline
  implicit class IGenericFieldLayoutMutableBuilder[Self <: IGenericFieldLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFieldListObject(value: IFieldList): Self = StObject.set(x, "qFieldListObject", value.asInstanceOf[js.Any])
  }
}
