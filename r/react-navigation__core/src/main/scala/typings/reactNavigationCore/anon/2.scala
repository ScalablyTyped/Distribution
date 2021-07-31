package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var canPreventDefault: `true`
}
object `2` {
  
  @scala.inline
  def apply(): `2` = {
    val __obj = js.Dynamic.literal(canPreventDefault = true)
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPreventDefault(value: `true`): Self = StObject.set(x, "canPreventDefault", value.asInstanceOf[js.Any])
  }
}
