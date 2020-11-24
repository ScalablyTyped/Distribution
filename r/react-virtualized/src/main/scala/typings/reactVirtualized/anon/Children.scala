package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.reactVirtualized.esColumnSizerMod.SizedColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  var children: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]] = js.native
  
  var columnCount: Validator[Double] = js.native
  
  var columnMaxWidth: Requireable[Double] = js.native
  
  var columnMinWidth: Requireable[Double] = js.native
  
  var width: Validator[Double] = js.native
}
object Children {
  
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]],
    columnCount: Validator[Double],
    columnMaxWidth: Requireable[Double],
    columnMinWidth: Requireable[Double],
    width: Validator[Double]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnMaxWidth = columnMaxWidth.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCount(value: Validator[Double]): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMaxWidth(value: Requireable[Double]): Self = this.set("columnMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMinWidth(value: Requireable[Double]): Self = this.set("columnMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Validator[Double]): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
