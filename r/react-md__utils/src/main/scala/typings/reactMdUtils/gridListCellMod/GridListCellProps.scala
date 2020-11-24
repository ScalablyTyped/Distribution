package typings.reactMdUtils.gridListCellMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridListCellProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Boolean if the className should be cloned into the child instead of
    * wrapping in another div. This will only work if the `children` is a single
    * ReactElement.
    */
  @JSName("clone")
  var clone_FGridListCellProps: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the cell should be square by also setting the current cell size
    * to the `height`.
    */
  var square: js.UndefOr[Boolean] = js.native
}
object GridListCellProps {
  
  @scala.inline
  def apply(): GridListCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridListCellProps]
  }
  
  @scala.inline
  implicit class GridListCellPropsOps[Self <: GridListCellProps] (val x: Self) extends AnyVal {
    
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
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    
    @scala.inline
    def setSquare(value: Boolean): Self = this.set("square", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
  }
}
