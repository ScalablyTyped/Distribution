package typings.rsvp.rsvpMod

import typings.rsvp.rsvpBooleans.`false`
import typings.rsvp.rsvpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "denodeify")
@js.native
object denodeify extends js.Object {
  def apply[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[T]] = js.native
  def apply[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `false`
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[T]] = js.native
  def apply[T, A](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: `true`
  ): js.Function1[/* arg1 */ A, typings.rsvp.rsvpMod.RSVP.Promise[js.Array[T]]] = js.native
  def apply[T, A, K1 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
      Unit
    ],
    options: js.Array[K1]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.rsvpMod.RSVP.Promise[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in K1 ]: T}
    */ typings.rsvp.rsvpStrings.denodeify with js.Any
    ]
  ] = js.native
  def apply[T1, T2, A, K1 /* <: String */, K2 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
      Unit
    ],
    options: js.Tuple2[K1, K2]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.rsvpMod.RSVP.Promise[typings.rsvp.rsvpStrings.denodeify with js.Any]
  ] = js.native
  def apply[T1, T2, T3, A, K1 /* <: String */, K2 /* <: String */, K3 /* <: String */](
    nodeFunc: js.Function2[
      /* arg1 */ A, 
      /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
      Unit
    ],
    options: js.Tuple3[K1, K2, K3]
  ): js.Function1[
    /* arg1 */ A, 
    typings.rsvp.rsvpMod.RSVP.Promise[typings.rsvp.rsvpStrings.denodeify with js.Any]
  ] = js.native
}

