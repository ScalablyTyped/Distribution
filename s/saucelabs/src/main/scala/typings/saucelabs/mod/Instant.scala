package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instant
  extends /* key */ StringDictionary[js.Any] {
  
  var epochSecond: js.UndefOr[Double] = js.native
  
  var nano: js.UndefOr[Double] = js.native
}
object Instant {
  
  @scala.inline
  def apply(): Instant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instant]
  }
  
  @scala.inline
  implicit class InstantOps[Self <: Instant] (val x: Self) extends AnyVal {
    
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
    def setEpochSecond(value: Double): Self = this.set("epochSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpochSecond: Self = this.set("epochSecond", js.undefined)
    
    @scala.inline
    def setNano(value: Double): Self = this.set("nano", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNano: Self = this.set("nano", js.undefined)
  }
}
