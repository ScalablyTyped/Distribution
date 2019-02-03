package typings
package reselectLib.reselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reselect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSelector[S1, R1, T](selector1: reselectLib.reselectMod.Selector[S1, R1], combiner: js.Function1[/* res1 */ R1, T]): reselectLib.reselectMod.OutputSelector[S1, T, js.Function1[/* res1 */ R1, T]] = js.native
  def createSelector[S, R1, T](
    selectors: js.Array[reselectLib.reselectMod.Selector[S, R1]],
    combiner: js.Function1[/* res */ R1, T]
  ): reselectLib.reselectMod.OutputSelector[S, T, js.Function1[/* res */ R1, T]] = js.native
  def createSelector[S1, P1, R1, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    combiner: js.Function1[/* res1 */ R1, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S1, P1, T, js.Function1[/* res1 */ R1, T]] = js.native
  def createSelector[S, R1, R2, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reselectLib.reselectMod.OutputSelector[S, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  def createSelector[S, R1, R2, T](
    selectors: js.Tuple2[reselectLib.reselectMod.Selector[S, R1], reselectLib.reselectMod.Selector[S, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reselectLib.reselectMod.OutputSelector[S, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  def createSelector[S, P, R1, R2, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S, P, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  def createSelector[S, R1, R2, R3, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reselectLib.reselectMod.OutputSelector[S, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  def createSelector[S, R1, R2, R3, T](
    selectors: js.Tuple3[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reselectLib.reselectMod.OutputSelector[S, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  def createSelector[S, P, R1, R2, R3, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S, P, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  def createSelector[S, R1, R2, R3, R4, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    selector4: reselectLib.reselectMod.Selector[S, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reselectLib.reselectMod.OutputSelector[S, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  def createSelector[S, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3], 
      reselectLib.reselectMod.Selector[S, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reselectLib.reselectMod.OutputSelector[S, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  def createSelector[S, P, R1, R2, R3, R4, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S, P, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S, P, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  def createSelector[S, R1, R2, R3, R4, R5, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    selector4: reselectLib.reselectMod.Selector[S, R4],
    selector5: reselectLib.reselectMod.Selector[S, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reselectLib.reselectMod.OutputSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  def createSelector[S, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3], 
      reselectLib.reselectMod.Selector[S, R4], 
      reselectLib.reselectMod.Selector[S, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reselectLib.reselectMod.OutputSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  def createSelector[S, P, R1, R2, R3, R4, R5, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S, P, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S, P, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  def createSelector[S, R1, R2, R3, R4, R5, R6, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    selector4: reselectLib.reselectMod.Selector[S, R4],
    selector5: reselectLib.reselectMod.Selector[S, R5],
    selector6: reselectLib.reselectMod.Selector[S, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reselectLib.reselectMod.OutputSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  def createSelector[S, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3], 
      reselectLib.reselectMod.Selector[S, R4], 
      reselectLib.reselectMod.Selector[S, R5], 
      reselectLib.reselectMod.Selector[S, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reselectLib.reselectMod.OutputSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  def createSelector[S, P, R1, R2, R3, R4, R5, R6, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S, P, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S, P, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S, P, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    selector4: reselectLib.reselectMod.Selector[S, R4],
    selector5: reselectLib.reselectMod.Selector[S, R5],
    selector6: reselectLib.reselectMod.Selector[S, R6],
    selector7: reselectLib.reselectMod.Selector[S, R7],
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3], 
      reselectLib.reselectMod.Selector[S, R4], 
      reselectLib.reselectMod.Selector[S, R5], 
      reselectLib.reselectMod.Selector[S, R6], 
      reselectLib.reselectMod.Selector[S, R7]
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S, P, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S, P, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S, P, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S, P, R7],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    selector4: reselectLib.reselectMod.Selector[S, R4],
    selector5: reselectLib.reselectMod.Selector[S, R5],
    selector6: reselectLib.reselectMod.Selector[S, R6],
    selector7: reselectLib.reselectMod.Selector[S, R7],
    selector8: reselectLib.reselectMod.Selector[S, R8],
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3], 
      reselectLib.reselectMod.Selector[S, R4], 
      reselectLib.reselectMod.Selector[S, R5], 
      reselectLib.reselectMod.Selector[S, R6], 
      reselectLib.reselectMod.Selector[S, R7], 
      reselectLib.reselectMod.Selector[S, R8]
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S, P, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S, P, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S, P, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S, P, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S, P, R8],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    selector4: reselectLib.reselectMod.Selector[S, R4],
    selector5: reselectLib.reselectMod.Selector[S, R5],
    selector6: reselectLib.reselectMod.Selector[S, R6],
    selector7: reselectLib.reselectMod.Selector[S, R7],
    selector8: reselectLib.reselectMod.Selector[S, R8],
    selector9: reselectLib.reselectMod.Selector[S, R9],
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3], 
      reselectLib.reselectMod.Selector[S, R4], 
      reselectLib.reselectMod.Selector[S, R5], 
      reselectLib.reselectMod.Selector[S, R6], 
      reselectLib.reselectMod.Selector[S, R7], 
      reselectLib.reselectMod.Selector[S, R8], 
      reselectLib.reselectMod.Selector[S, R9]
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S, P, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S, P, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S, P, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S, P, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S, P, R8],
    selector9: reselectLib.reselectMod.ParametricSelector[S, P, R9],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    selector4: reselectLib.reselectMod.Selector[S, R4],
    selector5: reselectLib.reselectMod.Selector[S, R5],
    selector6: reselectLib.reselectMod.Selector[S, R6],
    selector7: reselectLib.reselectMod.Selector[S, R7],
    selector8: reselectLib.reselectMod.Selector[S, R8],
    selector9: reselectLib.reselectMod.Selector[S, R9],
    selector10: reselectLib.reselectMod.Selector[S, R10],
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3], 
      reselectLib.reselectMod.Selector[S, R4], 
      reselectLib.reselectMod.Selector[S, R5], 
      reselectLib.reselectMod.Selector[S, R6], 
      reselectLib.reselectMod.Selector[S, R7], 
      reselectLib.reselectMod.Selector[S, R8], 
      reselectLib.reselectMod.Selector[S, R9], 
      reselectLib.reselectMod.Selector[S, R10]
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S, P, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S, P, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S, P, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S, P, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S, P, R8],
    selector9: reselectLib.reselectMod.ParametricSelector[S, P, R9],
    selector10: reselectLib.reselectMod.ParametricSelector[S, P, R10],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    selector4: reselectLib.reselectMod.Selector[S, R4],
    selector5: reselectLib.reselectMod.Selector[S, R5],
    selector6: reselectLib.reselectMod.Selector[S, R6],
    selector7: reselectLib.reselectMod.Selector[S, R7],
    selector8: reselectLib.reselectMod.Selector[S, R8],
    selector9: reselectLib.reselectMod.Selector[S, R9],
    selector10: reselectLib.reselectMod.Selector[S, R10],
    selector11: reselectLib.reselectMod.Selector[S, R11],
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3], 
      reselectLib.reselectMod.Selector[S, R4], 
      reselectLib.reselectMod.Selector[S, R5], 
      reselectLib.reselectMod.Selector[S, R6], 
      reselectLib.reselectMod.Selector[S, R7], 
      reselectLib.reselectMod.Selector[S, R8], 
      reselectLib.reselectMod.Selector[S, R9], 
      reselectLib.reselectMod.Selector[S, R10], 
      reselectLib.reselectMod.Selector[S, R11]
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S, P, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S, P, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S, P, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S, P, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S, P, R8],
    selector9: reselectLib.reselectMod.ParametricSelector[S, P, R9],
    selector10: reselectLib.reselectMod.ParametricSelector[S, P, R10],
    selector11: reselectLib.reselectMod.ParametricSelector[S, P, R11],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: reselectLib.reselectMod.Selector[S, R1],
    selector2: reselectLib.reselectMod.Selector[S, R2],
    selector3: reselectLib.reselectMod.Selector[S, R3],
    selector4: reselectLib.reselectMod.Selector[S, R4],
    selector5: reselectLib.reselectMod.Selector[S, R5],
    selector6: reselectLib.reselectMod.Selector[S, R6],
    selector7: reselectLib.reselectMod.Selector[S, R7],
    selector8: reselectLib.reselectMod.Selector[S, R8],
    selector9: reselectLib.reselectMod.Selector[S, R9],
    selector10: reselectLib.reselectMod.Selector[S, R10],
    selector11: reselectLib.reselectMod.Selector[S, R11],
    selector12: reselectLib.reselectMod.Selector[S, R12],
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      reselectLib.reselectMod.Selector[S, R1], 
      reselectLib.reselectMod.Selector[S, R2], 
      reselectLib.reselectMod.Selector[S, R3], 
      reselectLib.reselectMod.Selector[S, R4], 
      reselectLib.reselectMod.Selector[S, R5], 
      reselectLib.reselectMod.Selector[S, R6], 
      reselectLib.reselectMod.Selector[S, R7], 
      reselectLib.reselectMod.Selector[S, R8], 
      reselectLib.reselectMod.Selector[S, R9], 
      reselectLib.reselectMod.Selector[S, R10], 
      reselectLib.reselectMod.Selector[S, R11], 
      reselectLib.reselectMod.Selector[S, R12]
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
  ): reselectLib.reselectMod.OutputSelector[
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
  def createSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S, P, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S, P, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S, P, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S, P, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S, P, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S, P, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S, P, R8],
    selector9: reselectLib.reselectMod.ParametricSelector[S, P, R9],
    selector10: reselectLib.reselectMod.ParametricSelector[S, P, R10],
    selector11: reselectLib.reselectMod.ParametricSelector[S, P, R11],
    selector12: reselectLib.reselectMod.ParametricSelector[S, P, R12],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  def createSelectorCreator(memoize: js.Function1[/* func */ js.Function, js.Function]): reselectLib.Anon_Combiner = js.native
  def createSelectorCreator[O1](memoize: js.Function2[/* func */ js.Function, /* option1 */ O1, js.Function], option1: O1): reselectLib.Anon_Combiner = js.native
  def createSelectorCreator[O1, O2](
    memoize: js.Function3[/* func */ js.Function, /* option1 */ O1, /* option2 */ O2, js.Function],
    option1: O1,
    option2: O2
  ): reselectLib.Anon_Combiner = js.native
  def createSelectorCreator[O1, O2, O3](
    memoize: js.Function5[
      /* func */ js.Function, 
      /* option1 */ O1, 
      /* option2 */ O2, 
      /* option3 */ O3, 
      /* repeated */ js.Any, 
      js.Function
    ],
    option1: O1,
    option2: O2,
    option3: O3,
    rest: js.Any*
  ): reselectLib.Anon_Combiner = js.native
  @JSName("createSelector")
  def createSelector_S1P1R1TOutputParametricSelector[S1, P1, R1, T](
    selectors: js.Array[reselectLib.reselectMod.ParametricSelector[S1, P1, R1]],
    combiner: js.Function1[/* res1 */ R1, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S1, P1, T, js.Function1[/* res1 */ R1, T]] = js.native
  @JSName("createSelector")
  def createSelector_S1R1T[S1, R1, T](
    selectors: js.Array[reselectLib.reselectMod.Selector[S1, R1]],
    combiner: js.Function1[/* res1 */ R1, T]
  ): reselectLib.reselectMod.OutputSelector[S1, T, js.Function1[/* res1 */ R1, T]] = js.native
  @JSName("createSelector")
  def createSelector_S1S2P1P2R1R2T[S1, S2, P1, P2, R1, R2, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S1 with S2, P1 with P2, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  @JSName("createSelector")
  def createSelector_S1S2P1P2R1R2TOutputParametricSelector[S1, S2, P1, P2, R1, R2, T](
    selectors: js.Tuple2[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2]
    ],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S1 with S2, P1 with P2, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  @JSName("createSelector")
  def createSelector_S1S2R1R2T[S1, S2, R1, R2, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reselectLib.reselectMod.OutputSelector[S1 with S2, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  @JSName("createSelector")
  def createSelector_S1S2R1R2T[S1, S2, R1, R2, T](
    selectors: js.Tuple2[reselectLib.reselectMod.Selector[S1, R1], reselectLib.reselectMod.Selector[S2, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reselectLib.reselectMod.OutputSelector[S1 with S2, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3P1P2P3R1R2R3T[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S1 with S2 with S3, 
    P1 with P2 with P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3P1P2P3R1R2R3TOutputParametricSelector[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selectors: js.Tuple3[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S1 with S2 with S3, 
    P1 with P2 with P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reselectLib.reselectMod.OutputSelector[S1 with S2 with S3, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selectors: js.Tuple3[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reselectLib.reselectMod.OutputSelector[S1 with S2 with S3, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4P1P2P3P4R1R2R3R4T[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S4, P4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S1 with S2 with S3 with S4, 
    P1 with P2 with P3 with P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4P1P2P3P4R1R2R3R4TOutputParametricSelector[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3], 
      reselectLib.reselectMod.ParametricSelector[S4, P4, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S1 with S2 with S3 with S4, 
    P1 with P2 with P3 with P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    selector4: reselectLib.reselectMod.Selector[S4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reselectLib.reselectMod.OutputSelector[
    S1 with S2 with S3 with S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3], 
      reselectLib.reselectMod.Selector[S4, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reselectLib.reselectMod.OutputSelector[
    S1 with S2 with S3 with S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S4, P4, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S5, P5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S1 with S2 with S3 with S4 with S5, 
    P1 with P2 with P3 with P4 with P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5TOutputParametricSelector[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3], 
      reselectLib.reselectMod.ParametricSelector[S4, P4, R4], 
      reselectLib.reselectMod.ParametricSelector[S5, P5, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S1 with S2 with S3 with S4 with S5, 
    P1 with P2 with P3 with P4 with P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    selector4: reselectLib.reselectMod.Selector[S4, R4],
    selector5: reselectLib.reselectMod.Selector[S5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reselectLib.reselectMod.OutputSelector[
    S1 with S2 with S3 with S4 with S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3], 
      reselectLib.reselectMod.Selector[S4, R4], 
      reselectLib.reselectMod.Selector[S5, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reselectLib.reselectMod.OutputSelector[
    S1 with S2 with S3 with S4 with S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S4, P4, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S5, P5, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S6, P6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    P1 with P2 with P3 with P4 with P5 with P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6TOutputParametricSelector[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3], 
      reselectLib.reselectMod.ParametricSelector[S4, P4, R4], 
      reselectLib.reselectMod.ParametricSelector[S5, P5, R5], 
      reselectLib.reselectMod.ParametricSelector[S6, P6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    P1 with P2 with P3 with P4 with P5 with P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    selector4: reselectLib.reselectMod.Selector[S4, R4],
    selector5: reselectLib.reselectMod.Selector[S5, R5],
    selector6: reselectLib.reselectMod.Selector[S6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reselectLib.reselectMod.OutputSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3], 
      reselectLib.reselectMod.Selector[S4, R4], 
      reselectLib.reselectMod.Selector[S5, R5], 
      reselectLib.reselectMod.Selector[S6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reselectLib.reselectMod.OutputSelector[
    S1 with S2 with S3 with S4 with S5 with S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S4, P4, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S5, P5, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S6, P6, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S7, P7, R7],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7TOutputParametricSelector[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3], 
      reselectLib.reselectMod.ParametricSelector[S4, P4, R4], 
      reselectLib.reselectMod.ParametricSelector[S5, P5, R5], 
      reselectLib.reselectMod.ParametricSelector[S6, P6, R6], 
      reselectLib.reselectMod.ParametricSelector[S7, P7, R7]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    selector4: reselectLib.reselectMod.Selector[S4, R4],
    selector5: reselectLib.reselectMod.Selector[S5, R5],
    selector6: reselectLib.reselectMod.Selector[S6, R6],
    selector7: reselectLib.reselectMod.Selector[S7, R7],
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3], 
      reselectLib.reselectMod.Selector[S4, R4], 
      reselectLib.reselectMod.Selector[S5, R5], 
      reselectLib.reselectMod.Selector[S6, R6], 
      reselectLib.reselectMod.Selector[S7, R7]
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S4, P4, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S5, P5, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S6, P6, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S7, P7, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S8, P8, R8],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8TOutputParametricSelector[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3], 
      reselectLib.reselectMod.ParametricSelector[S4, P4, R4], 
      reselectLib.reselectMod.ParametricSelector[S5, P5, R5], 
      reselectLib.reselectMod.ParametricSelector[S6, P6, R6], 
      reselectLib.reselectMod.ParametricSelector[S7, P7, R7], 
      reselectLib.reselectMod.ParametricSelector[S8, P8, R8]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    selector4: reselectLib.reselectMod.Selector[S4, R4],
    selector5: reselectLib.reselectMod.Selector[S5, R5],
    selector6: reselectLib.reselectMod.Selector[S6, R6],
    selector7: reselectLib.reselectMod.Selector[S7, R7],
    selector8: reselectLib.reselectMod.Selector[S8, R8],
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3], 
      reselectLib.reselectMod.Selector[S4, R4], 
      reselectLib.reselectMod.Selector[S5, R5], 
      reselectLib.reselectMod.Selector[S6, R6], 
      reselectLib.reselectMod.Selector[S7, R7], 
      reselectLib.reselectMod.Selector[S8, R8]
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S4, P4, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S5, P5, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S6, P6, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S7, P7, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S8, P8, R8],
    selector9: reselectLib.reselectMod.ParametricSelector[S9, P9, R9],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9R1R2R3R4R5R6R7R8R9TOutputParametricSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3], 
      reselectLib.reselectMod.ParametricSelector[S4, P4, R4], 
      reselectLib.reselectMod.ParametricSelector[S5, P5, R5], 
      reselectLib.reselectMod.ParametricSelector[S6, P6, R6], 
      reselectLib.reselectMod.ParametricSelector[S7, P7, R7], 
      reselectLib.reselectMod.ParametricSelector[S8, P8, R8], 
      reselectLib.reselectMod.ParametricSelector[S9, P9, R9]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    selector4: reselectLib.reselectMod.Selector[S4, R4],
    selector5: reselectLib.reselectMod.Selector[S5, R5],
    selector6: reselectLib.reselectMod.Selector[S6, R6],
    selector7: reselectLib.reselectMod.Selector[S7, R7],
    selector8: reselectLib.reselectMod.Selector[S8, R8],
    selector9: reselectLib.reselectMod.Selector[S9, R9],
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3], 
      reselectLib.reselectMod.Selector[S4, R4], 
      reselectLib.reselectMod.Selector[S5, R5], 
      reselectLib.reselectMod.Selector[S6, R6], 
      reselectLib.reselectMod.Selector[S7, R7], 
      reselectLib.reselectMod.Selector[S8, R8], 
      reselectLib.reselectMod.Selector[S9, R9]
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S4, P4, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S5, P5, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S6, P6, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S7, P7, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S8, P8, R8],
    selector9: reselectLib.reselectMod.ParametricSelector[S9, P9, R9],
    selector10: reselectLib.reselectMod.ParametricSelector[S10, P10, R10],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10TOutputParametricSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3], 
      reselectLib.reselectMod.ParametricSelector[S4, P4, R4], 
      reselectLib.reselectMod.ParametricSelector[S5, P5, R5], 
      reselectLib.reselectMod.ParametricSelector[S6, P6, R6], 
      reselectLib.reselectMod.ParametricSelector[S7, P7, R7], 
      reselectLib.reselectMod.ParametricSelector[S8, P8, R8], 
      reselectLib.reselectMod.ParametricSelector[S9, P9, R9], 
      reselectLib.reselectMod.ParametricSelector[S10, P10, R10]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    selector4: reselectLib.reselectMod.Selector[S4, R4],
    selector5: reselectLib.reselectMod.Selector[S5, R5],
    selector6: reselectLib.reselectMod.Selector[S6, R6],
    selector7: reselectLib.reselectMod.Selector[S7, R7],
    selector8: reselectLib.reselectMod.Selector[S8, R8],
    selector9: reselectLib.reselectMod.Selector[S9, R9],
    selector10: reselectLib.reselectMod.Selector[S10, R10],
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3], 
      reselectLib.reselectMod.Selector[S4, R4], 
      reselectLib.reselectMod.Selector[S5, R5], 
      reselectLib.reselectMod.Selector[S6, R6], 
      reselectLib.reselectMod.Selector[S7, R7], 
      reselectLib.reselectMod.Selector[S8, R8], 
      reselectLib.reselectMod.Selector[S9, R9], 
      reselectLib.reselectMod.Selector[S10, R10]
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S4, P4, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S5, P5, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S6, P6, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S7, P7, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S8, P8, R8],
    selector9: reselectLib.reselectMod.ParametricSelector[S9, P9, R9],
    selector10: reselectLib.reselectMod.ParametricSelector[S10, P10, R10],
    selector11: reselectLib.reselectMod.ParametricSelector[S11, P11, R11],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11TOutputParametricSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3], 
      reselectLib.reselectMod.ParametricSelector[S4, P4, R4], 
      reselectLib.reselectMod.ParametricSelector[S5, P5, R5], 
      reselectLib.reselectMod.ParametricSelector[S6, P6, R6], 
      reselectLib.reselectMod.ParametricSelector[S7, P7, R7], 
      reselectLib.reselectMod.ParametricSelector[S8, P8, R8], 
      reselectLib.reselectMod.ParametricSelector[S9, P9, R9], 
      reselectLib.reselectMod.ParametricSelector[S10, P10, R10], 
      reselectLib.reselectMod.ParametricSelector[S11, P11, R11]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    selector4: reselectLib.reselectMod.Selector[S4, R4],
    selector5: reselectLib.reselectMod.Selector[S5, R5],
    selector6: reselectLib.reselectMod.Selector[S6, R6],
    selector7: reselectLib.reselectMod.Selector[S7, R7],
    selector8: reselectLib.reselectMod.Selector[S8, R8],
    selector9: reselectLib.reselectMod.Selector[S9, R9],
    selector10: reselectLib.reselectMod.Selector[S10, R10],
    selector11: reselectLib.reselectMod.Selector[S11, R11],
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3], 
      reselectLib.reselectMod.Selector[S4, R4], 
      reselectLib.reselectMod.Selector[S5, R5], 
      reselectLib.reselectMod.Selector[S6, R6], 
      reselectLib.reselectMod.Selector[S7, R7], 
      reselectLib.reselectMod.Selector[S8, R8], 
      reselectLib.reselectMod.Selector[S9, R9], 
      reselectLib.reselectMod.Selector[S10, R10], 
      reselectLib.reselectMod.Selector[S11, R11]
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: reselectLib.reselectMod.ParametricSelector[S1, P1, R1],
    selector2: reselectLib.reselectMod.ParametricSelector[S2, P2, R2],
    selector3: reselectLib.reselectMod.ParametricSelector[S3, P3, R3],
    selector4: reselectLib.reselectMod.ParametricSelector[S4, P4, R4],
    selector5: reselectLib.reselectMod.ParametricSelector[S5, P5, R5],
    selector6: reselectLib.reselectMod.ParametricSelector[S6, P6, R6],
    selector7: reselectLib.reselectMod.ParametricSelector[S7, P7, R7],
    selector8: reselectLib.reselectMod.ParametricSelector[S8, P8, R8],
    selector9: reselectLib.reselectMod.ParametricSelector[S9, P9, R9],
    selector10: reselectLib.reselectMod.ParametricSelector[S10, P10, R10],
    selector11: reselectLib.reselectMod.ParametricSelector[S11, P11, R11],
    selector12: reselectLib.reselectMod.ParametricSelector[S12, P12, R12],
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12TOutputParametricSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      reselectLib.reselectMod.ParametricSelector[S1, P1, R1], 
      reselectLib.reselectMod.ParametricSelector[S2, P2, R2], 
      reselectLib.reselectMod.ParametricSelector[S3, P3, R3], 
      reselectLib.reselectMod.ParametricSelector[S4, P4, R4], 
      reselectLib.reselectMod.ParametricSelector[S5, P5, R5], 
      reselectLib.reselectMod.ParametricSelector[S6, P6, R6], 
      reselectLib.reselectMod.ParametricSelector[S7, P7, R7], 
      reselectLib.reselectMod.ParametricSelector[S8, P8, R8], 
      reselectLib.reselectMod.ParametricSelector[S9, P9, R9], 
      reselectLib.reselectMod.ParametricSelector[S10, P10, R10], 
      reselectLib.reselectMod.ParametricSelector[S11, P11, R11], 
      reselectLib.reselectMod.ParametricSelector[S12, P12, R12]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: reselectLib.reselectMod.Selector[S1, R1],
    selector2: reselectLib.reselectMod.Selector[S2, R2],
    selector3: reselectLib.reselectMod.Selector[S3, R3],
    selector4: reselectLib.reselectMod.Selector[S4, R4],
    selector5: reselectLib.reselectMod.Selector[S5, R5],
    selector6: reselectLib.reselectMod.Selector[S6, R6],
    selector7: reselectLib.reselectMod.Selector[S7, R7],
    selector8: reselectLib.reselectMod.Selector[S8, R8],
    selector9: reselectLib.reselectMod.Selector[S9, R9],
    selector10: reselectLib.reselectMod.Selector[S10, R10],
    selector11: reselectLib.reselectMod.Selector[S11, R11],
    selector12: reselectLib.reselectMod.Selector[S12, R12],
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      reselectLib.reselectMod.Selector[S1, R1], 
      reselectLib.reselectMod.Selector[S2, R2], 
      reselectLib.reselectMod.Selector[S3, R3], 
      reselectLib.reselectMod.Selector[S4, R4], 
      reselectLib.reselectMod.Selector[S5, R5], 
      reselectLib.reselectMod.Selector[S6, R6], 
      reselectLib.reselectMod.Selector[S7, R7], 
      reselectLib.reselectMod.Selector[S8, R8], 
      reselectLib.reselectMod.Selector[S9, R9], 
      reselectLib.reselectMod.Selector[S10, R10], 
      reselectLib.reselectMod.Selector[S11, R11], 
      reselectLib.reselectMod.Selector[S12, R12]
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
  ): reselectLib.reselectMod.OutputSelector[
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
    ]
  ] = js.native
  @JSName("createSelector")
  def createSelector_SPR1R2R3R4R5R6R7R8R9R10R11R12TOutputParametricSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3], 
      reselectLib.reselectMod.ParametricSelector[S, P, R4], 
      reselectLib.reselectMod.ParametricSelector[S, P, R5], 
      reselectLib.reselectMod.ParametricSelector[S, P, R6], 
      reselectLib.reselectMod.ParametricSelector[S, P, R7], 
      reselectLib.reselectMod.ParametricSelector[S, P, R8], 
      reselectLib.reselectMod.ParametricSelector[S, P, R9], 
      reselectLib.reselectMod.ParametricSelector[S, P, R10], 
      reselectLib.reselectMod.ParametricSelector[S, P, R11], 
      reselectLib.reselectMod.ParametricSelector[S, P, R12]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  @JSName("createSelector")
  def createSelector_SPR1R2R3R4R5R6R7R8R9R10R11TOutputParametricSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3], 
      reselectLib.reselectMod.ParametricSelector[S, P, R4], 
      reselectLib.reselectMod.ParametricSelector[S, P, R5], 
      reselectLib.reselectMod.ParametricSelector[S, P, R6], 
      reselectLib.reselectMod.ParametricSelector[S, P, R7], 
      reselectLib.reselectMod.ParametricSelector[S, P, R8], 
      reselectLib.reselectMod.ParametricSelector[S, P, R9], 
      reselectLib.reselectMod.ParametricSelector[S, P, R10], 
      reselectLib.reselectMod.ParametricSelector[S, P, R11]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  @JSName("createSelector")
  def createSelector_SPR1R2R3R4R5R6R7R8R9R10TOutputParametricSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3], 
      reselectLib.reselectMod.ParametricSelector[S, P, R4], 
      reselectLib.reselectMod.ParametricSelector[S, P, R5], 
      reselectLib.reselectMod.ParametricSelector[S, P, R6], 
      reselectLib.reselectMod.ParametricSelector[S, P, R7], 
      reselectLib.reselectMod.ParametricSelector[S, P, R8], 
      reselectLib.reselectMod.ParametricSelector[S, P, R9], 
      reselectLib.reselectMod.ParametricSelector[S, P, R10]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  @JSName("createSelector")
  def createSelector_SPR1R2R3R4R5R6R7R8R9TOutputParametricSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3], 
      reselectLib.reselectMod.ParametricSelector[S, P, R4], 
      reselectLib.reselectMod.ParametricSelector[S, P, R5], 
      reselectLib.reselectMod.ParametricSelector[S, P, R6], 
      reselectLib.reselectMod.ParametricSelector[S, P, R7], 
      reselectLib.reselectMod.ParametricSelector[S, P, R8], 
      reselectLib.reselectMod.ParametricSelector[S, P, R9]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  @JSName("createSelector")
  def createSelector_SPR1R2R3R4R5R6R7R8TOutputParametricSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3], 
      reselectLib.reselectMod.ParametricSelector[S, P, R4], 
      reselectLib.reselectMod.ParametricSelector[S, P, R5], 
      reselectLib.reselectMod.ParametricSelector[S, P, R6], 
      reselectLib.reselectMod.ParametricSelector[S, P, R7], 
      reselectLib.reselectMod.ParametricSelector[S, P, R8]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  @JSName("createSelector")
  def createSelector_SPR1R2R3R4R5R6R7TOutputParametricSelector[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3], 
      reselectLib.reselectMod.ParametricSelector[S, P, R4], 
      reselectLib.reselectMod.ParametricSelector[S, P, R5], 
      reselectLib.reselectMod.ParametricSelector[S, P, R6], 
      reselectLib.reselectMod.ParametricSelector[S, P, R7]
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
  ): reselectLib.reselectMod.OutputParametricSelector[
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
  @JSName("createSelector")
  def createSelector_SPR1R2R3R4R5R6TOutputParametricSelector[S, P, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3], 
      reselectLib.reselectMod.ParametricSelector[S, P, R4], 
      reselectLib.reselectMod.ParametricSelector[S, P, R5], 
      reselectLib.reselectMod.ParametricSelector[S, P, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_SPR1R2R3R4R5TOutputParametricSelector[S, P, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3], 
      reselectLib.reselectMod.ParametricSelector[S, P, R4], 
      reselectLib.reselectMod.ParametricSelector[S, P, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): reselectLib.reselectMod.OutputParametricSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ] = js.native
  @JSName("createSelector")
  def createSelector_SPR1R2R3R4TOutputParametricSelector[S, P, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3], 
      reselectLib.reselectMod.ParametricSelector[S, P, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S, P, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
  @JSName("createSelector")
  def createSelector_SPR1R2R3TOutputParametricSelector[S, P, R1, R2, R3, T](
    selectors: js.Tuple3[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2], 
      reselectLib.reselectMod.ParametricSelector[S, P, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S, P, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
  @JSName("createSelector")
  def createSelector_SPR1R2TOutputParametricSelector[S, P, R1, R2, T](
    selectors: js.Tuple2[
      reselectLib.reselectMod.ParametricSelector[S, P, R1], 
      reselectLib.reselectMod.ParametricSelector[S, P, R2]
    ],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S, P, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
  @JSName("createSelector")
  def createSelector_SPR1T[S, P, R1, T](
    selector: reselectLib.reselectMod.ParametricSelector[S, P, R1],
    combiner: js.Function1[/* res */ R1, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S, P, T, js.Function1[/* res */ R1, T]] = js.native
  @JSName("createSelector")
  def createSelector_SPR1TOutputParametricSelector[S, P, R1, T](
    selectors: js.Array[reselectLib.reselectMod.ParametricSelector[S, P, R1]],
    combiner: js.Function1[/* res */ R1, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S, P, T, js.Function1[/* res */ R1, T]] = js.native
  @JSName("createSelector")
  def createSelector_SPRTOutputParametricSelector[S, P, R, T](
    selectors: js.Array[reselectLib.reselectMod.ParametricSelector[S, P, R]],
    combiner: js.Function1[/* repeated */ R, T]
  ): reselectLib.reselectMod.OutputParametricSelector[S, P, T, js.Function1[/* repeated */ R, T]] = js.native
  @JSName("createSelector")
  def createSelector_SR1T[S, R1, T](selector: reselectLib.reselectMod.Selector[S, R1], combiner: js.Function1[/* res */ R1, T]): reselectLib.reselectMod.OutputSelector[S, T, js.Function1[/* res */ R1, T]] = js.native
  @JSName("createSelector")
  def createSelector_SRT[S, R, T](
    selectors: js.Array[reselectLib.reselectMod.Selector[S, R]],
    combiner: js.Function1[/* repeated */ R, T]
  ): reselectLib.reselectMod.OutputSelector[S, T, js.Function1[/* repeated */ R, T]] = js.native
  def createStructuredSelector[S, T](
    selectors: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: reselect.reselect.Selector<S, T[K]>}
    */ reselectLib.reselectLibStrings.createStructuredSelector with T
  ): reselectLib.reselectMod.Selector[S, T] = js.native
  def createStructuredSelector[S, T](
    selectors: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: reselect.reselect.Selector<S, T[K]>}
    */ reselectLib.reselectLibStrings.createStructuredSelector with T,
    selectorCreator: reselectLib.Anon_Combiner
  ): reselectLib.reselectMod.Selector[S, T] = js.native
  @JSName("createStructuredSelector")
  def createStructuredSelector_SPTParametricSelector[S, P, T](
    selectors: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: reselect.reselect.ParametricSelector<S, P, T[K]>}
    */ reselectLib.reselectLibStrings.createStructuredSelector with T
  ): reselectLib.reselectMod.ParametricSelector[S, P, T] = js.native
  @JSName("createStructuredSelector")
  def createStructuredSelector_SPTParametricSelector[S, P, T](
    selectors: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: reselect.reselect.ParametricSelector<S, P, T[K]>}
    */ reselectLib.reselectLibStrings.createStructuredSelector with T,
    selectorCreator: reselectLib.Anon_Combiner
  ): reselectLib.reselectMod.ParametricSelector[S, P, T] = js.native
  def defaultMemoize[F /* <: js.Function */](func: F): F = js.native
  def defaultMemoize[F /* <: js.Function */](
    func: F,
    equalityCheck: js.Function3[/* a */ js.Any, /* b */ js.Any, /* index */ scala.Double, scala.Boolean]
  ): F = js.native
}

