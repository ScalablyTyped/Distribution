package typings.reactThreeFiber

import typings.react.mod.Context
import typings.react.mod.MutableRefObject
import typings.reactThreeFiber.anon.Connect
import typings.reactThreeFiber.anon.Manual
import typings.reactThreeFiber.anon.PartialEventManagerany
import typings.reactThreeFiber.anon.ViewportgetCurrentViewpor
import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.DomEvent
import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.EventManager
import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.PointerCaptureTarget
import typings.reactThreeFiber.distDeclarationsSrcCoreEventsMod.ThreeEvent
import typings.reactThreeFiber.reactThreeFiberStrings.advance
import typings.reactThreeFiber.reactThreeFiberStrings.always
import typings.reactThreeFiber.reactThreeFiberStrings.demand
import typings.reactThreeFiber.reactThreeFiberStrings.events
import typings.reactThreeFiber.reactThreeFiberStrings.get
import typings.reactThreeFiber.reactThreeFiberStrings.invalidate
import typings.reactThreeFiber.reactThreeFiberStrings.never
import typings.reactThreeFiber.reactThreeFiberStrings.set
import typings.reactThreeFiber.reactThreeFiberStrings.setDpr
import typings.reactThreeFiber.reactThreeFiberStrings.setFrameloop
import typings.reactThreeFiber.reactThreeFiberStrings.setSize
import typings.reactThreeFiber.reactThreeFiberStrings.size
import typings.reactThreeFiber.reactThreeFiberStrings.viewport
import typings.std.Map
import typings.std.MouseEvent
import typings.three.mod.Camera
import typings.three.mod.Clock
import typings.three.mod.EventDispatcher
import typings.three.mod.Object3D
import typings.three.mod.Raycaster
import typings.three.mod.Scene
import typings.three.mod.Vector2
import typings.three.mod.WebGLRenderer
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcMathVector3Mod.Vector3
import typings.webxr.XRFrame
import typings.zustand.reactMod.UseBoundStore
import typings.zustand.vanillaMod.GetState
import typings.zustand.vanillaMod.SetState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCoreStoreMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/store", "context")
  @js.native
  val context: Context[UseBoundStore[RootState]] = js.native
  
  inline def createStore(
    invalidate: js.Function2[/* state */ js.UndefOr[RootState], /* frames */ js.UndefOr[Double], Unit],
    advance: js.Function4[
      /* timestamp */ Double, 
      /* runGlobalEffects */ js.UndefOr[Boolean], 
      /* state */ js.UndefOr[RootState], 
      /* frame */ js.UndefOr[XRFrame], 
      Unit
    ]
  ): UseBoundStore[RootState] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(invalidate.asInstanceOf[js.Any], advance.asInstanceOf[js.Any])).asInstanceOf[UseBoundStore[RootState]]
  
  inline def isRenderer(`def`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRenderer")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/store", "privateKeys")
  @js.native
  val privateKeys: js.Tuple10[set, get, setSize, setFrameloop, setDpr, events, invalidate, advance, size, viewport] = js.native
  
  type Dpr = Double | (js.Tuple2[/* min */ Double, /* max */ Double])
  
  trait InternalState extends StObject {
    
    var active: Boolean
    
    var capturedMap: Map[Double, Map[Object3D[Event], PointerCaptureTarget]]
    
    var frames: Double
    
    var hovered: Map[String, ThreeEvent[DomEvent]]
    
    var initialClick: js.Tuple2[/* x */ Double, /* y */ Double]
    
    var initialHits: js.Array[Object3D[Event]]
    
    var interaction: js.Array[Object3D[Event]]
    
    var lastEvent: MutableRefObject[DomEvent | Null]
    
    var priority: Double
    
    def subscribe(callback: MutableRefObject[RenderCallback], priority: Double, store: UseBoundStore[RootState]): js.Function0[Unit]
    
    var subscribers: js.Array[Subscription]
  }
  object InternalState {
    
    inline def apply(
      active: Boolean,
      capturedMap: Map[Double, Map[Object3D[Event], PointerCaptureTarget]],
      frames: Double,
      hovered: Map[String, ThreeEvent[DomEvent]],
      initialClick: js.Tuple2[/* x */ Double, /* y */ Double],
      initialHits: js.Array[Object3D[Event]],
      interaction: js.Array[Object3D[Event]],
      lastEvent: MutableRefObject[DomEvent | Null],
      priority: Double,
      subscribe: (MutableRefObject[RenderCallback], Double, UseBoundStore[RootState]) => js.Function0[Unit],
      subscribers: js.Array[Subscription]
    ): InternalState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], capturedMap = capturedMap.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], initialClick = initialClick.asInstanceOf[js.Any], initialHits = initialHits.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], lastEvent = lastEvent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], subscribe = js.Any.fromFunction3(subscribe), subscribers = subscribers.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalState] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCapturedMap(value: Map[Double, Map[Object3D[Event], PointerCaptureTarget]]): Self = StObject.set(x, "capturedMap", value.asInstanceOf[js.Any])
      
      inline def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setHovered(value: Map[String, ThreeEvent[DomEvent]]): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
      
      inline def setInitialClick(value: js.Tuple2[/* x */ Double, /* y */ Double]): Self = StObject.set(x, "initialClick", value.asInstanceOf[js.Any])
      
      inline def setInitialHits(value: js.Array[Object3D[Event]]): Self = StObject.set(x, "initialHits", value.asInstanceOf[js.Any])
      
      inline def setInitialHitsVarargs(value: Object3D[Event]*): Self = StObject.set(x, "initialHits", js.Array(value*))
      
      inline def setInteraction(value: js.Array[Object3D[Event]]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
      
      inline def setInteractionVarargs(value: Object3D[Event]*): Self = StObject.set(x, "interaction", js.Array(value*))
      
      inline def setLastEvent(value: MutableRefObject[DomEvent | Null]): Self = StObject.set(x, "lastEvent", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: (MutableRefObject[RenderCallback], Double, UseBoundStore[RootState]) => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
      
      inline def setSubscribers(value: js.Array[Subscription]): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
      
      inline def setSubscribersVarargs(value: Subscription*): Self = StObject.set(x, "subscribers", js.Array(value*))
    }
  }
  
  trait Intersection
    extends StObject
       with typings.three.srcCoreRaycasterMod.Intersection[typings.three.srcCoreObject3DMod.Object3D[Event]] {
    
    var eventObject: Object3D[Event]
  }
  object Intersection {
    
    inline def apply(
      distance: Double,
      eventObject: Object3D[Event],
      `object`: typings.three.srcCoreObject3DMod.Object3D[Event],
      point: Vector3
    ): Intersection = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Intersection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Intersection] (val x: Self) extends AnyVal {
      
      inline def setEventObject(value: Object3D[Event]): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
    }
  }
  
  trait Performance extends StObject {
    
    var current: Double
    
    var debounce: Double
    
    var max: Double
    
    var min: Double
    
    def regress(): Unit
  }
  object Performance {
    
    inline def apply(current: Double, debounce: Double, max: Double, min: Double, regress: () => Unit): Performance = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], regress = js.Any.fromFunction0(regress))
      __obj.asInstanceOf[Performance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Performance] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setRegress(value: () => Unit): Self = StObject.set(x, "regress", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactThreeFiber.reactThreeFiberStrings.set
    - typings.reactThreeFiber.reactThreeFiberStrings.get
    - typings.reactThreeFiber.reactThreeFiberStrings.setSize
    - typings.reactThreeFiber.reactThreeFiberStrings.setFrameloop
    - typings.reactThreeFiber.reactThreeFiberStrings.setDpr
    - typings.reactThreeFiber.reactThreeFiberStrings.events
    - typings.reactThreeFiber.reactThreeFiberStrings.invalidate
    - typings.reactThreeFiber.reactThreeFiberStrings.advance
    - typings.reactThreeFiber.reactThreeFiberStrings.size
    - typings.reactThreeFiber.reactThreeFiberStrings.viewport
  */
  trait PrivateKeys_ extends StObject
  
  type RenderCallback = js.Function3[/* state */ RootState, /* delta */ Double, /* frame */ js.UndefOr[XRFrame], Unit]
  
  trait Renderer extends StObject {
    
    def render(scene: Scene, camera: Camera): Any
  }
  object Renderer {
    
    inline def apply(render: (Scene, Camera) => Any): Renderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[Renderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
      
      inline def setRender(value: (Scene, Camera) => Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait RootState extends StObject {
    
    def advance(timestamp: Double): Unit = js.native
    def advance(timestamp: Double, runGlobalEffects: Boolean): Unit = js.native
    
    var camera: typings.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.Camera & Manual = js.native
    
    var clock: Clock = js.native
    
    var controls: EventDispatcher[Event] | Null = js.native
    
    var events: EventManager[Any] = js.native
    
    var flat: Boolean = js.native
    
    var frameloop: always | demand | never = js.native
    
    var get: GetState[RootState] = js.native
    
    var gl: WebGLRenderer = js.native
    
    var internal: InternalState = js.native
    
    def invalidate(): Unit = js.native
    def invalidate(frames: Double): Unit = js.native
    
    var legacy: Boolean = js.native
    
    var linear: Boolean = js.native
    
    var mouse: Vector2 = js.native
    
    var onPointerMissed: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
    
    var performance: Performance = js.native
    
    var pointer: Vector2 = js.native
    
    var previousRoot: js.UndefOr[UseBoundStore[RootState]] = js.native
    
    var raycaster: Raycaster = js.native
    
    var scene: Scene = js.native
    
    var set: SetState[RootState] = js.native
    
    def setDpr(dpr: Dpr): Unit = js.native
    
    def setEvents(events: PartialEventManagerany): Unit = js.native
    
    def setFrameloop(): Unit = js.native
    def setFrameloop(frameloop: always | demand | never): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Boolean): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Boolean, top: Double): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Boolean, top: Double, left: Double): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Boolean, top: Unit, left: Double): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Unit, top: Double): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Unit, top: Double, left: Double): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Unit, top: Unit, left: Double): Unit = js.native
    
    var size: Size = js.native
    
    var viewport: ViewportgetCurrentViewpor = js.native
    
    var xr: Connect = js.native
  }
  
  trait Size extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var updateStyle: js.UndefOr[Boolean] = js.undefined
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setUpdateStyle(value: Boolean): Self = StObject.set(x, "updateStyle", value.asInstanceOf[js.Any])
      
      inline def setUpdateStyleUndefined: Self = StObject.set(x, "updateStyle", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscription extends StObject {
    
    var priority: Double
    
    var ref: MutableRefObject[RenderCallback]
    
    var store: UseBoundStore[RootState]
  }
  object Subscription {
    
    inline def apply(priority: Double, ref: MutableRefObject[RenderCallback], store: UseBoundStore[RootState]): Subscription = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setRef(value: MutableRefObject[RenderCallback]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setStore(value: UseBoundStore[RootState]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  trait Viewport
    extends StObject
       with Size {
    
    var aspect: Double
    
    var distance: Double
    
    var dpr: Double
    
    var factor: Double
    
    var initialDpr: Double
  }
  object Viewport {
    
    inline def apply(
      aspect: Double,
      distance: Double,
      dpr: Double,
      factor: Double,
      height: Double,
      initialDpr: Double,
      left: Double,
      top: Double,
      width: Double
    ): Viewport = {
      val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], dpr = dpr.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initialDpr = initialDpr.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Viewport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
      
      inline def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDpr(value: Double): Self = StObject.set(x, "dpr", value.asInstanceOf[js.Any])
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setInitialDpr(value: Double): Self = StObject.set(x, "initialDpr", value.asInstanceOf[js.Any])
    }
  }
}
