package typings.reselect

import typings.reselect.mod.OutputParametricSelector
import typings.reselect.mod.OutputSelector
import typings.reselect.mod.ParametricSelector
import typings.reselect.mod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[S1, R1, T](selector1: Selector[S1, R1], combiner: js.Function1[/* res1 */ R1, T]): OutputSelector[S1, T, js.Function1[/* res1 */ R1, T]] = js.native
    def apply[S, R1, T](selectors: js.Array[Selector[S, R1]], combiner: js.Function1[/* res */ R1, T]): OutputSelector[S, T, js.Function1[/* res */ R1, T]] = js.native
    def apply[S, R1, R2, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
    ): OutputSelector[S, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
    def apply[S, R1, R2, T](
      selectors: js.Tuple2[Selector[S, R1], Selector[S, R2]],
      combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
    ): OutputSelector[S, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
    def apply[S, P, R1, T](selector: ParametricSelector[S, P, R1], combiner: js.Function1[/* res */ R1, T]): OutputParametricSelector[S, P, T, js.Function1[/* res */ R1, T]] = js.native
    def apply[S, P, R1, R2, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
    ): OutputParametricSelector[S, P, T, js.Function2[/* res1 */ R1, /* res2 */ R2, T]] = js.native
    def apply[S, R1, R2, R3, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
    ): OutputSelector[S, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
    def apply[S, R1, R2, R3, T](
      selectors: js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]],
      combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
    ): OutputSelector[S, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
    def apply[S, P, R1, R2, R3, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
    ): OutputParametricSelector[S, P, T, js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]] = js.native
    def apply[S, R1, R2, R3, R4, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      selector4: Selector[S, R4],
      combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
    ): OutputSelector[S, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
    def apply[S, R1, R2, R3, R4, T](
      selectors: js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]],
      combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
    ): OutputSelector[S, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
    def apply[S, P, R1, R2, R3, R4, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      selector4: ParametricSelector[S, P, R4],
      combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
    ): OutputParametricSelector[S, P, T, js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]] = js.native
    def apply[S, R1, R2, R3, R4, R5, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      selector4: Selector[S, R4],
      selector5: Selector[S, R5],
      combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
    ): OutputSelector[
        S, 
        T, 
        js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
      ] = js.native
    def apply[S, R1, R2, R3, R4, R5, T](
      selectors: js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]],
      combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
    ): OutputSelector[
        S, 
        T, 
        js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
      ] = js.native
    def apply[S, P, R1, R2, R3, R4, R5, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      selector4: ParametricSelector[S, P, R4],
      selector5: ParametricSelector[S, P, R5],
      combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
    ): OutputParametricSelector[
        S, 
        P, 
        T, 
        js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
      ] = js.native
    def apply[S, R1, R2, R3, R4, R5, R6, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      selector4: Selector[S, R4],
      selector5: Selector[S, R5],
      selector6: Selector[S, R6],
      combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
    ): OutputSelector[
        S, 
        T, 
        js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
      ] = js.native
    def apply[S, R1, R2, R3, R4, R5, R6, T](
      selectors: js.Tuple6[
          Selector[S, R1], 
          Selector[S, R2], 
          Selector[S, R3], 
          Selector[S, R4], 
          Selector[S, R5], 
          Selector[S, R6]
        ],
      combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
    ): OutputSelector[
        S, 
        T, 
        js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
      ] = js.native
    def apply[S, P, R1, R2, R3, R4, R5, R6, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      selector4: ParametricSelector[S, P, R4],
      selector5: ParametricSelector[S, P, R5],
      selector6: ParametricSelector[S, P, R6],
      combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
    ): OutputParametricSelector[
        S, 
        P, 
        T, 
        js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
      ] = js.native
    def apply[S, R1, R2, R3, R4, R5, R6, R7, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      selector4: Selector[S, R4],
      selector5: Selector[S, R5],
      selector6: Selector[S, R6],
      selector7: Selector[S, R7],
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
    ): OutputSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, T](
      selectors: js.Tuple7[
          Selector[S, R1], 
          Selector[S, R2], 
          Selector[S, R3], 
          Selector[S, R4], 
          Selector[S, R5], 
          Selector[S, R6], 
          Selector[S, R7]
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
    ): OutputSelector[
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
    def apply[S, P, R1, R2, R3, R4, R5, R6, R7, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      selector4: ParametricSelector[S, P, R4],
      selector5: ParametricSelector[S, P, R5],
      selector6: ParametricSelector[S, P, R6],
      selector7: ParametricSelector[S, P, R7],
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
    ): OutputParametricSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      selector4: Selector[S, R4],
      selector5: Selector[S, R5],
      selector6: Selector[S, R6],
      selector7: Selector[S, R7],
      selector8: Selector[S, R8],
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
    ): OutputSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
      selectors: js.Tuple8[
          Selector[S, R1], 
          Selector[S, R2], 
          Selector[S, R3], 
          Selector[S, R4], 
          Selector[S, R5], 
          Selector[S, R6], 
          Selector[S, R7], 
          Selector[S, R8]
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
    ): OutputSelector[
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
    def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      selector4: ParametricSelector[S, P, R4],
      selector5: ParametricSelector[S, P, R5],
      selector6: ParametricSelector[S, P, R6],
      selector7: ParametricSelector[S, P, R7],
      selector8: ParametricSelector[S, P, R8],
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
    ): OutputParametricSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      selector4: Selector[S, R4],
      selector5: Selector[S, R5],
      selector6: Selector[S, R6],
      selector7: Selector[S, R7],
      selector8: Selector[S, R8],
      selector9: Selector[S, R9],
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
    ): OutputSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
      selectors: js.Tuple9[
          Selector[S, R1], 
          Selector[S, R2], 
          Selector[S, R3], 
          Selector[S, R4], 
          Selector[S, R5], 
          Selector[S, R6], 
          Selector[S, R7], 
          Selector[S, R8], 
          Selector[S, R9]
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
    ): OutputSelector[
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
    def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      selector4: ParametricSelector[S, P, R4],
      selector5: ParametricSelector[S, P, R5],
      selector6: ParametricSelector[S, P, R6],
      selector7: ParametricSelector[S, P, R7],
      selector8: ParametricSelector[S, P, R8],
      selector9: ParametricSelector[S, P, R9],
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
    ): OutputParametricSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      selector4: Selector[S, R4],
      selector5: Selector[S, R5],
      selector6: Selector[S, R6],
      selector7: Selector[S, R7],
      selector8: Selector[S, R8],
      selector9: Selector[S, R9],
      selector10: Selector[S, R10],
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
    ): OutputSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
      selectors: js.Tuple10[
          Selector[S, R1], 
          Selector[S, R2], 
          Selector[S, R3], 
          Selector[S, R4], 
          Selector[S, R5], 
          Selector[S, R6], 
          Selector[S, R7], 
          Selector[S, R8], 
          Selector[S, R9], 
          Selector[S, R10]
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
    ): OutputSelector[
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
    def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      selector4: ParametricSelector[S, P, R4],
      selector5: ParametricSelector[S, P, R5],
      selector6: ParametricSelector[S, P, R6],
      selector7: ParametricSelector[S, P, R7],
      selector8: ParametricSelector[S, P, R8],
      selector9: ParametricSelector[S, P, R9],
      selector10: ParametricSelector[S, P, R10],
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
    ): OutputParametricSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      selector4: Selector[S, R4],
      selector5: Selector[S, R5],
      selector6: Selector[S, R6],
      selector7: Selector[S, R7],
      selector8: Selector[S, R8],
      selector9: Selector[S, R9],
      selector10: Selector[S, R10],
      selector11: Selector[S, R11],
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
    ): OutputSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
      selectors: js.Tuple11[
          Selector[S, R1], 
          Selector[S, R2], 
          Selector[S, R3], 
          Selector[S, R4], 
          Selector[S, R5], 
          Selector[S, R6], 
          Selector[S, R7], 
          Selector[S, R8], 
          Selector[S, R9], 
          Selector[S, R10], 
          Selector[S, R11]
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
    ): OutputSelector[
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
    def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      selector4: ParametricSelector[S, P, R4],
      selector5: ParametricSelector[S, P, R5],
      selector6: ParametricSelector[S, P, R6],
      selector7: ParametricSelector[S, P, R7],
      selector8: ParametricSelector[S, P, R8],
      selector9: ParametricSelector[S, P, R9],
      selector10: ParametricSelector[S, P, R10],
      selector11: ParametricSelector[S, P, R11],
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
    ): OutputParametricSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
      selector1: Selector[S, R1],
      selector2: Selector[S, R2],
      selector3: Selector[S, R3],
      selector4: Selector[S, R4],
      selector5: Selector[S, R5],
      selector6: Selector[S, R6],
      selector7: Selector[S, R7],
      selector8: Selector[S, R8],
      selector9: Selector[S, R9],
      selector10: Selector[S, R10],
      selector11: Selector[S, R11],
      selector12: Selector[S, R12],
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
    ): OutputSelector[
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
    def apply[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
      selectors: js.Tuple12[
          Selector[S, R1], 
          Selector[S, R2], 
          Selector[S, R3], 
          Selector[S, R4], 
          Selector[S, R5], 
          Selector[S, R6], 
          Selector[S, R7], 
          Selector[S, R8], 
          Selector[S, R9], 
          Selector[S, R10], 
          Selector[S, R11], 
          Selector[S, R12]
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
    ): OutputSelector[
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
    def apply[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
      selector1: ParametricSelector[S, P, R1],
      selector2: ParametricSelector[S, P, R2],
      selector3: ParametricSelector[S, P, R3],
      selector4: ParametricSelector[S, P, R4],
      selector5: ParametricSelector[S, P, R5],
      selector6: ParametricSelector[S, P, R6],
      selector7: ParametricSelector[S, P, R7],
      selector8: ParametricSelector[S, P, R8],
      selector9: ParametricSelector[S, P, R9],
      selector10: ParametricSelector[S, P, R10],
      selector11: ParametricSelector[S, P, R11],
      selector12: ParametricSelector[S, P, R12],
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
    ): OutputParametricSelector[
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
  }
  
  @js.native
  trait Recomputations[C] extends StObject {
    
    def recomputations(): Double = js.native
    
    def resetRecomputations(): Double = js.native
    
    var resultFunc: C = js.native
  }
  object Recomputations {
    
    @scala.inline
    def apply[C](recomputations: () => Double, resetRecomputations: () => Double, resultFunc: C): Recomputations[C] = {
      val __obj = js.Dynamic.literal(recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recomputations[C]]
    }
    
    @scala.inline
    implicit class RecomputationsMutableBuilder[Self <: Recomputations[_], C] (val x: Self with Recomputations[C]) extends AnyVal {
      
      @scala.inline
      def setRecomputations(value: () => Double): Self = StObject.set(x, "recomputations", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetRecomputations(value: () => Double): Self = StObject.set(x, "resetRecomputations", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResultFunc(value: C): Self = StObject.set(x, "resultFunc", value.asInstanceOf[js.Any])
    }
  }
}
