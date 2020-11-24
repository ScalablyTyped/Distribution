package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'precision'> */
@js.native
trait PickImplprecision extends js.Object {
  
  var precision: Double = js.native
}
object PickImplprecision {
  
  @scala.inline
  def apply(precision: Double): PickImplprecision = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprecision]
  }
  
  @scala.inline
  implicit class PickImplprecisionOps[Self <: PickImplprecision] (val x: Self) extends AnyVal {
    
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
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
  }
}
