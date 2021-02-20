package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders the properties of a list object. Is the layout for ListObjectDef.
  * For more information about the definition of a list object, see Generic objects.
  *
  * Note: ListObject is used by the GetLayout method to display the properties of a list object.
  */
@js.native
trait IListObject extends StObject {
  
  /**
    * Set of data.
    * Is empty if nothing has been defined in qInitialDataFetch in ListObjectDef.
    */
  var qDataPages: js.Array[INxDataPage] = js.native
  
  /**
    * Information about the dimension.
    */
  var qDimensionInfo: INxDimensionInfo = js.native
  
  /**
    * This parameter is optional and is displayed in case of error.
    */
  var qError: js.UndefOr[INxValidationError] = js.native
  
  /**
    * Lists the expressions in the list object.
    */
  var qExpressions: js.Array[INxListObjectExpression] = js.native
  
  /**
    * Defines the size of a list object.
    */
  var qSize: ISize = js.native
  
  /**
    * Name of the alternate state.
    * Default is current selections $.
    */
  var qStateName: String = js.native
}
object IListObject {
  
  @scala.inline
  def apply(
    qDataPages: js.Array[INxDataPage],
    qDimensionInfo: INxDimensionInfo,
    qExpressions: js.Array[INxListObjectExpression],
    qSize: ISize,
    qStateName: String
  ): IListObject = {
    val __obj = js.Dynamic.literal(qDataPages = qDataPages.asInstanceOf[js.Any], qDimensionInfo = qDimensionInfo.asInstanceOf[js.Any], qExpressions = qExpressions.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListObject]
  }
  
  @scala.inline
  implicit class IListObjectMutableBuilder[Self <: IListObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDataPages(value: js.Array[INxDataPage]): Self = StObject.set(x, "qDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDataPagesVarargs(value: INxDataPage*): Self = StObject.set(x, "qDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQDimensionInfo(value: INxDimensionInfo): Self = StObject.set(x, "qDimensionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQError(value: INxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorUndefined: Self = StObject.set(x, "qError", js.undefined)
    
    @scala.inline
    def setQExpressions(value: js.Array[INxListObjectExpression]): Self = StObject.set(x, "qExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpressionsVarargs(value: INxListObjectExpression*): Self = StObject.set(x, "qExpressions", js.Array(value :_*))
    
    @scala.inline
    def setQSize(value: ISize): Self = StObject.set(x, "qSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
  }
}
