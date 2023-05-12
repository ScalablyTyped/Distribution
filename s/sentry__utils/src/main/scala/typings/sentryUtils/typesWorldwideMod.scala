package typings.sentryUtils

import typings.sentryUtils.anon.Call
import typings.sentryUtils.anon.Extensions
import typings.sentryUtils.anon.Id
import typings.sentryUtils.anon.Integrations
import typings.sentryUtils.anon.SENTRYINSTRUMENTED
import typings.sentryUtils.anon.UserAgent
import typings.sentryUtils.typesEnvMod.SdkSource
import typings.std.Console
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWorldwideMod {
  
  @JSImport("@sentry/utils/types/worldwide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils/types/worldwide", "GLOBAL_OBJ")
  @js.native
  val GLOBAL_OBJ: InternalGlobal = js.native
  
  inline def getGlobalObject[T](): T & InternalGlobal = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalObject")().asInstanceOf[T & InternalGlobal]
  
  inline def getGlobalSingleton[T](
    name: /* import warning: importer.ImportType#apply Failed type conversion: 'navigator' | 'console' | 'Sentry' | 'onerror' | 'onunhandledrejection' | 'SENTRY_ENVIRONMENT' | 'SENTRY_DSN' | 'SENTRY_RELEASE' | 'SENTRY_SDK_SOURCE' | '_sentryDebugIds' | '__SENTRY__'['__SENTRY__'] */ js.Any,
    creator: js.Function0[T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalSingleton")(name.asInstanceOf[js.Any], creator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getGlobalSingleton[T](
    name: /* import warning: importer.ImportType#apply Failed type conversion: 'navigator' | 'console' | 'Sentry' | 'onerror' | 'onunhandledrejection' | 'SENTRY_ENVIRONMENT' | 'SENTRY_DSN' | 'SENTRY_RELEASE' | 'SENTRY_SDK_SOURCE' | '_sentryDebugIds' | '__SENTRY__'['__SENTRY__'] */ js.Any,
    creator: js.Function0[T],
    obj: Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalSingleton")(name.asInstanceOf[js.Any], creator.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait InternalGlobal extends StObject {
    
    var SENTRY_DSN: js.UndefOr[String] = js.undefined
    
    var SENTRY_ENVIRONMENT: js.UndefOr[String] = js.undefined
    
    var SENTRY_RELEASE: js.UndefOr[Id] = js.undefined
    
    var SENTRY_SDK_SOURCE: js.UndefOr[SdkSource] = js.undefined
    
    var Sentry: js.UndefOr[Integrations] = js.undefined
    
    var __SENTRY__ : Extensions
    
    /**
      * Debug IDs are indirectly injected by Sentry CLI or bundler plugins to directly reference a particular source map
      * for resolving of a source file. The injected code will place an entry into the record for each loaded bundle/JS
      * file.
      */
    var _sentryDebugIds: js.UndefOr[Record[String, String]] = js.undefined
    
    var console: Console
    
    var navigator: js.UndefOr[UserAgent] = js.undefined
    
    var onerror: js.UndefOr[Call] = js.undefined
    
    var onunhandledrejection: js.UndefOr[SENTRYINSTRUMENTED] = js.undefined
  }
  object InternalGlobal {
    
    inline def apply(__SENTRY__ : Extensions, console: Console): InternalGlobal = {
      val __obj = js.Dynamic.literal(__SENTRY__ = __SENTRY__.asInstanceOf[js.Any], console = console.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalGlobal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalGlobal] (val x: Self) extends AnyVal {
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setNavigator(value: UserAgent): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
      
      inline def setNavigatorUndefined: Self = StObject.set(x, "navigator", js.undefined)
      
      inline def setOnerror(value: Call): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnunhandledrejection(value: SENTRYINSTRUMENTED): Self = StObject.set(x, "onunhandledrejection", value.asInstanceOf[js.Any])
      
      inline def setOnunhandledrejectionUndefined: Self = StObject.set(x, "onunhandledrejection", js.undefined)
      
      inline def setSENTRY_DSN(value: String): Self = StObject.set(x, "SENTRY_DSN", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_DSNUndefined: Self = StObject.set(x, "SENTRY_DSN", js.undefined)
      
      inline def setSENTRY_ENVIRONMENT(value: String): Self = StObject.set(x, "SENTRY_ENVIRONMENT", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_ENVIRONMENTUndefined: Self = StObject.set(x, "SENTRY_ENVIRONMENT", js.undefined)
      
      inline def setSENTRY_RELEASE(value: Id): Self = StObject.set(x, "SENTRY_RELEASE", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_RELEASEUndefined: Self = StObject.set(x, "SENTRY_RELEASE", js.undefined)
      
      inline def setSENTRY_SDK_SOURCE(value: SdkSource): Self = StObject.set(x, "SENTRY_SDK_SOURCE", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_SDK_SOURCEUndefined: Self = StObject.set(x, "SENTRY_SDK_SOURCE", js.undefined)
      
      inline def setSentry(value: Integrations): Self = StObject.set(x, "Sentry", value.asInstanceOf[js.Any])
      
      inline def setSentryUndefined: Self = StObject.set(x, "Sentry", js.undefined)
      
      inline def set__SENTRY__(value: Extensions): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
      
      inline def set_sentryDebugIds(value: Record[String, String]): Self = StObject.set(x, "_sentryDebugIds", value.asInstanceOf[js.Any])
      
      inline def set_sentryDebugIdsUndefined: Self = StObject.set(x, "_sentryDebugIds", js.undefined)
    }
  }
}
