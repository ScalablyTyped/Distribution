package typings.reactNative.anon

import typings.reactNative.mod.ColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait False extends StObject {
  
  var `false`: ColorValue = js.native
  
  var `true`: ColorValue = js.native
}
object False {
  
  @scala.inline
  def apply(`false`: ColorValue, `true`: ColorValue): False = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[False]
  }
  
  @scala.inline
  implicit class FalseMutableBuilder[Self <: False] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFalse(value: ColorValue): Self = StObject.set(x, "false", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrue(value: ColorValue): Self = StObject.set(x, "true", value.asInstanceOf[js.Any])
  }
}
