package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders the properties of a list object. Is the layout for ListObjectDef.
  * For more information about the definition of a list object, see Generic objects.
  *
  * Note: ListObject is used by the GetLayout method to display the properties of a list object.
  */
trait IListObject extends js.Object {
  /**
    * Set of data.
    * Is empty if nothing has been defined in qInitialDataFetch in ListObjectDef.
    */
  var qDataPages: js.Array[INxDataPage]
  /**
    * Information about the dimension.
    */
  var qDimensionInfo: INxDimensionInfo
  /**
    * This parameter is optional and is displayed in case of error.
    */
  var qError: js.UndefOr[INxValidationError] = js.undefined
  /**
    * Lists the expressions in the list object.
    */
  var qExpressions: js.Array[INxListObjectExpression]
  /**
    * Defines the size of a list object.
    */
  var qSize: ISize
  /**
    * Name of the alternate state.
    * Default is current selections $.
    */
  var qStateName: String
}

object IListObject {
  @scala.inline
  def apply(
    qDataPages: js.Array[INxDataPage],
    qDimensionInfo: INxDimensionInfo,
    qExpressions: js.Array[INxListObjectExpression],
    qSize: ISize,
    qStateName: String,
    qError: INxValidationError = null
  ): IListObject = {
    val __obj = js.Dynamic.literal(qDataPages = qDataPages, qDimensionInfo = qDimensionInfo, qExpressions = qExpressions, qSize = qSize, qStateName = qStateName)
    if (qError != null) __obj.updateDynamic("qError")(qError)
    __obj.asInstanceOf[IListObject]
  }
}

