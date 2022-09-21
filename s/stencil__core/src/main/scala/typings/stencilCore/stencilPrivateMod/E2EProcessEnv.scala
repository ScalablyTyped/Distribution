package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait E2EProcessEnv extends StObject {
  
  var STENCIL_COMMIT_ID: js.UndefOr[String] = js.undefined
  
  var STENCIL_COMMIT_MESSAGE: js.UndefOr[String] = js.undefined
  
  var STENCIL_REPO_URL: js.UndefOr[String] = js.undefined
  
  var STENCIL_SCREENSHOT_CONNECTOR: js.UndefOr[String] = js.undefined
  
  var STENCIL_SCREENSHOT_SERVER: js.UndefOr[String] = js.undefined
  
  var __STENCIL_APP_SCRIPT_URL__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_APP_STYLE_URL__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_BROWSER_URL__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_BROWSER_WAIT_UNTIL: js.UndefOr[String] = js.undefined
  
  var __STENCIL_BROWSER_WS_ENDPOINT__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_DEFAULT_TIMEOUT__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_E2E_DEVTOOLS__ : js.UndefOr[`true`] = js.undefined
  
  var __STENCIL_E2E_TESTS__ : js.UndefOr[`true`] = js.undefined
  
  var __STENCIL_EMULATE_CONFIGS__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_EMULATE__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_ENV__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_PUPPETEER_MODULE__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_SCREENSHOT_BUILD__ : js.UndefOr[String] = js.undefined
  
  var __STENCIL_SCREENSHOT__ : js.UndefOr[`true`] = js.undefined
  
  var __STENCIL_SPEC_TESTS__ : js.UndefOr[`true`] = js.undefined
}
object E2EProcessEnv {
  
  inline def apply(): E2EProcessEnv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[E2EProcessEnv]
  }
  
  extension [Self <: E2EProcessEnv](x: Self) {
    
    inline def setSTENCIL_COMMIT_ID(value: String): Self = StObject.set(x, "STENCIL_COMMIT_ID", value.asInstanceOf[js.Any])
    
    inline def setSTENCIL_COMMIT_IDUndefined: Self = StObject.set(x, "STENCIL_COMMIT_ID", js.undefined)
    
    inline def setSTENCIL_COMMIT_MESSAGE(value: String): Self = StObject.set(x, "STENCIL_COMMIT_MESSAGE", value.asInstanceOf[js.Any])
    
    inline def setSTENCIL_COMMIT_MESSAGEUndefined: Self = StObject.set(x, "STENCIL_COMMIT_MESSAGE", js.undefined)
    
    inline def setSTENCIL_REPO_URL(value: String): Self = StObject.set(x, "STENCIL_REPO_URL", value.asInstanceOf[js.Any])
    
    inline def setSTENCIL_REPO_URLUndefined: Self = StObject.set(x, "STENCIL_REPO_URL", js.undefined)
    
    inline def setSTENCIL_SCREENSHOT_CONNECTOR(value: String): Self = StObject.set(x, "STENCIL_SCREENSHOT_CONNECTOR", value.asInstanceOf[js.Any])
    
    inline def setSTENCIL_SCREENSHOT_CONNECTORUndefined: Self = StObject.set(x, "STENCIL_SCREENSHOT_CONNECTOR", js.undefined)
    
    inline def setSTENCIL_SCREENSHOT_SERVER(value: String): Self = StObject.set(x, "STENCIL_SCREENSHOT_SERVER", value.asInstanceOf[js.Any])
    
    inline def setSTENCIL_SCREENSHOT_SERVERUndefined: Self = StObject.set(x, "STENCIL_SCREENSHOT_SERVER", js.undefined)
    
    inline def set__STENCIL_APP_SCRIPT_URL__(value: String): Self = StObject.set(x, "__STENCIL_APP_SCRIPT_URL__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_APP_SCRIPT_URL__Undefined: Self = StObject.set(x, "__STENCIL_APP_SCRIPT_URL__", js.undefined)
    
    inline def set__STENCIL_APP_STYLE_URL__(value: String): Self = StObject.set(x, "__STENCIL_APP_STYLE_URL__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_APP_STYLE_URL__Undefined: Self = StObject.set(x, "__STENCIL_APP_STYLE_URL__", js.undefined)
    
    inline def set__STENCIL_BROWSER_URL__(value: String): Self = StObject.set(x, "__STENCIL_BROWSER_URL__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_BROWSER_URL__Undefined: Self = StObject.set(x, "__STENCIL_BROWSER_URL__", js.undefined)
    
    inline def set__STENCIL_BROWSER_WAIT_UNTIL(value: String): Self = StObject.set(x, "__STENCIL_BROWSER_WAIT_UNTIL", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_BROWSER_WAIT_UNTILUndefined: Self = StObject.set(x, "__STENCIL_BROWSER_WAIT_UNTIL", js.undefined)
    
    inline def set__STENCIL_BROWSER_WS_ENDPOINT__(value: String): Self = StObject.set(x, "__STENCIL_BROWSER_WS_ENDPOINT__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_BROWSER_WS_ENDPOINT__Undefined: Self = StObject.set(x, "__STENCIL_BROWSER_WS_ENDPOINT__", js.undefined)
    
    inline def set__STENCIL_DEFAULT_TIMEOUT__(value: String): Self = StObject.set(x, "__STENCIL_DEFAULT_TIMEOUT__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_DEFAULT_TIMEOUT__Undefined: Self = StObject.set(x, "__STENCIL_DEFAULT_TIMEOUT__", js.undefined)
    
    inline def set__STENCIL_E2E_DEVTOOLS__(value: `true`): Self = StObject.set(x, "__STENCIL_E2E_DEVTOOLS__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_E2E_DEVTOOLS__Undefined: Self = StObject.set(x, "__STENCIL_E2E_DEVTOOLS__", js.undefined)
    
    inline def set__STENCIL_E2E_TESTS__(value: `true`): Self = StObject.set(x, "__STENCIL_E2E_TESTS__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_E2E_TESTS__Undefined: Self = StObject.set(x, "__STENCIL_E2E_TESTS__", js.undefined)
    
    inline def set__STENCIL_EMULATE_CONFIGS__(value: String): Self = StObject.set(x, "__STENCIL_EMULATE_CONFIGS__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_EMULATE_CONFIGS__Undefined: Self = StObject.set(x, "__STENCIL_EMULATE_CONFIGS__", js.undefined)
    
    inline def set__STENCIL_EMULATE__(value: String): Self = StObject.set(x, "__STENCIL_EMULATE__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_EMULATE__Undefined: Self = StObject.set(x, "__STENCIL_EMULATE__", js.undefined)
    
    inline def set__STENCIL_ENV__(value: String): Self = StObject.set(x, "__STENCIL_ENV__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_ENV__Undefined: Self = StObject.set(x, "__STENCIL_ENV__", js.undefined)
    
    inline def set__STENCIL_PUPPETEER_MODULE__(value: String): Self = StObject.set(x, "__STENCIL_PUPPETEER_MODULE__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_PUPPETEER_MODULE__Undefined: Self = StObject.set(x, "__STENCIL_PUPPETEER_MODULE__", js.undefined)
    
    inline def set__STENCIL_SCREENSHOT_BUILD__(value: String): Self = StObject.set(x, "__STENCIL_SCREENSHOT_BUILD__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_SCREENSHOT_BUILD__Undefined: Self = StObject.set(x, "__STENCIL_SCREENSHOT_BUILD__", js.undefined)
    
    inline def set__STENCIL_SCREENSHOT__(value: `true`): Self = StObject.set(x, "__STENCIL_SCREENSHOT__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_SCREENSHOT__Undefined: Self = StObject.set(x, "__STENCIL_SCREENSHOT__", js.undefined)
    
    inline def set__STENCIL_SPEC_TESTS__(value: `true`): Self = StObject.set(x, "__STENCIL_SPEC_TESTS__", value.asInstanceOf[js.Any])
    
    inline def set__STENCIL_SPEC_TESTS__Undefined: Self = StObject.set(x, "__STENCIL_SPEC_TESTS__", js.undefined)
  }
}
