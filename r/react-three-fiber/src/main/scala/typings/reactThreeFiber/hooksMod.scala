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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-three-fiber/hooks", "useFrame")
  @js.native
  def useFrame(callback: RenderCallback): Null = js.native
  @JSImport("react-three-fiber/hooks", "useFrame")
  @js.native
  def useFrame(callback: RenderCallback, renderPriority: Double): Null = js.native
  
  @JSImport("react-three-fiber/hooks", "useGraph")
  @js.native
  def useGraph(`object`: Object3D): ObjectMap = js.native
  
  object useLoader {
    
    @JSImport("react-three-fiber/hooks", "useLoader")
    @js.native
    def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String]): T = js.native
    @JSImport("react-three-fiber/hooks", "useLoader")
    @js.native
    def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = js.native
    @JSImport("react-three-fiber/hooks", "useLoader")
    @js.native
    def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String], extensions: Extensions): T = js.native
    @JSImport("react-three-fiber/hooks", "useLoader")
    @js.native
    def apply[T](
      Proto: Instantiable0[LoaderResult[T]],
      input: String | js.Array[String],
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): T = js.native
    @JSImport("react-three-fiber/hooks", "useLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-three-fiber/hooks", "useLoader.preload")
    @js.native
    def preload: js.Function3[
        /* Proto */ Instantiable0[LoaderResult[js.Any]], 
        /* url */ String | js.Array[String], 
        /* extensions */ js.UndefOr[Extensions], 
        js.UndefOr[scala.Nothing]
      ] = js.native
    @scala.inline
    def preload_=(
      x: js.Function3[
          /* Proto */ Instantiable0[LoaderResult[js.Any]], 
          /* url */ String | js.Array[String], 
          /* extensions */ js.UndefOr[Extensions], 
          js.UndefOr[scala.Nothing]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-three-fiber/hooks", "useResource")
  @js.native
  def useResource[T](): MutableRefObject[T] = js.native
  @JSImport("react-three-fiber/hooks", "useResource")
  @js.native
  def useResource[T](optionalRef: MutableRefObject[T]): MutableRefObject[T] = js.native
  
  @JSImport("react-three-fiber/hooks", "useThree")
  @js.native
  def useThree(): SharedCanvasContext = js.native
  
  @JSImport("react-three-fiber/hooks", "useUpdate")
  @js.native
  def useUpdate[T](callback: js.Function1[/* props */ T, Unit], dependents: js.Array[_]): MutableRefObject[js.UndefOr[T]] = js.native
  @JSImport("react-three-fiber/hooks", "useUpdate")
  @js.native
  def useUpdate[T](
    callback: js.Function1[/* props */ T, Unit],
    dependents: js.Array[_],
    optionalRef: MutableRefObject[T]
  ): MutableRefObject[js.UndefOr[T]] = js.native
  
  type Extensions = js.Function1[/* loader */ typings.three.mod.Loader, Unit]
  
  @js.native
  trait Loader[T]
    extends typings.three.mod.Loader {
    
    def load(url: String): js.Any = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): js.Any = js.native
    def load(
      url: String,
      onLoad: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
    def load(url: String, onLoad: js.Function1[/* result */ T, Unit]): js.Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ T, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): js.Any = js.native
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
  }
  
  type LoaderResult[T] = Loader[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any) | T
  ]
  
  @js.native
  trait ObjectMap extends StObject {
    
    var materials: StringDictionary[Material] = js.native
    
    var nodes: StringDictionary[Object3D] = js.native
  }
  object ObjectMap {
    
    @scala.inline
    def apply(materials: StringDictionary[Material], nodes: StringDictionary[Object3D]): ObjectMap = {
      val __obj = js.Dynamic.literal(materials = materials.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectMap]
    }
    
    @scala.inline
    implicit class ObjectMapMutableBuilder[Self <: ObjectMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaterials(value: StringDictionary[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: StringDictionary[Object3D]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    }
  }
}
