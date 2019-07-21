package typings
package rsvpLib.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "Promise")
@js.native
class PromiseCls[T] protected ()
  extends rsvpLib.rsvpMod.RSVPNs.Promise[T] {
  def this(executor: js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[
          rsvpLib.rsvpMod.RSVPNs.Arg[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ _]
        ], 
        scala.Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
  def this(executor: js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[
          rsvpLib.rsvpMod.RSVPNs.Arg[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ _]
        ], 
        scala.Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], label: java.lang.String) = this()
}

@JSImport("rsvp", "Promise")
@js.native
object Promise
  extends org.scalablytyped.runtime.Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            rsvpLib.rsvpMod.RSVPNs.Arg[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any]
          ], 
          scala.Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ], 
      rsvpLib.rsvpMod.RSVPNs.Promise[js.Object]
    ]
     with org.scalablytyped.runtime.Instantiable2[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            rsvpLib.rsvpMod.RSVPNs.Arg[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any]
          ], 
          scala.Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ], 
      /* label */ java.lang.String, 
      rsvpLib.rsvpMod.RSVPNs.Promise[js.Object]
    ] {
  def all[T](values: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]]): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T]] = js.native
  def all[T](values: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]], label: java.lang.String): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T]] = js.native
  def all[T1, T2](values: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]]): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2](
    values: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2, T3](
    values: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3](
    values: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T9]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T9]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T9], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T10]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T9], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T10]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  def race[T](values: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]]): rsvpLib.rsvpMod.RSVPNs.Promise[T] = js.native
  def race[T](values: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]], label: java.lang.String): rsvpLib.rsvpMod.RSVPNs.Promise[T] = js.native
  def race[T1, T2](values: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]]): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2] = js.native
  def race[T1, T2](
    values: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2] = js.native
  def race[T1, T2, T3](
    values: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3] = js.native
  def race[T1, T2, T3](
    values: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3] = js.native
  def race[T1, T2, T3, T4](
    values: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4] = js.native
  def race[T1, T2, T3, T4](
    values: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4] = js.native
  def race[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5] = js.native
  def race[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5] = js.native
  def race[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  def race[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T9]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T9]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T9], 
      T10 | js.Thenable[T10]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T9], 
      T10 | js.Thenable[T10]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  def reject(): rsvpLib.rsvpMod.RSVPNs.Promise[scala.Nothing] = js.native
  def reject(reason: js.Any): rsvpLib.rsvpMod.RSVPNs.Promise[scala.Nothing] = js.native
  def reject(reason: js.Any, label: java.lang.String): rsvpLib.rsvpMod.RSVPNs.Promise[scala.Nothing] = js.native
  def resolve(): rsvpLib.rsvpMod.RSVPNs.Promise[scala.Unit] = js.native
  def resolve[T](value: rsvpLib.rsvpMod.RSVPNs.Arg[T]): rsvpLib.rsvpMod.RSVPNs.Promise[T] = js.native
  def resolve[T](value: rsvpLib.rsvpMod.RSVPNs.Arg[T], label: java.lang.String): rsvpLib.rsvpMod.RSVPNs.Promise[T] = js.native
  @JSName("resolve")
  def resolve_T[T](): rsvpLib.rsvpMod.RSVPNs.Promise[T] = js.native
}

