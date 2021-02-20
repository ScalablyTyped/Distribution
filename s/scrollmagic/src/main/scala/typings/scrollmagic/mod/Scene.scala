package typings.scrollmagic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrollmagic", "Scene")
@js.native
class Scene () extends StObject {
  def this(options: SceneConstructorOptions) = this()
  
  /* addIndicators Plugin */
  var addIndicators: js.UndefOr[js.Function1[/* options */ js.UndefOr[IndicatorOptions], this.type]] = js.native
  
  /* Control Methods */
  def addTo(controller: Controller): Scene = js.native
  
  def controller(): Controller = js.native
  
  def destroy(): Null = js.native
  def destroy(reset: Boolean): Null = js.native
  
  /* Getters/Setters */
  def duration(): Double = js.native
  def duration(newDuration: String): Scene = js.native
  def duration(newDuration: js.Function0[Double | String]): Scene = js.native
  def duration(newDuration: Double): Scene = js.native
  
  def enabled(): Boolean = js.native
  def enabled(newState: Boolean): Scene = js.native
  
  def loglevel(): LogLevel = js.native
  def loglevel(newLogLevel: LogLevel): Scene = js.native
  
  /* Event Handling */
  // tslint proposes to avoid Generics if they are used only once.
  // In the case of the on and off methods, the recommended approach
  // leads to errors (the compiler tries to match the event interfaces rather than
  // treating the generic Event interface as an abstract base interface
  // tslint:disable-next-line no-unnecessary-generics
  def off[T /* <: Event[EventType] */](events: String, callback: js.Function1[/* event */ T, _]): Scene = js.native
  
  def offset(): Double = js.native
  def offset(newOffset: Double): Scene = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  def on[T /* <: Event[EventType] */](events: String, callback: js.Function1[/* event */ T, _]): Scene = js.native
  
  def progress(): Double = js.native
  def progress(progress: Double): Scene = js.native
  
  def refresh(): Scene = js.native
  
  def remove(): Scene = js.native
  
  def removeClassToggle(): Scene = js.native
  def removeClassToggle(reset: Boolean): Scene = js.native
  
  var removeIndicators: js.UndefOr[js.Function0[this.type]] = js.native
  
  def removePin(): Scene = js.native
  def removePin(reset: Boolean): Scene = js.native
  
  def reverse(): Boolean = js.native
  def reverse(newReverse: Boolean): Scene = js.native
  
  /* Getters */
  def scrollOffset(): Double = js.native
  
  def setClassToggle(element: ElementOrSelector, classes: String): Scene = js.native
  
  def setPin(): Scene = js.native
  def setPin(element: Null, settings: PinSettings): Scene = js.native
  def setPin(element: ElementOrSelector): Scene = js.native
  def setPin(element: ElementOrSelector, settings: PinSettings): Scene = js.native
  
  def state(): SceneState = js.native
  
  def trigger(name: String): Scene = js.native
  def trigger(name: String, vars: js.Object): Scene = js.native
  
  def triggerElement(): ElementOrSelector | Null = js.native
  def triggerElement(newTriggerElement: ElementOrSelector): Scene = js.native
  @JSName("triggerElement")
  def triggerElement_Scene(): Scene = js.native
  
  def triggerHook(): TriggerHook = js.native
  def triggerHook(newTriggerHook: TriggerHook): Scene = js.native
  
  def triggerPosition(): Double = js.native
  
  def update(): Scene = js.native
  def update(immediately: Boolean): Scene = js.native
}
