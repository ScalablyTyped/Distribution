package typings.sentryReplay

import typings.sentryReplay.typesCoreHandlersUtilDomUtilsMod.DomHandlerData
import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleDomMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleDom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseDomBreadcrumb(
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify INode */ Any,
    message: String
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseDomBreadcrumb")(target.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getBaseDomBreadcrumb(target: Null, message: String): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseDomBreadcrumb")(target.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getBaseDomBreadcrumb(target: Node, message: String): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseDomBreadcrumb")(target.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  
  inline def handleDom(handlerData: DomHandlerData): Breadcrumb | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("handleDom")(handlerData.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb | Null]
  
  inline def handleDomListener(replay: ReplayContainer): js.Function1[/* handlerData */ DomHandlerData, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleDomListener")(replay.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* handlerData */ DomHandlerData, Unit]]
}
