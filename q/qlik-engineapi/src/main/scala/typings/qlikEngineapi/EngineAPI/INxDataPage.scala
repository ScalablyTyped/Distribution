package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * INxDataPage...
  */
@js.native
trait INxDataPage extends js.Object {
  
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect = js.native
  
  /**
    * Is set to true, if the data have been reduced.
    * The default value is false.
    */
  var qIsReduced: Boolean = js.native
  
  /**
    * Array of data.
    */
  var qMatrix: js.Array[INxCellRows] = js.native
  
  /**
    * Array of tails.
    * Is used for hypercube objects with multiple dimensions. It might happen that due to the window size some elements
    * in a group cannot be displayed in the same page as the other elements of the group. Elements of a group of
    * dimensions can be part of the previous or the next tail.
    * If there is no tail, the array is empty [ ].
    */
  var qTails: js.Array[INxGroupTail] = js.native
}
object INxDataPage {
  
  @scala.inline
  def apply(qArea: IRect, qIsReduced: Boolean, qMatrix: js.Array[INxCellRows], qTails: js.Array[INxGroupTail]): INxDataPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qIsReduced = qIsReduced.asInstanceOf[js.Any], qMatrix = qMatrix.asInstanceOf[js.Any], qTails = qTails.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDataPage]
  }
  
  @scala.inline
  implicit class INxDataPageOps[Self <: INxDataPage] (val x: Self) extends AnyVal {
    
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
    def setQArea(value: IRect): Self = this.set("qArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsReduced(value: Boolean): Self = this.set("qIsReduced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMatrixVarargs(value: INxCellRows*): Self = this.set("qMatrix", js.Array(value :_*))
    
    @scala.inline
    def setQMatrix(value: js.Array[INxCellRows]): Self = this.set("qMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTailsVarargs(value: INxGroupTail*): Self = this.set("qTails", js.Array(value :_*))
    
    @scala.inline
    def setQTails(value: js.Array[INxGroupTail]): Self = this.set("qTails", value.asInstanceOf[js.Any])
  }
}
