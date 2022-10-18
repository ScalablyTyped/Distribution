package typings.reactThreeFiber

import org.scalablytyped.runtime.StringDictionary
import typings.reactReconciler.mod.FiberRoot
import typings.reactThreeFiber.anon.ApplyProps
import typings.reactThreeFiber.anon.PartialEventHandlers
import typings.reactThreeFiber.anon.PartialLocalState
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typings.reactThreeFiber.reactThreeFiberBooleans.`true`
import typings.std.Map
import typings.three.mod.Raycaster
import typings.three.srcAnimationAnimationClipMod.AnimationClip
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventListener
import typings.three.srcCoreLayersMod.Layers
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcCoreRaycasterMod.Intersection
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathEulerMod.Euler
import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathQuaternionMod.Quaternion
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcObjectsGroupMod.Group
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.srcScenesSceneMod.Scene
import typings.zustand.reactMod.UseBoundStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCoreRendererMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRenderer[TCanvas](_roots: Map[TCanvas, Root]): ApplyProps = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")(_roots.asInstanceOf[js.Any]).asInstanceOf[ApplyProps]
  inline def createRenderer[TCanvas](_roots: Map[TCanvas, Root], _getEventPriority: js.Function0[Any]): ApplyProps = (^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")(_roots.asInstanceOf[js.Any], _getEventPriority.asInstanceOf[js.Any])).asInstanceOf[ApplyProps]
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/renderer", "extend")
  @js.native
  def extend: js.Function1[/* objects */ js.Object, Unit] = js.native
  inline def extend_=(x: js.Function1[/* objects */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extend")(x.asInstanceOf[js.Any])
  
  inline def prepare[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def prepare[T](`object`: T, state: PartialLocalState): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(`object`.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type AttachFnType = js.Function2[/* parent */ Instance, /* self */ Instance, js.Function0[Unit]]
  
  type AttachType = String | AttachFnType
  
  /* Inlined std.Omit<three.three.Object3D<three.three/src/core/EventDispatcher.Event>, 'children' | 'attach' | 'add' | 'remove' | 'raycast'> & {  __r3f :@react-three/fiber.@react-three/fiber/dist/declarations/src/core/renderer.LocalState,   children :std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/renderer.Instance>, remove (object : ...@react-three/fiber.@react-three/fiber/dist/declarations/src/core/renderer.Instance): @react-three/fiber.@react-three/fiber/dist/declarations/src/core/renderer.Instance, add (object : ...@react-three/fiber.@react-three/fiber/dist/declarations/src/core/renderer.Instance): @react-three/fiber.@react-three/fiber/dist/declarations/src/core/renderer.Instance,   raycast :(raycaster : three.three.Raycaster, intersects : std.Array<three.three.Intersection<three.three/src/core/Object3D.Object3D<three.three/src/core/EventDispatcher.Event>>>): void | undefined} */
  trait BaseInstance extends StObject {
    
    var DefaultMatrixAutoUpdate: js.UndefOr[Any] = js.undefined
    
    var DefaultUp: js.UndefOr[Any] = js.undefined
    
    var __r3f: LocalState
    
    def add(`object`: Instance*): Instance
    
    var addEventListener: js.Function2[/* type */ String, /* listener */ EventListener[Event, String, this.type], Unit]
    
    var animations: js.Array[AnimationClip]
    
    var applyMatrix4: js.Function1[/* matrix */ Matrix4, Unit]
    
    var applyQuaternion: js.Function1[/* quaternion */ Quaternion, this.type]
    
    var castShadow: Boolean
    
    var children: js.Array[Instance]
    
    var clear: js.Function0[this.type]
    
    @JSName("clone")
    var clone_FBaseInstance: js.Function0[this.type]
    
    var constructor: js.Function0[Any]
    
    var copy: js.Function1[/* source */ this.type, this.type]
    
    var customDepthMaterial: Material
    
    var customDistanceMaterial: Material
    
    var dispatchEvent: js.Function1[/* event */ Event, Unit]
    
    var frustumCulled: Boolean
    
    var getObjectById: js.Function1[/* id */ Double, js.UndefOr[Object3D[Event]]]
    
    var getObjectByName: js.Function1[/* name */ String, js.UndefOr[Object3D[Event]]]
    
    var getObjectByProperty: js.Function2[/* name */ String, /* value */ String, js.UndefOr[Object3D[Event]]]
    
    var getWorldDirection: js.Function1[/* target */ Vector3, Vector3]
    
    var getWorldPosition: js.Function1[/* target */ Vector3, Vector3]
    
    var getWorldQuaternion: js.Function1[/* target */ Quaternion, Quaternion]
    
    var getWorldScale: js.Function1[/* target */ Vector3, Vector3]
    
    var hasEventListener: js.Function2[/* type */ String, /* listener */ EventListener[Event, String, this.type], Boolean]
    
    var id: Double
    
    var isObject3D: `true`
    
    var layers: Layers
    
    var localToWorld: js.Function1[/* vector */ Vector3, Vector3]
    
    var lookAt: js.Function1[/* vector */ Vector3, Unit]
    
    var matrix: Matrix4
    
    var matrixAutoUpdate: Boolean
    
    var matrixWorld: Matrix4
    
    var matrixWorldNeedsUpdate: Boolean
    
    var modelViewMatrix: Matrix4
    
    var name: String
    
    var normalMatrix: Matrix3
    
    var onAfterRender: js.Function6[
        /* renderer */ WebGLRenderer, 
        /* scene */ Scene, 
        /* camera */ Camera, 
        /* geometry */ BufferGeometry, 
        /* material */ Material, 
        /* group */ Group, 
        Unit
      ]
    
    var onBeforeRender: js.Function6[
        /* renderer */ WebGLRenderer, 
        /* scene */ Scene, 
        /* camera */ Camera, 
        /* geometry */ BufferGeometry, 
        /* material */ Material, 
        /* group */ Group, 
        Unit
      ]
    
    var parent: js.UndefOr[Object3D[Event] | Null] = js.undefined
    
    var position: Vector3
    
    var quaternion: Quaternion
    
    var raycast: js.UndefOr[
        js.Function2[
          /* raycaster */ Raycaster, 
          /* intersects */ js.Array[Intersection[Object3D[Event]]], 
          Unit
        ]
      ] = js.undefined
    
    var receiveShadow: Boolean
    
    def remove(`object`: Instance*): Instance
    
    var removeEventListener: js.Function2[/* type */ String, /* listener */ EventListener[Event, String, this.type], Unit]
    
    var removeFromParent: js.Function0[this.type]
    
    var renderOrder: Double
    
    var rotateOnAxis: js.Function2[/* axis */ Vector3, /* angle */ Double, this.type]
    
    var rotateOnWorldAxis: js.Function2[/* axis */ Vector3, /* angle */ Double, this.type]
    
    var rotateX: js.Function1[/* angle */ Double, this.type]
    
    var rotateY: js.Function1[/* angle */ Double, this.type]
    
    var rotateZ: js.Function1[/* angle */ Double, this.type]
    
    var rotation: Euler
    
    var scale: Vector3
    
    var setRotationFromAxisAngle: js.Function2[/* axis */ Vector3, /* angle */ Double, Unit]
    
    var setRotationFromEuler: js.Function1[/* euler */ Euler, Unit]
    
    var setRotationFromMatrix: js.Function1[/* m */ Matrix4, Unit]
    
    var setRotationFromQuaternion: js.Function1[/* q */ Quaternion, Unit]
    
    var toJSON: js.Function0[Any]
    
    var translateOnAxis: js.Function2[/* axis */ Vector3, /* distance */ Double, this.type]
    
    var translateX: js.Function1[/* distance */ Double, this.type]
    
    var translateY: js.Function1[/* distance */ Double, this.type]
    
    var translateZ: js.Function1[/* distance */ Double, this.type]
    
    var traverse: js.Function1[/* callback */ js.Function1[/* object */ Object3D[Event], Any], Unit]
    
    var traverseAncestors: js.Function1[/* callback */ js.Function1[/* object */ Object3D[Event], Any], Unit]
    
    var traverseVisible: js.Function1[/* callback */ js.Function1[/* object */ Object3D[Event], Any], Unit]
    
    var `type`: String
    
    var up: Vector3
    
    var updateMatrix: js.Function0[Unit]
    
    var updateMatrixWorld: js.Function0[Unit]
    
    var updateWorldMatrix: js.Function2[/* updateParents */ Boolean, /* updateChildren */ Boolean, Unit]
    
    var userData: StringDictionary[Any]
    
    var uuid: String
    
    var visible: Boolean
    
    var worldToLocal: js.Function1[/* vector */ Vector3, Vector3]
  }
  object BaseInstance {
    
    inline def apply(
      __r3f: LocalState,
      add: /* repeated */ Instance => Instance,
      addEventListener: (/* type */ String, /* listener */ EventListener[Event, String, BaseInstance]) => Unit,
      animations: js.Array[AnimationClip],
      applyMatrix4: /* matrix */ Matrix4 => Unit,
      applyQuaternion: /* quaternion */ Quaternion => BaseInstance,
      castShadow: Boolean,
      children: js.Array[Instance],
      clear: () => BaseInstance,
      clone_ : () => BaseInstance,
      constructor: () => Any,
      copy: BaseInstance => BaseInstance,
      customDepthMaterial: Material,
      customDistanceMaterial: Material,
      dispatchEvent: /* event */ Event => Unit,
      frustumCulled: Boolean,
      getObjectById: /* id */ Double => js.UndefOr[Object3D[Event]],
      getObjectByName: /* name */ String => js.UndefOr[Object3D[Event]],
      getObjectByProperty: (/* name */ String, /* value */ String) => js.UndefOr[Object3D[Event]],
      getWorldDirection: /* target */ Vector3 => Vector3,
      getWorldPosition: /* target */ Vector3 => Vector3,
      getWorldQuaternion: /* target */ Quaternion => Quaternion,
      getWorldScale: /* target */ Vector3 => Vector3,
      hasEventListener: (/* type */ String, /* listener */ EventListener[Event, String, BaseInstance]) => Boolean,
      id: Double,
      layers: Layers,
      localToWorld: /* vector */ Vector3 => Vector3,
      lookAt: /* vector */ Vector3 => Unit,
      matrix: Matrix4,
      matrixAutoUpdate: Boolean,
      matrixWorld: Matrix4,
      matrixWorldNeedsUpdate: Boolean,
      modelViewMatrix: Matrix4,
      name: String,
      normalMatrix: Matrix3,
      onAfterRender: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Unit,
      onBeforeRender: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Unit,
      position: Vector3,
      quaternion: Quaternion,
      receiveShadow: Boolean,
      remove: /* repeated */ Instance => Instance,
      removeEventListener: (/* type */ String, /* listener */ EventListener[Event, String, BaseInstance]) => Unit,
      removeFromParent: () => BaseInstance,
      renderOrder: Double,
      rotateOnAxis: (/* axis */ Vector3, /* angle */ Double) => BaseInstance,
      rotateOnWorldAxis: (/* axis */ Vector3, /* angle */ Double) => BaseInstance,
      rotateX: /* angle */ Double => BaseInstance,
      rotateY: /* angle */ Double => BaseInstance,
      rotateZ: /* angle */ Double => BaseInstance,
      rotation: Euler,
      scale: Vector3,
      setRotationFromAxisAngle: (/* axis */ Vector3, /* angle */ Double) => Unit,
      setRotationFromEuler: /* euler */ Euler => Unit,
      setRotationFromMatrix: /* m */ Matrix4 => Unit,
      setRotationFromQuaternion: /* q */ Quaternion => Unit,
      toJSON: () => Any,
      translateOnAxis: (/* axis */ Vector3, /* distance */ Double) => BaseInstance,
      translateX: /* distance */ Double => BaseInstance,
      translateY: /* distance */ Double => BaseInstance,
      translateZ: /* distance */ Double => BaseInstance,
      traverse: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit,
      traverseAncestors: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit,
      traverseVisible: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit,
      `type`: String,
      up: Vector3,
      updateMatrix: () => Unit,
      updateMatrixWorld: () => Unit,
      updateWorldMatrix: (/* updateParents */ Boolean, /* updateChildren */ Boolean) => Unit,
      userData: StringDictionary[Any],
      uuid: String,
      visible: Boolean,
      worldToLocal: /* vector */ Vector3 => Vector3
    ): BaseInstance = {
      val __obj = js.Dynamic.literal(__r3f = __r3f.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), addEventListener = js.Any.fromFunction2(addEventListener), animations = animations.asInstanceOf[js.Any], applyMatrix4 = js.Any.fromFunction1(applyMatrix4), applyQuaternion = js.Any.fromFunction1(applyQuaternion), castShadow = castShadow.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), constructor = js.Any.fromFunction0(constructor), copy = js.Any.fromFunction1(copy), customDepthMaterial = customDepthMaterial.asInstanceOf[js.Any], customDistanceMaterial = customDistanceMaterial.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), frustumCulled = frustumCulled.asInstanceOf[js.Any], getObjectById = js.Any.fromFunction1(getObjectById), getObjectByName = js.Any.fromFunction1(getObjectByName), getObjectByProperty = js.Any.fromFunction2(getObjectByProperty), getWorldDirection = js.Any.fromFunction1(getWorldDirection), getWorldPosition = js.Any.fromFunction1(getWorldPosition), getWorldQuaternion = js.Any.fromFunction1(getWorldQuaternion), getWorldScale = js.Any.fromFunction1(getWorldScale), hasEventListener = js.Any.fromFunction2(hasEventListener), id = id.asInstanceOf[js.Any], isObject3D = true, layers = layers.asInstanceOf[js.Any], localToWorld = js.Any.fromFunction1(localToWorld), lookAt = js.Any.fromFunction1(lookAt), matrix = matrix.asInstanceOf[js.Any], matrixAutoUpdate = matrixAutoUpdate.asInstanceOf[js.Any], matrixWorld = matrixWorld.asInstanceOf[js.Any], matrixWorldNeedsUpdate = matrixWorldNeedsUpdate.asInstanceOf[js.Any], modelViewMatrix = modelViewMatrix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], normalMatrix = normalMatrix.asInstanceOf[js.Any], onAfterRender = js.Any.fromFunction6(onAfterRender), onBeforeRender = js.Any.fromFunction6(onBeforeRender), position = position.asInstanceOf[js.Any], quaternion = quaternion.asInstanceOf[js.Any], receiveShadow = receiveShadow.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction2(removeEventListener), removeFromParent = js.Any.fromFunction0(removeFromParent), renderOrder = renderOrder.asInstanceOf[js.Any], rotateOnAxis = js.Any.fromFunction2(rotateOnAxis), rotateOnWorldAxis = js.Any.fromFunction2(rotateOnWorldAxis), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ), rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setRotationFromAxisAngle = js.Any.fromFunction2(setRotationFromAxisAngle), setRotationFromEuler = js.Any.fromFunction1(setRotationFromEuler), setRotationFromMatrix = js.Any.fromFunction1(setRotationFromMatrix), setRotationFromQuaternion = js.Any.fromFunction1(setRotationFromQuaternion), toJSON = js.Any.fromFunction0(toJSON), translateOnAxis = js.Any.fromFunction2(translateOnAxis), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ), traverse = js.Any.fromFunction1(traverse), traverseAncestors = js.Any.fromFunction1(traverseAncestors), traverseVisible = js.Any.fromFunction1(traverseVisible), up = up.asInstanceOf[js.Any], updateMatrix = js.Any.fromFunction0(updateMatrix), updateMatrixWorld = js.Any.fromFunction0(updateMatrixWorld), updateWorldMatrix = js.Any.fromFunction2(updateWorldMatrix), userData = userData.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], worldToLocal = js.Any.fromFunction1(worldToLocal))
      __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseInstance]
    }
    
    extension [Self <: BaseInstance](x: Self) {
      
      inline def setAdd(value: /* repeated */ Instance => Instance): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddEventListener(value: (/* type */ String, /* listener */ EventListener[Event, String, BaseInstance]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setAnimations(value: js.Array[AnimationClip]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsVarargs(value: AnimationClip*): Self = StObject.set(x, "animations", js.Array(value*))
      
      inline def setApplyMatrix4(value: /* matrix */ Matrix4 => Unit): Self = StObject.set(x, "applyMatrix4", js.Any.fromFunction1(value))
      
      inline def setApplyQuaternion(value: /* quaternion */ Quaternion => BaseInstance): Self = StObject.set(x, "applyQuaternion", js.Any.fromFunction1(value))
      
      inline def setCastShadow(value: Boolean): Self = StObject.set(x, "castShadow", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Instance]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Instance*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClear(value: () => BaseInstance): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClone_(value: () => BaseInstance): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setConstructor(value: () => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
      
      inline def setCopy(value: BaseInstance => BaseInstance): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setCustomDepthMaterial(value: Material): Self = StObject.set(x, "customDepthMaterial", value.asInstanceOf[js.Any])
      
      inline def setCustomDistanceMaterial(value: Material): Self = StObject.set(x, "customDistanceMaterial", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatrixAutoUpdate(value: Any): Self = StObject.set(x, "DefaultMatrixAutoUpdate", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatrixAutoUpdateUndefined: Self = StObject.set(x, "DefaultMatrixAutoUpdate", js.undefined)
      
      inline def setDefaultUp(value: Any): Self = StObject.set(x, "DefaultUp", value.asInstanceOf[js.Any])
      
      inline def setDefaultUpUndefined: Self = StObject.set(x, "DefaultUp", js.undefined)
      
      inline def setDispatchEvent(value: /* event */ Event => Unit): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setFrustumCulled(value: Boolean): Self = StObject.set(x, "frustumCulled", value.asInstanceOf[js.Any])
      
      inline def setGetObjectById(value: /* id */ Double => js.UndefOr[Object3D[Event]]): Self = StObject.set(x, "getObjectById", js.Any.fromFunction1(value))
      
      inline def setGetObjectByName(value: /* name */ String => js.UndefOr[Object3D[Event]]): Self = StObject.set(x, "getObjectByName", js.Any.fromFunction1(value))
      
      inline def setGetObjectByProperty(value: (/* name */ String, /* value */ String) => js.UndefOr[Object3D[Event]]): Self = StObject.set(x, "getObjectByProperty", js.Any.fromFunction2(value))
      
      inline def setGetWorldDirection(value: /* target */ Vector3 => Vector3): Self = StObject.set(x, "getWorldDirection", js.Any.fromFunction1(value))
      
      inline def setGetWorldPosition(value: /* target */ Vector3 => Vector3): Self = StObject.set(x, "getWorldPosition", js.Any.fromFunction1(value))
      
      inline def setGetWorldQuaternion(value: /* target */ Quaternion => Quaternion): Self = StObject.set(x, "getWorldQuaternion", js.Any.fromFunction1(value))
      
      inline def setGetWorldScale(value: /* target */ Vector3 => Vector3): Self = StObject.set(x, "getWorldScale", js.Any.fromFunction1(value))
      
      inline def setHasEventListener(value: (/* type */ String, /* listener */ EventListener[Event, String, BaseInstance]) => Boolean): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction2(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsObject3D(value: `true`): Self = StObject.set(x, "isObject3D", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLocalToWorld(value: /* vector */ Vector3 => Vector3): Self = StObject.set(x, "localToWorld", js.Any.fromFunction1(value))
      
      inline def setLookAt(value: /* vector */ Vector3 => Unit): Self = StObject.set(x, "lookAt", js.Any.fromFunction1(value))
      
      inline def setMatrix(value: Matrix4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixAutoUpdate(value: Boolean): Self = StObject.set(x, "matrixAutoUpdate", value.asInstanceOf[js.Any])
      
      inline def setMatrixWorld(value: Matrix4): Self = StObject.set(x, "matrixWorld", value.asInstanceOf[js.Any])
      
      inline def setMatrixWorldNeedsUpdate(value: Boolean): Self = StObject.set(x, "matrixWorldNeedsUpdate", value.asInstanceOf[js.Any])
      
      inline def setModelViewMatrix(value: Matrix4): Self = StObject.set(x, "modelViewMatrix", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNormalMatrix(value: Matrix3): Self = StObject.set(x, "normalMatrix", value.asInstanceOf[js.Any])
      
      inline def setOnAfterRender(
        value: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Unit
      ): Self = StObject.set(x, "onAfterRender", js.Any.fromFunction6(value))
      
      inline def setOnBeforeRender(
        value: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Unit
      ): Self = StObject.set(x, "onBeforeRender", js.Any.fromFunction6(value))
      
      inline def setParent(value: Object3D[Event]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setQuaternion(value: Quaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
      
      inline def setRaycast(
        value: (/* raycaster */ Raycaster, /* intersects */ js.Array[Intersection[Object3D[Event]]]) => Unit
      ): Self = StObject.set(x, "raycast", js.Any.fromFunction2(value))
      
      inline def setRaycastUndefined: Self = StObject.set(x, "raycast", js.undefined)
      
      inline def setReceiveShadow(value: Boolean): Self = StObject.set(x, "receiveShadow", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: /* repeated */ Instance => Instance): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveEventListener(value: (/* type */ String, /* listener */ EventListener[Event, String, BaseInstance]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      inline def setRemoveFromParent(value: () => BaseInstance): Self = StObject.set(x, "removeFromParent", js.Any.fromFunction0(value))
      
      inline def setRenderOrder(value: Double): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      inline def setRotateOnAxis(value: (/* axis */ Vector3, /* angle */ Double) => BaseInstance): Self = StObject.set(x, "rotateOnAxis", js.Any.fromFunction2(value))
      
      inline def setRotateOnWorldAxis(value: (/* axis */ Vector3, /* angle */ Double) => BaseInstance): Self = StObject.set(x, "rotateOnWorldAxis", js.Any.fromFunction2(value))
      
      inline def setRotateX(value: /* angle */ Double => BaseInstance): Self = StObject.set(x, "rotateX", js.Any.fromFunction1(value))
      
      inline def setRotateY(value: /* angle */ Double => BaseInstance): Self = StObject.set(x, "rotateY", js.Any.fromFunction1(value))
      
      inline def setRotateZ(value: /* angle */ Double => BaseInstance): Self = StObject.set(x, "rotateZ", js.Any.fromFunction1(value))
      
      inline def setRotation(value: Euler): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Vector3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSetRotationFromAxisAngle(value: (/* axis */ Vector3, /* angle */ Double) => Unit): Self = StObject.set(x, "setRotationFromAxisAngle", js.Any.fromFunction2(value))
      
      inline def setSetRotationFromEuler(value: /* euler */ Euler => Unit): Self = StObject.set(x, "setRotationFromEuler", js.Any.fromFunction1(value))
      
      inline def setSetRotationFromMatrix(value: /* m */ Matrix4 => Unit): Self = StObject.set(x, "setRotationFromMatrix", js.Any.fromFunction1(value))
      
      inline def setSetRotationFromQuaternion(value: /* q */ Quaternion => Unit): Self = StObject.set(x, "setRotationFromQuaternion", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setTranslateOnAxis(value: (/* axis */ Vector3, /* distance */ Double) => BaseInstance): Self = StObject.set(x, "translateOnAxis", js.Any.fromFunction2(value))
      
      inline def setTranslateX(value: /* distance */ Double => BaseInstance): Self = StObject.set(x, "translateX", js.Any.fromFunction1(value))
      
      inline def setTranslateY(value: /* distance */ Double => BaseInstance): Self = StObject.set(x, "translateY", js.Any.fromFunction1(value))
      
      inline def setTranslateZ(value: /* distance */ Double => BaseInstance): Self = StObject.set(x, "translateZ", js.Any.fromFunction1(value))
      
      inline def setTraverse(value: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
      
      inline def setTraverseAncestors(value: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit): Self = StObject.set(x, "traverseAncestors", js.Any.fromFunction1(value))
      
      inline def setTraverseVisible(value: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit): Self = StObject.set(x, "traverseVisible", js.Any.fromFunction1(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUp(value: Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpdateMatrix(value: () => Unit): Self = StObject.set(x, "updateMatrix", js.Any.fromFunction0(value))
      
      inline def setUpdateMatrixWorld(value: () => Unit): Self = StObject.set(x, "updateMatrixWorld", js.Any.fromFunction0(value))
      
      inline def setUpdateWorldMatrix(value: (/* updateParents */ Boolean, /* updateChildren */ Boolean) => Unit): Self = StObject.set(x, "updateWorldMatrix", js.Any.fromFunction2(value))
      
      inline def setUserData(value: StringDictionary[Any]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWorldToLocal(value: /* vector */ Vector3 => Vector3): Self = StObject.set(x, "worldToLocal", js.Any.fromFunction1(value))
      
      inline def set__r3f(value: LocalState): Self = StObject.set(x, "__r3f", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @react-three/fiber.@react-three/fiber/dist/declarations/src/core/renderer.BaseInstance & {[key: string] : any} */
  trait Instance
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var DefaultMatrixAutoUpdate: js.UndefOr[Any] = js.undefined
    
    var DefaultUp: js.UndefOr[Any] = js.undefined
    
    var __r3f: LocalState
    
    def add(`object`: Instance*): Instance
    
    var addEventListener: js.Function2[/* type */ String, /* listener */ EventListener[Event, String, this.type], Unit]
    
    var animations: js.Array[AnimationClip]
    
    var applyMatrix4: js.Function1[/* matrix */ Matrix4, Unit]
    
    var applyQuaternion: js.Function1[/* quaternion */ Quaternion, this.type]
    
    var castShadow: Boolean
    
    var children: js.Array[Instance]
    
    var clear: js.Function0[this.type]
    
    @JSName("clone")
    var clone_FInstance: js.Function0[this.type]
    
    var constructor: js.Function0[Any]
    
    var copy: js.Function1[/* source */ this.type, this.type]
    
    var customDepthMaterial: Material
    
    var customDistanceMaterial: Material
    
    var dispatchEvent: js.Function1[/* event */ Event, Unit]
    
    var frustumCulled: Boolean
    
    var getObjectById: js.Function1[/* id */ Double, js.UndefOr[Object3D[Event]]]
    
    var getObjectByName: js.Function1[/* name */ String, js.UndefOr[Object3D[Event]]]
    
    var getObjectByProperty: js.Function2[/* name */ String, /* value */ String, js.UndefOr[Object3D[Event]]]
    
    var getWorldDirection: js.Function1[/* target */ Vector3, Vector3]
    
    var getWorldPosition: js.Function1[/* target */ Vector3, Vector3]
    
    var getWorldQuaternion: js.Function1[/* target */ Quaternion, Quaternion]
    
    var getWorldScale: js.Function1[/* target */ Vector3, Vector3]
    
    var hasEventListener: js.Function2[/* type */ String, /* listener */ EventListener[Event, String, this.type], Boolean]
    
    var id: Double
    
    var isObject3D: `true`
    
    var layers: Layers
    
    var localToWorld: js.Function1[/* vector */ Vector3, Vector3]
    
    var lookAt: js.Function1[/* vector */ Vector3, Unit]
    
    var matrix: Matrix4
    
    var matrixAutoUpdate: Boolean
    
    var matrixWorld: Matrix4
    
    var matrixWorldNeedsUpdate: Boolean
    
    var modelViewMatrix: Matrix4
    
    var name: String
    
    var normalMatrix: Matrix3
    
    var onAfterRender: js.Function6[
        /* renderer */ WebGLRenderer, 
        /* scene */ Scene, 
        /* camera */ Camera, 
        /* geometry */ BufferGeometry, 
        /* material */ Material, 
        /* group */ Group, 
        Unit
      ]
    
    var onBeforeRender: js.Function6[
        /* renderer */ WebGLRenderer, 
        /* scene */ Scene, 
        /* camera */ Camera, 
        /* geometry */ BufferGeometry, 
        /* material */ Material, 
        /* group */ Group, 
        Unit
      ]
    
    var parent: js.UndefOr[Object3D[Event] | Null] = js.undefined
    
    var position: Vector3
    
    var quaternion: Quaternion
    
    var raycast: js.UndefOr[
        js.Function2[
          /* raycaster */ Raycaster, 
          /* intersects */ js.Array[Intersection[Object3D[Event]]], 
          Unit
        ]
      ] = js.undefined
    
    var receiveShadow: Boolean
    
    def remove(`object`: Instance*): Instance
    
    var removeEventListener: js.Function2[/* type */ String, /* listener */ EventListener[Event, String, this.type], Unit]
    
    var removeFromParent: js.Function0[this.type]
    
    var renderOrder: Double
    
    var rotateOnAxis: js.Function2[/* axis */ Vector3, /* angle */ Double, this.type]
    
    var rotateOnWorldAxis: js.Function2[/* axis */ Vector3, /* angle */ Double, this.type]
    
    var rotateX: js.Function1[/* angle */ Double, this.type]
    
    var rotateY: js.Function1[/* angle */ Double, this.type]
    
    var rotateZ: js.Function1[/* angle */ Double, this.type]
    
    var rotation: Euler
    
    var scale: Vector3
    
    var setRotationFromAxisAngle: js.Function2[/* axis */ Vector3, /* angle */ Double, Unit]
    
    var setRotationFromEuler: js.Function1[/* euler */ Euler, Unit]
    
    var setRotationFromMatrix: js.Function1[/* m */ Matrix4, Unit]
    
    var setRotationFromQuaternion: js.Function1[/* q */ Quaternion, Unit]
    
    var toJSON: js.Function0[Any]
    
    var translateOnAxis: js.Function2[/* axis */ Vector3, /* distance */ Double, this.type]
    
    var translateX: js.Function1[/* distance */ Double, this.type]
    
    var translateY: js.Function1[/* distance */ Double, this.type]
    
    var translateZ: js.Function1[/* distance */ Double, this.type]
    
    var traverse: js.Function1[/* callback */ js.Function1[/* object */ Object3D[Event], Any], Unit]
    
    var traverseAncestors: js.Function1[/* callback */ js.Function1[/* object */ Object3D[Event], Any], Unit]
    
    var traverseVisible: js.Function1[/* callback */ js.Function1[/* object */ Object3D[Event], Any], Unit]
    
    var `type`: String
    
    var up: Vector3
    
    var updateMatrix: js.Function0[Unit]
    
    var updateMatrixWorld: js.Function0[Unit]
    
    var updateWorldMatrix: js.Function2[/* updateParents */ Boolean, /* updateChildren */ Boolean, Unit]
    
    var userData: StringDictionary[Any]
    
    var uuid: String
    
    var visible: Boolean
    
    var worldToLocal: js.Function1[/* vector */ Vector3, Vector3]
  }
  object Instance {
    
    inline def apply(
      __r3f: LocalState,
      add: /* repeated */ Instance => Instance,
      addEventListener: (/* type */ String, /* listener */ EventListener[Event, String, Instance]) => Unit,
      animations: js.Array[AnimationClip],
      applyMatrix4: /* matrix */ Matrix4 => Unit,
      applyQuaternion: /* quaternion */ Quaternion => Instance,
      castShadow: Boolean,
      children: js.Array[Instance],
      clear: () => Instance,
      clone_ : () => Instance,
      constructor: () => Any,
      copy: Instance => Instance,
      customDepthMaterial: Material,
      customDistanceMaterial: Material,
      dispatchEvent: /* event */ Event => Unit,
      frustumCulled: Boolean,
      getObjectById: /* id */ Double => js.UndefOr[Object3D[Event]],
      getObjectByName: /* name */ String => js.UndefOr[Object3D[Event]],
      getObjectByProperty: (/* name */ String, /* value */ String) => js.UndefOr[Object3D[Event]],
      getWorldDirection: /* target */ Vector3 => Vector3,
      getWorldPosition: /* target */ Vector3 => Vector3,
      getWorldQuaternion: /* target */ Quaternion => Quaternion,
      getWorldScale: /* target */ Vector3 => Vector3,
      hasEventListener: (/* type */ String, /* listener */ EventListener[Event, String, Instance]) => Boolean,
      id: Double,
      layers: Layers,
      localToWorld: /* vector */ Vector3 => Vector3,
      lookAt: /* vector */ Vector3 => Unit,
      matrix: Matrix4,
      matrixAutoUpdate: Boolean,
      matrixWorld: Matrix4,
      matrixWorldNeedsUpdate: Boolean,
      modelViewMatrix: Matrix4,
      name: String,
      normalMatrix: Matrix3,
      onAfterRender: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Unit,
      onBeforeRender: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Unit,
      position: Vector3,
      quaternion: Quaternion,
      receiveShadow: Boolean,
      remove: /* repeated */ Instance => Instance,
      removeEventListener: (/* type */ String, /* listener */ EventListener[Event, String, Instance]) => Unit,
      removeFromParent: () => Instance,
      renderOrder: Double,
      rotateOnAxis: (/* axis */ Vector3, /* angle */ Double) => Instance,
      rotateOnWorldAxis: (/* axis */ Vector3, /* angle */ Double) => Instance,
      rotateX: /* angle */ Double => Instance,
      rotateY: /* angle */ Double => Instance,
      rotateZ: /* angle */ Double => Instance,
      rotation: Euler,
      scale: Vector3,
      setRotationFromAxisAngle: (/* axis */ Vector3, /* angle */ Double) => Unit,
      setRotationFromEuler: /* euler */ Euler => Unit,
      setRotationFromMatrix: /* m */ Matrix4 => Unit,
      setRotationFromQuaternion: /* q */ Quaternion => Unit,
      toJSON: () => Any,
      translateOnAxis: (/* axis */ Vector3, /* distance */ Double) => Instance,
      translateX: /* distance */ Double => Instance,
      translateY: /* distance */ Double => Instance,
      translateZ: /* distance */ Double => Instance,
      traverse: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit,
      traverseAncestors: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit,
      traverseVisible: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit,
      `type`: String,
      up: Vector3,
      updateMatrix: () => Unit,
      updateMatrixWorld: () => Unit,
      updateWorldMatrix: (/* updateParents */ Boolean, /* updateChildren */ Boolean) => Unit,
      userData: StringDictionary[Any],
      uuid: String,
      visible: Boolean,
      worldToLocal: /* vector */ Vector3 => Vector3
    ): Instance = {
      val __obj = js.Dynamic.literal(__r3f = __r3f.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), addEventListener = js.Any.fromFunction2(addEventListener), animations = animations.asInstanceOf[js.Any], applyMatrix4 = js.Any.fromFunction1(applyMatrix4), applyQuaternion = js.Any.fromFunction1(applyQuaternion), castShadow = castShadow.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), constructor = js.Any.fromFunction0(constructor), copy = js.Any.fromFunction1(copy), customDepthMaterial = customDepthMaterial.asInstanceOf[js.Any], customDistanceMaterial = customDistanceMaterial.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), frustumCulled = frustumCulled.asInstanceOf[js.Any], getObjectById = js.Any.fromFunction1(getObjectById), getObjectByName = js.Any.fromFunction1(getObjectByName), getObjectByProperty = js.Any.fromFunction2(getObjectByProperty), getWorldDirection = js.Any.fromFunction1(getWorldDirection), getWorldPosition = js.Any.fromFunction1(getWorldPosition), getWorldQuaternion = js.Any.fromFunction1(getWorldQuaternion), getWorldScale = js.Any.fromFunction1(getWorldScale), hasEventListener = js.Any.fromFunction2(hasEventListener), id = id.asInstanceOf[js.Any], isObject3D = true, layers = layers.asInstanceOf[js.Any], localToWorld = js.Any.fromFunction1(localToWorld), lookAt = js.Any.fromFunction1(lookAt), matrix = matrix.asInstanceOf[js.Any], matrixAutoUpdate = matrixAutoUpdate.asInstanceOf[js.Any], matrixWorld = matrixWorld.asInstanceOf[js.Any], matrixWorldNeedsUpdate = matrixWorldNeedsUpdate.asInstanceOf[js.Any], modelViewMatrix = modelViewMatrix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], normalMatrix = normalMatrix.asInstanceOf[js.Any], onAfterRender = js.Any.fromFunction6(onAfterRender), onBeforeRender = js.Any.fromFunction6(onBeforeRender), position = position.asInstanceOf[js.Any], quaternion = quaternion.asInstanceOf[js.Any], receiveShadow = receiveShadow.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction2(removeEventListener), removeFromParent = js.Any.fromFunction0(removeFromParent), renderOrder = renderOrder.asInstanceOf[js.Any], rotateOnAxis = js.Any.fromFunction2(rotateOnAxis), rotateOnWorldAxis = js.Any.fromFunction2(rotateOnWorldAxis), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ), rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setRotationFromAxisAngle = js.Any.fromFunction2(setRotationFromAxisAngle), setRotationFromEuler = js.Any.fromFunction1(setRotationFromEuler), setRotationFromMatrix = js.Any.fromFunction1(setRotationFromMatrix), setRotationFromQuaternion = js.Any.fromFunction1(setRotationFromQuaternion), toJSON = js.Any.fromFunction0(toJSON), translateOnAxis = js.Any.fromFunction2(translateOnAxis), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ), traverse = js.Any.fromFunction1(traverse), traverseAncestors = js.Any.fromFunction1(traverseAncestors), traverseVisible = js.Any.fromFunction1(traverseVisible), up = up.asInstanceOf[js.Any], updateMatrix = js.Any.fromFunction0(updateMatrix), updateMatrixWorld = js.Any.fromFunction0(updateMatrixWorld), updateWorldMatrix = js.Any.fromFunction2(updateWorldMatrix), userData = userData.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], worldToLocal = js.Any.fromFunction1(worldToLocal))
      __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setAdd(value: /* repeated */ Instance => Instance): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddEventListener(value: (/* type */ String, /* listener */ EventListener[Event, String, Instance]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setAnimations(value: js.Array[AnimationClip]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsVarargs(value: AnimationClip*): Self = StObject.set(x, "animations", js.Array(value*))
      
      inline def setApplyMatrix4(value: /* matrix */ Matrix4 => Unit): Self = StObject.set(x, "applyMatrix4", js.Any.fromFunction1(value))
      
      inline def setApplyQuaternion(value: /* quaternion */ Quaternion => Instance): Self = StObject.set(x, "applyQuaternion", js.Any.fromFunction1(value))
      
      inline def setCastShadow(value: Boolean): Self = StObject.set(x, "castShadow", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Instance]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Instance*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClear(value: () => Instance): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClone_(value: () => Instance): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setConstructor(value: () => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
      
      inline def setCopy(value: Instance => Instance): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setCustomDepthMaterial(value: Material): Self = StObject.set(x, "customDepthMaterial", value.asInstanceOf[js.Any])
      
      inline def setCustomDistanceMaterial(value: Material): Self = StObject.set(x, "customDistanceMaterial", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatrixAutoUpdate(value: Any): Self = StObject.set(x, "DefaultMatrixAutoUpdate", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatrixAutoUpdateUndefined: Self = StObject.set(x, "DefaultMatrixAutoUpdate", js.undefined)
      
      inline def setDefaultUp(value: Any): Self = StObject.set(x, "DefaultUp", value.asInstanceOf[js.Any])
      
      inline def setDefaultUpUndefined: Self = StObject.set(x, "DefaultUp", js.undefined)
      
      inline def setDispatchEvent(value: /* event */ Event => Unit): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setFrustumCulled(value: Boolean): Self = StObject.set(x, "frustumCulled", value.asInstanceOf[js.Any])
      
      inline def setGetObjectById(value: /* id */ Double => js.UndefOr[Object3D[Event]]): Self = StObject.set(x, "getObjectById", js.Any.fromFunction1(value))
      
      inline def setGetObjectByName(value: /* name */ String => js.UndefOr[Object3D[Event]]): Self = StObject.set(x, "getObjectByName", js.Any.fromFunction1(value))
      
      inline def setGetObjectByProperty(value: (/* name */ String, /* value */ String) => js.UndefOr[Object3D[Event]]): Self = StObject.set(x, "getObjectByProperty", js.Any.fromFunction2(value))
      
      inline def setGetWorldDirection(value: /* target */ Vector3 => Vector3): Self = StObject.set(x, "getWorldDirection", js.Any.fromFunction1(value))
      
      inline def setGetWorldPosition(value: /* target */ Vector3 => Vector3): Self = StObject.set(x, "getWorldPosition", js.Any.fromFunction1(value))
      
      inline def setGetWorldQuaternion(value: /* target */ Quaternion => Quaternion): Self = StObject.set(x, "getWorldQuaternion", js.Any.fromFunction1(value))
      
      inline def setGetWorldScale(value: /* target */ Vector3 => Vector3): Self = StObject.set(x, "getWorldScale", js.Any.fromFunction1(value))
      
      inline def setHasEventListener(value: (/* type */ String, /* listener */ EventListener[Event, String, Instance]) => Boolean): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction2(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsObject3D(value: `true`): Self = StObject.set(x, "isObject3D", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLocalToWorld(value: /* vector */ Vector3 => Vector3): Self = StObject.set(x, "localToWorld", js.Any.fromFunction1(value))
      
      inline def setLookAt(value: /* vector */ Vector3 => Unit): Self = StObject.set(x, "lookAt", js.Any.fromFunction1(value))
      
      inline def setMatrix(value: Matrix4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixAutoUpdate(value: Boolean): Self = StObject.set(x, "matrixAutoUpdate", value.asInstanceOf[js.Any])
      
      inline def setMatrixWorld(value: Matrix4): Self = StObject.set(x, "matrixWorld", value.asInstanceOf[js.Any])
      
      inline def setMatrixWorldNeedsUpdate(value: Boolean): Self = StObject.set(x, "matrixWorldNeedsUpdate", value.asInstanceOf[js.Any])
      
      inline def setModelViewMatrix(value: Matrix4): Self = StObject.set(x, "modelViewMatrix", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNormalMatrix(value: Matrix3): Self = StObject.set(x, "normalMatrix", value.asInstanceOf[js.Any])
      
      inline def setOnAfterRender(
        value: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Unit
      ): Self = StObject.set(x, "onAfterRender", js.Any.fromFunction6(value))
      
      inline def setOnBeforeRender(
        value: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Unit
      ): Self = StObject.set(x, "onBeforeRender", js.Any.fromFunction6(value))
      
      inline def setParent(value: Object3D[Event]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setQuaternion(value: Quaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
      
      inline def setRaycast(
        value: (/* raycaster */ Raycaster, /* intersects */ js.Array[Intersection[Object3D[Event]]]) => Unit
      ): Self = StObject.set(x, "raycast", js.Any.fromFunction2(value))
      
      inline def setRaycastUndefined: Self = StObject.set(x, "raycast", js.undefined)
      
      inline def setReceiveShadow(value: Boolean): Self = StObject.set(x, "receiveShadow", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: /* repeated */ Instance => Instance): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveEventListener(value: (/* type */ String, /* listener */ EventListener[Event, String, Instance]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      inline def setRemoveFromParent(value: () => Instance): Self = StObject.set(x, "removeFromParent", js.Any.fromFunction0(value))
      
      inline def setRenderOrder(value: Double): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      inline def setRotateOnAxis(value: (/* axis */ Vector3, /* angle */ Double) => Instance): Self = StObject.set(x, "rotateOnAxis", js.Any.fromFunction2(value))
      
      inline def setRotateOnWorldAxis(value: (/* axis */ Vector3, /* angle */ Double) => Instance): Self = StObject.set(x, "rotateOnWorldAxis", js.Any.fromFunction2(value))
      
      inline def setRotateX(value: /* angle */ Double => Instance): Self = StObject.set(x, "rotateX", js.Any.fromFunction1(value))
      
      inline def setRotateY(value: /* angle */ Double => Instance): Self = StObject.set(x, "rotateY", js.Any.fromFunction1(value))
      
      inline def setRotateZ(value: /* angle */ Double => Instance): Self = StObject.set(x, "rotateZ", js.Any.fromFunction1(value))
      
      inline def setRotation(value: Euler): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Vector3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSetRotationFromAxisAngle(value: (/* axis */ Vector3, /* angle */ Double) => Unit): Self = StObject.set(x, "setRotationFromAxisAngle", js.Any.fromFunction2(value))
      
      inline def setSetRotationFromEuler(value: /* euler */ Euler => Unit): Self = StObject.set(x, "setRotationFromEuler", js.Any.fromFunction1(value))
      
      inline def setSetRotationFromMatrix(value: /* m */ Matrix4 => Unit): Self = StObject.set(x, "setRotationFromMatrix", js.Any.fromFunction1(value))
      
      inline def setSetRotationFromQuaternion(value: /* q */ Quaternion => Unit): Self = StObject.set(x, "setRotationFromQuaternion", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setTranslateOnAxis(value: (/* axis */ Vector3, /* distance */ Double) => Instance): Self = StObject.set(x, "translateOnAxis", js.Any.fromFunction2(value))
      
      inline def setTranslateX(value: /* distance */ Double => Instance): Self = StObject.set(x, "translateX", js.Any.fromFunction1(value))
      
      inline def setTranslateY(value: /* distance */ Double => Instance): Self = StObject.set(x, "translateY", js.Any.fromFunction1(value))
      
      inline def setTranslateZ(value: /* distance */ Double => Instance): Self = StObject.set(x, "translateZ", js.Any.fromFunction1(value))
      
      inline def setTraverse(value: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
      
      inline def setTraverseAncestors(value: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit): Self = StObject.set(x, "traverseAncestors", js.Any.fromFunction1(value))
      
      inline def setTraverseVisible(value: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Unit): Self = StObject.set(x, "traverseVisible", js.Any.fromFunction1(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUp(value: Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpdateMatrix(value: () => Unit): Self = StObject.set(x, "updateMatrix", js.Any.fromFunction0(value))
      
      inline def setUpdateMatrixWorld(value: () => Unit): Self = StObject.set(x, "updateMatrixWorld", js.Any.fromFunction0(value))
      
      inline def setUpdateWorldMatrix(value: (/* updateParents */ Boolean, /* updateChildren */ Boolean) => Unit): Self = StObject.set(x, "updateWorldMatrix", js.Any.fromFunction2(value))
      
      inline def setUserData(value: StringDictionary[Any]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWorldToLocal(value: /* vector */ Vector3 => Vector3): Self = StObject.set(x, "worldToLocal", js.Any.fromFunction1(value))
      
      inline def set__r3f(value: LocalState): Self = StObject.set(x, "__r3f", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstanceProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var attach: js.UndefOr[AttachType] = js.undefined
    
    var dispose: js.UndefOr[Null] = js.undefined
    
    var `object`: js.UndefOr[js.Object] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object InstanceProps {
    
    inline def apply(): InstanceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceProps]
    }
    
    extension [Self <: InstanceProps](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setAttach(value: AttachType): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
      
      inline def setAttachFunction2(value: (/* parent */ Instance, /* self */ Instance) => js.Function0[Unit]): Self = StObject.set(x, "attach", js.Any.fromFunction2(value))
      
      inline def setAttachUndefined: Self = StObject.set(x, "attach", js.undefined)
      
      inline def setObject(value: js.Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LocalState extends StObject {
    
    var attach: js.UndefOr[AttachType] = js.undefined
    
    var eventCount: Double
    
    var handlers: PartialEventHandlers
    
    var memoizedProps: StringDictionary[Any]
    
    var objects: js.Array[Instance]
    
    var parent: Instance | Null
    
    var previousAttach: Any
    
    var primitive: js.UndefOr[Boolean] = js.undefined
    
    var root: UseBoundStore[RootState]
    
    var `type`: String
  }
  object LocalState {
    
    inline def apply(
      eventCount: Double,
      handlers: PartialEventHandlers,
      memoizedProps: StringDictionary[Any],
      objects: js.Array[Instance],
      previousAttach: Any,
      root: UseBoundStore[RootState],
      `type`: String
    ): LocalState = {
      val __obj = js.Dynamic.literal(eventCount = eventCount.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], memoizedProps = memoizedProps.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], previousAttach = previousAttach.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], parent = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalState]
    }
    
    extension [Self <: LocalState](x: Self) {
      
      inline def setAttach(value: AttachType): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
      
      inline def setAttachFunction2(value: (/* parent */ Instance, /* self */ Instance) => js.Function0[Unit]): Self = StObject.set(x, "attach", js.Any.fromFunction2(value))
      
      inline def setAttachUndefined: Self = StObject.set(x, "attach", js.undefined)
      
      inline def setEventCount(value: Double): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
      
      inline def setHandlers(value: PartialEventHandlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setMemoizedProps(value: StringDictionary[Any]): Self = StObject.set(x, "memoizedProps", value.asInstanceOf[js.Any])
      
      inline def setObjects(value: js.Array[Instance]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsVarargs(value: Instance*): Self = StObject.set(x, "objects", js.Array(value*))
      
      inline def setParent(value: Instance): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setPreviousAttach(value: Any): Self = StObject.set(x, "previousAttach", value.asInstanceOf[js.Any])
      
      inline def setPrimitive(value: Boolean): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
      
      inline def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
      
      inline def setRoot(value: UseBoundStore[RootState]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Root extends StObject {
    
    var fiber: FiberRoot
    
    var store: UseBoundStore[RootState]
  }
  object Root {
    
    inline def apply(fiber: FiberRoot, store: UseBoundStore[RootState]): Root = {
      val __obj = js.Dynamic.literal(fiber = fiber.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Root]
    }
    
    extension [Self <: Root](x: Self) {
      
      inline def setFiber(value: FiberRoot): Self = StObject.set(x, "fiber", value.asInstanceOf[js.Any])
      
      inline def setStore(value: UseBoundStore[RootState]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
