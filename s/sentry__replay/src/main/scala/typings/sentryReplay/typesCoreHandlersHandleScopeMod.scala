package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.ReplayContainer
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleScopeMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleScope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleScope(scope: Scope): Breadcrumb | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("handleScope")(scope.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb | Null]
  
  inline def handleScopeListener(replay: ReplayContainer): js.Function1[/* scope */ Scope, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleScopeListener")(replay.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* scope */ Scope, Unit]]
  
  inline def normalizeConsoleBreadcrumb(breadcrumb: Breadcrumb): Breadcrumb = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeConsoleBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb]
}
