package typings
package rsvpLib.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "Promise")
@js.native
class Promise[T] protected ()
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

