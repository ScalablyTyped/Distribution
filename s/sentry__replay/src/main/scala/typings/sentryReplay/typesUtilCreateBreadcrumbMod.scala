package typings.sentryReplay

import typings.sentryReplay.anon.PartialPickBreadcrumbFram
import typings.sentryReplay.sentryReplayStrings.`type`
import typings.sentryReplay.sentryReplayStrings.timestamp
import typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilCreateBreadcrumbMod {
  
  @JSImport("@sentry/replay/types/util/createBreadcrumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBreadcrumb(breadcrumb: (Omit[BreadcrumbFrame, timestamp | `type`]) & PartialPickBreadcrumbFram): BreadcrumbFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("createBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[BreadcrumbFrame]
}
