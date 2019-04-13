package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Custom implementation of the array functions, which return Immutable. */
@js.native
trait Overrides[T] extends js.Object {
  def concat(arr: (T | js.Array[T])*): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
  def filter(filterFunction: js.Function1[/* item */ T, scala.Boolean]): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
  def map[TTarget](mapFuction: js.Function1[/* item */ T, TTarget]): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[TTarget], js.Object] = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object] = js.native
  def reduce[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      TTarget
    ],
    initialValue: TTarget
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[TTarget, js.Object] = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object] = js.native
  def reduceRight[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      TTarget
    ],
    initialValue: TTarget
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[TTarget, js.Object] = js.native
  @JSName("reduceRight")
  def reduceRight_TTarget[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      TTarget
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[TTarget, js.Object] = js.native
  @JSName("reduce")
  def reduce_TTarget[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      TTarget
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[TTarget, js.Object] = js.native
  def slice(): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
  def slice(start: scala.Double): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
  def slice(start: scala.Double, end: scala.Double): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
}

