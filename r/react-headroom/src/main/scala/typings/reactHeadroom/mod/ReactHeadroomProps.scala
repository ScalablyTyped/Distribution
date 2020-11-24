package typings.reactHeadroom.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactHeadroomProps extends js.Object {
  
  var calcHeightOnResize: js.UndefOr[Boolean] = js.native
  
  var children: ReactNode = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var disable: js.UndefOr[Boolean] = js.native
  
  var disableInlineStyles: js.UndefOr[Boolean] = js.native
  
  var downTolerance: js.UndefOr[Double] = js.native
  
  var onPin: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onUnfix: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onUnpin: js.UndefOr[js.Function0[Unit]] = js.native
  
  var parent: js.UndefOr[js.Function0[_]] = js.native
  
  var pinStart: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var upTolerance: js.UndefOr[Double] = js.native
  
  var wrapperStyle: js.UndefOr[CSSProperties] = js.native
}
object ReactHeadroomProps {
  
  @scala.inline
  def apply(): ReactHeadroomProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactHeadroomProps]
  }
  
  @scala.inline
  implicit class ReactHeadroomPropsOps[Self <: ReactHeadroomProps] (val x: Self) extends AnyVal {
    
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
    def setCalcHeightOnResize(value: Boolean): Self = this.set("calcHeightOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalcHeightOnResize: Self = this.set("calcHeightOnResize", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setDisableInlineStyles(value: Boolean): Self = this.set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableInlineStyles: Self = this.set("disableInlineStyles", js.undefined)
    
    @scala.inline
    def setDownTolerance(value: Double): Self = this.set("downTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownTolerance: Self = this.set("downTolerance", js.undefined)
    
    @scala.inline
    def setOnPin(value: () => Unit): Self = this.set("onPin", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPin: Self = this.set("onPin", js.undefined)
    
    @scala.inline
    def setOnUnfix(value: () => Unit): Self = this.set("onUnfix", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnfix: Self = this.set("onUnfix", js.undefined)
    
    @scala.inline
    def setOnUnpin(value: () => Unit): Self = this.set("onUnpin", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnpin: Self = this.set("onUnpin", js.undefined)
    
    @scala.inline
    def setParent(value: () => _): Self = this.set("parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPinStart(value: Double): Self = this.set("pinStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinStart: Self = this.set("pinStart", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUpTolerance(value: Double): Self = this.set("upTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpTolerance: Self = this.set("upTolerance", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: CSSProperties): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
