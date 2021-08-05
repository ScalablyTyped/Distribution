package typings.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MutableRefObject
import typings.reactThreeFiber.canvasMod.RenderCallback
import typings.reactThreeFiber.canvasMod.SharedCanvasContext
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.mod.Material
import typings.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-three-fiber/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFrame(callback: RenderCallback): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Null]
  inline def useFrame(callback: RenderCallback, renderPriority: Double): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any], renderPriority.asInstanceOf[js.Any])).asInstanceOf[Null]
  
  inline def useGraph(`object`: Object3D): ObjectMap = ^.asInstanceOf[js.Dynamic].applyDynamic("useGraph")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectMap]
  
  object useLoader {
    
    inline def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String]): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String], extensions: Extensions): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @JSImport("react-three-fiber/hooks", "useLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-three-fiber/hooks", "useLoader.preload")
    @js.native
    def preload: js.Function3[
        /* Proto */ Instantiable0[LoaderResult[js.Any]], 
        /* url */ String | js.Array[String], 
        /* extensions */ js.UndefOr[Extensions], 
        Unit
      ] = js.native
    inline def preload_=(
      x: js.Function3[
          /* Proto */ Instantiable0[LoaderResult[js.Any]], 
          /* url */ String | js.Array[String], 
          /* extensions */ js.UndefOr[Extensions], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
  }
  
  inline def useResource[T](): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResource")().asInstanceOf[MutableRefObject[T]]
  inline def useResource[T](optionalRef: MutableRefObject[T]): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResource")(optionalRef.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
  inline def useThree(): SharedCanvasContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useThree")().asInstanceOf[SharedCanvasContext]
  
  inline def useUpdate[T](callback: js.Function1[/* props */ T, Unit], dependents: js.Array[js.Any]): MutableRefObject[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdate")(callback.asInstanceOf[js.Any], dependents.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Unit]]
  inline def useUpdate[T](
    callback: js.Function1[/* props */ T, Unit],
    dependents: js.Array[js.Any],
    optionalRef: MutableRefObject[T]
  ): MutableRefObject[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdate")(callback.asInstanceOf[js.Any], dependents.asInstanceOf[js.Any], optionalRef.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Unit]]
  
  type Extensions = js.Function1[/* loader */ typings.three.mod.Loader, Unit]
  
  @js.native
  trait Loader[T]
    extends typings.three.mod.Loader {
    
    def load(url: String): js.Any = js.native
    def load(url: String, onLoad: js.Function1[/* result */ T, Unit]): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ T, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ T, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ T, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(url: String, onLoad: Unit, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Any = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(url: String, onLoad: Unit, onProgress: Unit, onError: js.Function1[/* event */ ErrorEvent, Unit]): js.Any = js.native
  }
  
  type LoaderResult[T] = Loader[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any) | T
  ]
  
  trait ObjectMap extends StObject {
    
    var materials: StringDictionary[Material]
    
    var nodes: StringDictionary[Object3D]
  }
  object ObjectMap {
    
    inline def apply(materials: StringDictionary[Material], nodes: StringDictionary[Object3D]): ObjectMap = {
      val __obj = js.Dynamic.literal(materials = materials.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectMap]
    }
    
    extension [Self <: ObjectMap](x: Self) {
      
      inline def setMaterials(value: StringDictionary[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: StringDictionary[Object3D]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    }
  }
}
