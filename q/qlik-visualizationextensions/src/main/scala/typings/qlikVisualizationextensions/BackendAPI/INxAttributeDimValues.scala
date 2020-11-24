package typings.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxAttributeDimValues extends js.Object {
  
  /**
    * List of values.
    * Array of NxSimpleDimValue
    */
  var qValues: js.Array[INxSimpleDimValue] = js.native
}
object INxAttributeDimValues {
  
  @scala.inline
  def apply(qValues: js.Array[INxSimpleDimValue]): INxAttributeDimValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttributeDimValues]
  }
  
  @scala.inline
  implicit class INxAttributeDimValuesOps[Self <: INxAttributeDimValues] (val x: Self) extends AnyVal {
    
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
    def setQValuesVarargs(value: INxSimpleDimValue*): Self = this.set("qValues", js.Array(value :_*))
    
    @scala.inline
    def setQValues(value: js.Array[INxSimpleDimValue]): Self = this.set("qValues", value.asInstanceOf[js.Any])
  }
}
