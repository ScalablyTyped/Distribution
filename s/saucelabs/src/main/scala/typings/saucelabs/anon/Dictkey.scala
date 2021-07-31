package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var lower_boundary: js.UndefOr[Double] = js.undefined
  
  var upper_boundary: js.UndefOr[Double] = js.undefined
}
object Dictkey {
  
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLower_boundary(value: Double): Self = StObject.set(x, "lower_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLower_boundaryUndefined: Self = StObject.set(x, "lower_boundary", js.undefined)
    
    @scala.inline
    def setUpper_boundary(value: Double): Self = StObject.set(x, "upper_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper_boundaryUndefined: Self = StObject.set(x, "upper_boundary", js.undefined)
  }
}
