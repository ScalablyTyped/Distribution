package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class InstantMutableBuilder[Self <: Instant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEpochSecond(value: Double): Self = StObject.set(x, "epochSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpochSecondUndefined: Self = StObject.set(x, "epochSecond", js.undefined)
    
    @scala.inline
    def setNano(value: Double): Self = StObject.set(x, "nano", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanoUndefined: Self = StObject.set(x, "nano", js.undefined)
  }
}
