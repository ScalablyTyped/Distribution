package typings
package rsvpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EntriesItem extends js.Object {
  def apply[T, U](entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]], mapFn: js.Function1[/* item */ T, U]): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_1] = js.native
  def apply[T, U](
    entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]],
    mapFn: js.Function1[/* item */ T, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_1] = js.native
  def apply[T1, T2, U](
    entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    mapFn: js.Function1[/* item */ T1 | T2, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_2] = js.native
  def apply[T1, T2, U](
    entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    mapFn: js.Function1[/* item */ T1 | T2, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_2] = js.native
  def apply[T1, T2, T3, U](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_3] = js.native
  def apply[T1, T2, T3, U](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_3] = js.native
  def apply[T1, T2, T3, T4, U](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_4] = js.native
  def apply[T1, T2, T3, T4, U](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_4] = js.native
  def apply[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_5] = js.native
  def apply[T1, T2, T3, T4, T5, U](
    entries: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_5] = js.native
  def apply[T1, T2, T3, T4, T5, T6, U](
    entries: js.Tuple6[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T6]
    ],
    mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_6] = js.native
  def apply[T1, T2, T3, T4, T5, T6, U](
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_6] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, U](
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_7] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, U](
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_7] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, U](
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_8] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, U](
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_8] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_9] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_9] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_10] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
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
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[U] with Anon_10] = js.native
}

