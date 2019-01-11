package typings
package reDashReselectLib.reDashReselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-reselect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[S, R1, T](
    selector: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[S, T, js.Function1[/* res */ R1, T]] = js.native
  def default[S, R1, T](
    selectors: js.Array[reDashReselectLib.reDashReselectMod.Selector[S, R1]],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[S, T, js.Function1[/* res */ R1, T]] = js.native
  def default[S, R1, R2, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[S, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  def default[S, P, R1, T](
    selector: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T]] = js.native
  def default[S, R1, R2, T](
    selectors: js.Tuple2[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2]
    ],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[S, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  def default[S, P, R1, R2, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[S, P, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  def default[S, R1, R2, R3, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[S, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  def default[S, R1, R2, R3, T](
    selectors: js.Tuple3[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[S, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  def default[S, P, R1, R2, R3, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[S, P, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  def default[S, R1, R2, R3, R4, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[S, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  def default[S, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[S, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  def default[S, P, R1, R2, R3, R4, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[S, P, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  def default[S, R1, R2, R3, R4, R5, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  def default[S, P, R1, R2, R3, R4, R5, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S, R7],
    combiner: js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7]
    ],
    combiner: js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ] = js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7],
    combiner: js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S, R8],
    combiner: js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S, R8]
    ],
    combiner: js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ] = js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8],
    combiner: js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S, R8],
    selector9: reDashReselectLib.reDashReselectMod.Selector[S, R9],
    combiner: js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S, R9]
    ],
    combiner: js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ] = js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8],
    selector9: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9],
    combiner: js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S, R8],
    selector9: reDashReselectLib.reDashReselectMod.Selector[S, R9],
    selector10: reDashReselectLib.reDashReselectMod.Selector[S, R10],
    combiner: js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S, R10]
    ],
    combiner: js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ] = js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8],
    selector9: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9],
    selector10: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R10],
    combiner: js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S, R8],
    selector9: reDashReselectLib.reDashReselectMod.Selector[S, R9],
    selector10: reDashReselectLib.reDashReselectMod.Selector[S, R10],
    selector11: reDashReselectLib.reDashReselectMod.Selector[S, R11],
    combiner: js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S, R10], 
      reDashReselectLib.reDashReselectMod.Selector[S, R11]
    ],
    combiner: js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ] = js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8],
    selector9: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9],
    selector10: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R10],
    selector11: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R11],
    combiner: js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S, R8],
    selector9: reDashReselectLib.reDashReselectMod.Selector[S, R9],
    selector10: reDashReselectLib.reDashReselectMod.Selector[S, R10],
    selector11: reDashReselectLib.reDashReselectMod.Selector[S, R11],
    selector12: reDashReselectLib.reDashReselectMod.Selector[S, R12],
    combiner: js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S, R10], 
      reDashReselectLib.reDashReselectMod.Selector[S, R11], 
      reDashReselectLib.reDashReselectMod.Selector[S, R12]
    ],
    combiner: js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ] = js.native
  def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8],
    selector9: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9],
    selector10: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R10],
    selector11: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R11],
    selector12: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R12],
    combiner: js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3R4R5R6R7R8R9R10R11R12TOutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R10], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R11], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R12]
    ],
    combiner: js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function12[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      /* res12 */ R12, 
      T
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3R4R5R6R7R8R9R10R11TOutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R10], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R11]
    ],
    combiner: js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function11[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      /* res11 */ R11, 
      T
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3R4R5R6R7R8R9R10TOutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R10]
    ],
    combiner: js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function10[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      /* res10 */ R10, 
      T
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3R4R5R6R7R8R9TOutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9]
    ],
    combiner: js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function9[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      /* res9 */ R9, 
      T
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3R4R5R6R7R8TOutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8]
    ],
    combiner: js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function8[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      /* res8 */ R8, 
      T
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3R4R5R6R7TOutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7]
    ],
    combiner: js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function7[
      /* res1 */ R1, 
      /* res2 */ R2, 
      /* res3 */ R3, 
      /* res4 */ R4, 
      /* res5 */ R5, 
      /* res6 */ R6, 
      /* res7 */ R7, 
      T
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3R4R5R6TOutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3R4R5TOutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3R4TOutputParametricCachedSelector[S, P, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[S, P, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  @JSName("default")
  def default_SPR1R2R3TOutputParametricCachedSelector[S, P, R1, R2, R3, T](
    selectors: js.Tuple3[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[S, P, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  @JSName("default")
  def default_SPR1R2TOutputParametricCachedSelector[S, P, R1, R2, T](
    selectors: js.Tuple2[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2]
    ],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[S, P, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  @JSName("default")
  def default_SPR1TOutputParametricCachedSelector[S, P, R1, T](
    selectors: js.Array[reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1]],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T]] = js.native
}

