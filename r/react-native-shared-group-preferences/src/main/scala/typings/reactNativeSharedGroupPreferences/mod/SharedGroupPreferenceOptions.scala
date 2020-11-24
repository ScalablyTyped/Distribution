package typings.reactNativeSharedGroupPreferences.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedGroupPreferenceOptions extends js.Object {
  
  var useAndroidSharedPreferences: js.UndefOr[Boolean] = js.native
}
object SharedGroupPreferenceOptions {
  
  @scala.inline
  def apply(): SharedGroupPreferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedGroupPreferenceOptions]
  }
  
  @scala.inline
  implicit class SharedGroupPreferenceOptionsOps[Self <: SharedGroupPreferenceOptions] (val x: Self) extends AnyVal {
    
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
    def setUseAndroidSharedPreferences(value: Boolean): Self = this.set("useAndroidSharedPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAndroidSharedPreferences: Self = this.set("useAndroidSharedPreferences", js.undefined)
  }
}
