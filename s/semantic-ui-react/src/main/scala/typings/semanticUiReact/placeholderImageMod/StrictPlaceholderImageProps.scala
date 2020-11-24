package typings.semanticUiReact.placeholderImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictPlaceholderImageProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** An image can modify size correctly with responsive styles. */
  var rectangular: js.UndefOr[Boolean] = js.native
  
  /** An image can modify size correctly with responsive styles. */
  var square: js.UndefOr[Boolean] = js.native
}
object StrictPlaceholderImageProps {
  
  @scala.inline
  def apply(): StrictPlaceholderImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictPlaceholderImageProps]
  }
  
  @scala.inline
  implicit class StrictPlaceholderImagePropsOps[Self <: StrictPlaceholderImageProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setRectangular(value: Boolean): Self = this.set("rectangular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangular: Self = this.set("rectangular", js.undefined)
    
    @scala.inline
    def setSquare(value: Boolean): Self = this.set("square", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
  }
}
