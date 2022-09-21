package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildFeatures extends StObject {
  
  /**
    * Every component has a render function
    */
  var allRenderFn: Boolean
  
  var asyncLoading: Boolean
  
  var cmpDidLoad: Boolean
  
  var cmpDidRender: Boolean
  
  var cmpDidUnload: Boolean
  
  var cmpDidUpdate: Boolean
  
  var cmpShouldUpdate: Boolean
  
  var cmpWillLoad: Boolean
  
  var cmpWillRender: Boolean
  
  var cmpWillUpdate: Boolean
  
  var connectedCallback: Boolean
  
  var disconnectedCallback: Boolean
  
  var element: Boolean
  
  var event: Boolean
  
  /**
    * At least one component has a render function
    */
  var hasRenderFn: Boolean
  
  var hostListener: Boolean
  
  var hostListenerTarget: Boolean
  
  var hostListenerTargetBody: Boolean
  
  var hostListenerTargetDocument: Boolean
  
  /**
    * @deprecated Prevented from new apps, but left in for older collections
    */
  var hostListenerTargetParent: Boolean
  
  var hostListenerTargetWindow: Boolean
  
  var lifecycle: Boolean
  
  var member: Boolean
  
  var method: Boolean
  
  var mode: Boolean
  
  var observeAttribute: Boolean
  
  var prop: Boolean
  
  var propBoolean: Boolean
  
  var propMutable: Boolean
  
  var propNumber: Boolean
  
  var propString: Boolean
  
  var reflect: Boolean
  
  var scoped: Boolean
  
  var shadowDelegatesFocus: Boolean
  
  var shadowDom: Boolean
  
  var slot: Boolean
  
  var slotRelocation: Boolean
  
  var state: Boolean
  
  var style: Boolean
  
  var svg: Boolean
  
  var taskQueue: Boolean
  
  var updatable: Boolean
  
  var vdomAttribute: Boolean
  
  var vdomClass: Boolean
  
  var vdomFunctional: Boolean
  
  var vdomKey: Boolean
  
  var vdomListener: Boolean
  
  var vdomPropOrAttr: Boolean
  
  var vdomRef: Boolean
  
  var vdomRender: Boolean
  
  var vdomStyle: Boolean
  
  var vdomText: Boolean
  
  var vdomXlink: Boolean
  
  var watchCallback: Boolean
}
object BuildFeatures {
  
  inline def apply(
    allRenderFn: Boolean,
    asyncLoading: Boolean,
    cmpDidLoad: Boolean,
    cmpDidRender: Boolean,
    cmpDidUnload: Boolean,
    cmpDidUpdate: Boolean,
    cmpShouldUpdate: Boolean,
    cmpWillLoad: Boolean,
    cmpWillRender: Boolean,
    cmpWillUpdate: Boolean,
    connectedCallback: Boolean,
    disconnectedCallback: Boolean,
    element: Boolean,
    event: Boolean,
    hasRenderFn: Boolean,
    hostListener: Boolean,
    hostListenerTarget: Boolean,
    hostListenerTargetBody: Boolean,
    hostListenerTargetDocument: Boolean,
    hostListenerTargetParent: Boolean,
    hostListenerTargetWindow: Boolean,
    lifecycle: Boolean,
    member: Boolean,
    method: Boolean,
    mode: Boolean,
    observeAttribute: Boolean,
    prop: Boolean,
    propBoolean: Boolean,
    propMutable: Boolean,
    propNumber: Boolean,
    propString: Boolean,
    reflect: Boolean,
    scoped: Boolean,
    shadowDelegatesFocus: Boolean,
    shadowDom: Boolean,
    slot: Boolean,
    slotRelocation: Boolean,
    state: Boolean,
    style: Boolean,
    svg: Boolean,
    taskQueue: Boolean,
    updatable: Boolean,
    vdomAttribute: Boolean,
    vdomClass: Boolean,
    vdomFunctional: Boolean,
    vdomKey: Boolean,
    vdomListener: Boolean,
    vdomPropOrAttr: Boolean,
    vdomRef: Boolean,
    vdomRender: Boolean,
    vdomStyle: Boolean,
    vdomText: Boolean,
    vdomXlink: Boolean,
    watchCallback: Boolean
  ): BuildFeatures = {
    val __obj = js.Dynamic.literal(allRenderFn = allRenderFn.asInstanceOf[js.Any], asyncLoading = asyncLoading.asInstanceOf[js.Any], cmpDidLoad = cmpDidLoad.asInstanceOf[js.Any], cmpDidRender = cmpDidRender.asInstanceOf[js.Any], cmpDidUnload = cmpDidUnload.asInstanceOf[js.Any], cmpDidUpdate = cmpDidUpdate.asInstanceOf[js.Any], cmpShouldUpdate = cmpShouldUpdate.asInstanceOf[js.Any], cmpWillLoad = cmpWillLoad.asInstanceOf[js.Any], cmpWillRender = cmpWillRender.asInstanceOf[js.Any], cmpWillUpdate = cmpWillUpdate.asInstanceOf[js.Any], connectedCallback = connectedCallback.asInstanceOf[js.Any], disconnectedCallback = disconnectedCallback.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], hasRenderFn = hasRenderFn.asInstanceOf[js.Any], hostListener = hostListener.asInstanceOf[js.Any], hostListenerTarget = hostListenerTarget.asInstanceOf[js.Any], hostListenerTargetBody = hostListenerTargetBody.asInstanceOf[js.Any], hostListenerTargetDocument = hostListenerTargetDocument.asInstanceOf[js.Any], hostListenerTargetParent = hostListenerTargetParent.asInstanceOf[js.Any], hostListenerTargetWindow = hostListenerTargetWindow.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], member = member.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], observeAttribute = observeAttribute.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], propBoolean = propBoolean.asInstanceOf[js.Any], propMutable = propMutable.asInstanceOf[js.Any], propNumber = propNumber.asInstanceOf[js.Any], propString = propString.asInstanceOf[js.Any], reflect = reflect.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], shadowDelegatesFocus = shadowDelegatesFocus.asInstanceOf[js.Any], shadowDom = shadowDom.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], slotRelocation = slotRelocation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], taskQueue = taskQueue.asInstanceOf[js.Any], updatable = updatable.asInstanceOf[js.Any], vdomAttribute = vdomAttribute.asInstanceOf[js.Any], vdomClass = vdomClass.asInstanceOf[js.Any], vdomFunctional = vdomFunctional.asInstanceOf[js.Any], vdomKey = vdomKey.asInstanceOf[js.Any], vdomListener = vdomListener.asInstanceOf[js.Any], vdomPropOrAttr = vdomPropOrAttr.asInstanceOf[js.Any], vdomRef = vdomRef.asInstanceOf[js.Any], vdomRender = vdomRender.asInstanceOf[js.Any], vdomStyle = vdomStyle.asInstanceOf[js.Any], vdomText = vdomText.asInstanceOf[js.Any], vdomXlink = vdomXlink.asInstanceOf[js.Any], watchCallback = watchCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildFeatures]
  }
  
  extension [Self <: BuildFeatures](x: Self) {
    
    inline def setAllRenderFn(value: Boolean): Self = StObject.set(x, "allRenderFn", value.asInstanceOf[js.Any])
    
    inline def setAsyncLoading(value: Boolean): Self = StObject.set(x, "asyncLoading", value.asInstanceOf[js.Any])
    
    inline def setCmpDidLoad(value: Boolean): Self = StObject.set(x, "cmpDidLoad", value.asInstanceOf[js.Any])
    
    inline def setCmpDidRender(value: Boolean): Self = StObject.set(x, "cmpDidRender", value.asInstanceOf[js.Any])
    
    inline def setCmpDidUnload(value: Boolean): Self = StObject.set(x, "cmpDidUnload", value.asInstanceOf[js.Any])
    
    inline def setCmpDidUpdate(value: Boolean): Self = StObject.set(x, "cmpDidUpdate", value.asInstanceOf[js.Any])
    
    inline def setCmpShouldUpdate(value: Boolean): Self = StObject.set(x, "cmpShouldUpdate", value.asInstanceOf[js.Any])
    
    inline def setCmpWillLoad(value: Boolean): Self = StObject.set(x, "cmpWillLoad", value.asInstanceOf[js.Any])
    
    inline def setCmpWillRender(value: Boolean): Self = StObject.set(x, "cmpWillRender", value.asInstanceOf[js.Any])
    
    inline def setCmpWillUpdate(value: Boolean): Self = StObject.set(x, "cmpWillUpdate", value.asInstanceOf[js.Any])
    
    inline def setConnectedCallback(value: Boolean): Self = StObject.set(x, "connectedCallback", value.asInstanceOf[js.Any])
    
    inline def setDisconnectedCallback(value: Boolean): Self = StObject.set(x, "disconnectedCallback", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Boolean): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Boolean): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setHasRenderFn(value: Boolean): Self = StObject.set(x, "hasRenderFn", value.asInstanceOf[js.Any])
    
    inline def setHostListener(value: Boolean): Self = StObject.set(x, "hostListener", value.asInstanceOf[js.Any])
    
    inline def setHostListenerTarget(value: Boolean): Self = StObject.set(x, "hostListenerTarget", value.asInstanceOf[js.Any])
    
    inline def setHostListenerTargetBody(value: Boolean): Self = StObject.set(x, "hostListenerTargetBody", value.asInstanceOf[js.Any])
    
    inline def setHostListenerTargetDocument(value: Boolean): Self = StObject.set(x, "hostListenerTargetDocument", value.asInstanceOf[js.Any])
    
    inline def setHostListenerTargetParent(value: Boolean): Self = StObject.set(x, "hostListenerTargetParent", value.asInstanceOf[js.Any])
    
    inline def setHostListenerTargetWindow(value: Boolean): Self = StObject.set(x, "hostListenerTargetWindow", value.asInstanceOf[js.Any])
    
    inline def setLifecycle(value: Boolean): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setMember(value: Boolean): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Boolean): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setObserveAttribute(value: Boolean): Self = StObject.set(x, "observeAttribute", value.asInstanceOf[js.Any])
    
    inline def setProp(value: Boolean): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    inline def setPropBoolean(value: Boolean): Self = StObject.set(x, "propBoolean", value.asInstanceOf[js.Any])
    
    inline def setPropMutable(value: Boolean): Self = StObject.set(x, "propMutable", value.asInstanceOf[js.Any])
    
    inline def setPropNumber(value: Boolean): Self = StObject.set(x, "propNumber", value.asInstanceOf[js.Any])
    
    inline def setPropString(value: Boolean): Self = StObject.set(x, "propString", value.asInstanceOf[js.Any])
    
    inline def setReflect(value: Boolean): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setShadowDelegatesFocus(value: Boolean): Self = StObject.set(x, "shadowDelegatesFocus", value.asInstanceOf[js.Any])
    
    inline def setShadowDom(value: Boolean): Self = StObject.set(x, "shadowDom", value.asInstanceOf[js.Any])
    
    inline def setSlot(value: Boolean): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotRelocation(value: Boolean): Self = StObject.set(x, "slotRelocation", value.asInstanceOf[js.Any])
    
    inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setTaskQueue(value: Boolean): Self = StObject.set(x, "taskQueue", value.asInstanceOf[js.Any])
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setVdomAttribute(value: Boolean): Self = StObject.set(x, "vdomAttribute", value.asInstanceOf[js.Any])
    
    inline def setVdomClass(value: Boolean): Self = StObject.set(x, "vdomClass", value.asInstanceOf[js.Any])
    
    inline def setVdomFunctional(value: Boolean): Self = StObject.set(x, "vdomFunctional", value.asInstanceOf[js.Any])
    
    inline def setVdomKey(value: Boolean): Self = StObject.set(x, "vdomKey", value.asInstanceOf[js.Any])
    
    inline def setVdomListener(value: Boolean): Self = StObject.set(x, "vdomListener", value.asInstanceOf[js.Any])
    
    inline def setVdomPropOrAttr(value: Boolean): Self = StObject.set(x, "vdomPropOrAttr", value.asInstanceOf[js.Any])
    
    inline def setVdomRef(value: Boolean): Self = StObject.set(x, "vdomRef", value.asInstanceOf[js.Any])
    
    inline def setVdomRender(value: Boolean): Self = StObject.set(x, "vdomRender", value.asInstanceOf[js.Any])
    
    inline def setVdomStyle(value: Boolean): Self = StObject.set(x, "vdomStyle", value.asInstanceOf[js.Any])
    
    inline def setVdomText(value: Boolean): Self = StObject.set(x, "vdomText", value.asInstanceOf[js.Any])
    
    inline def setVdomXlink(value: Boolean): Self = StObject.set(x, "vdomXlink", value.asInstanceOf[js.Any])
    
    inline def setWatchCallback(value: Boolean): Self = StObject.set(x, "watchCallback", value.asInstanceOf[js.Any])
  }
}
