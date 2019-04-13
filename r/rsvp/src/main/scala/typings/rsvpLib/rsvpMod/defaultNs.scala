package typings
package rsvpLib.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class EventTarget ()
    extends rsvpLib.rsvpMod.RSVPNs.EventTarget
  
  @js.native
  class Promise[T] protected ()
    extends rsvpLib.rsvpMod.RSVPNs.Promise[T]
       with org.scalablytyped.runtime.Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[rsvpLib.rsvpMod.RSVPNs.Arg[js.Object]], scala.Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
            scala.Unit
          ], 
          rsvpLib.rsvpMod.RSVPNs.Promise[js.Object]
        ] {
    def this(executor: js.Function2[
          /* resolve */ js.Function1[/* value */ js.UndefOr[rsvpLib.rsvpMod.RSVPNs.Arg[T]], scala.Unit], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
          scala.Unit
        ]) = this()
    def this(executor: js.Function2[
          /* resolve */ js.Function1[/* value */ js.UndefOr[rsvpLib.rsvpMod.RSVPNs.Arg[T]], scala.Unit], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
          scala.Unit
        ], label: java.lang.String) = this()
  }
  
  val cast: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Promise.cast */ js.Any = js.native
  val off: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.off */ js.Any = js.native
  val on: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.on */ js.Any = js.native
  def allSettled[T](entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]]): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[rsvpLib.rsvpMod.RSVPNs.PromiseState[T]]] = js.native
  def allSettled[T](entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]], label: java.lang.String): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[rsvpLib.rsvpMod.RSVPNs.PromiseState[T]]] = js.native
  def allSettled[T1, T2](entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]]): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple2[rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], rsvpLib.rsvpMod.RSVPNs.PromiseState[T2]]
  ] = js.native
  def allSettled[T1, T2](
    entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple2[rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], rsvpLib.rsvpMod.RSVPNs.PromiseState[T2]]
  ] = js.native
  def allSettled[T1, T2, T3](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3]
    ]
  ] = js.native
  def allSettled[T1, T2, T3](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5](
    entries: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5](
    entries: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T7]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T7]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8]
    ]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T7], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T8]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T7], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T8]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple9[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T7], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T8], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T9]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple9[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T7], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T8], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T9]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple9[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T7], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T8], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T9]
    ]
  ] = js.native
  def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    js.Tuple9[
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T1], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T2], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T3], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T4], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T5], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T6], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T7], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T8], 
      rsvpLib.rsvpMod.RSVPNs.PromiseState[T9]
    ]
  ] = js.native
  def asap[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): scala.Unit = js.native
  def configure[T](name: java.lang.String): T = js.native
  def configure[T](name: java.lang.String, value: T): scala.Unit = js.native
  def defer[T](): rsvpLib.rsvpMod.RSVPNs.Deferred[T] = js.native
  def defer[T](label: java.lang.String): rsvpLib.rsvpMod.RSVPNs.Deferred[T] = js.native
  def denodeify[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[T]] = js.native
  def denodeify[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, scala.Unit], 
      scala.Unit
    ],
    options: rsvpLib.rsvpLibNumbers.`false`
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[T]] = js.native
  def denodeify[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, scala.Unit], 
      scala.Unit
    ],
    options: rsvpLib.rsvpLibNumbers.`true`
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T]]] = js.native
  def denodeify[T, A, K1 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, scala.Unit], 
      scala.Unit
    ],
    options: js.Array[K1]
  ): js.Function1[
    /* arg1 */ A, 
    rsvpLib.rsvpMod.RSVPNs.Promise[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in K1 ]: T}
    */ rsvpLib.rsvpLibStrings.denodeify with js.Any
    ]
  ] = js.native
  def denodeify[T1, T2, A, K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, scala.Unit], 
      scala.Unit
    ],
    options: js.Tuple2[K1, K2]
  ): js.Function1[
    /* arg1 */ A, 
    rsvpLib.rsvpMod.RSVPNs.Promise[rsvpLib.rsvpLibStrings.denodeify with js.Any]
  ] = js.native
  def denodeify[T1, T2, T3, A, K1 /* <: java.lang.String */, K2 /* <: java.lang.String */, K3 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, scala.Unit], 
      scala.Unit
    ],
    options: js.Tuple3[K1, K2, K3]
  ): js.Function1[
    /* arg1 */ A, 
    rsvpLib.rsvpMod.RSVPNs.Promise[rsvpLib.rsvpLibStrings.denodeify with js.Any]
  ] = js.native
  @JSName("denodeify")
  def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, scala.Unit], 
      scala.Unit
    ],
    options: rsvpLib.rsvpLibNumbers.`false`
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_T1T2A[T1, T2, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, scala.Unit], 
      scala.Unit
    ],
    options: rsvpLib.rsvpLibNumbers.`true`
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple2[T1, T2]]] = js.native
  // ----- denodeify ----- //
  // Here be absurd things because we don't have variadic types. All of
  // this will go away if we can ever write this:
  //
  //     denodeify<...T, ...A>(
  //         nodeFunc: (...args: ...A, callback: (err: any, ...cbArgs: ...T) => any) => void,
  //         options?: false
  //     ): (...args: ...A) => RSVP.Promise<...T>
  // That day, however, may never come. So, in the meantime, we do this.
  @JSName("denodeify")
  def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, scala.Unit], 
      scala.Unit
    ],
    options: rsvpLib.rsvpLibNumbers.`false`
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[T1]] = js.native
  @JSName("denodeify")
  def denodeify_T1T2T3A[T1, T2, T3, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, scala.Unit], 
      scala.Unit
    ],
    options: rsvpLib.rsvpLibNumbers.`true`
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[js.Tuple3[T1, T2, T3]]] = js.native
  def filter[T](
    entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]],
    filterFn: js.Function1[/* item */ T, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T]] = js.native
  def filter[T](
    entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]],
    filterFn: js.Function1[/* item */ T, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T]] = js.native
  def filter[T1, T2](
    entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    filterFn: js.Function1[/* item */ T1 | T2, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2]] = js.native
  def filter[T1, T2](
    entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    filterFn: js.Function1[/* item */ T1 | T2, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2]] = js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3]] = js.native
  def filter[T1, T2, T3](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3]] = js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  def filter[T1, T2, T3, T4](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  def filter[T1, T2, T3, T4, T5](
    entries: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with rsvpLib.Anon_6] = js.native
  def filter[T1, T2, T3, T4, T5, T6](
    entries: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with rsvpLib.Anon_6] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7](
    entries: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8](
    entries: js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[
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
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    entries: js.Tuple9[
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
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[
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
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    entries: js.Tuple10[
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
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
  // ----- hash and hashSettled ----- //
  def hash[T](
    `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ rsvpLib.rsvpLibStrings.hash with T
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T] = js.native
  def hash[T](
    `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ rsvpLib.rsvpLibStrings.hash with T,
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T] = js.native
  def hashSettled[T](
    `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ rsvpLib.rsvpLibStrings.hashSettled with T
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ rsvpLib.rsvpLibStrings.hashSettled with T
  ] = js.native
  def hashSettled[T](
    `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ rsvpLib.rsvpLibStrings.hashSettled with T,
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
    */ rsvpLib.rsvpLibStrings.hashSettled with T
  ] = js.native
  def map[T, U](entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]], mapFn: js.Function1[/* item */ T, U]): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_1] = js.native
  def map[T, U](
    entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]],
    mapFn: js.Function1[/* item */ T, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_1] = js.native
  def map[T1, T2, U](
    entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    mapFn: js.Function1[/* item */ T1 | T2, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_2] = js.native
  def map[T1, T2, U](
    entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    mapFn: js.Function1[/* item */ T1 | T2, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_2] = js.native
  def map[T1, T2, T3, U](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_3] = js.native
  def map[T1, T2, T3, U](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_3] = js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_4] = js.native
  def map[T1, T2, T3, T4, U](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_4] = js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_5] = js.native
  def map[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_5] = js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_6] = js.native
  def map[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_6] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_7] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, U](
    entries: js.Tuple7[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_7] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_8] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
    entries: js.Tuple8[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T7], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T8]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_8] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[
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
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_9] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
    entries: js.Tuple9[
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
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_9] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[
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
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_10] = js.native
  def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
    entries: js.Tuple10[
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
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with rsvpLib.Anon_10] = js.native
  def rethrow(reason: js.Any): scala.Unit = js.native
  /* static members */
  @js.native
  object EventTarget extends js.Object {
    /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
    def mixin(`object`: js.Object): rsvpLib.rsvpMod.RSVPNs.ObjectWithEventMixins = js.native
    /**
      * You can use `off` to stop firing a particular callback for an event.
      *
      * If you don't pass a `callback` argument to `off`, ALL callbacks for the
      * event will not be executed when the event fires.
      */
    def off(eventName: java.lang.String): scala.Unit = js.native
    def off(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
    def on(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
    @JSName("on")
    def on_chained(
      eventName: rsvpLib.rsvpLibStrings.chained,
      listener: js.Function1[/* event */ rsvpLib.rsvpMod.RSVPNs.InstrumentEvent, scala.Unit]
    ): scala.Unit = js.native
    /** Registers a callback to be executed when `eventName` is triggered */
    @JSName("on")
    def on_created(
      eventName: rsvpLib.rsvpLibStrings.created,
      listener: js.Function1[/* event */ rsvpLib.rsvpMod.RSVPNs.InstrumentEvent, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_error(
      eventName: rsvpLib.rsvpLibStrings.error,
      errorHandler: js.Function1[/* reason */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_fulfilled(
      eventName: rsvpLib.rsvpLibStrings.fulfilled,
      listener: js.Function1[/* event */ rsvpLib.rsvpMod.RSVPNs.InstrumentEvent, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_rejected(
      eventName: rsvpLib.rsvpLibStrings.rejected,
      listener: js.Function1[/* event */ rsvpLib.rsvpMod.RSVPNs.InstrumentEvent, scala.Unit]
    ): scala.Unit = js.native
    /**
      * Use `trigger` to fire custom events.
      *
      * You can also pass a value as a second argument to `trigger` that will be
      * passed as an argument to all event listeners for the event
      */
    def trigger(eventName: java.lang.String): scala.Unit = js.native
    def trigger(eventName: java.lang.String, options: js.Any): scala.Unit = js.native
    def trigger(eventName: java.lang.String, options: js.Any, label: java.lang.String): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object Promise extends js.Object {
    /**
      * @deprecated
      */
    @JSName("cast")
    var cast_Original: rsvpLib.Anon_Value = js.native
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
    /**
      * @deprecated
      */
    def cast(): js.Promise[scala.Unit] = js.native
    /**
      * @deprecated
      */
    def cast[T](value: T): js.Promise[T] = js.native
    /**
      * @deprecated
      */
    def cast[T](value: js.Thenable[T]): js.Promise[T] = js.native
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
  
  // RSVP supplies status for promises in certain places.
  @js.native
  object State extends js.Object {
    /* "fulfilled" */ val fulfilled: rsvpLib.rsvpMod.RSVPNs.State.fulfilled with java.lang.String = js.native
    /* "pending" */ val pending: rsvpLib.rsvpMod.RSVPNs.State.pending with java.lang.String = js.native
    /* "rejected" */ val rejected: rsvpLib.rsvpMod.RSVPNs.State.rejected with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[rsvpLib.rsvpMod.RSVPNs.State with java.lang.String] = js.native
  }
  
  @js.native
  object all extends js.Object {
    def apply[T](values: js.Array[T | js.Thenable[T]]): js.Promise[js.Array[T]] = js.native
    def apply[TAll](values: stdLib.Iterable[TAll | js.Thenable[TAll]]): js.Promise[js.Array[TAll]] = js.native
    def apply[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): js.Promise[js.Tuple2[T1, T2]] = js.native
    def apply[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): js.Promise[js.Tuple3[T1, T2, T3]] = js.native
    def apply[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
    ): js.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def apply[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5]
        ]
    ): js.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def apply[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6]
        ]
    ): js.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7]
        ]
    ): js.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8]
        ]
    ): js.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9]
        ]
    ): js.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9], 
          T10 | js.Thenable[T10]
        ]
    ): js.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  }
  
  @js.native
  object async extends js.Object {
    def apply[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): scala.Unit = js.native
  }
  
  @js.native
  object race extends js.Object {
    def apply[T](values: js.Array[T | js.Thenable[T]]): js.Promise[T] = js.native
    def apply[T](values: stdLib.Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
    def apply[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): js.Promise[T1 | T2] = js.native
    def apply[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): js.Promise[T1 | T2 | T3] = js.native
    def apply[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
    ): js.Promise[T1 | T2 | T3 | T4] = js.native
    def apply[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5]
        ]
    ): js.Promise[T1 | T2 | T3 | T4 | T5] = js.native
    def apply[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6]
        ]
    ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7]
        ]
    ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8]
        ]
    ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9]
        ]
    ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9], 
          T10 | js.Thenable[T10]
        ]
    ): js.Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  }
  
  @js.native
  object reject extends js.Object {
    def apply[T](): js.Promise[T] = js.native
    def apply[T](reason: js.Any): js.Promise[T] = js.native
  }
  
  @js.native
  object resolve extends js.Object {
    def apply(): js.Promise[scala.Unit] = js.native
    def apply[T](value: T): js.Promise[T] = js.native
    def apply[T](value: js.Thenable[T]): js.Promise[T] = js.native
  }
  
}

