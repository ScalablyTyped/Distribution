package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderedModule extends js.Object {
  
  var originalLength: Double = js.native
  
  var removedExports: js.Array[String] = js.native
  
  var renderedExports: js.Array[String] = js.native
  
  var renderedLength: Double = js.native
}
object RenderedModule {
  
  @scala.inline
  def apply(
    originalLength: Double,
    removedExports: js.Array[String],
    renderedExports: js.Array[String],
    renderedLength: Double
  ): RenderedModule = {
    val __obj = js.Dynamic.literal(originalLength = originalLength.asInstanceOf[js.Any], removedExports = removedExports.asInstanceOf[js.Any], renderedExports = renderedExports.asInstanceOf[js.Any], renderedLength = renderedLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedModule]
  }
  
  @scala.inline
  implicit class RenderedModuleOps[Self <: RenderedModule] (val x: Self) extends AnyVal {
    
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
    def setOriginalLength(value: Double): Self = this.set("originalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedExportsVarargs(value: String*): Self = this.set("removedExports", js.Array(value :_*))
    
    @scala.inline
    def setRemovedExports(value: js.Array[String]): Self = this.set("removedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedExportsVarargs(value: String*): Self = this.set("renderedExports", js.Array(value :_*))
    
    @scala.inline
    def setRenderedExports(value: js.Array[String]): Self = this.set("renderedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedLength(value: Double): Self = this.set("renderedLength", value.asInstanceOf[js.Any])
  }
}
