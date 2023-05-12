package typings.rdfjsTraverser

import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traverserMod {
  
  @JSImport("@rdfjs/traverser/Traverser", JSImport.Default)
  @js.native
  open class default[D /* <: DatasetCore[Quad, Quad] */] protected ()
    extends StObject
       with Traverser[D] {
    def this(filter: TraversePredicate[D]) = this()
    def this(filter: TraversePredicate[D], options: Options) = this()
  }
  
  trait CallbackParams[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var dataset: D
    
    var level: Double
    
    var quad: Quad
  }
  object CallbackParams {
    
    inline def apply[D /* <: DatasetCore[Quad, Quad] */](dataset: D, level: Double, quad: Quad): CallbackParams[D] = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], quad = quad.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackParams[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbackParams[?], D /* <: DatasetCore[Quad, Quad] */] (val x: Self & CallbackParams[D]) extends AnyVal {
      
      inline def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setQuad(value: Quad): Self = StObject.set(x, "quad", value.asInstanceOf[js.Any])
    }
  }
  
  type ForEachCallback[D /* <: DatasetCore[Quad, Quad] */] = js.Function1[/* arg */ CallbackParams[D], Unit]
  
  trait Options extends StObject {
    
    var backward: Boolean
    
    var factory: DataFactory[Quad, Quad]
    
    var forward: Boolean
  }
  object Options {
    
    inline def apply(backward: Boolean, factory: DataFactory[Quad, Quad], forward: Boolean): Options = {
      val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
      
      inline def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointerLike[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    var dataset: D
    
    var term: Term
  }
  object PointerLike {
    
    inline def apply[D /* <: DatasetCore[Quad, Quad] */](dataset: D, term: Term): PointerLike[D] = {
      val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerLike[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointerLike[?], D /* <: DatasetCore[Quad, Quad] */] (val x: Self & PointerLike[D]) extends AnyVal {
      
      inline def setDataset(value: D): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: Term): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  type ReduceCallback[D /* <: DatasetCore[Quad, Quad] */, R] = js.Function2[/* context */ CallbackParams[D], /* result */ R, R]
  
  type TraversePredicate[D /* <: DatasetCore[Quad, Quad] */] = js.Function1[/* arg */ CallbackParams[D], Boolean]
  
  @js.native
  trait Traverser[D /* <: DatasetCore[Quad, Quad] */] extends StObject {
    
    def forEach(pointer: PointerLike[D], callback: ForEachCallback[D]): Unit = js.native
    
    def `match`(pointer: PointerLike[D]): D = js.native
    
    def reduce[R](pointer: PointerLike[D], callback: ReduceCallback[D, js.UndefOr[R]]): js.UndefOr[R] = js.native
    def reduce[R](pointer: PointerLike[D], callback: ReduceCallback[D, R], initialValue: R): R = js.native
  }
}
