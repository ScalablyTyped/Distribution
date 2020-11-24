package typings.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxAttrDimInfo extends js.Object {
  
  /**
    * Cardinality of the attribute expression.
    *     Integer
    */
  var qCardinal: Double = js.native
  
  /**
    * Validation error.
    * REF(NxValidationError)
    */
  // ?Type = REF(NxValidationError)?
  var qError: INxValidationError = js.native
  
  /**
    * The title for the attribute dimension.
    * String
    */
  var qFallbackTitle: String = js.native
  
  /**
    * The Locked value of the dimension.
    * Boolean
    */
  var qLocked: Boolean = js.native
  
  /**
    * Number of rows.
    *     Size
    */
  var qSize: Double = js.native
}
object INxAttrDimInfo {
  
  @scala.inline
  def apply(
    qCardinal: Double,
    qError: INxValidationError,
    qFallbackTitle: String,
    qLocked: Boolean,
    qSize: Double
  ): INxAttrDimInfo = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrDimInfo]
  }
  
  @scala.inline
  implicit class INxAttrDimInfoOps[Self <: INxAttrDimInfo] (val x: Self) extends AnyVal {
    
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
    def setQCardinal(value: Double): Self = this.set("qCardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQError(value: INxValidationError): Self = this.set("qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFallbackTitle(value: String): Self = this.set("qFallbackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLocked(value: Boolean): Self = this.set("qLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSize(value: Double): Self = this.set("qSize", value.asInstanceOf[js.Any])
  }
}
