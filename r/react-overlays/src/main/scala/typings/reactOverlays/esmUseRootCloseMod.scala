package typings.reactOverlays

import typings.react.mod.RefObject
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUseRootCloseMod {
  
  @JSImport("react-overlays/esm/useRootClose", JSImport.Default)
  @js.native
  def default(ref: js.UndefOr[scala.Nothing], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/esm/useRootClose", JSImport.Default)
  @js.native
  def default(
    ref: js.UndefOr[scala.Nothing],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  @JSImport("react-overlays/esm/useRootClose", JSImport.Default)
  @js.native
  def default(ref: Null, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/esm/useRootClose", JSImport.Default)
  @js.native
  def default(
    ref: Null,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
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
  @JSImport("react-overlays/esm/useRootClose", JSImport.Default)
  @js.native
  def default(ref: RefObject[Element], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/esm/useRootClose", JSImport.Default)
  @js.native
  def default(
    ref: RefObject[Element],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  @JSImport("react-overlays/esm/useRootClose", JSImport.Default)
  @js.native
  def default(ref: Element, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/esm/useRootClose", JSImport.Default)
  @js.native
  def default(
    ref: Element,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactOverlays.reactOverlaysStrings.transitionrun
    - typings.reactOverlays.reactOverlaysStrings.toggle
    - typings.reactOverlays.reactOverlaysStrings.click
    - typings.reactOverlays.reactOverlaysStrings.reset
    - typings.reactOverlays.reactOverlaysStrings.focusin
    - typings.reactOverlays.reactOverlaysStrings.pointerup
    - typings.reactOverlays.reactOverlaysStrings.focus
    - typings.reactOverlays.reactOverlaysStrings.pointercancel
    - typings.reactOverlays.reactOverlaysStrings.selectionchange
    - typings.reactOverlays.reactOverlaysStrings.volumechange
    - typings.reactOverlays.reactOverlaysStrings.dragexit
    - typings.reactOverlays.reactOverlaysStrings.pointerenter
    - typings.reactOverlays.reactOverlaysStrings.animationend
    - typings.reactOverlays.reactOverlaysStrings.animationstart
    - typings.reactOverlays.reactOverlaysStrings.canplaythrough
    - typings.reactOverlays.reactOverlaysStrings.mouseenter
    - typings.reactOverlays.reactOverlaysStrings.auxclick
    - typings.reactOverlays.reactOverlaysStrings.pause
    - typings.reactOverlays.reactOverlaysStrings.keyup
    - typings.reactOverlays.reactOverlaysStrings.stalled
    - typings.reactOverlays.reactOverlaysStrings.animationiteration
    - typings.reactOverlays.reactOverlaysStrings.drag
    - typings.reactOverlays.reactOverlaysStrings.mouseleave
    - typings.reactOverlays.reactOverlaysStrings.dblclick
    - typings.reactOverlays.reactOverlaysStrings.change
    - typings.reactOverlays.reactOverlaysStrings.suspend
    - typings.reactOverlays.reactOverlaysStrings.mouseover
    - typings.reactOverlays.reactOverlaysStrings.wheel
    - typings.reactOverlays.reactOverlaysStrings.canplay
    - typings.reactOverlays.reactOverlaysStrings.dragstart
    - typings.reactOverlays.reactOverlaysStrings.error
    - typings.reactOverlays.reactOverlaysStrings.blur
    - typings.reactOverlays.reactOverlaysStrings.abort
    - typings.reactOverlays.reactOverlaysStrings.touchend
    - typings.reactOverlays.reactOverlaysStrings.seeked
    - typings.reactOverlays.reactOverlaysStrings.cuechange
    - typings.reactOverlays.reactOverlaysStrings.animationcancel
    - typings.reactOverlays.reactOverlaysStrings.mouseout
    - typings.reactOverlays.reactOverlaysStrings.loadeddata
    - typings.reactOverlays.reactOverlaysStrings.gotpointercapture
    - typings.reactOverlays.reactOverlaysStrings.transitioncancel
    - typings.reactOverlays.reactOverlaysStrings.touchcancel
    - typings.reactOverlays.reactOverlaysStrings.keydown
    - typings.reactOverlays.reactOverlaysStrings.touchstart
    - typings.reactOverlays.reactOverlaysStrings.dragleave
    - typings.reactOverlays.reactOverlaysStrings.mousedown
    - typings.reactOverlays.reactOverlaysStrings.submit
    - typings.reactOverlays.reactOverlaysStrings.input
    - typings.reactOverlays.reactOverlaysStrings.loadstart
    - typings.reactOverlays.reactOverlaysStrings.loadedmetadata
    - typings.reactOverlays.reactOverlaysStrings.durationchange
    - typings.reactOverlays.reactOverlaysStrings.timeupdate
    - typings.reactOverlays.reactOverlaysStrings.dragend
    - typings.reactOverlays.reactOverlaysStrings.lostpointercapture
    - typings.reactOverlays.reactOverlaysStrings.playing
    - typings.reactOverlays.reactOverlaysStrings.progress
    - typings.reactOverlays.reactOverlaysStrings.invalid
    - typings.reactOverlays.reactOverlaysStrings.mouseup
    - typings.reactOverlays.reactOverlaysStrings.pointerover
    - typings.reactOverlays.reactOverlaysStrings.dragenter
    - typings.reactOverlays.reactOverlaysStrings.resize
    - typings.reactOverlays.reactOverlaysStrings.pointerleave
    - typings.reactOverlays.reactOverlaysStrings.cancel
    - typings.reactOverlays.reactOverlaysStrings.play
    - typings.reactOverlays.reactOverlaysStrings.securitypolicyviolation
    - typings.reactOverlays.reactOverlaysStrings.drop
    - typings.reactOverlays.reactOverlaysStrings.pointerdown
    - typings.reactOverlays.reactOverlaysStrings.focusout
    - typings.reactOverlays.reactOverlaysStrings.pointermove
    - typings.reactOverlays.reactOverlaysStrings.waiting
    - typings.reactOverlays.reactOverlaysStrings.emptied
    - typings.reactOverlays.reactOverlaysStrings.scroll
    - typings.reactOverlays.reactOverlaysStrings.keypress
    - typings.reactOverlays.reactOverlaysStrings.pointerout
    - typings.reactOverlays.reactOverlaysStrings.transitionend
    - typings.reactOverlays.reactOverlaysStrings.ended
    - typings.reactOverlays.reactOverlaysStrings.seeking
    - typings.reactOverlays.reactOverlaysStrings.select
    - typings.reactOverlays.reactOverlaysStrings.dragover
    - typings.reactOverlays.reactOverlaysStrings.close
    - typings.reactOverlays.reactOverlaysStrings.touchmove
    - typings.reactOverlays.reactOverlaysStrings.load
    - typings.reactOverlays.reactOverlaysStrings.contextmenu
    - typings.reactOverlays.reactOverlaysStrings.selectstart
    - typings.reactOverlays.reactOverlaysStrings.mousemove
    - typings.reactOverlays.reactOverlaysStrings.transitionstart
    - typings.reactOverlays.reactOverlaysStrings.ratechange
  */
  trait MouseEvents extends StObject
  
  @js.native
  trait RootCloseOptions extends StObject {
    
    var clickTrigger: js.UndefOr[MouseEvents] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
  }
  object RootCloseOptions {
    
    @scala.inline
    def apply(): RootCloseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootCloseOptions]
    }
    
    @scala.inline
    implicit class RootCloseOptionsMutableBuilder[Self <: RootCloseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickTrigger(value: MouseEvents): Self = StObject.set(x, "clickTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickTriggerUndefined: Self = StObject.set(x, "clickTrigger", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
}
