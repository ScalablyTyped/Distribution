package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :react-native.react-native.AccessibilityActionName | string,   label :string | undefined}> */
@js.native
trait AccessibilityActionInfo extends StObject {
  
  val label: js.UndefOr[String] = js.native
  
  val name: AccessibilityActionName | String = js.native
}
object AccessibilityActionInfo {
  
  @scala.inline
  def apply(name: AccessibilityActionName | String): AccessibilityActionInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityActionInfo]
  }
  
  @scala.inline
  implicit class AccessibilityActionInfoMutableBuilder[Self <: AccessibilityActionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: AccessibilityActionName | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
