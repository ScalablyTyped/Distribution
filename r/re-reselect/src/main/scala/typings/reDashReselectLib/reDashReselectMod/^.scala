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
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function1[/* res */ R1, T], 
    js.Array[reDashReselectLib.reDashReselectMod.Selector[S, R1]]
  ] = js.native
  def default[S, R, T](
    selectors: js.Array[reDashReselectLib.reDashReselectMod.Selector[S, R]],
    combiner: js.Function1[/* repeated */ R, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function1[/* repeated */ R, T], 
    js.Array[reDashReselectLib.reDashReselectMod.Selector[S, R]]
  ] = js.native
  def default[S, R1, R2, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2]
    ]
  ] = js.native
  def default[S1, P1, R1, T](
    selector: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1, 
    P1, 
    T, 
    js.Function1[/* res */ R1, T], 
    js.Array[reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1]]
  ] = js.native
  def default[S, R1, R2, T](
    selectors: js.Tuple2[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2]
    ],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2]
    ]
  ] = js.native
  def default[S, P, R1, R2, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2]
    ]
  ] = js.native
  def default[S, R1, R2, R3, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3]
    ]
  ] = js.native
  def default[S, R1, R2, R3, T](
    selectors: js.Tuple3[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3]
    ]
  ] = js.native
  def default[S, P, R1, R2, R3, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3]
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4]
    ]
  ] = js.native
  def default[S, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4]
    ]
  ] = js.native
  def default[S, P, R1, R2, R3, R4, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4]
    ]
  ] = js.native
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
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5]
    ]
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
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5]
    ]
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
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5]
    ]
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
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6]
    ]
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
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6]
    ]
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
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6]
    ]
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
    ], 
    js.Tuple7[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7]
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
    ], 
    js.Tuple7[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7]
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
    ], 
    js.Tuple7[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7]
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
    ], 
    js.Tuple8[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S, R8]
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
    ], 
    js.Tuple8[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S, R8]
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
    ], 
    js.Tuple8[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8]
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
    ], 
    js.Tuple9[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S, R9]
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
    ], 
    js.Tuple9[
      reDashReselectLib.reDashReselectMod.Selector[S, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S, R9]
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
    ], 
    js.Tuple9[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9]
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
    ], 
    js.Tuple10[
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
    ], 
    js.Tuple10[
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
    ], 
    js.Tuple10[
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
    ], 
    js.Tuple11[
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
    ], 
    js.Tuple11[
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
    ], 
    js.Tuple11[
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
    ], 
    js.Tuple12[
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
    ], 
    js.Tuple12[
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
    ], 
    js.Tuple12[
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
    ]
  ] = js.native
  @JSName("default")
  def default_S1P1R1TOutputParametricCachedSelector[S1, P1, R1, T](
    selectors: js.Array[reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1]],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1, 
    P1, 
    T, 
    js.Function1[/* res */ R1, T], 
    js.Array[reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1]]
  ] = js.native
  @JSName("default")
  def default_S1R1T[S1, R1, T](
    selector: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1, 
    T, 
    js.Function1[/* res */ R1, T], 
    js.Array[reDashReselectLib.reDashReselectMod.Selector[S1, R1]]
  ] = js.native
  @JSName("default")
  def default_S1R1T[S1, R1, T](
    selectors: js.Array[reDashReselectLib.reDashReselectMod.Selector[S1, R1]],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1, 
    T, 
    js.Function1[/* res */ R1, T], 
    js.Array[reDashReselectLib.reDashReselectMod.Selector[S1, R1]]
  ] = js.native
  @JSName("default")
  def default_S1S2P1P2R1R2T[S1, S2, P1, P2, R1, R2, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2, 
    P1 with P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2P1P2R1R2TOutputParametricCachedSelector[S1, S2, P1, P2, R1, R2, T](
    selectors: js.Tuple2[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2]
    ],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2, 
    P1 with P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2R1R2T[S1, S2, R1, R2, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2R1R2T[S1, S2, R1, R2, T](
    selectors: js.Tuple2[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2]
    ],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3P1P2P3R1R2R3T[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2 with S3, 
    P1 with P2 with P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3P1P2P3R1R2R3TOutputParametricCachedSelector[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selectors: js.Tuple3[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2 with S3, 
    P1 with P2 with P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2 with S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selectors: js.Tuple3[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2 with S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4P1P2P3P4R1R2R3R4T[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2 with S3 with S4, 
    P1 with P2 with P3 with P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4P1P2P3P4R1R2R3R4TOutputParametricCachedSelector[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2 with S3 with S4, 
    P1 with P2 with P3 with P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2 with S3 with S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2 with S3 with S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    P1 with P2 with P3 with P4 with P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5TOutputParametricCachedSelector[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    P1 with P2 with P3 with P4 with P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S4, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    P1 with P2 with P3 with P4 with P5 with P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6TOutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    P1 with P2 with P3 with P4 with P5 with P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S4, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S5, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7, 
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
    ], 
    js.Tuple7[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7TOutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7, 
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
    ], 
    js.Tuple7[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S4, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S5, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S6, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S7, R7],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
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
    ], 
    js.Tuple7[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7, 
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
    ], 
    js.Tuple7[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8, 
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
    ], 
    js.Tuple8[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8TOutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8, 
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
    ], 
    js.Tuple8[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S4, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S5, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S6, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S7, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S8, R8],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
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
    ], 
    js.Tuple8[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8, 
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
    ], 
    js.Tuple8[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9PR1R2R3R4R5R6R7R8R9TOutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9, 
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
    ], 
    js.Tuple9[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8],
    selector9: reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9, 
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
    ], 
    js.Tuple9[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S4, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S5, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S6, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S7, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S8, R8],
    selector9: reDashReselectLib.reDashReselectMod.Selector[S9, R9],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
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
    ], 
    js.Tuple9[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9, 
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
    ], 
    js.Tuple9[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8],
    selector9: reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9],
    selector10: reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10, 
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
    ], 
    js.Tuple10[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10TOutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10, 
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
    ], 
    js.Tuple10[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S4, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S5, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S6, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S7, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S8, R8],
    selector9: reDashReselectLib.reDashReselectMod.Selector[S9, R9],
    selector10: reDashReselectLib.reDashReselectMod.Selector[S10, R10],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
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
    ], 
    js.Tuple10[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S10, R10]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S10, R10]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10, 
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
    ], 
    js.Tuple10[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S10, R10]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8],
    selector9: reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9],
    selector10: reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10],
    selector11: reDashReselectLib.reDashReselectMod.ParametricSelector[S11, P11, R11],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11, 
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
    ], 
    js.Tuple11[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S11, P11, R11]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11TOutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S11, P11, R11]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11, 
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
    ], 
    js.Tuple11[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S11, P11, R11]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S4, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S5, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S6, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S7, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S8, R8],
    selector9: reDashReselectLib.reDashReselectMod.Selector[S9, R9],
    selector10: reDashReselectLib.reDashReselectMod.Selector[S10, R10],
    selector11: reDashReselectLib.reDashReselectMod.Selector[S11, R11],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
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
    ], 
    js.Tuple11[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S10, R10], 
      reDashReselectLib.reDashReselectMod.Selector[S11, R11]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S10, R10], 
      reDashReselectLib.reDashReselectMod.Selector[S11, R11]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11, 
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
    ], 
    js.Tuple11[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S10, R10], 
      reDashReselectLib.reDashReselectMod.Selector[S11, R11]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1],
    selector2: reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2],
    selector3: reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3],
    selector4: reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4],
    selector5: reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5],
    selector6: reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6],
    selector7: reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7],
    selector8: reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8],
    selector9: reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9],
    selector10: reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10],
    selector11: reDashReselectLib.reDashReselectMod.ParametricSelector[S11, P11, R11],
    selector12: reDashReselectLib.reDashReselectMod.ParametricSelector[S12, P12, R12],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11 with P12, 
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
    ], 
    js.Tuple12[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S11, P11, R11], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S12, P12, R12]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12TOutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S11, P11, R11], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S12, P12, R12]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
    P1 with P2 with P3 with P4 with P5 with P6 with P7 with P8 with P9 with P10 with P11 with P12, 
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
    ], 
    js.Tuple12[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S1, P1, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S2, P2, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S3, P3, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S4, P4, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S5, P5, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S6, P6, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S7, P7, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S8, P8, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S9, P9, R9], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S10, P10, R10], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S11, P11, R11], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S12, P12, R12]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: reDashReselectLib.reDashReselectMod.Selector[S1, R1],
    selector2: reDashReselectLib.reDashReselectMod.Selector[S2, R2],
    selector3: reDashReselectLib.reDashReselectMod.Selector[S3, R3],
    selector4: reDashReselectLib.reDashReselectMod.Selector[S4, R4],
    selector5: reDashReselectLib.reDashReselectMod.Selector[S5, R5],
    selector6: reDashReselectLib.reDashReselectMod.Selector[S6, R6],
    selector7: reDashReselectLib.reDashReselectMod.Selector[S7, R7],
    selector8: reDashReselectLib.reDashReselectMod.Selector[S8, R8],
    selector9: reDashReselectLib.reDashReselectMod.Selector[S9, R9],
    selector10: reDashReselectLib.reDashReselectMod.Selector[S10, R10],
    selector11: reDashReselectLib.reDashReselectMod.Selector[S11, R11],
    selector12: reDashReselectLib.reDashReselectMod.Selector[S12, R12],
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
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
    ], 
    js.Tuple12[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S10, R10], 
      reDashReselectLib.reDashReselectMod.Selector[S11, R11], 
      reDashReselectLib.reDashReselectMod.Selector[S12, R12]
    ]
  ] = js.native
  @JSName("default")
  def default_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S10, R10], 
      reDashReselectLib.reDashReselectMod.Selector[S11, R11], 
      reDashReselectLib.reDashReselectMod.Selector[S12, R12]
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
    S1 with S2 with S3 with S4 with S5 with S6 with S7 with S8 with S9 with S10 with S11 with S12, 
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
    ], 
    js.Tuple12[
      reDashReselectLib.reDashReselectMod.Selector[S1, R1], 
      reDashReselectLib.reDashReselectMod.Selector[S2, R2], 
      reDashReselectLib.reDashReselectMod.Selector[S3, R3], 
      reDashReselectLib.reDashReselectMod.Selector[S4, R4], 
      reDashReselectLib.reDashReselectMod.Selector[S5, R5], 
      reDashReselectLib.reDashReselectMod.Selector[S6, R6], 
      reDashReselectLib.reDashReselectMod.Selector[S7, R7], 
      reDashReselectLib.reDashReselectMod.Selector[S8, R8], 
      reDashReselectLib.reDashReselectMod.Selector[S9, R9], 
      reDashReselectLib.reDashReselectMod.Selector[S10, R10], 
      reDashReselectLib.reDashReselectMod.Selector[S11, R11], 
      reDashReselectLib.reDashReselectMod.Selector[S12, R12]
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
    ], 
    js.Tuple12[
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
    ], 
    js.Tuple11[
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
    ], 
    js.Tuple10[
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
    ], 
    js.Tuple9[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R9]
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
    ], 
    js.Tuple8[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R8]
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
    ], 
    js.Tuple7[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R7]
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
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R6]
    ]
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
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R5]
    ]
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
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R4]
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1R2R3TOutputParametricCachedSelector[S, P, R1, R2, R3, T](
    selectors: js.Tuple3[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R3]
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1R2TOutputParametricCachedSelector[S, P, R1, R2, T](
    selectors: js.Tuple2[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2]
    ],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1], 
      reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R2]
    ]
  ] = js.native
  @JSName("default")
  def default_SPR1T[S, P, R1, T](
    selector: reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function1[/* res */ R1, T], 
    js.Array[reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1]]
  ] = js.native
  @JSName("default")
  def default_SPR1TOutputParametricCachedSelector[S, P, R1, T](
    selectors: js.Array[reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1]],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function1[/* res */ R1, T], 
    js.Array[reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R1]]
  ] = js.native
  @JSName("default")
  def default_SPRTOutputParametricCachedSelector[S, P, R, T](
    selectors: js.Array[reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R]],
    combiner: js.Function1[/* repeated */ R, T]
  ): reDashReselectLib.reDashReselectMod.OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function1[/* repeated */ R, T], 
    js.Array[reDashReselectLib.reDashReselectMod.ParametricSelector[S, P, R]]
  ] = js.native
  @JSName("default")
  def default_SR1T[S, R1, T](
    selectors: js.Array[reDashReselectLib.reDashReselectMod.Selector[S, R1]],
    combiner: js.Function1[/* res */ R1, T]
  ): reDashReselectLib.reDashReselectMod.OutputCachedSelector[
    S, 
    T, 
    js.Function1[/* res */ R1, T], 
    js.Array[reDashReselectLib.reDashReselectMod.Selector[S, R1]]
  ] = js.native
}

