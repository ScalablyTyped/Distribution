package typings.reResizable.mod

import typings.reResizable.anon.Y
import typings.reResizable.resizerMod.Direction
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var backgroundStyle: CSSProperties = js.native
  
  var direction: Direction = js.native
  
  var flexBasis: js.UndefOr[String | Double] = js.native
  
  var height: Double | String = js.native
  
  var isResizing: Boolean = js.native
  
  var original: Y = js.native
  
  var width: Double | String = js.native
}
object State {
  
  @scala.inline
  def apply(
    backgroundStyle: CSSProperties,
    direction: Direction,
    height: Double | String,
    isResizing: Boolean,
    original: Y,
    width: Double | String
  ): State = {
    val __obj = js.Dynamic.literal(backgroundStyle = backgroundStyle.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setBackgroundStyle(value: CSSProperties): Self = this.set("backgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResizing(value: Boolean): Self = this.set("isResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: Y): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexBasis(value: String | Double): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
  }
}
