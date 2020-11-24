package typings.seamlessImmutable.mod.ImmutableArray

import typings.seamlessImmutable.mod.Immutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Custom implementation of the array functions, which return Immutable. */
@js.native
trait Overrides[T] extends js.Object {
  
  def concat(arr: (T | (js.Array[(Immutable[T, js.Object]) | T]) | (Immutable[js.Array[T] | T, js.Object]))*): Immutable[js.Array[T], js.Object] = js.native
  
  def filter(filterFunction: js.Function2[/* item */ Immutable[T, js.Object], /* index */ Double, Boolean]): Immutable[js.Array[T], js.Object] = js.native
  
  def forEach(
    callbackfn: js.Function3[
      /* value */ Immutable[T, js.Object], 
      /* index */ Double, 
      /* array */ Immutable[js.Array[T], js.Object], 
      Unit
    ]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ Immutable[T, js.Object], 
      /* index */ Double, 
      /* array */ Immutable[js.Array[T], js.Object], 
      Unit
    ],
    thisArg: js.Any
  ): Unit = js.native
  
  def map[TTarget](
    mapFuction: js.Function3[
      /* item */ Immutable[T, js.Object], 
      /* index */ Double, 
      /* array */ Immutable[js.Array[T], js.Object], 
      TTarget
    ]
  ): Immutable[js.Array[TTarget], js.Object] = js.native
  
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Immutable[T, js.Object], 
      /* currentValue */ Immutable[T, js.Object], 
      /* currentIndex */ Double, 
      /* array */ Immutable[js.Array[T], js.Object], 
      T
    ]
  ): Immutable[T, js.Object] = js.native
  def reduce[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ Immutable[T, js.Object], 
      /* currentIndex */ Double, 
      /* array */ Immutable[js.Array[T], js.Object], 
      TTarget
    ],
    initialValue: TTarget
  ): Immutable[TTarget, js.Object] = js.native
  
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Immutable[T, js.Object], 
      /* currentValue */ Immutable[T, js.Object], 
      /* currentIndex */ Double, 
      /* array */ Immutable[js.Array[T], js.Object], 
      T
    ]
  ): Immutable[T, js.Object] = js.native
  def reduceRight[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ Immutable[T, js.Object], 
      /* currentIndex */ Double, 
      /* array */ Immutable[js.Array[T], js.Object], 
      TTarget
    ],
    initialValue: TTarget
  ): Immutable[TTarget, js.Object] = js.native
  @JSName("reduceRight")
  def reduceRight_TTarget[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ Immutable[T, js.Object], 
      /* currentIndex */ Double, 
      /* array */ Immutable[js.Array[T], js.Object], 
      TTarget
    ]
  ): Immutable[TTarget, js.Object] = js.native
  
  @JSName("reduce")
  def reduce_TTarget[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ Immutable[T, js.Object], 
      /* currentIndex */ Double, 
      /* array */ Immutable[js.Array[T], js.Object], 
      TTarget
    ]
  ): Immutable[TTarget, js.Object] = js.native
  
  def slice(): Immutable[js.Array[T], js.Object] = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): Immutable[js.Array[T], js.Object] = js.native
  def slice(start: Double): Immutable[js.Array[T], js.Object] = js.native
  def slice(start: Double, end: Double): Immutable[js.Array[T], js.Object] = js.native
}
