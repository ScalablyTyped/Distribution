package typings
package rsvpLib.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "filter")
@js.native
object filter extends js.Object {
  def apply[T](
    entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]],
    filterFn: js.Function1[/* item */ T, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T]] = js.native
  def apply[T](
    entries: js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[T]],
    filterFn: js.Function1[/* item */ T, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T]] = js.native
  def apply[T1, T2](
    entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    filterFn: js.Function1[/* item */ T1 | T2, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2]] = js.native
  def apply[T1, T2](
    entries: js.Tuple2[rsvpLib.rsvpMod.RSVPNs.Arg[T1], rsvpLib.rsvpMod.RSVPNs.Arg[T2]],
    filterFn: js.Function1[/* item */ T1 | T2, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2]] = js.native
  def apply[T1, T2, T3](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3]] = js.native
  def apply[T1, T2, T3](
    entries: js.Tuple3[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3]] = js.native
  def apply[T1, T2, T3, T4](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  def apply[T1, T2, T3, T4](
    entries: js.Tuple4[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, scala.Boolean],
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
  def apply[T1, T2, T3, T4, T5](
    entries: js.Tuple5[
      rsvpLib.rsvpMod.RSVPNs.Arg[T1], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T2], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T3], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T4], 
      rsvpLib.rsvpMod.RSVPNs.Arg[T5]
    ],
    filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, scala.Boolean]
  ): rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
  def apply[T1, T2, T3, T4, T5](
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
  def apply[T1, T2, T3, T4, T5, T6](
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
  def apply[T1, T2, T3, T4, T5, T6](
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
  def apply[T1, T2, T3, T4, T5, T6, T7](
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
  def apply[T1, T2, T3, T4, T5, T6, T7](
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
  def apply[T1, T2, T3, T4, T5, T6, T7, T8](
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
  def apply[T1, T2, T3, T4, T5, T6, T7, T8](
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
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
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
}

