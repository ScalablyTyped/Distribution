package typings.sentryReplay

import typings.sentryReplay.anon.PickBreadcrumbRequiredPro
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilCreateBreadcrumbMod {
  
  @JSImport("@sentry/replay/types/util/createBreadcrumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBreadcrumb(breadcrumb: PickBreadcrumbRequiredPro): Breadcrumb = ^.asInstanceOf[js.Dynamic].applyDynamic("createBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryReplay.sentryReplayStrings.category
    - typings.sentryReplay.sentryReplayStrings.message
  */
  trait RequiredProperties extends StObject
  object RequiredProperties {
    
    inline def category: typings.sentryReplay.sentryReplayStrings.category = "category".asInstanceOf[typings.sentryReplay.sentryReplayStrings.category]
    
    inline def message: typings.sentryReplay.sentryReplayStrings.message = "message".asInstanceOf[typings.sentryReplay.sentryReplayStrings.message]
  }
}
