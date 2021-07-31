package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemedComponentProps extends StObject {
  
  var theme: js.UndefOr[InspectorTheme] = js.undefined
}
object ThemedComponentProps {
  
  @scala.inline
  def apply(): ThemedComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemedComponentProps]
  }
  
  @scala.inline
  implicit class ThemedComponentPropsMutableBuilder[Self <: ThemedComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(value: InspectorTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
