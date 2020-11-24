package typings.reactFlexr.ReactFlexr

import typings.react.mod.Props
import typings.reactFlexr.reactFlexrStrings.bottom
import typings.reactFlexr.reactFlexrStrings.center
import typings.reactFlexr.reactFlexrStrings.left
import typings.reactFlexr.reactFlexrStrings.right
import typings.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridProps extends Props[Grid] {
  
  /**
    * Vertical Align Sub Cells: top, center, bottom
    */
  var align: js.UndefOr[top | center | bottom] = js.native
  
  /**
    * All sub cells will be full height.
    */
  var flexCells: js.UndefOr[Boolean] = js.native
  
  /**
    * Override default gutter: '1em', '5%', '10px', etc.
    * Propagates downwards. Cells inside this Grid component
    * will use the same gutter.
    */
  var gutter: js.UndefOr[String] = js.native
  
  /**
    * Horizontal Align Sub Cells: left, center, right
    */
  var hAlign: js.UndefOr[left | center | right] = js.native
}
object GridProps {
  
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: top | center | bottom): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setFlexCells(value: Boolean): Self = this.set("flexCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexCells: Self = this.set("flexCells", js.undefined)
    
    @scala.inline
    def setGutter(value: String): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setHAlign(value: left | center | right): Self = this.set("hAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHAlign: Self = this.set("hAlign", js.undefined)
  }
}
