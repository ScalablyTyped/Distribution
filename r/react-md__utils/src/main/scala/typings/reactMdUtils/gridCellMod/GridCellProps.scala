package typings.reactMdUtils.gridCellMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridCellProps
  extends HTMLAttributes[HTMLDivElement]
     with GridCSSProperties {
  
  /**
    * Boolean if the className should be cloned into the child instead of
    * wrapping in another div. This will only work if the `children` is a single
    * ReactElement.
    */
  @JSName("clone")
  var clone_FGridCellProps: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional Grid CSS Property overries that should be applied on desktop
    * screens.
    */
  var desktop: js.UndefOr[GridCSSProperties] = js.native
  
  /**
    * Optional Grid CSS Property overries that should be applied on large
    * desktops only.
    */
  var largeDesktop: js.UndefOr[GridCSSProperties] = js.native
  
  /**
    * Optional Grid CSS Property overries that should be applied on phones only.
    */
  var phone: js.UndefOr[GridCSSProperties] = js.native
  
  /**
    * Optional Grid CSS Property overries that should be applied on tablets and
    * above.
    */
  var tablet: js.UndefOr[GridCSSProperties] = js.native
}
object GridCellProps {
  
  @scala.inline
  def apply(): GridCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridCellProps]
  }
  
  @scala.inline
  implicit class GridCellPropsOps[Self <: GridCellProps] (val x: Self) extends AnyVal {
    
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
    def setDesktop(value: GridCSSProperties): Self = this.set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    
    @scala.inline
    def setLargeDesktop(value: GridCSSProperties): Self = this.set("largeDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeDesktop: Self = this.set("largeDesktop", js.undefined)
    
    @scala.inline
    def setPhone(value: GridCSSProperties): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setTablet(value: GridCSSProperties): Self = this.set("tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
  }
}
