package typings.sentryReplay

import typings.sentryReplay.anon.OmitBreadcrumbcategoryBre
import typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrame
import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
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
  
  inline def normalizeConsoleBreadcrumb(breadcrumb: OmitBreadcrumbcategoryBre): ReplayFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeConsoleBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[ReplayFrame]
  
  /* Inlined std.Required<std.Pick<@sentry/types.@sentry/types.Breadcrumb, 'category'>> */
  trait BreadcrumbWithCategory extends StObject {
    
    var category: String
  }
  object BreadcrumbWithCategory {
    
    inline def apply(category: String): BreadcrumbWithCategory = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbWithCategory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbWithCategory] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    }
  }
}
