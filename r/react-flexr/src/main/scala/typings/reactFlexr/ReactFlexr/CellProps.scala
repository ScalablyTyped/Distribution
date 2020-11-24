package typings.reactFlexr.ReactFlexr

import typings.react.mod.Props
import typings.reactFlexr.reactFlexrStrings.bottom
import typings.reactFlexr.reactFlexrStrings.center
import typings.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellProps extends Props[Cell] {
  
  /**
    * Vertical Align This Cell: top, center, bottom
    */
  var align: js.UndefOr[top | center | bottom] = js.native
  
  /**
    * Like size, but only for desk devices.
    * Accepts 'hidden' as well.
    */
  var desk: js.UndefOr[String | Double] = js.native
  
  /**
    * Cell will be full height.
    */
  var flex: js.UndefOr[Boolean] = js.native
  
  /**
    * Override default gutter: '1em', '5%', '10px', etc.
    */
  var gutter: js.UndefOr[String] = js.native
  
  /**
    * Like size, but only for lap devices.
    * Accepts 'hidden' as well.
    */
  var lap: js.UndefOr[String | Double] = js.native
  
  /**
    * Like size, but only for palm devices.
    * Accepts 'hidden' as well.
    */
  var palm: js.UndefOr[String | Double] = js.native
  
  /**
    * Like size, but only for ( palm + lap ) devices.
    * Accepts 'hidden' as well.
    */
  var portable: js.UndefOr[String | Double] = js.native
  
  /**
    * Takes a fraction. e.g. 1/6
    */
  var size: js.UndefOr[String | Double] = js.native
}
object CellProps {
  
  @scala.inline
  def apply(): CellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellProps]
  }
  
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps] (val x: Self) extends AnyVal {
    
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
    def setDesk(value: String | Double): Self = this.set("desk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesk: Self = this.set("desk", js.undefined)
    
    @scala.inline
    def setFlex(value: Boolean): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    
    @scala.inline
    def setGutter(value: String): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setLap(value: String | Double): Self = this.set("lap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLap: Self = this.set("lap", js.undefined)
    
    @scala.inline
    def setPalm(value: String | Double): Self = this.set("palm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalm: Self = this.set("palm", js.undefined)
    
    @scala.inline
    def setPortable(value: String | Double): Self = this.set("portable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortable: Self = this.set("portable", js.undefined)
    
    @scala.inline
    def setSize(value: String | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
