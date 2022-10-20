package typings.sentryUtils

import typings.sentryUtils.anon.Extensions
import typings.sentryUtils.anon.Id
import typings.sentryUtils.anon.Integrations
import typings.sentryUtils.anon.UserAgent
import typings.std.Console
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
    name: /* import warning: importer.ImportType#apply Failed type conversion: 'navigator' | 'console' | 'Sentry' | 'SENTRY_ENVIRONMENT' | 'SENTRY_DSN' | 'SENTRY_RELEASE' | '__SENTRY__'['__SENTRY__'] */ js.Any,
    creator: js.Function0[T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalSingleton")(name.asInstanceOf[js.Any], creator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getGlobalSingleton[T](
    name: /* import warning: importer.ImportType#apply Failed type conversion: 'navigator' | 'console' | 'Sentry' | 'SENTRY_ENVIRONMENT' | 'SENTRY_DSN' | 'SENTRY_RELEASE' | '__SENTRY__'['__SENTRY__'] */ js.Any,
    creator: js.Function0[T],
    obj: Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalSingleton")(name.asInstanceOf[js.Any], creator.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait InternalGlobal extends StObject {
    
    var SENTRY_DSN: js.UndefOr[String] = js.undefined
    
    var SENTRY_ENVIRONMENT: js.UndefOr[String] = js.undefined
    
    var SENTRY_RELEASE: js.UndefOr[Id] = js.undefined
    
    var Sentry: js.UndefOr[Integrations] = js.undefined
    
    var __SENTRY__ : Extensions
    
    var console: Console
    
    var navigator: js.UndefOr[UserAgent] = js.undefined
  }
  object InternalGlobal {
    
    inline def apply(__SENTRY__ : Extensions, console: Console): InternalGlobal = {
      val __obj = js.Dynamic.literal(__SENTRY__ = __SENTRY__.asInstanceOf[js.Any], console = console.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalGlobal]
    }
    
    extension [Self <: InternalGlobal](x: Self) {
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setNavigator(value: UserAgent): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
      
      inline def setNavigatorUndefined: Self = StObject.set(x, "navigator", js.undefined)
      
      inline def setSENTRY_DSN(value: String): Self = StObject.set(x, "SENTRY_DSN", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_DSNUndefined: Self = StObject.set(x, "SENTRY_DSN", js.undefined)
      
      inline def setSENTRY_ENVIRONMENT(value: String): Self = StObject.set(x, "SENTRY_ENVIRONMENT", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_ENVIRONMENTUndefined: Self = StObject.set(x, "SENTRY_ENVIRONMENT", js.undefined)
      
      inline def setSENTRY_RELEASE(value: Id): Self = StObject.set(x, "SENTRY_RELEASE", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_RELEASEUndefined: Self = StObject.set(x, "SENTRY_RELEASE", js.undefined)
      
      inline def setSentry(value: Integrations): Self = StObject.set(x, "Sentry", value.asInstanceOf[js.Any])
      
      inline def setSentryUndefined: Self = StObject.set(x, "Sentry", js.undefined)
      
      inline def set__SENTRY__(value: Extensions): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
    }
  }
}
