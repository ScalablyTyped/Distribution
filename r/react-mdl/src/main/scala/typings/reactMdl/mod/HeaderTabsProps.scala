package typings.reactMdl.mod

import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderTabsProps
  extends StObject
     with HTMLProps[Any]
     with RippleComponent {
  
  var activeTab: js.UndefOr[Double] = js.undefined
  
  @JSName("onChange")
  var onChange_HeaderTabsProps: js.UndefOr[FormEventHandler[Header]] = js.undefined
}
object HeaderTabsProps {
  
  inline def apply(): HeaderTabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderTabsProps]
  }
  
  extension [Self <: HeaderTabsProps](x: Self) {
    
    inline def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
    
    inline def setOnChange(value: FormEvent[Header] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
