package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.ReplayClickDetector
import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import typings.sentryReplay.typesTypesReplayMod.SlowClickConfig
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleClickMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleClick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/replay/types/coreHandlers/handleClick", "ClickDetector")
  @js.native
  open class ClickDetector protected ()
    extends StObject
       with ReplayClickDetector {
    def this(replay: ReplayContainer, slowClickConfig: SlowClickConfig) = this()
    def this(
      replay: ReplayContainer,
      slowClickConfig: SlowClickConfig,
      _addBreadcrumbEvent: js.Function2[/* replay */ ReplayContainer, /* breadcrumb */ Breadcrumb, Unit]
    ) = this()
    
    /* private */ var _addBreadcrumbEvent: Any = js.native
    
    /* private */ var _checkClickTimeout: Any = js.native
    
    /** Check the clicks that happened. */
    /* private */ var _checkClicks: Any = js.native
    
    /* private */ var _clicks: Any = js.native
    
    /** Generate matching breadcrumb(s) for the click. */
    /* private */ var _generateBreadcrumbs: Any = js.native
    
    /** Try to get an existing click on the given element. */
    /* private */ var _getClick: Any = js.native
    
    /** Count multiple clicks on elements. */
    /* private */ var _handleMultiClick: Any = js.native
    
    /* private */ var _ignoreSelector: Any = js.native
    
    /* protected */ var _lastMutation: Double = js.native
    
    /* protected */ var _lastScroll: Double = js.native
    
    /* private */ var _multiClickTimeout: Any = js.native
    
    /* private */ var _replay: Any = js.native
    
    /** Schedule to check current clicks. */
    /* private */ var _scheduleCheckClicks: Any = js.native
    
    /* private */ var _scollTimeout: Any = js.native
    
    /* private */ var _teardown: Any = js.native
    
    /* private */ var _threshold: Any = js.native
    
    /* private */ var _timeout: Any = js.native
    
    /* CompleteClass */
    override def addListeners(): Unit = js.native
    
    /* CompleteClass */
    override def handleClick(breadcrumb: Breadcrumb, node: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def removeListeners(): Unit = js.native
  }
  
  inline def handleClick(clickDetector: ReplayClickDetector, clickBreadcrumb: Breadcrumb, node: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleClick")(clickDetector.asInstanceOf[js.Any], clickBreadcrumb.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ignoreElement(node: HTMLElement, ignoreSelector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ignoreElement")(node.asInstanceOf[js.Any], ignoreSelector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
