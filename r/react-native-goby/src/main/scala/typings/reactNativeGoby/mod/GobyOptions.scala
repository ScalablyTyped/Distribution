package typings.reactNativeGoby.mod

import typings.reactNativeGoby.mod.Goby.CheckFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GobyOptions extends SyncOptions {
  
  /**
    * Specifies when you would like to synchronize updates with the Goby server.
    * Defaults to goby.CheckFrequency.ON_APP_START.
    */
  var checkFrequency: CheckFrequency = js.native
}
object GobyOptions {
  
  @scala.inline
  def apply(checkFrequency: CheckFrequency): GobyOptions = {
    val __obj = js.Dynamic.literal(checkFrequency = checkFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[GobyOptions]
  }
  
  @scala.inline
  implicit class GobyOptionsOps[Self <: GobyOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckFrequency(value: CheckFrequency): Self = this.set("checkFrequency", value.asInstanceOf[js.Any])
  }
}
