package typings.sentryUtils

import typings.sentryUtils.anon.GlobalEventProcessors
import typings.sentryUtils.anon.Id
import typings.sentryUtils.anon.Integrations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  @JSImport("@sentry/utils/types/global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobalObject[T](): T & SentryGlobal = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalObject")().asInstanceOf[T & SentryGlobal]
  
  inline def getGlobalSingleton[T](
    name: /* import warning: importer.ImportType#apply Failed type conversion: 'Sentry' | 'SENTRY_ENVIRONMENT' | 'SENTRY_DSN' | 'SENTRY_RELEASE' | '__SENTRY__'['__SENTRY__'] */ js.Any,
    creator: js.Function0[T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalSingleton")(name.asInstanceOf[js.Any], creator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getGlobalSingleton[T](
    name: /* import warning: importer.ImportType#apply Failed type conversion: 'Sentry' | 'SENTRY_ENVIRONMENT' | 'SENTRY_DSN' | 'SENTRY_RELEASE' | '__SENTRY__'['__SENTRY__'] */ js.Any,
    creator: js.Function0[T],
    obj: Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalSingleton")(name.asInstanceOf[js.Any], creator.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /** Internal */
  trait SentryGlobal extends StObject {
    
    var SENTRY_DSN: js.UndefOr[String] = js.undefined
    
    var SENTRY_ENVIRONMENT: js.UndefOr[String] = js.undefined
    
    var SENTRY_RELEASE: js.UndefOr[Id] = js.undefined
    
    var Sentry: js.UndefOr[Integrations] = js.undefined
    
    var __SENTRY__ : GlobalEventProcessors
  }
  object SentryGlobal {
    
    inline def apply(__SENTRY__ : GlobalEventProcessors): SentryGlobal = {
      val __obj = js.Dynamic.literal(__SENTRY__ = __SENTRY__.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryGlobal]
    }
    
    extension [Self <: SentryGlobal](x: Self) {
      
      inline def setSENTRY_DSN(value: String): Self = StObject.set(x, "SENTRY_DSN", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_DSNUndefined: Self = StObject.set(x, "SENTRY_DSN", js.undefined)
      
      inline def setSENTRY_ENVIRONMENT(value: String): Self = StObject.set(x, "SENTRY_ENVIRONMENT", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_ENVIRONMENTUndefined: Self = StObject.set(x, "SENTRY_ENVIRONMENT", js.undefined)
      
      inline def setSENTRY_RELEASE(value: Id): Self = StObject.set(x, "SENTRY_RELEASE", value.asInstanceOf[js.Any])
      
      inline def setSENTRY_RELEASEUndefined: Self = StObject.set(x, "SENTRY_RELEASE", js.undefined)
      
      inline def setSentry(value: Integrations): Self = StObject.set(x, "Sentry", value.asInstanceOf[js.Any])
      
      inline def setSentryUndefined: Self = StObject.set(x, "Sentry", js.undefined)
      
      inline def set__SENTRY__(value: GlobalEventProcessors): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
    }
  }
}
