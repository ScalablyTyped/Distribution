package typings.reactMdUtils.typesMod

import typings.reactMdUtils.anon.Coordspositionfixedabsolu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedPosition extends js.Object {
  
  /**
    * The calculated horizontal position that can be used to compare to the
    * provided horizontal position anchor if additional manual updates should be
    * applied.
    */
  var actualX: HorizontalPosition = js.native
  
  /**
    * The calculated vertical position that can be used to compare to the
    * provided horizontal position anchor if additional manual updates should be
    * applied.
    */
  var actualY: VerticalPosition = js.native
  
  /**
    * The style object that should be applied to the fixed element so it will be
    * fixed to the container element. This will be `undefined` if the container
    * element doesn't exist within the DOM.
    *
    * Note: The fixed element styles **will not** contain styles for `z-index` or
    * `background-color` so you'll need to add that manually.
    */
  var style: js.UndefOr[Coordspositionfixedabsolu] = js.native
}
object FixedPosition {
  
  @scala.inline
  def apply(actualX: HorizontalPosition, actualY: VerticalPosition): FixedPosition = {
    val __obj = js.Dynamic.literal(actualX = actualX.asInstanceOf[js.Any], actualY = actualY.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedPosition]
  }
  
  @scala.inline
  implicit class FixedPositionOps[Self <: FixedPosition] (val x: Self) extends AnyVal {
    
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
    def setActualX(value: HorizontalPosition): Self = this.set("actualX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualY(value: VerticalPosition): Self = this.set("actualY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Coordspositionfixedabsolu): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
