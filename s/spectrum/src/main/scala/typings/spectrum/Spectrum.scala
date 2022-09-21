package typings.spectrum

import typings.jquery.JQuery.CoordinatesPartial
import typings.jquery.JQuery.EventBase
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.TypeOrArray
import typings.jquery.JQuery.htmlString
import typings.spectrum.spectrumBooleans.`false`
import typings.spectrum.spectrumStrings.beforeShow
import typings.spectrum.spectrumStrings.dragstart
import typings.spectrum.spectrumStrings.dragstop
import typings.spectrum.spectrumStrings.hide
import typings.spectrum.spectrumStrings.move
import typings.spectrum.spectrumStrings.show
import typings.std.DocumentFragment
import typings.std.Element
import typings.tinycolor2.mod.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spectrum {
  
  /**
    * You can prevent the color picker from showing up if you return `false` in
    * the `beforeShow` event.
    *
    * This event is ignored on a flat color picker.
    *
    * The callback will receive an additional argument of type
    * `tinycolor.Instance` with the currently selected color.
    *
    * ```javascript
    * $("#picker").spectrum({
    *   beforeShow: function(color) {
    *     color.toHexString(); // #ff0000
    *     return false; // Will never show up
    *   }
    * }
    * ```
    */
  trait BeforeShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    extends StObject
       with EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
    
    @JSName("type")
    var type_BeforeShowEvent: beforeShow
  }
  object BeforeShowEvent {
    
    inline def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
      altKey: Unit,
      bubbles: Boolean,
      button: Unit,
      buttons: Unit,
      cancelable: Boolean,
      changedTouches: Unit,
      char: Unit,
      charCode: Unit,
      clientX: Unit,
      clientY: Unit,
      ctrlKey: Unit,
      currentTarget: TCurrentTarget,
      data: TData,
      delegateTarget: TDelegateTarget,
      detail: Unit,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      key: Unit,
      keyCode: Unit,
      metaKey: Unit,
      offsetX: Unit,
      offsetY: Unit,
      pageX: Unit,
      pageY: Unit,
      pointerId: Unit,
      pointerType: Unit,
      preventDefault: () => Unit,
      relatedTarget: Unit,
      screenX: Unit,
      screenY: Unit,
      shiftKey: Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: TTarget,
      targetTouches: Unit,
      timeStamp: Double,
      toElement: Unit,
      touches: Unit,
      view: Unit,
      which: Unit
    ): BeforeShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("beforeShow")
      __obj.asInstanceOf[BeforeShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    }
    
    extension [Self <: BeforeShowEvent[?, ?, ?, ?], TDelegateTarget, TData, TCurrentTarget, TTarget](x: Self & (BeforeShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) {
      
      inline def setType(value: beforeShow): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Possible values for the `preferredFormat` option.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.spectrum.spectrumStrings.hex
    - typings.spectrum.spectrumStrings.hex3
    - typings.spectrum.spectrumStrings.hsl
    - typings.spectrum.spectrumStrings.rgb
    - typings.spectrum.spectrumStrings.name
  */
  trait ColorFormatName extends StObject
  object ColorFormatName {
    
    inline def hex: typings.spectrum.spectrumStrings.hex = "hex".asInstanceOf[typings.spectrum.spectrumStrings.hex]
    
    inline def hex3: typings.spectrum.spectrumStrings.hex3 = "hex3".asInstanceOf[typings.spectrum.spectrumStrings.hex3]
    
    inline def hsl: typings.spectrum.spectrumStrings.hsl = "hsl".asInstanceOf[typings.spectrum.spectrumStrings.hsl]
    
    inline def name: typings.spectrum.spectrumStrings.name = "name".asInstanceOf[typings.spectrum.spectrumStrings.name]
    
    inline def rgb: typings.spectrum.spectrumStrings.rgb = "rgb".asInstanceOf[typings.spectrum.spectrumStrings.rgb]
  }
  
  /**
    * Called at the beginning of a drag event on either hue slider, alpha
    * slider, or main color picker areas.
    *
    * The callback will receive an additional argument of type
    * `tinycolor.Instance` with the currently selected color.
    *
    * ```javascript
    * $(element).on("dragstart.spectrum", function(e, color) {
    *  color.toHexString(); // #ff0000
    * });
    * ```
    */
  trait DragstartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    extends StObject
       with EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
    
    @JSName("type")
    var type_DragstartEvent: dragstart
  }
  object DragstartEvent {
    
    inline def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
      altKey: Unit,
      bubbles: Boolean,
      button: Unit,
      buttons: Unit,
      cancelable: Boolean,
      changedTouches: Unit,
      char: Unit,
      charCode: Unit,
      clientX: Unit,
      clientY: Unit,
      ctrlKey: Unit,
      currentTarget: TCurrentTarget,
      data: TData,
      delegateTarget: TDelegateTarget,
      detail: Unit,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      key: Unit,
      keyCode: Unit,
      metaKey: Unit,
      offsetX: Unit,
      offsetY: Unit,
      pageX: Unit,
      pageY: Unit,
      pointerId: Unit,
      pointerType: Unit,
      preventDefault: () => Unit,
      relatedTarget: Unit,
      screenX: Unit,
      screenY: Unit,
      shiftKey: Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: TTarget,
      targetTouches: Unit,
      timeStamp: Double,
      toElement: Unit,
      touches: Unit,
      view: Unit,
      which: Unit
    ): DragstartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dragstart")
      __obj.asInstanceOf[DragstartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    }
    
    extension [Self <: DragstartEvent[?, ?, ?, ?], TDelegateTarget, TData, TCurrentTarget, TTarget](x: Self & (DragstartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) {
      
      inline def setType(value: dragstart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Called at the end of a drag event on either hue slider, alpha slider, or
    * main color picker areas.
    *
    * The callback will receive an additional argument of type
    * `tinycolor.Instance` with the currently selected color.
    *
    * ```javascript
    * $(element).on("dragstop.spectrum", function(e, color) {
    *  color.toHexString(); // #ff0000
    * });
    * ```
    */
  trait DragstopEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    extends StObject
       with EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
    
    @JSName("type")
    var type_DragstopEvent: dragstop
  }
  object DragstopEvent {
    
    inline def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
      altKey: Unit,
      bubbles: Boolean,
      button: Unit,
      buttons: Unit,
      cancelable: Boolean,
      changedTouches: Unit,
      char: Unit,
      charCode: Unit,
      clientX: Unit,
      clientY: Unit,
      ctrlKey: Unit,
      currentTarget: TCurrentTarget,
      data: TData,
      delegateTarget: TDelegateTarget,
      detail: Unit,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      key: Unit,
      keyCode: Unit,
      metaKey: Unit,
      offsetX: Unit,
      offsetY: Unit,
      pageX: Unit,
      pageY: Unit,
      pointerId: Unit,
      pointerType: Unit,
      preventDefault: () => Unit,
      relatedTarget: Unit,
      screenX: Unit,
      screenY: Unit,
      shiftKey: Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: TTarget,
      targetTouches: Unit,
      timeStamp: Double,
      toElement: Unit,
      touches: Unit,
      view: Unit,
      which: Unit
    ): DragstopEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dragstop")
      __obj.asInstanceOf[DragstopEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    }
    
    extension [Self <: DragstopEvent[?, ?, ?, ?], TDelegateTarget, TData, TCurrentTarget, TTarget](x: Self & (DragstopEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) {
      
      inline def setType(value: dragstop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Called after the color picker is hidden.
    *
    * This happens when clicking outside of the picker while it is open.
    *
    * Note: When any color picker on the page is shown, it will hide all other
    * color picker that are already open.
    *
    * This event is ignored on a flat color picker, i.e. when `flat` is set to
    * `true`.
    *
    * The callback will receive an additional argument of type
    * `tinycolor.Instance` with the currently selected color.
    *
    * ```javascript
    * $("#picker").spectrum({
    *   hide: function(color) {
    *     color.toHexString(); // #ff0000
    *   }
    * }
    * ```
    */
  trait HideEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    extends StObject
       with EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
    
    @JSName("type")
    var type_HideEvent: hide
  }
  object HideEvent {
    
    inline def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
      altKey: Unit,
      bubbles: Boolean,
      button: Unit,
      buttons: Unit,
      cancelable: Boolean,
      changedTouches: Unit,
      char: Unit,
      charCode: Unit,
      clientX: Unit,
      clientY: Unit,
      ctrlKey: Unit,
      currentTarget: TCurrentTarget,
      data: TData,
      delegateTarget: TDelegateTarget,
      detail: Unit,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      key: Unit,
      keyCode: Unit,
      metaKey: Unit,
      offsetX: Unit,
      offsetY: Unit,
      pageX: Unit,
      pageY: Unit,
      pointerId: Unit,
      pointerType: Unit,
      preventDefault: () => Unit,
      relatedTarget: Unit,
      screenX: Unit,
      screenY: Unit,
      shiftKey: Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: TTarget,
      targetTouches: Unit,
      timeStamp: Double,
      toElement: Unit,
      touches: Unit,
      view: Unit,
      which: Unit
    ): HideEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("hide")
      __obj.asInstanceOf[HideEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    }
    
    extension [Self <: HideEvent[?, ?, ?, ?], TDelegateTarget, TData, TCurrentTarget, TTarget](x: Self & (HideEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) {
      
      inline def setType(value: hide): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Called as the user moves around within the color picker.
    *
    * The callback will receive an additional argument of type
    * `tinycolor.Instance` with the currently selected color.
    *
    * ```javascript
    * $("#picker").spectrum({
    *   move: function(color) {
    *     color.toHexString(); // #ff0000
    *   }
    * }
    * ```
    */
  trait MoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    extends StObject
       with EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
    
    @JSName("type")
    var type_MoveEvent: move
  }
  object MoveEvent {
    
    inline def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
      altKey: Unit,
      bubbles: Boolean,
      button: Unit,
      buttons: Unit,
      cancelable: Boolean,
      changedTouches: Unit,
      char: Unit,
      charCode: Unit,
      clientX: Unit,
      clientY: Unit,
      ctrlKey: Unit,
      currentTarget: TCurrentTarget,
      data: TData,
      delegateTarget: TDelegateTarget,
      detail: Unit,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      key: Unit,
      keyCode: Unit,
      metaKey: Unit,
      offsetX: Unit,
      offsetY: Unit,
      pageX: Unit,
      pageY: Unit,
      pointerId: Unit,
      pointerType: Unit,
      preventDefault: () => Unit,
      relatedTarget: Unit,
      screenX: Unit,
      screenY: Unit,
      shiftKey: Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: TTarget,
      targetTouches: Unit,
      timeStamp: Double,
      toElement: Unit,
      touches: Unit,
      view: Unit,
      which: Unit
    ): MoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("move")
      __obj.asInstanceOf[MoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    }
    
    extension [Self <: MoveEvent[?, ?, ?, ?], TDelegateTarget, TData, TCurrentTarget, TTarget](x: Self & (MoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) {
      
      inline def setType(value: move): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Allows the color picker to have no color as a value. This will
      * display a button to set selection to 'no color'.
      */
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets which element the color picker container is appended to (default
      * is `body`).
      *
      * Changing this can help resolve issues with opening the color picker
      * in a modal dialog or fixed position container, for instance.
      */
    var appendTo: js.UndefOr[Selector | htmlString | (TypeOrArray[Element | DocumentFragment]) | JQuery] = js.undefined
    
    /**
      * You can prevent the color picker from showing up if you return
      * `false` in the `beforeShow` event.
      *
      * This event is ignored on a flat color picker.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   beforeShow: function(color) {
      *     color.toHexString(); // #ff0000
      *     return false; // Will never show up
      *   }
      * }
      * ```
      *
      * @param color The currently selected color of the color picker.
      * @return `false` to prevent the color picker from showing up.
      */
    var beforeShow: js.UndefOr[js.Function1[/* color */ Instance, Boolean | Unit]] = js.undefined
    
    /**
      * Sets the text on the cancel button. Defaults to `cancel`.
      */
    var cancelText: js.UndefOr[String] = js.undefined
    
    /**
      * Called as the original input changes. Only happens when the input is
      * closed or the 'Choose' button is clicked.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   change: function(color) {
      *     color.toHexString(); // #ff0000
      *   }
      * }
      * ```
      *
      * @param color The currently selected color of the color picker.
      */
    var change: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.undefined
    
    /**
      * Sets the text on the choose button. Defaults to `choose`.
      */
    var chooseText: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the text on the clear button. Defaults to
      * `Clear Color Selection`.
      */
    var clearText: js.UndefOr[String] = js.undefined
    
    /**
      * When clicking outside of the color picker, you can force it to fire a
      * `change` event rather than having it revert the change. This is
      * `true` by default.
      *
      * ```javascript
      * $("#clickoutFiresChange").spectrum({
      *   clickoutFiresChange: true
      * });
      * $("#clickoutDoesntChange").spectrum({
      *   clickoutFiresChange: false
      * });
      * ```
      */
    var clickoutFiresChange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial color can be set with the color option. This may be
      * `false` when no value has been set explicitly.
      *
      * If you do not pass in a color, spectrum will use the value attribute
      * on the input. The input is a string that is parsed using
      * [TinyColor](https://github.com/bgrins/TinyColor).
      *
      * ```html
      * <input type='text' class='basic' value='red' />
      * <input type='text' class='basic' value='#0f0' />
      * <input type='text' class='basic' value='blue' />
      * <br />
      * <input type='text' class='override' />
      * <br />
      * <input type='text' class='startEmpty' value='' />
      *
      * <script>
      * $(".basic").spectrum();
      * $(".override").spectrum({
      *   color: "yellow"
      * });
      * $(".startEmpty").spectrum({
      *   allowEmpty: true
      * });
      * </script>
      * ```
      */
    var color: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Adds an additional class name to the just the container element.
      *
      * ```javascript
      * $("#containerClassName").spectrum({
      *   containerClassName: 'awesome'
      * });
      * ```
      *
      * ```css
      * .awesome {
      *   background: purple;
      * }
      * ```
      */
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Spectrum can be automatically disabled if you pass in the `disabled`
      * flag.
      *
      * Additionally, if the input that you initialize spectrum on is
      * disabled, this will be the default value.
      *
      * Note: You cannot enable spectrum if the input is disabled.
      *
      * ```javascript
      * $("#disabled").spectrum({
      *   disabled: true
      * });
      * $("input:disabled").spectrum({
      * });
      * ```
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The color picker will always show up at full size, and be positioned
      * as an `inline-block` element.
      *
      * ```html
      * <input type='text' id="flat" />
      * <br/>
      * <input type='text' id="flat" />
      * ```
      *
      * ```javascript
      * $("#flat").spectrum({
      *   flat: true,
      *   showInput: true
      * });
      * $("#flatClearable").spectrum({
      *   flat: true,
      *   showInput: true,
      *   allowEmpty:true
      * });
      * ```
      */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called after the color picker is hidden.
      *
      * This happens when clicking outside of the picker while it is open.
      *
      * Note: When any color picker on the page is shown, it will hide all
      * other color picker that are already open.
      *
      * This event is ignored on a flat color picker, i.e. when `flat` is
      * set to `true`.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   hide: function(color) {
      *     color.toHexString(); // #ff0000
      *   }
      * }
      * ```
      *
      * @param color The currently selected color of the color picker.
      */
    var hide: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.undefined
    
    /**
      * Automatically hides the color picker after a palette color is
      * selected.
      *
      * ```javascript
      * $("#hideAfterPaletteSelect").spectrum({
      *   showPaletteOnly: true,
      *   showPalette:true,
      *   hideAfterPaletteSelect:true,
      *   color: 'blanchedalmond',
      *   palette: [
      *     ['black', 'white', 'blanchedalmond',
      *     'rgb(255, 128, 0);', 'hsv 100 70 50'],
      *     ['red', 'yellow', 'green', 'blue', 'violet']
      *   ]
      * });
      * ```
      */
    var hideAfterPaletteSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The users selection will be saved in the browser's `localStorage`
      * object. Any spectrum with the same string will share the selection.
      *
      * May be `false` when no value has been set explicitly.
      */
    var localStorageKey: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Sets the max size for the palette.
      *
      * This is how many elements are allowed in the selection palette at
      * once.
      *
      * Elements will be removed from the palette in first in - first out
      * order if this limit is reached.
      *
      * ```javascript
      * $("#maxSelectionSize").spectrum({
      *   showPalette: true,
      *   palette: [ ],
      *   showSelectionPalette: true, // true by default
      *   selectionPalette: ["red", "green", "blue"],
      *   maxSelectionSize: 2
      * });
      * ```
      */
    var maxSelectionSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Called as the user moves around within the color picker.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   move: function(color) {
      *     color.toHexString(); // #ff0000
      *   }
      * }
      * ```
      *
      * @param color The currently selected color of the color picker.
      */
    var move: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.undefined
    
    /**
      * Sets the text for when no color has been selected. Defaults to
      * `No Color Selected`.
      */
    var noColorSelectedText: js.UndefOr[String] = js.undefined
    
    /**
      * Additional offset to apply as a CSS unit to the container.
      */
    var offset: js.UndefOr[CoordinatesPartial | Null] = js.undefined
    
    /**
      * Sets a palette below the color picker to make it convenient for users
      * to choose from frequently or recently used colors.
      *
      * Default value:
      *
      * ```javascript
      * [[
      *     "#ffffff", "#000000", "#ff0000",
      *     "#ff8000", "#ffff00", "#008000",
      *     "#0000ff", "#4b0082", "#9400d3"
      * ]]
      * ```
      */
    var palette: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    /**
      * Sets the format that is displayed in the text box. This may be
      * `false` when not set explicitly.
      *
      * This will also change the format that is displayed in the titles from
      * the palette swatches.
      *
      * ```javascript
      * $("#preferredHex").spectrum({
      *   preferredFormat: "hex",
      *   showInput: true,
      *   showPalette: true,
      *   palette: [["red", "rgba(0, 255, 0, .5)", "rgb(0, 0, 255)"]]
      * });
      * $("#preferredHex3").spectrum({
      *   preferredFormat: "hex3",
      *   showInput: true,
      *   showPalette: true,
      *   palette: [["red", "rgba(0, 255, 0, .5)", "rgb(0, 0, 255)"]]
      * });
      * $("#preferredHsl").spectrum({
      *   preferredFormat: "hsl",
      *   showInput: true,
      *   showPalette: true,
      *   palette: [["red", "rgba(0, 255, 0, .5)", "rgb(0, 0, 255)"]]
      * });
      * $("#preferredRgb").spectrum({
      *   preferredFormat: "rgb",
      *   showInput: true,
      *   showPalette: true,
      *   palette: [["red", "rgba(0, 255, 0, .5)", "rgb(0, 0, 255)"]]
      * });
      * $("#preferredName").spectrum({
      *   preferredFormat: "name",
      *   showInput: true,
      *   showPalette: true,
      *   palette: [["red", "rgba(0, 255, 0, .5)", "rgb(0, 0, 255)"]]
      * });
      * $("#preferredNone").spectrum({
      *   showInput: true,
      *   showPalette: true,
      *   palette: [["red", "rgba(0, 255, 0, .5)", "rgb(0, 0, 255)"]]
      * });
      * ```
      */
    var preferredFormat: js.UndefOr[ColorFormatName | `false`] = js.undefined
    
    /**
      * Adds an additional class name to just the replacer element.
      *
      * ```javascript
      * $("#replacerClassName").spectrum({
      *   replacerClassName: 'awesome'
      * });
      * ```
      *
      * ```css
      * .awesome {
      *   background: purple;
      * }
      * ```
      */
    var replacerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The default values inside of the selection palette. Make sure that
      * `showSelectionPalette` and `showPalette` are both enabled.
      *
      * If a `localStorageKey` is defined, then this value will be
      * overwritten by it.
      *
      * The following example shows a color picker with red, green, and blue
      * available in the selection palette by default:
      *
      * ```javascript
      * $("#selectionPalette").spectrum({
      *     showPalette: true,
      *     palette: [ ],
      *     showSelectionPalette: true, // true by default
      *     selectionPalette: ["red", "green", "blue"]
      * });
      * ```
      */
    var selectionPalette: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Called after the color picker is opened. This is ignored on a flat
      * color picker.
      *
      * Note: When any color picker on the page is shown, it will hide all
      * other color pickers that are already open.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   show: function(color) {
      *     color.toHexString(); // #ff0000
      *   }
      * }
      * ```
      *
      * @param color The currently selected color of the color picker.
      */
    var show: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.undefined
    
    /**
      * Allows alpha transparency selection.
      *
      * ```javascript
      * $("#showAlpha").spectrum({
      *   showAlpha: true
      * });
      * ```
      */
    var showAlpha: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Toggles the choose / cancel buttons.
      *
      * If there are no buttons, the behavior will be to fire the `change`
      * event (and update the original input) when the picker is closed.
      *
      * ```javascript
      * $("#hideButtons").spectrum({
      *   showButtons: false
      * });
      * ```
      */
    var showButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shows the color that was initially set when opening. This provides an
      * easy way to click back to what was set when opened.
      *
      * ```javascript
      * $("#showInitial").spectrum({
      *   showInitial: true
      * });
      * ```
      */
    var showInitial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds an input to allow for free form typing. The color parsing is
      * very permissive in the allowed strings. See
      * [TinyColor](https://github.com/bgrins/TinyColor) for more details.
      *
      * ```javascript
      * $("#showInput").spectrum({
      *   showInput: true
      * });
      * $("#showInputWithClear").spectrum({
      *   showInput: true,
      *   allowEmpty:true
      * });
      * ```
      */
    var showInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Spectrum can show a palette below the color picker to make it
      * convenient for users to choose from frequently or recently used colors.
      *
      * When the color picker is closed, the current color will be added to
      * the palette if it is not there already.
      *
      * ```javascript
      * $("#showPalette").spectrum({
      *   showPalette: true,
      *   palette: [
      *     ['black', 'white', 'blanchedalmond'],
      *     ['rgb(255, 128, 0);', 'hsv 100 70 50', 'lightyellow']
      *   ]
      * });
      * ```
      */
    var showPalette: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shows only the colors specified in the palette.
      *
      * ```javascript
      * $("#showPaletteOnly").spectrum({
      *   showPaletteOnly: true,
      *   showPalette:true,
      *   color: 'blanchedalmond',
      *   palette: [
      *     ['black', 'white', 'blanchedalmond',
      *     'rgb(255, 128, 0);', 'hsv 100 70 50'],
      *     ['red', 'yellow', 'green', 'blue', 'violet']
      *   ]
      * });
      * ```
      */
    var showPaletteOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Keeps track of what has been selected by the user.
      *
      * Spectrum can keep track of what has been selected by the user with
      * the `showSelectionPalette` option.
      *
      * If the `localStorageKey` option is defined, the selection will be
      * saved in the browser's `localStorage` object.
      *
      * ```javascript
      * $("#showSelectionPalette").spectrum({
      *   showPalette: true,
      *   showSelectionPalette: true, // true by default
      *   palette: [ ]
      * });
      * $("#showSelectionPaletteStorage").spectrum({
      *   showPalette: true,
      *   showSelectionPalette: true,
      *   palette: [ ],
      *   localStorageKey: "spectrum.homepage", // Any Spectrum with the same string will share selection
      * });
      * ```
      */
    var showSelectionPalette: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Changes the text on the close-toggle color picker button. Defaults to
      * `less`.
      */
    var togglePaletteLessText: js.UndefOr[String] = js.undefined
    
    /**
      * Changes the text on the open-toggle color picker button. Defaults to
      * `more`.
      */
    var togglePaletteMoreText: js.UndefOr[String] = js.undefined
    
    /**
      * Shows a button to toggle the color picker next to the palette.
      *
      * This way, the user can choose from a limited number of colors in the
      * palette, but still be able to pick a color that's not in the palette.
      *
      * The default value for `togglePaletteOnly` is `false`. Set it to
      * `true` to enable the toggle button.
      *
      * You can also change the text on the toggle button with the options
      * `togglePaletteMoreText` (default is `more`) and
      * `togglePaletteLessText` (default is `less`).
      *
      * ```javascript
      * $("#togglePaletteOnly").spectrum({
      *   showPaletteOnly: true,
      *   togglePaletteOnly: true,
      *   togglePaletteMoreText: 'more',
      *   togglePaletteLessText: 'less',
      *   color: 'blanchedalmond',
      *   palette: [
      *     ["#000","#444","#666","#999","#ccc","#eee","#f3f3f3","#fff"],
      *     ["#f00","#f90","#ff0","#0f0","#0ff","#00f","#90f","#f0f"],
      *     ["#f4cccc","#fce5cd","#fff2cc","#d9ead3","#d0e0e3","#cfe2f3","#d9d2e9","#ead1dc"],
      *     ["#ea9999","#f9cb9c","#ffe599","#b6d7a8","#a2c4c9","#9fc5e8","#b4a7d6","#d5a6bd"],
      *     ["#e06666","#f6b26b","#ffd966","#93c47d","#76a5af","#6fa8dc","#8e7cc3","#c27ba0"],
      *     ["#c00","#e69138","#f1c232","#6aa84f","#45818e","#3d85c6","#674ea7","#a64d79"],
      *     ["#900","#b45f06","#bf9000","#38761d","#134f5c","#0b5394","#351c75","#741b47"],
      *     ["#600","#783f04","#7f6000","#274e13","#0c343d","#073763","#20124d","#4c1130"]
      *   ]
      * });
      * ```
      */
    var togglePaletteOnly: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setAppendTo(value: Selector | htmlString | (TypeOrArray[Element | DocumentFragment]) | JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAppendToVarargs(value: (Element | DocumentFragment)*): Self = StObject.set(x, "appendTo", js.Array(value*))
      
      inline def setBeforeShow(value: /* color */ Instance => Boolean | Unit): Self = StObject.set(x, "beforeShow", js.Any.fromFunction1(value))
      
      inline def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setChange(value: /* color */ Instance => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setChooseText(value: String): Self = StObject.set(x, "chooseText", value.asInstanceOf[js.Any])
      
      inline def setChooseTextUndefined: Self = StObject.set(x, "chooseText", js.undefined)
      
      inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
      
      inline def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
      
      inline def setClickoutFiresChange(value: Boolean): Self = StObject.set(x, "clickoutFiresChange", value.asInstanceOf[js.Any])
      
      inline def setClickoutFiresChangeUndefined: Self = StObject.set(x, "clickoutFiresChange", js.undefined)
      
      inline def setColor(value: String | `false`): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setHide(value: /* color */ Instance => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      inline def setHideAfterPaletteSelect(value: Boolean): Self = StObject.set(x, "hideAfterPaletteSelect", value.asInstanceOf[js.Any])
      
      inline def setHideAfterPaletteSelectUndefined: Self = StObject.set(x, "hideAfterPaletteSelect", js.undefined)
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setLocalStorageKey(value: String | `false`): Self = StObject.set(x, "localStorageKey", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageKeyUndefined: Self = StObject.set(x, "localStorageKey", js.undefined)
      
      inline def setMaxSelectionSize(value: Double): Self = StObject.set(x, "maxSelectionSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSelectionSizeUndefined: Self = StObject.set(x, "maxSelectionSize", js.undefined)
      
      inline def setMove(value: /* color */ Instance => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setNoColorSelectedText(value: String): Self = StObject.set(x, "noColorSelectedText", value.asInstanceOf[js.Any])
      
      inline def setNoColorSelectedTextUndefined: Self = StObject.set(x, "noColorSelectedText", js.undefined)
      
      inline def setOffset(value: CoordinatesPartial): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetNull: Self = StObject.set(x, "offset", null)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPalette(value: js.Array[js.Array[String]]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPaletteVarargs(value: js.Array[String]*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setPreferredFormat(value: ColorFormatName | `false`): Self = StObject.set(x, "preferredFormat", value.asInstanceOf[js.Any])
      
      inline def setPreferredFormatUndefined: Self = StObject.set(x, "preferredFormat", js.undefined)
      
      inline def setReplacerClassName(value: String): Self = StObject.set(x, "replacerClassName", value.asInstanceOf[js.Any])
      
      inline def setReplacerClassNameUndefined: Self = StObject.set(x, "replacerClassName", js.undefined)
      
      inline def setSelectionPalette(value: js.Array[String]): Self = StObject.set(x, "selectionPalette", value.asInstanceOf[js.Any])
      
      inline def setSelectionPaletteUndefined: Self = StObject.set(x, "selectionPalette", js.undefined)
      
      inline def setSelectionPaletteVarargs(value: String*): Self = StObject.set(x, "selectionPalette", js.Array(value*))
      
      inline def setShow(value: /* color */ Instance => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowAlpha(value: Boolean): Self = StObject.set(x, "showAlpha", value.asInstanceOf[js.Any])
      
      inline def setShowAlphaUndefined: Self = StObject.set(x, "showAlpha", js.undefined)
      
      inline def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      inline def setShowInitial(value: Boolean): Self = StObject.set(x, "showInitial", value.asInstanceOf[js.Any])
      
      inline def setShowInitialUndefined: Self = StObject.set(x, "showInitial", js.undefined)
      
      inline def setShowInput(value: Boolean): Self = StObject.set(x, "showInput", value.asInstanceOf[js.Any])
      
      inline def setShowInputUndefined: Self = StObject.set(x, "showInput", js.undefined)
      
      inline def setShowPalette(value: Boolean): Self = StObject.set(x, "showPalette", value.asInstanceOf[js.Any])
      
      inline def setShowPaletteOnly(value: Boolean): Self = StObject.set(x, "showPaletteOnly", value.asInstanceOf[js.Any])
      
      inline def setShowPaletteOnlyUndefined: Self = StObject.set(x, "showPaletteOnly", js.undefined)
      
      inline def setShowPaletteUndefined: Self = StObject.set(x, "showPalette", js.undefined)
      
      inline def setShowSelectionPalette(value: Boolean): Self = StObject.set(x, "showSelectionPalette", value.asInstanceOf[js.Any])
      
      inline def setShowSelectionPaletteUndefined: Self = StObject.set(x, "showSelectionPalette", js.undefined)
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTogglePaletteLessText(value: String): Self = StObject.set(x, "togglePaletteLessText", value.asInstanceOf[js.Any])
      
      inline def setTogglePaletteLessTextUndefined: Self = StObject.set(x, "togglePaletteLessText", js.undefined)
      
      inline def setTogglePaletteMoreText(value: String): Self = StObject.set(x, "togglePaletteMoreText", value.asInstanceOf[js.Any])
      
      inline def setTogglePaletteMoreTextUndefined: Self = StObject.set(x, "togglePaletteMoreText", js.undefined)
      
      inline def setTogglePaletteOnly(value: Boolean): Self = StObject.set(x, "togglePaletteOnly", value.asInstanceOf[js.Any])
      
      inline def setTogglePaletteOnlyUndefined: Self = StObject.set(x, "togglePaletteOnly", js.undefined)
    }
  }
  
  /**
    * Called after the color picker is opened. This is ignored on a flat color
    * picker.
    *
    * Note: When any color picker on the page is shown, it will hide all other
    * color pickers that are already open.
    *
    * The callback will receive an additional argument of type
    * `tinycolor.Instance` with the currently selected color.
    *
    * ```javascript
    * $("#picker").spectrum({
    *   show: function(color) {
    *     color.toHexString(); // #ff0000
    *   }
    * }
    * ```
    */
  trait ShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    extends StObject
       with EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
    
    @JSName("type")
    var type_ShowEvent: show
  }
  object ShowEvent {
    
    inline def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
      altKey: Unit,
      bubbles: Boolean,
      button: Unit,
      buttons: Unit,
      cancelable: Boolean,
      changedTouches: Unit,
      char: Unit,
      charCode: Unit,
      clientX: Unit,
      clientY: Unit,
      ctrlKey: Unit,
      currentTarget: TCurrentTarget,
      data: TData,
      delegateTarget: TDelegateTarget,
      detail: Unit,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isImmediatePropagationStopped: () => Boolean,
      isPropagationStopped: () => Boolean,
      key: Unit,
      keyCode: Unit,
      metaKey: Unit,
      offsetX: Unit,
      offsetY: Unit,
      pageX: Unit,
      pageY: Unit,
      pointerId: Unit,
      pointerType: Unit,
      preventDefault: () => Unit,
      relatedTarget: Unit,
      screenX: Unit,
      screenY: Unit,
      shiftKey: Unit,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      target: TTarget,
      targetTouches: Unit,
      timeStamp: Double,
      toElement: Unit,
      touches: Unit,
      view: Unit,
      which: Unit
    ): ShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("show")
      __obj.asInstanceOf[ShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    }
    
    extension [Self <: ShowEvent[?, ?, ?, ?], TDelegateTarget, TData, TCurrentTarget, TTarget](x: Self & (ShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) {
      
      inline def setType(value: show): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
