package typings.reReselect

import org.scalablytyped.runtime.StringDictionary
import typings.reReselect.anon.Cache
import typings.reReselect.anon.CacheSize
import typings.reReselect.anon.ClearCache
import typings.reReselect.anon.InputSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("re-reselect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /*
    * Heterogeneous selectors, array argument
    */
  /* one selector */
  inline def default[S1, R1, T](selectors: js.Array[Selector[S1, R1]], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]]]
  /*
    * Homogeneous selectors, parameter types
    */
  /* one selector */
  inline def default[S, R1, T](selector: Selector[S, R1], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]]]
  /* two selectors */
  inline def default[S, R1, R2, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ]]
  /* two selectors */
  inline def default[S, R1, R2, T](
    selectors: js.Tuple2[Selector[S, R1], Selector[S, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ]]
  inline def default[S, P, R1, T](selector: ParametricSelector[S, P, R1], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]]]
  inline def default[S, P, R1, R2, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ]]
  /* three selectors */
  inline def default[S, R1, R2, R3, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ]]
  /* three selectors */
  inline def default[S, R1, R2, R3, T](
    selectors: js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ]]
  inline def default[S, P, R1, R2, R3, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ]]
  /* four selectors */
  inline def default[S, R1, R2, R3, R4, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ]]
  /* four selectors */
  inline def default[S, R1, R2, R3, R4, T](
    selectors: js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ]]
  inline def default[S, P, R1, R2, R3, R4, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ]]
  /* five selectors */
  inline def default[S, R1, R2, R3, R4, R5, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ]]
  /* five selectors */
  inline def default[S, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ]]
  inline def default[S, P, R1, R2, R3, R4, R5, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ]]
  /* six selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ]]
  /* six selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ]]
  inline def default[S, P, R1, R2, R3, R4, R5, R6, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ]]
  /* seven selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ]]
  /* seven selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ]]
  inline def default[S, P, R1, R2, R3, R4, R5, R6, R7, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ]]
  /* eight selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ]]
  /* eight selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ]]
  inline def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ]]
  /* nine selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ]]
  /* nine selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ]]
  inline def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ]]
  /* ten selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  /* ten selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  inline def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ]]
  /* eleven selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  /* eleven selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  inline def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ]]
  /* twelve selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], selector12.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  /* twelve selectors */
  inline def default[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  inline def default[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], selector12.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ]]
  
  @JSImport("re-reselect", "FifoMapCache")
  @js.native
  open class FifoMapCache protected ()
    extends StObject
       with ICacheObject {
    def this(options: CacheSize) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: Any): Any = js.native
    
    /* CompleteClass */
    override def remove(key: Any): Unit = js.native
    
    /* CompleteClass */
    override def set(key: Any, selectorFn: Any): Unit = js.native
  }
  
  @JSImport("re-reselect", "FifoObjectCache")
  @js.native
  open class FifoObjectCache protected ()
    extends StObject
       with ICacheObject {
    def this(options: CacheSize) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: Any): Any = js.native
    
    @JSName("isValidCacheKey")
    def isValidCacheKey_MFifoObjectCache(key: ObjectCacheKey): Boolean = js.native
    
    /* CompleteClass */
    override def remove(key: Any): Unit = js.native
    
    /* CompleteClass */
    override def set(key: Any, selectorFn: Any): Unit = js.native
  }
  
  @JSImport("re-reselect", "FlatMapCache")
  @js.native
  open class FlatMapCache ()
    extends StObject
       with ICacheObject {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: Any): Any = js.native
    
    /* CompleteClass */
    override def remove(key: Any): Unit = js.native
    
    /* CompleteClass */
    override def set(key: Any, selectorFn: Any): Unit = js.native
  }
  
  @JSImport("re-reselect", "FlatObjectCache")
  @js.native
  open class FlatObjectCache ()
    extends StObject
       with ICacheObject {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: Any): Any = js.native
    
    @JSName("isValidCacheKey")
    def isValidCacheKey_MFlatObjectCache(key: ObjectCacheKey): Boolean = js.native
    
    /* CompleteClass */
    override def remove(key: Any): Unit = js.native
    
    /* CompleteClass */
    override def set(key: Any, selectorFn: Any): Unit = js.native
  }
  
  @JSImport("re-reselect", "LruMapCache")
  @js.native
  open class LruMapCache protected ()
    extends StObject
       with ICacheObject {
    def this(options: CacheSize) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: Any): Any = js.native
    
    /* CompleteClass */
    override def remove(key: Any): Unit = js.native
    
    /* CompleteClass */
    override def set(key: Any, selectorFn: Any): Unit = js.native
  }
  
  @JSImport("re-reselect", "LruObjectCache")
  @js.native
  open class LruObjectCache protected ()
    extends StObject
       with ICacheObject {
    def this(options: CacheSize) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: Any): Any = js.native
    
    @JSName("isValidCacheKey")
    def isValidCacheKey_MLruObjectCache(key: ObjectCacheKey): Boolean = js.native
    
    /* CompleteClass */
    override def remove(key: Any): Unit = js.native
    
    /* CompleteClass */
    override def set(key: Any, selectorFn: Any): Unit = js.native
  }
  
  /*
    * Heterogeneous selectors, array argument
    */
  /* one selector */
  inline def createCachedSelector[S1, R1, T](selectors: js.Array[Selector[S1, R1]], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]]]
  /*
    * Homogeneous selectors, parameter types
    */
  /* one selector */
  inline def createCachedSelector[S, R1, T](selector: Selector[S, R1], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]]]
  /* two selectors */
  inline def createCachedSelector[S, R1, R2, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ]]
  /* two selectors */
  inline def createCachedSelector[S, R1, R2, T](
    selectors: js.Tuple2[Selector[S, R1], Selector[S, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S, R1], Selector[S, R2]]
  ]]
  inline def createCachedSelector[S, P, R1, T](selector: ParametricSelector[S, P, R1], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]]]
  inline def createCachedSelector[S, P, R1, R2, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ]]
  /* three selectors */
  inline def createCachedSelector[S, R1, R2, R3, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ]]
  /* three selectors */
  inline def createCachedSelector[S, R1, R2, R3, T](
    selectors: js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S, R1], Selector[S, R2], Selector[S, R3]]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ]]
  /* four selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ]]
  /* four selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, T](
    selectors: js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4]]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, R4, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ]]
  /* five selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ]]
  /* five selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S, R1], Selector[S, R2], Selector[S, R3], Selector[S, R4], Selector[S, R5]]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, R4, R5, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ]]
  /* six selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, T](
    selector1: Selector[S, R1],
    selector2: Selector[S, R2],
    selector3: Selector[S, R3],
    selector4: Selector[S, R4],
    selector5: Selector[S, R5],
    selector6: Selector[S, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ]]
  /* six selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6]
    ]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, T](
    selector1: ParametricSelector[S, P, R1],
    selector2: ParametricSelector[S, P, R2],
    selector3: ParametricSelector[S, P, R3],
    selector4: ParametricSelector[S, P, R4],
    selector5: ParametricSelector[S, P, R5],
    selector6: ParametricSelector[S, P, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ]]
  /* seven selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ]]
  /* seven selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7]
    ]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ]]
  /* eight selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ]]
  /* eight selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8]
    ]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ]]
  /* nine selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ]]
  /* nine selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
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
  ): OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
      Selector[S, R1], 
      Selector[S, R2], 
      Selector[S, R3], 
      Selector[S, R4], 
      Selector[S, R5], 
      Selector[S, R6], 
      Selector[S, R7], 
      Selector[S, R8], 
      Selector[S, R9]
    ]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ]]
  /* ten selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  /* ten selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ]]
  /* eleven selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  /* eleven selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ]]
  /* twelve selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], selector12.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  /* twelve selectors */
  inline def createCachedSelector[S, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
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
  ): OutputCachedSelector[
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
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
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
    ]
  ]]
  inline def createCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], selector12.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ]]
  
  inline def createCachedSelector_S1P1R1T[S1, P1, R1, T](selector: ParametricSelector[S1, P1, R1], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]]]
  
  inline def createCachedSelector_S1P1R1T_OutputParametricCachedSelector[S1, P1, R1, T](selectors: js.Array[ParametricSelector[S1, P1, R1]], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]]]
  
  /*
    * Heterogeneous selectors, parameter types
    */
  /* one selector */
  inline def createCachedSelector_S1R1T[S1, R1, T](selector: Selector[S1, R1], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]]]
  
  inline def createCachedSelector_S1S2P1P2R1R2T[S1, S2, P1, P2, R1, R2, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S1 & S2, 
    P1 & P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2, 
    P1 & P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ]]
  
  inline def createCachedSelector_S1S2P1P2R1R2T_OutputParametricCachedSelector[S1, S2, P1, P2, R1, R2, T](
    selectors: js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S1 & S2, 
    P1 & P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2, 
    P1 & P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ]]
  
  /* two selectors */
  inline def createCachedSelector_S1S2R1R2T[S1, S2, R1, R2, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S1 & S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ]]
  /* two selectors */
  inline def createCachedSelector_S1S2R1R2T[S1, S2, R1, R2, T](
    selectors: js.Tuple2[Selector[S1, R1], Selector[S2, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S1 & S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ]]
  
  inline def createCachedSelector_S1S2S3P1P2P3R1R2R3T[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3, 
    P1 & P2 & P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3, 
    P1 & P2 & P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3P1P2P3R1R2R3T_OutputParametricCachedSelector[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selectors: js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3, 
    P1 & P2 & P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3, 
    P1 & P2 & P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ]]
  
  /* three selectors */
  inline def createCachedSelector_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S1 & S2 & S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ]]
  /* three selectors */
  inline def createCachedSelector_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selectors: js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S1 & S2 & S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ]]
  
  inline def createCachedSelector_S1S2S3S4P1P2P3P4R1R2R3R4T[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4, 
    P1 & P2 & P3 & P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4, 
    P1 & P2 & P3 & P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4P1P2P3P4R1R2R3R4T_OutputParametricCachedSelector[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4, 
    P1 & P2 & P3 & P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4, 
    P1 & P2 & P3 & P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ]]
  
  /* four selectors */
  inline def createCachedSelector_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ]]
  /* four selectors */
  inline def createCachedSelector_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    P1 & P2 & P3 & P4 & P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    P1 & P2 & P3 & P4 & P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    P1 & P2 & P3 & P4 & P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    P1 & P2 & P3 & P4 & P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ]]
  
  /* five selectors */
  inline def createCachedSelector_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ]]
  /* five selectors */
  inline def createCachedSelector_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    P1 & P2 & P3 & P4 & P5 & P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    P1 & P2 & P3 & P4 & P5 & P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    P1 & P2 & P3 & P4 & P5 & P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    P1 & P2 & P3 & P4 & P5 & P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ]]
  
  /* six selectors */
  inline def createCachedSelector_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ]]
  /* six selectors */
  inline def createCachedSelector_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ]]
  
  /* seven selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ]]
  /* seven selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ]]
  
  /* eight selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ]]
  /* eight selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9PR1R2R3R4R5R6R7R8R9T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ]]
  
  /* nine selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ]]
  /* nine selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ]]
  
  /* ten selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ]]
  /* ten selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
    selector11: ParametricSelector[S11, P11, R11],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ]]
  
  /* eleven selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
    selector11: Selector[S11, R11],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ]]
  /* eleven selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
    selector11: ParametricSelector[S11, P11, R11],
    selector12: ParametricSelector[S12, P12, R12],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11 & P12, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], selector12.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11 & P12, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ]]
  
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11 & P12, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11 & P12, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ]]
  
  /* twelve selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
    selector11: Selector[S11, R11],
    selector12: Selector[S12, R12],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], selector12.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ]]
  /* twelve selectors */
  inline def createCachedSelector_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3R4R5R6R7R8R9R10R11R12T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3R4R5R6R7R8R9R10R11T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3R4R5R6R7R8R9R10T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3R4R5R6R7R8R9T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3R4R5R6R7R8T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3R4R5R6R7T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3R4R5R6T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3R4R5T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3R4T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2R3T_OutputParametricCachedSelector[S, P, R1, R2, R3, T](
    selectors: js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ]]
  
  inline def createCachedSelector_SPR1R2T_OutputParametricCachedSelector[S, P, R1, R2, T](
    selectors: js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ]]
  
  inline def createCachedSelector_SPR1T_OutputParametricCachedSelector[S, P, R1, T](selectors: js.Array[ParametricSelector[S, P, R1]], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]]]
  
  inline def createCachedSelector_SPRT_OutputParametricCachedSelector[S, P, R, T](selectors: js.Array[ParametricSelector[S, P, R]], combiner: js.Function1[/* repeated */ R, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* repeated */ R, T], js.Array[ParametricSelector[S, P, R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S, P, T, js.Function1[/* repeated */ R, T], js.Array[ParametricSelector[S, P, R]]]]
  
  /*
    * Homogeneous selectors, array argument
    */
  /* one selector */
  inline def createCachedSelector_SR1T[S, R1, T](selectors: js.Array[Selector[S, R1]], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]]]
  
  /*
    * Any number of uniform selectors
    */
  inline def createCachedSelector_SRT[S, R, T](selectors: js.Array[Selector[S, R]], combiner: js.Function1[/* repeated */ R, T]): OutputCachedSelector[S, T, js.Function1[/* repeated */ R, T], js.Array[Selector[S, R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCachedSelector")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S, T, js.Function1[/* repeated */ R, T], js.Array[Selector[S, R]]]]
  
  inline def createStructuredCachedSelector[T /* <: StringDictionary[js.Function1[/* state */ Any, Any]] */, S, R](selectors: T): OutputCachedSelector[S, R, js.Function1[/* repeated */ Values[R], R], js.Array[Selector[S, Values[R]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStructuredCachedSelector")(selectors.asInstanceOf[js.Any]).asInstanceOf[OutputCachedSelector[S, R, js.Function1[/* repeated */ Values[R], R], js.Array[Selector[S, Values[R]]]]]
  
  inline def createStructuredCachedSelector_TSPR_OutputParametricCachedSelector[T /* <: StringDictionary[js.Function3[/* state */ Any, /* props */ Any, /* repeated */ Any, Any]] */, S, P, R](selectors: T): OutputParametricCachedSelector[
    S, 
    P, 
    R, 
    js.Function1[/* repeated */ Values[R], R], 
    js.Array[ParametricSelector[S, P, Values[R]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStructuredCachedSelector")(selectors.asInstanceOf[js.Any]).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    R, 
    js.Function1[/* repeated */ Values[R], R], 
    js.Array[ParametricSelector[S, P, Values[R]]]
  ]]
  
  inline def default_S1P1R1T[S1, P1, R1, T](selector: ParametricSelector[S1, P1, R1], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]]]
  
  inline def default_S1P1R1T_OutputParametricCachedSelector[S1, P1, R1, T](selectors: js.Array[ParametricSelector[S1, P1, R1]], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S1, P1, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S1, P1, R1]]]]
  
  /*
    * Heterogeneous selectors, parameter types
    */
  /* one selector */
  inline def default_S1R1T[S1, R1, T](selector: Selector[S1, R1], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S1, T, js.Function1[/* res */ R1, T], js.Array[Selector[S1, R1]]]]
  
  inline def default_S1S2P1P2R1R2T[S1, S2, P1, P2, R1, R2, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S1 & S2, 
    P1 & P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2, 
    P1 & P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ]]
  
  inline def default_S1S2P1P2R1R2T_OutputParametricCachedSelector[S1, S2, P1, P2, R1, R2, T](
    selectors: js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S1 & S2, 
    P1 & P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2, 
    P1 & P2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S1, P1, R1], ParametricSelector[S2, P2, R2]]
  ]]
  
  /* two selectors */
  inline def default_S1S2R1R2T[S1, S2, R1, R2, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S1 & S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ]]
  /* two selectors */
  inline def default_S1S2R1R2T[S1, S2, R1, R2, T](
    selectors: js.Tuple2[Selector[S1, R1], Selector[S2, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputCachedSelector[
    S1 & S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[Selector[S1, R1], Selector[S2, R2]]
  ]]
  
  inline def default_S1S2S3P1P2P3R1R2R3T[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3, 
    P1 & P2 & P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3, 
    P1 & P2 & P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ]]
  
  inline def default_S1S2S3P1P2P3R1R2R3T_OutputParametricCachedSelector[S1, S2, S3, P1, P2, P3, R1, R2, R3, T](
    selectors: js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3, 
    P1 & P2 & P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3, 
    P1 & P2 & P3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3]
    ]
  ]]
  
  /* three selectors */
  inline def default_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S1 & S2 & S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ]]
  /* three selectors */
  inline def default_S1S2S3R1R2R3T[S1, S2, S3, R1, R2, R3, T](
    selectors: js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputCachedSelector[
    S1 & S2 & S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3]]
  ]]
  
  inline def default_S1S2S3S4P1P2P3P4R1R2R3R4T[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4, 
    P1 & P2 & P3 & P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4, 
    P1 & P2 & P3 & P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ]]
  
  inline def default_S1S2S3S4P1P2P3P4R1R2R3R4T_OutputParametricCachedSelector[S1, S2, S3, S4, P1, P2, P3, P4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4, 
    P1 & P2 & P3 & P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4, 
    P1 & P2 & P3 & P4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4]
    ]
  ]]
  
  /* four selectors */
  inline def default_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ]]
  /* four selectors */
  inline def default_S1S2S3S4R1R2R3R4T[S1, S2, S3, S4, R1, R2, R3, R4, T](
    selectors: js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4]]
  ]]
  
  inline def default_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    P1 & P2 & P3 & P4 & P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    P1 & P2 & P3 & P4 & P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ]]
  
  inline def default_S1S2S3S4S5P1P2P3P4P5R1R2R3R4R5T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, P1, P2, P3, P4, P5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    P1 & P2 & P3 & P4 & P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    P1 & P2 & P3 & P4 & P5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5]
    ]
  ]]
  
  /* five selectors */
  inline def default_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ]]
  /* five selectors */
  inline def default_S1S2S3S4S5R1R2R3R4R5T[S1, S2, S3, S4, S5, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[Selector[S1, R1], Selector[S2, R2], Selector[S3, R3], Selector[S4, R4], Selector[S5, R5]]
  ]]
  
  inline def default_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    P1 & P2 & P3 & P4 & P5 & P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    P1 & P2 & P3 & P4 & P5 & P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6P1P2P3P4P5P6R1R2R3R4R5R6T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, P1, P2, P3, P4, P5, P6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    P1 & P2 & P3 & P4 & P5 & P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    P1 & P2 & P3 & P4 & P5 & P6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6]
    ]
  ]]
  
  /* six selectors */
  inline def default_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ]]
  /* six selectors */
  inline def default_S1S2S3S4S5S6R1R2R3R4R5R6T[S1, S2, S3, S4, S5, S6, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7P1P2P3P4P5P6P7R1R2R3R4R5R6R7T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, P1, P2, P3, P4, P5, P6, P7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7]
    ]
  ]]
  
  /* seven selectors */
  inline def default_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ]]
  /* seven selectors */
  inline def default_S1S2S3S4S5S6S7R1R2R3R4R5R6R7T[S1, S2, S3, S4, S5, S6, S7, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8P1P2P3P4P5P6P7P8R1R2R3R4R5R6R7R8T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, P1, P2, P3, P4, P5, P6, P7, P8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8]
    ]
  ]]
  
  /* eight selectors */
  inline def default_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ]]
  /* eight selectors */
  inline def default_S1S2S3S4S5S6S7S8R1R2R3R4R5R6R7R8T[S1, S2, S3, S4, S5, S6, S7, S8, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9PR1R2R3R4R5R6R7R8R9T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8S9P1P2P3P4P5P6P7P8P9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, P1, P2, P3, P4, P5, P6, P7, P8, P9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9]
    ]
  ]]
  
  /* nine selectors */
  inline def default_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ]]
  /* nine selectors */
  inline def default_S1S2S3S4S5S6S7S8S9R1R2R3R4R5R6R7R8R9T[S1, S2, S3, S4, S5, S6, S7, S8, S9, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8S9S10P1P2P3P4P5P6P7P8P9P10R1R2R3R4R5R6R7R8R9R10T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10]
    ]
  ]]
  
  /* ten selectors */
  inline def default_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ]]
  /* ten selectors */
  inline def default_S1S2S3S4S5S6S7S8S9S10R1R2R3R4R5R6R7R8R9R10T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
    selector11: ParametricSelector[S11, P11, R11],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8S9S10S11P1P2P3P4P5P6P7P8P9P10P11R1R2R3R4R5R6R7R8R9R10R11T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11]
    ]
  ]]
  
  /* eleven selectors */
  inline def default_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
    selector11: Selector[S11, R11],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ]]
  /* eleven selectors */
  inline def default_S1S2S3S4S5S6S7S8S9S10S11R1R2R3R4R5R6R7R8R9R10R11T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: ParametricSelector[S1, P1, R1],
    selector2: ParametricSelector[S2, P2, R2],
    selector3: ParametricSelector[S3, P3, R3],
    selector4: ParametricSelector[S4, P4, R4],
    selector5: ParametricSelector[S5, P5, R5],
    selector6: ParametricSelector[S6, P6, R6],
    selector7: ParametricSelector[S7, P7, R7],
    selector8: ParametricSelector[S8, P8, R8],
    selector9: ParametricSelector[S9, P9, R9],
    selector10: ParametricSelector[S10, P10, R10],
    selector11: ParametricSelector[S11, P11, R11],
    selector12: ParametricSelector[S12, P12, R12],
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11 & P12, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], selector12.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11 & P12, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ]]
  
  inline def default_S1S2S3S4S5S6S7S8S9S10S11S12P1P2P3P4P5P6P7P8P9P10P11P12R1R2R3R4R5R6R7R8R9R10R11R12T_OutputParametricCachedSelector[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
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
  ): OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11 & P12, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
    P1 & P2 & P3 & P4 & P5 & P6 & P7 & P8 & P9 & P10 & P11 & P12, 
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
      ParametricSelector[S1, P1, R1], 
      ParametricSelector[S2, P2, R2], 
      ParametricSelector[S3, P3, R3], 
      ParametricSelector[S4, P4, R4], 
      ParametricSelector[S5, P5, R5], 
      ParametricSelector[S6, P6, R6], 
      ParametricSelector[S7, P7, R7], 
      ParametricSelector[S8, P8, R8], 
      ParametricSelector[S9, P9, R9], 
      ParametricSelector[S10, P10, R10], 
      ParametricSelector[S11, P11, R11], 
      ParametricSelector[S12, P12, R12]
    ]
  ]]
  
  /* twelve selectors */
  inline def default_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selector1: Selector[S1, R1],
    selector2: Selector[S2, R2],
    selector3: Selector[S3, R3],
    selector4: Selector[S4, R4],
    selector5: Selector[S5, R5],
    selector6: Selector[S6, R6],
    selector7: Selector[S7, R7],
    selector8: Selector[S8, R8],
    selector9: Selector[S9, R9],
    selector10: Selector[S10, R10],
    selector11: Selector[S11, R11],
    selector12: Selector[S12, R12],
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector1.asInstanceOf[js.Any], selector2.asInstanceOf[js.Any], selector3.asInstanceOf[js.Any], selector4.asInstanceOf[js.Any], selector5.asInstanceOf[js.Any], selector6.asInstanceOf[js.Any], selector7.asInstanceOf[js.Any], selector8.asInstanceOf[js.Any], selector9.asInstanceOf[js.Any], selector10.asInstanceOf[js.Any], selector11.asInstanceOf[js.Any], selector12.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ]]
  /* twelve selectors */
  inline def default_S1S2S3S4S5S6S7S8S9S10S11S12R1R2R3R4R5R6R7R8R9R10R11R12T[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
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
  ): OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[
    S1 & S2 & S3 & S4 & S5 & S6 & S7 & S8 & S9 & S10 & S11 & S12, 
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
      Selector[S1, R1], 
      Selector[S2, R2], 
      Selector[S3, R3], 
      Selector[S4, R4], 
      Selector[S5, R5], 
      Selector[S6, R6], 
      Selector[S7, R7], 
      Selector[S8, R8], 
      Selector[S9, R9], 
      Selector[S10, R10], 
      Selector[S11, R11], 
      Selector[S12, R12]
    ]
  ]]
  
  inline def default_SPR1R2R3R4R5R6R7R8R9R10R11R12T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, T](
    selectors: js.Tuple12[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11], 
      ParametricSelector[S, P, R12]
    ]
  ]]
  
  inline def default_SPR1R2R3R4R5R6R7R8R9R10R11T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, T](
    selectors: js.Tuple11[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10], 
      ParametricSelector[S, P, R11]
    ]
  ]]
  
  inline def default_SPR1R2R3R4R5R6R7R8R9R10T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, T](
    selectors: js.Tuple10[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9], 
      ParametricSelector[S, P, R10]
    ]
  ]]
  
  inline def default_SPR1R2R3R4R5R6R7R8R9T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, R9, T](
    selectors: js.Tuple9[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8], 
      ParametricSelector[S, P, R9]
    ]
  ]]
  
  inline def default_SPR1R2R3R4R5R6R7R8T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, R8, T](
    selectors: js.Tuple8[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7], 
      ParametricSelector[S, P, R8]
    ]
  ]]
  
  inline def default_SPR1R2R3R4R5R6R7T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, R7, T](
    selectors: js.Tuple7[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
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
  ): OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
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
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6], 
      ParametricSelector[S, P, R7]
    ]
  ]]
  
  inline def default_SPR1R2R3R4R5R6T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, R6, T](
    selectors: js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ],
    combiner: js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function6[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, /* res6 */ R6, T], 
    js.Tuple6[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5], 
      ParametricSelector[S, P, R6]
    ]
  ]]
  
  inline def default_SPR1R2R3R4R5T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, R5, T](
    selectors: js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ],
    combiner: js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* res5 */ R5, T], 
    js.Tuple5[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4], 
      ParametricSelector[S, P, R5]
    ]
  ]]
  
  inline def default_SPR1R2R3R4T_OutputParametricCachedSelector[S, P, R1, R2, R3, R4, T](
    selectors: js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ],
    combiner: js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function4[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, T], 
    js.Tuple4[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3], 
      ParametricSelector[S, P, R4]
    ]
  ]]
  
  inline def default_SPR1R2R3T_OutputParametricCachedSelector[S, P, R1, R2, R3, T](
    selectors: js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ],
    combiner: js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, T], 
    js.Tuple3[
      ParametricSelector[S, P, R1], 
      ParametricSelector[S, P, R2], 
      ParametricSelector[S, P, R3]
    ]
  ]]
  
  inline def default_SPR1R2T_OutputParametricCachedSelector[S, P, R1, R2, T](
    selectors: js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]],
    combiner: js.Function2[/* res1 */ R1, /* res2 */ R2, T]
  ): OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[
    S, 
    P, 
    T, 
    js.Function2[/* res1 */ R1, /* res2 */ R2, T], 
    js.Tuple2[ParametricSelector[S, P, R1], ParametricSelector[S, P, R2]]
  ]]
  
  inline def default_SPR1T_OutputParametricCachedSelector[S, P, R1, T](selectors: js.Array[ParametricSelector[S, P, R1]], combiner: js.Function1[/* res */ R1, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S, P, T, js.Function1[/* res */ R1, T], js.Array[ParametricSelector[S, P, R1]]]]
  
  inline def default_SPRT_OutputParametricCachedSelector[S, P, R, T](selectors: js.Array[ParametricSelector[S, P, R]], combiner: js.Function1[/* repeated */ R, T]): OutputParametricCachedSelector[S, P, T, js.Function1[/* repeated */ R, T], js.Array[ParametricSelector[S, P, R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputParametricCachedSelector[S, P, T, js.Function1[/* repeated */ R, T], js.Array[ParametricSelector[S, P, R]]]]
  
  /*
    * Homogeneous selectors, array argument
    */
  /* one selector */
  inline def default_SR1T[S, R1, T](selectors: js.Array[Selector[S, R1]], combiner: js.Function1[/* res */ R1, T]): OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S, T, js.Function1[/* res */ R1, T], js.Array[Selector[S, R1]]]]
  
  /*
    * Any number of uniform selectors
    */
  inline def default_SRT[S, R, T](selectors: js.Array[Selector[S, R]], combiner: js.Function1[/* repeated */ R, T]): OutputCachedSelector[S, T, js.Function1[/* repeated */ R, T], js.Array[Selector[S, R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], combiner.asInstanceOf[js.Any])).asInstanceOf[OutputCachedSelector[S, T, js.Function1[/* repeated */ R, T], js.Array[Selector[S, R]]]]
  
  /* Inlined std.Omit<reselect.reselect.CreateSelectorFunction<(args : ...unknown): unknown, reselect.anon.FnCall, [equalityCheckOrOptions: reselect.reselect/es/types.EqualityFn | reselect.reselect/es/defaultMemoize.DefaultMemoizeOptions | undefined | undefined], reselect.anon.ClearCache>, 'clearCache'> */
  trait CreateSelectorInstance extends StObject
  
  trait ICacheObject extends StObject {
    
    def clear(): Unit
    
    def get(key: Any): Any
    
    var isValidCacheKey: js.UndefOr[js.Function1[/* key */ Any, Boolean]] = js.undefined
    
    def remove(key: Any): Unit
    
    def set(key: Any, selectorFn: Any): Unit
  }
  object ICacheObject {
    
    inline def apply(clear: () => Unit, get: Any => Any, remove: Any => Unit, set: (Any, Any) => Unit): ICacheObject = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[ICacheObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICacheObject] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setIsValidCacheKey(value: /* key */ Any => Boolean): Self = StObject.set(x, "isValidCacheKey", js.Any.fromFunction1(value))
      
      inline def setIsValidCacheKeyUndefined: Self = StObject.set(x, "isValidCacheKey", js.undefined)
      
      inline def setRemove(value: Any => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Any, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait KeySelector[S] extends StObject {
    
    def apply(state: S, args: Any*): Any = js.native
  }
  
  type KeySelectorCreator[S, C, D] = js.Function1[/* selectorInputs */ InputSelectors[D, C, S], KeySelector[S]]
  
  type ObjectCacheKey = String | Double
  
  trait Options[S, C, D] extends StObject {
    
    var cacheObject: js.UndefOr[ICacheObject] = js.undefined
    
    var keySelector: js.UndefOr[KeySelector[S]] = js.undefined
    
    var keySelectorCreator: js.UndefOr[KeySelectorCreator[S, C, D]] = js.undefined
    
    var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.undefined
  }
  object Options {
    
    inline def apply[S, C, D](): Options[S, C, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[S, C, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?, ?, ?], S, C, D] (val x: Self & (Options[S, C, D])) extends AnyVal {
      
      inline def setCacheObject(value: ICacheObject): Self = StObject.set(x, "cacheObject", value.asInstanceOf[js.Any])
      
      inline def setCacheObjectUndefined: Self = StObject.set(x, "cacheObject", js.undefined)
      
      inline def setKeySelector(value: KeySelector[S]): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      inline def setKeySelectorCreator(value: /* selectorInputs */ InputSelectors[D, C, S] => KeySelector[S]): Self = StObject.set(x, "keySelectorCreator", js.Any.fromFunction1(value))
      
      inline def setKeySelectorCreatorUndefined: Self = StObject.set(x, "keySelectorCreator", js.undefined)
      
      inline def setKeySelectorUndefined: Self = StObject.set(x, "keySelector", js.undefined)
      
      inline def setSelectorCreator(value: CreateSelectorInstance): Self = StObject.set(x, "selectorCreator", value.asInstanceOf[js.Any])
      
      inline def setSelectorCreatorUndefined: Self = StObject.set(x, "selectorCreator", js.undefined)
    }
  }
  
  type OutputCachedSelector[S, R, C, D] = js.Function1[
    /* options */ KeySelector[S] | (Options[S, C, D]), 
    (OutputSelector[S, R, C, D]) & (Cache[S, R, C, D])
  ]
  
  type OutputParametricCachedSelector[S, P, R, C, D] = js.Function1[
    /* options */ (ParametricKeySelector[S, P]) | (ParametricOptions[S, P, C, D]), 
    (OutputParametricSelector[S, P, R, C, D]) & (ClearCache[S, P, R, C, D])
  ]
  
  @js.native
  trait OutputParametricSelector[S, P, R, C, D]
    extends StObject
       with ParametricSelector[S, P, R] {
    
    var dependencies: D = js.native
    
    def recomputations(): Double = js.native
    
    def resetRecomputations(): Double = js.native
    
    var resultFunc: C = js.native
  }
  
  @js.native
  trait OutputSelector[S, R, C, D] extends Selector[S, R] {
    
    var dependencies: D = js.native
    
    def recomputations(): Double = js.native
    
    def resetRecomputations(): Double = js.native
    
    var resultFunc: C = js.native
  }
  
  @js.native
  trait ParametricKeySelector[S, P] extends StObject {
    
    def apply(state: S, props: P, args: Any*): Any = js.native
  }
  
  type ParametricKeySelectorCreator[S, P, C, D] = js.Function1[
    /* selectorInputs */ typings.reReselect.anon.KeySelector[D, C, S, P], 
    ParametricKeySelector[S, P]
  ]
  
  trait ParametricOptions[S, P, C, D] extends StObject {
    
    var cacheObject: js.UndefOr[ICacheObject] = js.undefined
    
    var keySelector: js.UndefOr[ParametricKeySelector[S, P]] = js.undefined
    
    var keySelectorCreator: js.UndefOr[ParametricKeySelectorCreator[S, P, C, D]] = js.undefined
    
    var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.undefined
  }
  object ParametricOptions {
    
    inline def apply[S, P, C, D](): ParametricOptions[S, P, C, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParametricOptions[S, P, C, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParametricOptions[?, ?, ?, ?], S, P, C, D] (val x: Self & (ParametricOptions[S, P, C, D])) extends AnyVal {
      
      inline def setCacheObject(value: ICacheObject): Self = StObject.set(x, "cacheObject", value.asInstanceOf[js.Any])
      
      inline def setCacheObjectUndefined: Self = StObject.set(x, "cacheObject", js.undefined)
      
      inline def setKeySelector(value: ParametricKeySelector[S, P]): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      inline def setKeySelectorCreator(
        value: /* selectorInputs */ typings.reReselect.anon.KeySelector[D, C, S, P] => ParametricKeySelector[S, P]
      ): Self = StObject.set(x, "keySelectorCreator", js.Any.fromFunction1(value))
      
      inline def setKeySelectorCreatorUndefined: Self = StObject.set(x, "keySelectorCreator", js.undefined)
      
      inline def setKeySelectorUndefined: Self = StObject.set(x, "keySelector", js.undefined)
      
      inline def setSelectorCreator(value: CreateSelectorInstance): Self = StObject.set(x, "selectorCreator", value.asInstanceOf[js.Any])
      
      inline def setSelectorCreatorUndefined: Self = StObject.set(x, "selectorCreator", js.undefined)
    }
  }
  
  @js.native
  trait ParametricSelector[S, P, R] extends StObject {
    
    def apply(state: S, props: P, args: Any*): R = js.native
  }
  
  type Selector[S, R] = js.Function1[/* state */ S, R]
  
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
