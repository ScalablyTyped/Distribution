package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedPreferencesParams extends StObject {
  
  var appendComponentStack: Boolean
  
  var breakOnConsoleErrors: Boolean
  
  var componentFilters: js.Array[ComponentFilter]
  
  var hideConsoleLogsInStrictMode: Boolean
  
  var showInlineWarningsAndErrors: Boolean
}
object SavedPreferencesParams {
  
  inline def apply(
    appendComponentStack: Boolean,
    breakOnConsoleErrors: Boolean,
    componentFilters: js.Array[ComponentFilter],
    hideConsoleLogsInStrictMode: Boolean,
    showInlineWarningsAndErrors: Boolean
  ): SavedPreferencesParams = {
    val __obj = js.Dynamic.literal(appendComponentStack = appendComponentStack.asInstanceOf[js.Any], breakOnConsoleErrors = breakOnConsoleErrors.asInstanceOf[js.Any], componentFilters = componentFilters.asInstanceOf[js.Any], hideConsoleLogsInStrictMode = hideConsoleLogsInStrictMode.asInstanceOf[js.Any], showInlineWarningsAndErrors = showInlineWarningsAndErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedPreferencesParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavedPreferencesParams] (val x: Self) extends AnyVal {
    
    inline def setAppendComponentStack(value: Boolean): Self = StObject.set(x, "appendComponentStack", value.asInstanceOf[js.Any])
    
    inline def setBreakOnConsoleErrors(value: Boolean): Self = StObject.set(x, "breakOnConsoleErrors", value.asInstanceOf[js.Any])
    
    inline def setComponentFilters(value: js.Array[ComponentFilter]): Self = StObject.set(x, "componentFilters", value.asInstanceOf[js.Any])
    
    inline def setComponentFiltersVarargs(value: ComponentFilter*): Self = StObject.set(x, "componentFilters", js.Array(value*))
    
    inline def setHideConsoleLogsInStrictMode(value: Boolean): Self = StObject.set(x, "hideConsoleLogsInStrictMode", value.asInstanceOf[js.Any])
    
    inline def setShowInlineWarningsAndErrors(value: Boolean): Self = StObject.set(x, "showInlineWarningsAndErrors", value.asInstanceOf[js.Any])
  }
}
