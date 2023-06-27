package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersUtilAddBreadcrumbEventMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/util/addBreadcrumbEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBreadcrumbEvent(replay: ReplayContainer, breadcrumb: Breadcrumb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumbEvent")(replay.asInstanceOf[js.Any], breadcrumb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
