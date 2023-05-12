package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.ReplayContainer
import typings.sentryReplay.typesTypesMod.ReplayNetworkOptions
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesBreadcrumbMod.BreadcrumbHint
import typings.sentryTypes.typesTextencoderMod.TextEncoderInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleNetworkBreadcrumbsMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleNetworkBreadcrumbs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def beforeAddNetworkBreadcrumb(options: ExtendedNetworkBreadcrumbsOptions, breadcrumb: Breadcrumb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAddNetworkBreadcrumb")(options.asInstanceOf[js.Any], breadcrumb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeAddNetworkBreadcrumb(options: ExtendedNetworkBreadcrumbsOptions, breadcrumb: Breadcrumb, hint: BreadcrumbHint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAddNetworkBreadcrumb")(options.asInstanceOf[js.Any], breadcrumb.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def handleNetworkBreadcrumbs(replay: ReplayContainer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleNetworkBreadcrumbs")(replay.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ExtendedNetworkBreadcrumbsOptions
    extends StObject
       with ReplayNetworkOptions {
    
    var replay: ReplayContainer
    
    var textEncoder: TextEncoderInternal
  }
  object ExtendedNetworkBreadcrumbsOptions {
    
    inline def apply(
      networkCaptureBodies: Boolean,
      networkDetailAllowUrls: js.Array[String | js.RegExp],
      networkRequestHeaders: js.Array[String],
      networkResponseHeaders: js.Array[String],
      replay: ReplayContainer,
      textEncoder: TextEncoderInternal
    ): ExtendedNetworkBreadcrumbsOptions = {
      val __obj = js.Dynamic.literal(networkCaptureBodies = networkCaptureBodies.asInstanceOf[js.Any], networkDetailAllowUrls = networkDetailAllowUrls.asInstanceOf[js.Any], networkRequestHeaders = networkRequestHeaders.asInstanceOf[js.Any], networkResponseHeaders = networkResponseHeaders.asInstanceOf[js.Any], replay = replay.asInstanceOf[js.Any], textEncoder = textEncoder.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedNetworkBreadcrumbsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendedNetworkBreadcrumbsOptions] (val x: Self) extends AnyVal {
      
      inline def setReplay(value: ReplayContainer): Self = StObject.set(x, "replay", value.asInstanceOf[js.Any])
      
      inline def setTextEncoder(value: TextEncoderInternal): Self = StObject.set(x, "textEncoder", value.asInstanceOf[js.Any])
    }
  }
}
