package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var lower_boundary: js.UndefOr[Double] = js.native
  
  var upper_boundary: js.UndefOr[Double] = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
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
    def setLower_boundary(value: Double): Self = this.set("lower_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLower_boundary: Self = this.set("lower_boundary", js.undefined)
    
    @scala.inline
    def setUpper_boundary(value: Double): Self = this.set("upper_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpper_boundary: Self = this.set("upper_boundary", js.undefined)
  }
}
