package typings.qlikEngineapi.EngineAPI

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
trait IListObject extends js.Object {
  
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
  implicit class IListObjectOps[Self <: IListObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQDataPagesVarargs(value: INxDataPage*): Self = this.set("qDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQDataPages(value: js.Array[INxDataPage]): Self = this.set("qDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDimensionInfo(value: INxDimensionInfo): Self = this.set("qDimensionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpressionsVarargs(value: INxListObjectExpression*): Self = this.set("qExpressions", js.Array(value :_*))
    
    @scala.inline
    def setQExpressions(value: js.Array[INxListObjectExpression]): Self = this.set("qExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSize(value: ISize): Self = this.set("qSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateName(value: String): Self = this.set("qStateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQError(value: INxValidationError): Self = this.set("qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQError: Self = this.set("qError", js.undefined)
  }
}
