package typings.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable4
import typings.react.mod.AbstractView
import typings.react.mod.Context
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativePointerEvent
import typings.react.mod.NativeWheelEvent
import typings.react.mod.ReactNode
import typings.reactThreeFiber.anon.OffsetX
import typings.reactThreeFiber.anon.PartialRaycasterfilterFil
import typings.reactThreeFiber.anon.PartialWebGLRendererParam
import typings.reactThreeFiber.anon.PartialWebGLShadowMap
import typings.reactThreeFiber.anon.Resize
import typings.reactThreeFiber.reactThreeFiberStrings.mouse
import typings.reactThreeFiber.reactThreeFiberStrings.pen
import typings.reactThreeFiber.reactThreeFiberStrings.touch
import typings.reactThreeFiber.threeTypesMod.NamedArrayTuple
import typings.reactThreeFiber.threeTypesMod.Object3DNode
import typings.reactUseMeasure.mod.RectReadOnly
import typings.std.Element
import typings.std.EventTarget
import typings.std.Partial
import typings.three.face3Mod.Face3
import typings.three.mod.Clock
import typings.three.mod.Object3D
import typings.three.mod.OrthographicCamera
import typings.three.mod.PerspectiveCamera
import typings.three.mod.Ray
import typings.three.mod.Raycaster
import typings.three.mod.Scene
import typings.three.mod.Vector2
import typings.three.mod.WebGLRenderer
import typings.three.vector3Mod.Vector3
import typings.tinyEmitter.mod.TinyEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("react-three-fiber/canvas", "isOrthographicCamera")
  @js.native
  def isOrthographicCamera(`def`: typings.three.mod.Camera): /* is three.three.OrthographicCamera */ Boolean = js.native
  
  @JSImport("react-three-fiber/canvas", "stateContext")
  @js.native
  val stateContext: Context[SharedCanvasContext] = js.native
  
  @JSImport("react-three-fiber/canvas", "useCanvas")
  @js.native
  def useCanvas(props: UseCanvasProps): DomEventHandlers = js.native
  
  type Camera = OrthographicCamera | PerspectiveCamera
  
  /* Inlined react-three-fiber.react-three-fiber/canvas.SharedCanvasContext & {  captured :std.Array<react-three-fiber.react-three-fiber/canvas.Intersection> | undefined,   noEvents :boolean,   ready :boolean,   active :boolean,   manual :number,   colorManagement :boolean,   vr :boolean,   concurrent :boolean,   invalidateFrameloop :boolean,   frames :number,   subscribers :std.Array<react-three-fiber.react-three-fiber/canvas.Subscription>,   initialClick :react-three-fiber.react-three-fiber/three-types.NamedArrayTuple<(x : number, y : number): void>,   initialHits :std.Array<three.three.Object3D>,   pointer :tiny-emitter.tiny-emitter.TinyEmitter} */
  @js.native
  trait CanvasContext extends StObject {
    
    var active: Boolean = js.native
    
    var aspect: Double = js.native
    
    var camera: Camera = js.native
    
    var captured: js.UndefOr[js.Array[Intersection]] = js.native
    
    var clock: Clock = js.native
    
    var colorManagement: Boolean = js.native
    
    var concurrent: Boolean = js.native
    
    var events: DomEventHandlers = js.native
    
    def forceResize(): Unit = js.native
    
    var frames: Double = js.native
    
    var gl: WebGLRenderer = js.native
    
    var initialClick: NamedArrayTuple[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
    
    var initialHits: js.Array[Object3D] = js.native
    
    def intersect(): Unit = js.native
    def intersect(event: DomEvent): Unit = js.native
    
    def invalidate(): Unit = js.native
    
    var invalidateFrameloop: Boolean = js.native
    
    var manual: Double = js.native
    
    var mouse: Vector2 = js.native
    
    var noEvents: Boolean = js.native
    
    var pointer: TinyEmitter = js.native
    
    var raycaster: Raycaster = js.native
    
    var ready: Boolean = js.native
    
    var scene: Scene = js.native
    
    def setDefaultCamera(camera: Camera): Unit = js.native
    
    var size: RectReadOnly = js.native
    
    def subscribe(callback: MutableRefObject[RenderCallback]): js.Function0[Unit] = js.native
    def subscribe(callback: MutableRefObject[RenderCallback], priority: Double): js.Function0[Unit] = js.native
    
    var subscribers: js.Array[Subscription] = js.native
    
    var viewport: ViewportData = js.native
    
    var vr: Boolean = js.native
  }
  
  @js.native
  trait CanvasProps extends StObject {
    
    var camera: js.UndefOr[
        Partial[
          (Object3DNode[typings.three.mod.Camera, Instantiable0[typings.three.mod.Camera]]) with (Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]) with (Object3DNode[
            OrthographicCamera, 
            Instantiable4[
              /* left */ Double, 
              /* right */ Double, 
              /* top */ Double, 
              /* bottom */ Double, 
              OrthographicCamera
            ]
          ])
        ]
      ] = js.native
    
    var children: ReactNode = js.native
    
    var colorManagement: js.UndefOr[Boolean] = js.native
    
    var concurrent: js.UndefOr[Boolean] = js.native
    
    var gl: js.UndefOr[PartialWebGLRendererParam] = js.native
    
    var invalidateFrameloop: js.UndefOr[Boolean] = js.native
    
    var noEvents: js.UndefOr[Boolean] = js.native
    
    var onCreated: js.UndefOr[js.Function1[/* props */ CanvasContext, js.Promise[_] | Unit]] = js.native
    
    var onPointerMissed: js.UndefOr[js.Function0[Unit]] = js.native
    
    var orthographic: js.UndefOr[Boolean] = js.native
    
    var pixelRatio: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
    
    var raycaster: js.UndefOr[PartialRaycasterfilterFil] = js.native
    
    var resize: js.UndefOr[ResizeOptions] = js.native
    
    var shadowMap: js.UndefOr[Boolean | PartialWebGLShadowMap] = js.native
    
    var updateDefaultCamera: js.UndefOr[Boolean] = js.native
    
    var vr: js.UndefOr[Boolean] = js.native
    
    var webgl1: js.UndefOr[Boolean] = js.native
  }
  object CanvasProps {
    
    @scala.inline
    def apply(): CanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasProps]
    }
    
    @scala.inline
    implicit class CanvasPropsMutableBuilder[Self <: CanvasProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamera(
        value: Partial[
              (Object3DNode[typings.three.mod.Camera, Instantiable0[typings.three.mod.Camera]]) with (Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]) with (Object3DNode[
                OrthographicCamera, 
                Instantiable4[
                  /* left */ Double, 
                  /* right */ Double, 
                  /* top */ Double, 
                  /* bottom */ Double, 
                  OrthographicCamera
                ]
              ])
            ]
      ): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColorManagement(value: Boolean): Self = StObject.set(x, "colorManagement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorManagementUndefined: Self = StObject.set(x, "colorManagement", js.undefined)
      
      @scala.inline
      def setConcurrent(value: Boolean): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
      
      @scala.inline
      def setGl(value: PartialWebGLRendererParam): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
      
      @scala.inline
      def setInvalidateFrameloop(value: Boolean): Self = StObject.set(x, "invalidateFrameloop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidateFrameloopUndefined: Self = StObject.set(x, "invalidateFrameloop", js.undefined)
      
      @scala.inline
      def setNoEvents(value: Boolean): Self = StObject.set(x, "noEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEventsUndefined: Self = StObject.set(x, "noEvents", js.undefined)
      
      @scala.inline
      def setOnCreated(value: /* props */ CanvasContext => js.Promise[_] | Unit): Self = StObject.set(x, "onCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreatedUndefined: Self = StObject.set(x, "onCreated", js.undefined)
      
      @scala.inline
      def setOnPointerMissed(value: () => Unit): Self = StObject.set(x, "onPointerMissed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPointerMissedUndefined: Self = StObject.set(x, "onPointerMissed", js.undefined)
      
      @scala.inline
      def setOrthographic(value: Boolean): Self = StObject.set(x, "orthographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrthographicUndefined: Self = StObject.set(x, "orthographic", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setRaycaster(value: PartialRaycasterfilterFil): Self = StObject.set(x, "raycaster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaycasterUndefined: Self = StObject.set(x, "raycaster", js.undefined)
      
      @scala.inline
      def setResize(value: ResizeOptions): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setShadowMap(value: Boolean | PartialWebGLShadowMap): Self = StObject.set(x, "shadowMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowMapUndefined: Self = StObject.set(x, "shadowMap", js.undefined)
      
      @scala.inline
      def setUpdateDefaultCamera(value: Boolean): Self = StObject.set(x, "updateDefaultCamera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDefaultCameraUndefined: Self = StObject.set(x, "updateDefaultCamera", js.undefined)
      
      @scala.inline
      def setVr(value: Boolean): Self = StObject.set(x, "vr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVrUndefined: Self = StObject.set(x, "vr", js.undefined)
      
      @scala.inline
      def setWebgl1(value: Boolean): Self = StObject.set(x, "webgl1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebgl1Undefined: Self = StObject.set(x, "webgl1", js.undefined)
    }
  }
  
  type ComputeOffsetsFunction = js.Function1[/* event */ DomEvent, OffsetX]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactThreeFiber.canvasMod.PointerEvent
    - typings.reactThreeFiber.canvasMod.MouseEvent
    - typings.reactThreeFiber.canvasMod.WheelEvent
  */
  trait DomEvent extends StObject
  object DomEvent {
    
    @scala.inline
    def MouseEvent(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      camera: Camera,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget with Element,
      defaultPrevented: Boolean,
      delta: Double,
      detail: Double,
      distance: Double,
      eventObject: Object3D,
      eventPhase: Double,
      getModifierState: String => Boolean,
      intersections: js.Array[Intersection],
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      `object`: typings.three.object3DMod.Object3D,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      point: Vector3,
      preventDefault: () => Unit,
      ray: Ray,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      sourceEvent: typings.react.mod.MouseEvent[Element, NativeMouseEvent],
      stopPropagation: () => Unit,
      stopped: Boolean,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      unprojectedPoint: typings.three.mod.Vector3,
      view: AbstractView
    ): typings.reactThreeFiber.canvasMod.MouseEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactThreeFiber.canvasMod.MouseEvent]
    }
    
    @scala.inline
    def PointerEvent(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      camera: Camera,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget with Element,
      defaultPrevented: Boolean,
      delta: Double,
      detail: Double,
      distance: Double,
      eventObject: Object3D,
      eventPhase: Double,
      getModifierState: String => Boolean,
      height: Double,
      intersections: js.Array[Intersection],
      isDefaultPrevented: () => Boolean,
      isPrimary: Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativePointerEvent,
      `object`: typings.three.object3DMod.Object3D,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      point: Vector3,
      pointerId: Double,
      pointerType: mouse | pen | touch,
      pressure: Double,
      preventDefault: () => Unit,
      ray: Ray,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      sourceEvent: typings.react.mod.PointerEvent[Element],
      stopPropagation: () => Unit,
      stopped: Boolean,
      tangentialPressure: Double,
      target: EventTarget,
      tiltX: Double,
      tiltY: Double,
      timeStamp: Double,
      twist: Double,
      `type`: String,
      unprojectedPoint: typings.three.mod.Vector3,
      view: AbstractView,
      width: Double
    ): typings.reactThreeFiber.canvasMod.PointerEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), height = height.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPrimary = isPrimary.asInstanceOf[js.Any], isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], tangentialPressure = tangentialPressure.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactThreeFiber.canvasMod.PointerEvent]
    }
    
    @scala.inline
    def WheelEvent(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      camera: Camera,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget with Element,
      defaultPrevented: Boolean,
      delta: Double,
      deltaMode: Double,
      deltaX: Double,
      deltaY: Double,
      deltaZ: Double,
      detail: Double,
      distance: Double,
      eventObject: Object3D,
      eventPhase: Double,
      getModifierState: String => Boolean,
      intersections: js.Array[Intersection],
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeWheelEvent,
      `object`: typings.three.object3DMod.Object3D,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      point: Vector3,
      preventDefault: () => Unit,
      ray: Ray,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      sourceEvent: typings.react.mod.WheelEvent[Element],
      stopPropagation: () => Unit,
      stopped: Boolean,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      unprojectedPoint: typings.three.mod.Vector3,
      view: AbstractView
    ): typings.reactThreeFiber.canvasMod.WheelEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactThreeFiber.canvasMod.WheelEvent]
    }
  }
  
  @js.native
  trait DomEventHandlers extends StObject {
    
    def onClick(e: js.Any): Unit = js.native
    
    def onContextMenu(e: js.Any): Unit = js.native
    
    def onDoubleClick(e: js.Any): Unit = js.native
    
    def onGotPointerCaptureLegacy(e: js.Any): Unit = js.native
    
    def onLostPointerCapture(e: js.Any): Unit = js.native
    
    def onPointerDown(e: js.Any): Unit = js.native
    
    def onPointerLeave(e: js.Any): Unit = js.native
    
    def onPointerMove(e: js.Any): Unit = js.native
    
    def onPointerUp(e: js.Any): Unit = js.native
    
    def onWheel(e: js.Any): Unit = js.native
  }
  object DomEventHandlers {
    
    @scala.inline
    def apply(
      onClick: js.Any => Unit,
      onContextMenu: js.Any => Unit,
      onDoubleClick: js.Any => Unit,
      onGotPointerCaptureLegacy: js.Any => Unit,
      onLostPointerCapture: js.Any => Unit,
      onPointerDown: js.Any => Unit,
      onPointerLeave: js.Any => Unit,
      onPointerMove: js.Any => Unit,
      onPointerUp: js.Any => Unit,
      onWheel: js.Any => Unit
    ): DomEventHandlers = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onGotPointerCaptureLegacy = js.Any.fromFunction1(onGotPointerCaptureLegacy), onLostPointerCapture = js.Any.fromFunction1(onLostPointerCapture), onPointerDown = js.Any.fromFunction1(onPointerDown), onPointerLeave = js.Any.fromFunction1(onPointerLeave), onPointerMove = js.Any.fromFunction1(onPointerMove), onPointerUp = js.Any.fromFunction1(onPointerUp), onWheel = js.Any.fromFunction1(onWheel))
      __obj.asInstanceOf[DomEventHandlers]
    }
    
    @scala.inline
    implicit class DomEventHandlersMutableBuilder[Self <: DomEventHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenu(value: js.Any => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClick(value: js.Any => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGotPointerCaptureLegacy(value: js.Any => Unit): Self = StObject.set(x, "onGotPointerCaptureLegacy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLostPointerCapture(value: js.Any => Unit): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDown(value: js.Any => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeave(value: js.Any => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMove(value: js.Any => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUp(value: js.Any => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheel(value: js.Any => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    }
  }
  
  type FilterFunction = js.Function2[
    /* items */ js.Array[typings.three.raycasterMod.Intersection], 
    /* state */ SharedCanvasContext, 
    js.Array[typings.three.raycasterMod.Intersection]
  ]
  
  @js.native
  trait Intersection
    extends typings.three.raycasterMod.Intersection {
    
    var eventObject: Object3D = js.native
  }
  object Intersection {
    
    @scala.inline
    def apply(
      distance: Double,
      eventObject: Object3D,
      `object`: typings.three.object3DMod.Object3D,
      point: Vector3
    ): Intersection = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Intersection]
    }
    
    @scala.inline
    implicit class IntersectionMutableBuilder[Self <: Intersection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventObject(value: Object3D): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-three-fiber.react-three-fiber/canvas.ThreeEvent<react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>> */
  @js.native
  trait MouseEvent extends DomEvent {
    
    var altKey: Boolean = js.native
    
    var bubbles: Boolean = js.native
    
    var button: Double = js.native
    
    var buttons: Double = js.native
    
    var camera: Camera = js.native
    
    var cancelable: Boolean = js.native
    
    var clientX: Double = js.native
    
    var clientY: Double = js.native
    
    var ctrlKey: Boolean = js.native
    
    var currentTarget: EventTarget with Element = js.native
    
    var defaultPrevented: Boolean = js.native
    
    var delta: Double = js.native
    
    var detail: Double = js.native
    
    var distance: Double = js.native
    
    var distanceToRay: js.UndefOr[Double] = js.native
    
    var eventObject: Object3D = js.native
    
    var eventPhase: Double = js.native
    
    var face: js.UndefOr[Face3 | Null] = js.native
    
    var faceIndex: js.UndefOr[Double] = js.native
    
    /**
      * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
      */
    def getModifierState(key: String): Boolean = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var instanceId: js.UndefOr[Double] = js.native
    
    var intersections: js.Array[Intersection] = js.native
    
    def isDefaultPrevented(): Boolean = js.native
    
    def isPropagationStopped(): Boolean = js.native
    
    var isTrusted: Boolean = js.native
    
    var metaKey: Boolean = js.native
    
    var movementX: Double = js.native
    
    var movementY: Double = js.native
    
    var nativeEvent: NativeMouseEvent = js.native
    
    var `object`: typings.three.object3DMod.Object3D = js.native
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
    
    def persist(): Unit = js.native
    
    var point: Vector3 = js.native
    
    def preventDefault(): Unit = js.native
    
    var ray: Ray = js.native
    
    var relatedTarget: EventTarget | Null = js.native
    
    var screenX: Double = js.native
    
    var screenY: Double = js.native
    
    var shiftKey: Boolean = js.native
    
    var sourceEvent: typings.react.mod.MouseEvent[Element, NativeMouseEvent] = js.native
    
    def stopPropagation(): Unit = js.native
    
    var stopped: Boolean = js.native
    
    var target: EventTarget = js.native
    
    var timeStamp: Double = js.native
    
    var `type`: String = js.native
    
    var unprojectedPoint: typings.three.mod.Vector3 = js.native
    
    var uv: js.UndefOr[typings.three.vector2Mod.Vector2] = js.native
    
    var view: AbstractView = js.native
  }
  object MouseEvent {
    
    @scala.inline
    def apply(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      camera: Camera,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget with Element,
      defaultPrevented: Boolean,
      delta: Double,
      detail: Double,
      distance: Double,
      eventObject: Object3D,
      eventPhase: Double,
      getModifierState: String => Boolean,
      intersections: js.Array[Intersection],
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      `object`: typings.three.object3DMod.Object3D,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      point: Vector3,
      preventDefault: () => Unit,
      ray: Ray,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      sourceEvent: typings.react.mod.MouseEvent[Element, NativeMouseEvent],
      stopPropagation: () => Unit,
      stopped: Boolean,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      unprojectedPoint: typings.three.mod.Vector3,
      view: AbstractView
    ): MouseEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MouseEvent]
    }
    
    @scala.inline
    implicit class MouseEventMutableBuilder[Self <: MouseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTarget(value: EventTarget with Element): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToRay(value: Double): Self = StObject.set(x, "distanceToRay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToRayUndefined: Self = StObject.set(x, "distanceToRay", js.undefined)
      
      @scala.inline
      def setEventObject(value: Object3D): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFace(value: Face3): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIndexUndefined: Self = StObject.set(x, "faceIndex", js.undefined)
      
      @scala.inline
      def setFaceNull: Self = StObject.set(x, "face", null)
      
      @scala.inline
      def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
      
      @scala.inline
      def setGetModifierState(value: String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setIntersections(value: js.Array[Intersection]): Self = StObject.set(x, "intersections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectionsVarargs(value: Intersection*): Self = StObject.set(x, "intersections", js.Array(value :_*))
      
      @scala.inline
      def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeEvent(value: NativeMouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: typings.three.object3DMod.Object3D): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPoint(value: Vector3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRay(value: Ray): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
      
      @scala.inline
      def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceEvent(value: typings.react.mod.MouseEvent[Element, NativeMouseEvent]): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprojectedPoint(value: typings.three.mod.Vector3): Self = StObject.set(x, "unprojectedPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUv(value: typings.three.vector2Mod.Vector2): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
      
      @scala.inline
      def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-three-fiber.react-three-fiber/canvas.ThreeEvent<react.react.PointerEvent<std.Element>> */
  @js.native
  trait PointerEvent extends DomEvent {
    
    var altKey: Boolean = js.native
    
    var bubbles: Boolean = js.native
    
    var button: Double = js.native
    
    var buttons: Double = js.native
    
    var camera: Camera = js.native
    
    var cancelable: Boolean = js.native
    
    var clientX: Double = js.native
    
    var clientY: Double = js.native
    
    var ctrlKey: Boolean = js.native
    
    var currentTarget: EventTarget with Element = js.native
    
    var defaultPrevented: Boolean = js.native
    
    var delta: Double = js.native
    
    var detail: Double = js.native
    
    var distance: Double = js.native
    
    var distanceToRay: js.UndefOr[Double] = js.native
    
    var eventObject: Object3D = js.native
    
    var eventPhase: Double = js.native
    
    var face: js.UndefOr[Face3 | Null] = js.native
    
    var faceIndex: js.UndefOr[Double] = js.native
    
    /**
      * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
      */
    def getModifierState(key: String): Boolean = js.native
    
    var height: Double = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var instanceId: js.UndefOr[Double] = js.native
    
    var intersections: js.Array[Intersection] = js.native
    
    def isDefaultPrevented(): Boolean = js.native
    
    var isPrimary: Boolean = js.native
    
    def isPropagationStopped(): Boolean = js.native
    
    var isTrusted: Boolean = js.native
    
    var metaKey: Boolean = js.native
    
    var movementX: Double = js.native
    
    var movementY: Double = js.native
    
    var nativeEvent: NativePointerEvent = js.native
    
    var `object`: typings.three.object3DMod.Object3D = js.native
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
    
    def persist(): Unit = js.native
    
    var point: Vector3 = js.native
    
    var pointerId: Double = js.native
    
    var pointerType: mouse | pen | touch = js.native
    
    var pressure: Double = js.native
    
    def preventDefault(): Unit = js.native
    
    var ray: Ray = js.native
    
    var relatedTarget: EventTarget | Null = js.native
    
    var screenX: Double = js.native
    
    var screenY: Double = js.native
    
    var shiftKey: Boolean = js.native
    
    var sourceEvent: typings.react.mod.PointerEvent[Element] = js.native
    
    def stopPropagation(): Unit = js.native
    
    var stopped: Boolean = js.native
    
    var tangentialPressure: Double = js.native
    
    var target: EventTarget = js.native
    
    var tiltX: Double = js.native
    
    var tiltY: Double = js.native
    
    var timeStamp: Double = js.native
    
    var twist: Double = js.native
    
    var `type`: String = js.native
    
    var unprojectedPoint: typings.three.mod.Vector3 = js.native
    
    var uv: js.UndefOr[typings.three.vector2Mod.Vector2] = js.native
    
    var view: AbstractView = js.native
    
    var width: Double = js.native
  }
  object PointerEvent {
    
    @scala.inline
    def apply(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      camera: Camera,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget with Element,
      defaultPrevented: Boolean,
      delta: Double,
      detail: Double,
      distance: Double,
      eventObject: Object3D,
      eventPhase: Double,
      getModifierState: String => Boolean,
      height: Double,
      intersections: js.Array[Intersection],
      isDefaultPrevented: () => Boolean,
      isPrimary: Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativePointerEvent,
      `object`: typings.three.object3DMod.Object3D,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      point: Vector3,
      pointerId: Double,
      pointerType: mouse | pen | touch,
      pressure: Double,
      preventDefault: () => Unit,
      ray: Ray,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      sourceEvent: typings.react.mod.PointerEvent[Element],
      stopPropagation: () => Unit,
      stopped: Boolean,
      tangentialPressure: Double,
      target: EventTarget,
      tiltX: Double,
      tiltY: Double,
      timeStamp: Double,
      twist: Double,
      `type`: String,
      unprojectedPoint: typings.three.mod.Vector3,
      view: AbstractView,
      width: Double
    ): PointerEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), height = height.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPrimary = isPrimary.asInstanceOf[js.Any], isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], tangentialPressure = tangentialPressure.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerEvent]
    }
    
    @scala.inline
    implicit class PointerEventMutableBuilder[Self <: PointerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTarget(value: EventTarget with Element): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToRay(value: Double): Self = StObject.set(x, "distanceToRay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToRayUndefined: Self = StObject.set(x, "distanceToRay", js.undefined)
      
      @scala.inline
      def setEventObject(value: Object3D): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFace(value: Face3): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIndexUndefined: Self = StObject.set(x, "faceIndex", js.undefined)
      
      @scala.inline
      def setFaceNull: Self = StObject.set(x, "face", null)
      
      @scala.inline
      def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
      
      @scala.inline
      def setGetModifierState(value: String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setIntersections(value: js.Array[Intersection]): Self = StObject.set(x, "intersections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectionsVarargs(value: Intersection*): Self = StObject.set(x, "intersections", js.Array(value :_*))
      
      @scala.inline
      def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeEvent(value: NativePointerEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: typings.three.object3DMod.Object3D): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPoint(value: Vector3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerType(value: mouse | pen | touch): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRay(value: Ray): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
      
      @scala.inline
      def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceEvent(value: typings.react.mod.PointerEvent[Element]): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTangentialPressure(value: Double): Self = StObject.set(x, "tangentialPressure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprojectedPoint(value: typings.three.mod.Vector3): Self = StObject.set(x, "unprojectedPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUv(value: typings.three.vector2Mod.Vector2): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
      
      @scala.inline
      def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderCallback = js.Function2[/* state */ CanvasContext, /* delta */ Double, Unit]
  
  @js.native
  trait ResizeOptions extends StObject {
    
    var debounce: js.UndefOr[Double | Resize] = js.native
    
    var scroll: js.UndefOr[Boolean] = js.native
  }
  object ResizeOptions {
    
    @scala.inline
    def apply(): ResizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeOptions]
    }
    
    @scala.inline
    implicit class ResizeOptionsMutableBuilder[Self <: ResizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebounce(value: Double | Resize): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  @js.native
  trait SharedCanvasContext extends StObject {
    
    var aspect: Double = js.native
    
    var camera: Camera = js.native
    
    var clock: Clock = js.native
    
    var events: DomEventHandlers = js.native
    
    def forceResize(): Unit = js.native
    
    var gl: WebGLRenderer = js.native
    
    def intersect(): Unit = js.native
    def intersect(event: DomEvent): Unit = js.native
    
    def invalidate(): Unit = js.native
    
    var mouse: Vector2 = js.native
    
    var raycaster: Raycaster = js.native
    
    var scene: Scene = js.native
    
    def setDefaultCamera(camera: Camera): Unit = js.native
    
    var size: RectReadOnly = js.native
    
    def subscribe(callback: MutableRefObject[RenderCallback]): js.Function0[Unit] = js.native
    def subscribe(callback: MutableRefObject[RenderCallback], priority: Double): js.Function0[Unit] = js.native
    
    var viewport: ViewportData = js.native
  }
  
  @js.native
  trait Subscription extends StObject {
    
    var priority: Double = js.native
    
    var ref: MutableRefObject[RenderCallback] = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(priority: Double, ref: MutableRefObject[RenderCallback]): Subscription = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: MutableRefObject[RenderCallback]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  type ThreeEvent[T] = T with Intersection with typings.reactThreeFiber.anon.Camera[T]
  
  @js.native
  trait UseCanvasProps extends CanvasProps {
    
    def forceResize(): Unit = js.native
    
    @JSName("gl")
    var gl_UseCanvasProps: WebGLRenderer = js.native
    
    var size: RectReadOnly = js.native
  }
  object UseCanvasProps {
    
    @scala.inline
    def apply(forceResize: () => Unit, gl: WebGLRenderer, size: RectReadOnly): UseCanvasProps = {
      val __obj = js.Dynamic.literal(forceResize = js.Any.fromFunction0(forceResize), gl = gl.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseCanvasProps]
    }
    
    @scala.inline
    implicit class UseCanvasPropsMutableBuilder[Self <: UseCanvasProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceResize(value: () => Unit): Self = StObject.set(x, "forceResize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGl(value: WebGLRenderer): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: RectReadOnly): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Viewport extends StObject {
    
    var distance: Double = js.native
    
    var factor: Double = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Viewport {
    
    @scala.inline
    def apply(distance: Double, factor: Double, height: Double, width: Double): Viewport = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Viewport]
    }
    
    @scala.inline
    implicit class ViewportMutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type ViewportData = Viewport with (js.Function2[/* camera */ Camera, /* target */ typings.three.mod.Vector3, Viewport])
  
  /* Inlined react-three-fiber.react-three-fiber/canvas.ThreeEvent<react.react.WheelEvent<std.Element>> */
  @js.native
  trait WheelEvent extends DomEvent {
    
    var altKey: Boolean = js.native
    
    var bubbles: Boolean = js.native
    
    var button: Double = js.native
    
    var buttons: Double = js.native
    
    var camera: Camera = js.native
    
    var cancelable: Boolean = js.native
    
    var clientX: Double = js.native
    
    var clientY: Double = js.native
    
    var ctrlKey: Boolean = js.native
    
    var currentTarget: EventTarget with Element = js.native
    
    var defaultPrevented: Boolean = js.native
    
    var delta: Double = js.native
    
    var deltaMode: Double = js.native
    
    var deltaX: Double = js.native
    
    var deltaY: Double = js.native
    
    var deltaZ: Double = js.native
    
    var detail: Double = js.native
    
    var distance: Double = js.native
    
    var distanceToRay: js.UndefOr[Double] = js.native
    
    var eventObject: Object3D = js.native
    
    var eventPhase: Double = js.native
    
    var face: js.UndefOr[Face3 | Null] = js.native
    
    var faceIndex: js.UndefOr[Double] = js.native
    
    /**
      * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
      */
    def getModifierState(key: String): Boolean = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var instanceId: js.UndefOr[Double] = js.native
    
    var intersections: js.Array[Intersection] = js.native
    
    def isDefaultPrevented(): Boolean = js.native
    
    def isPropagationStopped(): Boolean = js.native
    
    var isTrusted: Boolean = js.native
    
    var metaKey: Boolean = js.native
    
    var movementX: Double = js.native
    
    var movementY: Double = js.native
    
    var nativeEvent: NativeWheelEvent = js.native
    
    var `object`: typings.three.object3DMod.Object3D = js.native
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
    
    def persist(): Unit = js.native
    
    var point: Vector3 = js.native
    
    def preventDefault(): Unit = js.native
    
    var ray: Ray = js.native
    
    var relatedTarget: EventTarget | Null = js.native
    
    var screenX: Double = js.native
    
    var screenY: Double = js.native
    
    var shiftKey: Boolean = js.native
    
    var sourceEvent: typings.react.mod.WheelEvent[Element] = js.native
    
    def stopPropagation(): Unit = js.native
    
    var stopped: Boolean = js.native
    
    var target: EventTarget = js.native
    
    var timeStamp: Double = js.native
    
    var `type`: String = js.native
    
    var unprojectedPoint: typings.three.mod.Vector3 = js.native
    
    var uv: js.UndefOr[typings.three.vector2Mod.Vector2] = js.native
    
    var view: AbstractView = js.native
  }
  object WheelEvent {
    
    @scala.inline
    def apply(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      camera: Camera,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget with Element,
      defaultPrevented: Boolean,
      delta: Double,
      deltaMode: Double,
      deltaX: Double,
      deltaY: Double,
      deltaZ: Double,
      detail: Double,
      distance: Double,
      eventObject: Object3D,
      eventPhase: Double,
      getModifierState: String => Boolean,
      intersections: js.Array[Intersection],
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeWheelEvent,
      `object`: typings.three.object3DMod.Object3D,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      point: Vector3,
      preventDefault: () => Unit,
      ray: Ray,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      sourceEvent: typings.react.mod.WheelEvent[Element],
      stopPropagation: () => Unit,
      stopped: Boolean,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      unprojectedPoint: typings.three.mod.Vector3,
      view: AbstractView
    ): WheelEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WheelEvent]
    }
    
    @scala.inline
    implicit class WheelEventMutableBuilder[Self <: WheelEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTarget(value: EventTarget with Element): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToRay(value: Double): Self = StObject.set(x, "distanceToRay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToRayUndefined: Self = StObject.set(x, "distanceToRay", js.undefined)
      
      @scala.inline
      def setEventObject(value: Object3D): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFace(value: Face3): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIndexUndefined: Self = StObject.set(x, "faceIndex", js.undefined)
      
      @scala.inline
      def setFaceNull: Self = StObject.set(x, "face", null)
      
      @scala.inline
      def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
      
      @scala.inline
      def setGetModifierState(value: String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setIntersections(value: js.Array[Intersection]): Self = StObject.set(x, "intersections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectionsVarargs(value: Intersection*): Self = StObject.set(x, "intersections", js.Array(value :_*))
      
      @scala.inline
      def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPropagationStopped(value: () => Boolean): Self = StObject.set(x, "isPropagationStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeEvent(value: NativeWheelEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: typings.three.object3DMod.Object3D): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersist(value: () => Unit): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPoint(value: Vector3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRay(value: Ray): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
      
      @scala.inline
      def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceEvent(value: typings.react.mod.WheelEvent[Element]): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprojectedPoint(value: typings.three.mod.Vector3): Self = StObject.set(x, "unprojectedPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUv(value: typings.three.vector2Mod.Vector2): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
      
      @scala.inline
      def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
