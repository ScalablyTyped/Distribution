package typings.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.DependencyList
import typings.react.mod.Dispatch
import typings.react.mod.EffectCallback
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.reactThreeFiber.anon.Children
import typings.reactThreeFiber.anon.Dictkey
import typings.reactThreeFiber.anon.Error
import typings.reactThreeFiber.anon.Manual
import typings.reactThreeFiber.anon.OmitUnblockPropschildren
import typings.reactThreeFiber.anon.PartialLocalState
import typings.reactThreeFiber.distDeclarationsSrcCoreRendererMod.AttachType
import typings.reactThreeFiber.distDeclarationsSrcCoreRendererMod.Instance
import typings.reactThreeFiber.distDeclarationsSrcCoreRendererMod.InstanceProps
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.Dpr
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.Size
import typings.reactThreeFiber.reactThreeFiberBooleans.`false`
import typings.reactThreeFiber.reactThreeFiberStrings.reference
import typings.reactThreeFiber.reactThreeFiberStrings.shallow
import typings.three.mod.Material
import typings.three.mod.Object3D
import typings.three.mod.OrthographicCamera
import typings.three.mod.PerspectiveCamera
import typings.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCoreUtilsMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Block(param0: OmitUnblockPropschildren): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Block")(param0.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/utils", "DEFAULT")
  @js.native
  val DEFAULT: /* "__default" */ String = js.native
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/utils", "ErrorBoundary")
  @js.native
  open class ErrorBoundary protected () extends Component[Children, Error, Any] {
    def this(props: Children) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Children, context: Any) = this()
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(err: js.Error): Unit = js.native
  }
  /* static members */
  object ErrorBoundary {
    
    @JSImport("@react-three/fiber/dist/declarations/src/core/utils", "ErrorBoundary")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")().asInstanceOf[Error]
  }
  
  inline def applyProps(instance: Instance, data: InstanceProps): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def applyProps(instance: Instance, data: DiffSet): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  inline def attach(parent: Instance, child: Instance, `type`: AttachType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def buildGraph(`object`: Object3D[Event]): ObjectMap = ^.asInstanceOf[js.Dynamic].applyDynamic("buildGraph")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectMap]
  
  inline def calculateDpr(dpr: Dpr): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDpr")(dpr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def detach(parent: Instance, child: Instance, `type`: AttachType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def diffProps(instance: Instance, param1: InstanceProps): DiffSet = (^.asInstanceOf[js.Dynamic].applyDynamic("diffProps")(instance.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[DiffSet]
  inline def diffProps(instance: Instance, param1: InstanceProps, param2: Unit, remove: Boolean): DiffSet = (^.asInstanceOf[js.Dynamic].applyDynamic("diffProps")(instance.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], remove.asInstanceOf[js.Any])).asInstanceOf[DiffSet]
  inline def diffProps(instance: Instance, param1: InstanceProps, param2: InstanceProps): DiffSet = (^.asInstanceOf[js.Dynamic].applyDynamic("diffProps")(instance.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[DiffSet]
  inline def diffProps(instance: Instance, param1: InstanceProps, param2: InstanceProps, remove: Boolean): DiffSet = (^.asInstanceOf[js.Dynamic].applyDynamic("diffProps")(instance.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], remove.asInstanceOf[js.Any])).asInstanceOf[DiffSet]
  
  inline def dispose[TObj /* <: Dictkey */](obj: TObj): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getRootState(obj: Object3D[Event]): js.UndefOr[RootState] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootState")(obj.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RootState]]
  
  inline def invalidateInstance(instance: Instance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object is {
    
    @JSImport("@react-three/fiber/dist/declarations/src/core/utils", "is")
    @js.native
    val ^ : js.Any = js.native
    
    inline def arr(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arr")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def boo(a: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boo")(a.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    inline def equ(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equ")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equ(a: Any, b: Any, param2: EquConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equ")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fun(a: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fun")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    inline def num(a: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("num")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def obj(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def str(a: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def und(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("und")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def isDiffSet(`def`: Any): /* is @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.DiffSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiffSet")(`def`.asInstanceOf[js.Any]).asInstanceOf[/* is @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.DiffSet */ Boolean]
  
  inline def isOrthographicCamera(`def`: Camera): /* is three.three.OrthographicCamera */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrthographicCamera")(`def`.asInstanceOf[js.Any]).asInstanceOf[/* is three.three.OrthographicCamera */ Boolean]
  
  inline def isRef(obj: Any): /* is react.react.MutableRefObject<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.MutableRefObject<unknown> */ Boolean]
  
  inline def prepare[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def prepare[T](`object`: T, state: PartialLocalState): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(`object`.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def setDeep(obj: Any, value: Any, keys: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setDeep")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def updateCamera(camera: Camera & Manual, size: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCamera")(camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateInstance(instance: Instance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useMutableCallback[T](fn: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutableCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
  type Camera = OrthographicCamera | PerspectiveCamera
  
  @js.native
  trait ClassConstructor
    extends StObject
       with Instantiable0[Unit]
  
  trait DiffSet extends StObject {
    
    var changes: js.Array[
        js.Tuple4[/* key */ String, /* value */ Any, /* isEvent */ Boolean, /* keys */ js.Array[String]]
      ]
    
    var memoized: StringDictionary[Any]
  }
  object DiffSet {
    
    inline def apply(
      changes: js.Array[
          js.Tuple4[/* key */ String, /* value */ Any, /* isEvent */ Boolean, /* keys */ js.Array[String]]
        ],
      memoized: StringDictionary[Any]
    ): DiffSet = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], memoized = memoized.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffSet]
    }
    
    extension [Self <: DiffSet](x: Self) {
      
      inline def setChanges(
        value: js.Array[
              js.Tuple4[/* key */ String, /* value */ Any, /* isEvent */ Boolean, /* keys */ js.Array[String]]
            ]
      ): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(
        value: (js.Tuple4[/* key */ String, /* value */ Any, /* isEvent */ Boolean, /* keys */ js.Array[String]])*
      ): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setMemoized(value: StringDictionary[Any]): Self = StObject.set(x, "memoized", value.asInstanceOf[js.Any])
    }
  }
  
  trait EquConfig extends StObject {
    
    var arrays: js.UndefOr[reference | shallow] = js.undefined
    
    var objects: js.UndefOr[reference | shallow] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object EquConfig {
    
    inline def apply(): EquConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EquConfig]
    }
    
    extension [Self <: EquConfig](x: Self) {
      
      inline def setArrays(value: reference | shallow): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      inline def setObjects(value: reference | shallow): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait ObjectMap extends StObject {
    
    var materials: StringDictionary[Material]
    
    var nodes: StringDictionary[Object3D[Event]]
  }
  object ObjectMap {
    
    inline def apply(materials: StringDictionary[Material], nodes: StringDictionary[Object3D[Event]]): ObjectMap = {
      val __obj = js.Dynamic.literal(materials = materials.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectMap]
    }
    
    extension [Self <: ObjectMap](x: Self) {
      
      inline def setMaterials(value: StringDictionary[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: StringDictionary[Object3D[Event]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    }
  }
  
  type SetBlock = `false` | js.Promise[Null] | Null
  
  trait UnblockProps extends StObject {
    
    var children: ReactNode
    
    var set: Dispatch[SetStateAction[SetBlock]]
  }
  object UnblockProps {
    
    inline def apply(set: SetStateAction[SetBlock] => Unit): UnblockProps = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[UnblockProps]
    }
    
    extension [Self <: UnblockProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setSet(value: SetStateAction[SetBlock] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
}
