package typings.sigmajs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.SigmaJs.Edge
import typings.sigmajs.SigmaJs.SVGEdgeLabels
import typings.sigmajs.SigmaJs.SVGObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictrenderType extends /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] {
  
  var labels: SVGEdgeLabels = js.native
}
object DictrenderType {
  
  @scala.inline
  def apply(labels: SVGEdgeLabels): DictrenderType = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictrenderType]
  }
  
  @scala.inline
  implicit class DictrenderTypeOps[Self <: DictrenderType] (val x: Self) extends AnyVal {
    
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
    def setLabels(value: SVGEdgeLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
  }
}
