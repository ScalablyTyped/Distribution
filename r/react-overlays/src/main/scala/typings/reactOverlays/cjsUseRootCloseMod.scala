package typings.reactOverlays

import typings.react.mod.RefObject
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseRootCloseMod {
  
  @JSImport("react-overlays/cjs/useRootClose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: Null, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    ref: Null,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any], hasDisabledClickTrigger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(ref: Unit, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    ref: Unit,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any], hasDisabledClickTrigger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * The `useRootClose` hook registers your callback on the document
    * when rendered. Powers the `<Overlay/>` component. This is used achieve modal
    * style behavior where your callback is triggered when the user tries to
    * interact with the rest of the document or hits the `esc` key.
    *
    * @param {Ref<HTMLElement>| HTMLElement} ref  The element boundary
    * @param {function} onRootClose
    * @param {object=}  options
    * @param {boolean=} options.disabled
    * @param {string=}  options.clickTrigger The DOM event name (click, mousedown, etc) to attach listeners on
    */
  inline def default(ref: RefObject[Element], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    ref: RefObject[Element],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any], hasDisabledClickTrigger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(ref: Element, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    ref: Element,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onRootClose.asInstanceOf[js.Any], hasDisabledClickTrigger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type MouseEvents = /* import warning: importer.ImportType#apply Failed type conversion: std.TransitionEvent extends std.MouseEvent ? 'transitionrun' : never */ js.Any
  
  trait RootCloseOptions extends StObject {
    
    var clickTrigger: js.UndefOr[MouseEvents] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object RootCloseOptions {
    
    inline def apply(): RootCloseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootCloseOptions]
    }
    
    extension [Self <: RootCloseOptions](x: Self) {
      
      inline def setClickTrigger(value: MouseEvents): Self = StObject.set(x, "clickTrigger", value.asInstanceOf[js.Any])
      
      inline def setClickTriggerUndefined: Self = StObject.set(x, "clickTrigger", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
}
