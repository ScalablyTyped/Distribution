package typings
package rsvpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arg1 extends js.Object {
  def apply[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, scala.Unit], 
      scala.Unit
    ]
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[T]] = js.native
  def apply[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, scala.Unit], 
      scala.Unit
    ],
    options: rsvpLib.rsvpLibNumbers.`false`
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[T]] = js.native
  def apply[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, scala.Unit], 
      scala.Unit
    ],
    options: rsvpLib.rsvpLibNumbers.`true`
  ): js.Function1[/* arg1 */ A, rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[T]]] = js.native
  def apply[T, A, K1 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, scala.Unit], 
      scala.Unit
    ],
    options: js.Array[K1]
  ): js.Function1[
    /* arg1 */ A, 
    rsvpLib.rsvpMod.RSVPNs.Promise[rsvpLib.rsvpLibStrings.Anon_Arg1 with js.Any]
  ] = js.native
  def apply[T1, T2, A, K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, scala.Unit], 
      scala.Unit
    ],
    options: js.Tuple2[K1, K2]
  ): js.Function1[
    /* arg1 */ A, 
    rsvpLib.rsvpMod.RSVPNs.Promise[rsvpLib.rsvpLibStrings.Anon_Arg1 with js.Any]
  ] = js.native
  def apply[T1, T2, T3, A, K1 /* <: java.lang.String */, K2 /* <: java.lang.String */, K3 /* <: java.lang.String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, scala.Unit], 
      scala.Unit
    ],
    options: js.Tuple3[K1, K2, K3]
  ): js.Function1[
    /* arg1 */ A, 
    rsvpLib.rsvpMod.RSVPNs.Promise[rsvpLib.rsvpLibStrings.Anon_Arg1 with js.Any]
  ] = js.native
}

