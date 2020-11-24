package typings.storybookApi.globalsMod

import typings.storybookApi.mod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubAPI extends js.Object {
  
  def updateGlobals(newGlobals: Args): Unit = js.native
}
object SubAPI {
  
  @scala.inline
  def apply(updateGlobals: Args => Unit): SubAPI = {
    val __obj = js.Dynamic.literal(updateGlobals = js.Any.fromFunction1(updateGlobals))
    __obj.asInstanceOf[SubAPI]
  }
  
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
    
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
    def setUpdateGlobals(value: Args => Unit): Self = this.set("updateGlobals", js.Any.fromFunction1(value))
  }
}
