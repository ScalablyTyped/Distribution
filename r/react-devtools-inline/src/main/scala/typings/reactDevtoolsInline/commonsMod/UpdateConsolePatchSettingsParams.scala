package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConsolePatchSettingsParams extends StObject {
  
  var appendComponentStack: Boolean
  
  var breakOnConsoleErrors: Boolean
  
  var browserTheme: BrowserTheme
  
  var hideConsoleLogsInStrictMode: Boolean
  
  var showInlineWarningsAndErrors: Boolean
}
object UpdateConsolePatchSettingsParams {
  
  inline def apply(
    appendComponentStack: Boolean,
    breakOnConsoleErrors: Boolean,
    browserTheme: BrowserTheme,
    hideConsoleLogsInStrictMode: Boolean,
    showInlineWarningsAndErrors: Boolean
  ): UpdateConsolePatchSettingsParams = {
    val __obj = js.Dynamic.literal(appendComponentStack = appendComponentStack.asInstanceOf[js.Any], breakOnConsoleErrors = breakOnConsoleErrors.asInstanceOf[js.Any], browserTheme = browserTheme.asInstanceOf[js.Any], hideConsoleLogsInStrictMode = hideConsoleLogsInStrictMode.asInstanceOf[js.Any], showInlineWarningsAndErrors = showInlineWarningsAndErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConsolePatchSettingsParams]
  }
  
  extension [Self <: UpdateConsolePatchSettingsParams](x: Self) {
    
    inline def setAppendComponentStack(value: Boolean): Self = StObject.set(x, "appendComponentStack", value.asInstanceOf[js.Any])
    
    inline def setBreakOnConsoleErrors(value: Boolean): Self = StObject.set(x, "breakOnConsoleErrors", value.asInstanceOf[js.Any])
    
    inline def setBrowserTheme(value: BrowserTheme): Self = StObject.set(x, "browserTheme", value.asInstanceOf[js.Any])
    
    inline def setHideConsoleLogsInStrictMode(value: Boolean): Self = StObject.set(x, "hideConsoleLogsInStrictMode", value.asInstanceOf[js.Any])
    
    inline def setShowInlineWarningsAndErrors(value: Boolean): Self = StObject.set(x, "showInlineWarningsAndErrors", value.asInstanceOf[js.Any])
  }
}
