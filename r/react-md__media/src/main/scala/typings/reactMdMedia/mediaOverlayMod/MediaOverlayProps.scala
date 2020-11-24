package typings.reactMdMedia.mediaOverlayMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaOverlayProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * The position of the overlay within the `MediaContainer`.
    */
  var position: js.UndefOr[MediaOverlayPosition] = js.native
}
object MediaOverlayProps {
  
  @scala.inline
  def apply(): MediaOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaOverlayProps]
  }
  
  @scala.inline
  implicit class MediaOverlayPropsOps[Self <: MediaOverlayProps] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: MediaOverlayPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
