package typings.reactFloater

import typings.popperjsCore.libEnumsMod.Placement
import typings.reactFloater.anon.PartialModifieranyany
import typings.reactFloater.libTypesMod.LogOptions
import typings.reactFloater.libTypesMod.Props
import typings.reactFloater.libTypesPopperMod.PopperModifiers
import typings.std.Element
import typings.std.EventListener
import typings.std.EventListenerOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModulesHelpersMod {
  
  @JSImport("react-floater/lib/modules/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-floater/lib/modules/helpers", "canUseDOM")
  @js.native
  val canUseDOM: Boolean = js.native
  
  inline def enhanceProps(props: Props): Props = ^.asInstanceOf[js.Dynamic].applyDynamic("enhanceProps")(props.asInstanceOf[js.Any]).asInstanceOf[Props]
  
  inline def getFallbackPlacements(placement: Placement): js.UndefOr[js.Array[Placement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFallbackPlacements")(placement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Placement]]]
  
  inline def getModifiers(): PopperModifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("getModifiers")().asInstanceOf[PopperModifiers]
  inline def getModifiers(modifiers: PopperModifiers): PopperModifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("getModifiers")(modifiers.asInstanceOf[js.Any]).asInstanceOf[PopperModifiers]
  
  inline def isFixed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixed")().asInstanceOf[Boolean]
  inline def isFixed(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixed")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")().asInstanceOf[Boolean]
  
  inline def log(param0: LogOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mergeModifier(modifier: PartialModifieranyany): PartialModifieranyany = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeModifier")(modifier.asInstanceOf[js.Any]).asInstanceOf[PartialModifieranyany]
  inline def mergeModifier(modifier: PartialModifieranyany, customModifier: PartialModifieranyany): PartialModifieranyany = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeModifier")(modifier.asInstanceOf[js.Any], customModifier.asInstanceOf[js.Any])).asInstanceOf[PartialModifieranyany]
  
  inline def off(element: Element, eventType: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element, eventType: String, handler: EventListener, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(element: Element, eventType: String, handler: EventListener, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(element: HTMLElement, eventType: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: HTMLElement, eventType: String, handler: EventListener, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(element: HTMLElement, eventType: String, handler: EventListener, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def once(element: HTMLElement, eventType: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def once(element: HTMLElement, eventType: String, handler: EventListener, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def once(element: HTMLElement, eventType: String, handler: EventListener, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(element.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("react-floater/lib/modules/helpers", "portalId")
  @js.native
  val portalId: /* "react-floater-portal" */ String = js.native
  
  inline def randomId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomId")().asInstanceOf[String]
}
