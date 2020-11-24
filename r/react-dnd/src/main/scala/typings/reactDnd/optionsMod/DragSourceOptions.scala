package typings.reactDnd.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragSourceOptions extends js.Object {
  
  /**
    * Optional. A string. By default, 'move'. In the browsers that support this feature, specifying 'copy'
    * shows a special “copying” cursor, while 'move' corresponds to the “move” cursor. You might want to use
    * this option to provide a hint to the user about whether an action is destructive.
    */
  var dropEffect: js.UndefOr[String] = js.native
}
object DragSourceOptions {
  
  @scala.inline
  def apply(): DragSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragSourceOptions]
  }
  
  @scala.inline
  implicit class DragSourceOptionsOps[Self <: DragSourceOptions] (val x: Self) extends AnyVal {
    
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
    def setDropEffect(value: String): Self = this.set("dropEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropEffect: Self = this.set("dropEffect", js.undefined)
  }
}
