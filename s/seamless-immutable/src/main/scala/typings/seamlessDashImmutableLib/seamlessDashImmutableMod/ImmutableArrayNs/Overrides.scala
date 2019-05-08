package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod.ImmutableArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Custom implementation of the array functions, which return Immutable. */
@js.native
trait Overrides[T] extends js.Object {
  def concat(
    arr: (T | js.Array[T] | (seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object]) | (js.Array[seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object]]) | (seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object]))*
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
  def filter(
    filterFunction: js.Function1[
      /* item */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      scala.Boolean
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* index */ scala.Double, 
      /* array */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* index */ scala.Double, 
      /* array */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object], 
      scala.Unit
    ],
    thisArg: js.Any
  ): scala.Unit = js.native
  def map[TTarget](
    mapFuction: js.Function1[
      /* item */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      TTarget
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[TTarget], js.Object] = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* currentValue */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* currentIndex */ scala.Double, 
      /* array */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object], 
      T
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object] = js.native
  def reduce[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* currentIndex */ scala.Double, 
      /* array */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object], 
      TTarget
    ],
    initialValue: TTarget
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[TTarget, js.Object] = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* currentValue */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* currentIndex */ scala.Double, 
      /* array */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object], 
      T
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object] = js.native
  def reduceRight[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* currentIndex */ scala.Double, 
      /* array */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object], 
      TTarget
    ],
    initialValue: TTarget
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[TTarget, js.Object] = js.native
  @JSName("reduceRight")
  def reduceRight_TTarget[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* currentIndex */ scala.Double, 
      /* array */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object], 
      TTarget
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[TTarget, js.Object] = js.native
  @JSName("reduce")
  def reduce_TTarget[TTarget](
    callbackfn: js.Function4[
      /* previousValue */ TTarget, 
      /* currentValue */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[T, js.Object], 
      /* currentIndex */ scala.Double, 
      /* array */ seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object], 
      TTarget
    ]
  ): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[TTarget, js.Object] = js.native
  def slice(): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
  def slice(start: scala.Double): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
  def slice(start: scala.Double, end: scala.Double): seamlessDashImmutableLib.seamlessDashImmutableMod.Immutable[js.Array[T], js.Object] = js.native
}

