package typings.reactMosaicComponent

import typings.immutabilityHelper.mod.Spec
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  object MosaicDragType {
    
    @JSImport("react-mosaic-component/lib/types", "MosaicDragType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/types", "MosaicDragType.WINDOW")
    @js.native
    def WINDOW: String = js.native
    inline def WINDOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CreateNode[T /* <: MosaicKey */] extends StObject {
    
    def apply(args: Any*): js.Promise[MosaicNode[T]] | MosaicNode[T] = js.native
  }
  
  trait EnabledResizeOptions
    extends StObject
       with ResizeOptions {
    
    var minimumPaneSizePercentage: js.UndefOr[Double] = js.undefined
  }
  object EnabledResizeOptions {
    
    inline def apply(): EnabledResizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnabledResizeOptions]
    }
    
    extension [Self <: EnabledResizeOptions](x: Self) {
      
      inline def setMinimumPaneSizePercentage(value: Double): Self = StObject.set(x, "minimumPaneSizePercentage", value.asInstanceOf[js.Any])
      
      inline def setMinimumPaneSizePercentageUndefined: Self = StObject.set(x, "minimumPaneSizePercentage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMosaicComponent.reactMosaicComponentStrings.first
    - typings.reactMosaicComponent.reactMosaicComponentStrings.second
  */
  trait MosaicBranch extends StObject
  object MosaicBranch {
    
    inline def first: typings.reactMosaicComponent.reactMosaicComponentStrings.first = "first".asInstanceOf[typings.reactMosaicComponent.reactMosaicComponentStrings.first]
    
    inline def second: typings.reactMosaicComponent.reactMosaicComponentStrings.second = "second".asInstanceOf[typings.reactMosaicComponent.reactMosaicComponentStrings.second]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMosaicComponent.reactMosaicComponentStrings.row
    - typings.reactMosaicComponent.reactMosaicComponentStrings.column
  */
  trait MosaicDirection extends StObject
  object MosaicDirection {
    
    inline def column: typings.reactMosaicComponent.reactMosaicComponentStrings.column = "column".asInstanceOf[typings.reactMosaicComponent.reactMosaicComponentStrings.column]
    
    inline def row: typings.reactMosaicComponent.reactMosaicComponentStrings.row = "row".asInstanceOf[typings.reactMosaicComponent.reactMosaicComponentStrings.row]
  }
  
  type MosaicKey = String | Double
  
  type MosaicNode[T /* <: MosaicKey */] = MosaicParent[T] | T
  
  trait MosaicParent[T /* <: MosaicKey */] extends StObject {
    
    var direction: MosaicDirection
    
    var first: MosaicNode[T]
    
    var second: MosaicNode[T]
    
    var splitPercentage: js.UndefOr[Double] = js.undefined
  }
  object MosaicParent {
    
    inline def apply[T /* <: MosaicKey */](direction: MosaicDirection, first: MosaicNode[T], second: MosaicNode[T]): MosaicParent[T] = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
      __obj.asInstanceOf[MosaicParent[T]]
    }
    
    extension [Self <: MosaicParent[?], T /* <: MosaicKey */](x: Self & MosaicParent[T]) {
      
      inline def setDirection(value: MosaicDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: MosaicNode[T]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: MosaicNode[T]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSplitPercentage(value: Double): Self = StObject.set(x, "splitPercentage", value.asInstanceOf[js.Any])
      
      inline def setSplitPercentageUndefined: Self = StObject.set(x, "splitPercentage", js.undefined)
    }
  }
  
  type MosaicPath = js.Array[MosaicBranch]
  
  trait MosaicUpdate[T /* <: MosaicKey */] extends StObject {
    
    var path: MosaicPath
    
    var spec: MosaicUpdateSpec[T]
  }
  object MosaicUpdate {
    
    inline def apply[T /* <: MosaicKey */](path: MosaicPath, spec: MosaicUpdateSpec[T]): MosaicUpdate[T] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[MosaicUpdate[T]]
    }
    
    extension [Self <: MosaicUpdate[?], T /* <: MosaicKey */](x: Self & MosaicUpdate[T]) {
      
      inline def setPath(value: MosaicPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: MosaicBranch*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSpec(value: MosaicUpdateSpec[T]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecFunction1(value: MosaicNode[T] => MosaicNode[T]): Self = StObject.set(x, "spec", js.Any.fromFunction1(value))
    }
  }
  
  type MosaicUpdateSpec[T /* <: MosaicKey */] = Spec[MosaicNode[T], scala.Nothing]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMosaicComponent.reactMosaicComponentStrings.DISABLED
    - typings.reactMosaicComponent.libTypesMod.EnabledResizeOptions
  */
  trait ResizeOptions extends StObject
  
  type TileRenderer[T /* <: MosaicKey */] = js.Function2[/* t */ T, /* path */ js.Array[MosaicBranch], Element]
}
