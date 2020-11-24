package typings.reactMdUtils.typesMod

import typings.reactMdUtils.anon.PartialPositionAnchor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedPositionOptions extends InitialCoords {
  
  /**
    * The configuration to anchor the fixed element to the container element.
    */
  var anchor: js.UndefOr[PartialPositionAnchor] = js.native
  
  /**
    * The container element that the `element` should be fixed to.
    */
  var container: HTMLElement | Null = js.native
  
  /**
    * Boolean if the auto-swapping behavior should be disabled. It's normally
    * recommended to not disable this since it'll allow elements to appear off
    * screen.
    */
  var disableSwapping: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the fixed positioning should no longer prevent the fixed element
    * to be positioned within the viewport. This is nice if you want to allow for
    * full page scrolling instead and manually set a max-height on your element.
    */
  var disableVHBounds: js.UndefOr[Boolean] = js.native
  
  /**
    * The element that is fixed to a `container` element.
    */
  var element: HTMLElement | Null = js.native
  
  /**
    * Boolean if the fixed element should no longer be able to overlap the
    * container element. This is useful for autocomplete menus or other
    * components that retain focus on the container element while the fixed
    * element becomes visible.
    */
  var preventOverlap: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the style object should include the `transformOrigin` value
    * based on the x and y positions.
    */
  var transformOrigin: js.UndefOr[Boolean] = js.native
  
  /**
    * The viewwidth margin to apply so that the element doesn't need to be
    * directly on the screen edge.
    */
  var vhMargin: js.UndefOr[Double] = js.native
  
  /**
    * The viewwidth margin to apply so that the element doesn't need to be
    * directly on the screen edge.
    */
  var vwMargin: js.UndefOr[Double] = js.native
  
  /**
    * @see PositionWidth
    */
  var width: js.UndefOr[PositionWidth] = js.native
  
  /**
    * The container width margin to apply so that the element doesn't need to be
    * directly on the container's edge.
    */
  var xMargin: js.UndefOr[Double] = js.native
  
  /**
    * The container height margin to apply so that the element doesn't need to be
    * directly on the container's edge
    */
  var yMargin: js.UndefOr[Double] = js.native
}
object FixedPositionOptions {
  
  @scala.inline
  def apply(): FixedPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedPositionOptions]
  }
  
  @scala.inline
  implicit class FixedPositionOptionsOps[Self <: FixedPositionOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: PartialPositionAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setDisableSwapping(value: Boolean): Self = this.set("disableSwapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSwapping: Self = this.set("disableSwapping", js.undefined)
    
    @scala.inline
    def setDisableVHBounds(value: Boolean): Self = this.set("disableVHBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableVHBounds: Self = this.set("disableVHBounds", js.undefined)
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementNull: Self = this.set("element", null)
    
    @scala.inline
    def setPreventOverlap(value: Boolean): Self = this.set("preventOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventOverlap: Self = this.set("preventOverlap", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: Boolean): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    
    @scala.inline
    def setVhMargin(value: Double): Self = this.set("vhMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVhMargin: Self = this.set("vhMargin", js.undefined)
    
    @scala.inline
    def setVwMargin(value: Double): Self = this.set("vwMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVwMargin: Self = this.set("vwMargin", js.undefined)
    
    @scala.inline
    def setWidth(value: PositionWidth): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXMargin(value: Double): Self = this.set("xMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXMargin: Self = this.set("xMargin", js.undefined)
    
    @scala.inline
    def setYMargin(value: Double): Self = this.set("yMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYMargin: Self = this.set("yMargin", js.undefined)
  }
}
