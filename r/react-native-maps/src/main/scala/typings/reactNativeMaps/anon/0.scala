package typings.reactNativeMaps.anon

import typings.reactNativeMaps.reactNativeMapsStrings.`callout-press`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var action: `callout-press` = js.native
}
object `0` {
  
  @scala.inline
  def apply(action: `callout-press`): `0` = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: `callout-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
