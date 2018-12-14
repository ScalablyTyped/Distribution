package typings
package rsvpLib.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", JSImport.Namespace)
@js.native
object rsvpModMembers extends js.Object {
  val EventTarget: org.scalablytyped.runtime.Instantiable0[rsvpLib.rsvpMod.RSVPNs.EventTarget] = js.native
  val Promise: org.scalablytyped.runtime.Instantiable2[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[rsvpLib.rsvpMod.RSVPNs.Arg[js.Object]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    /* label */ js.UndefOr[/* label */ java.lang.String], 
    rsvpLib.rsvpMod.RSVPNs.Promise[js.Object]
  ] = js.native
  val all: js.Any = js.native
  val allSettled: js.Function2[
    /* entries */ js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[js.Any]], 
    /* label */ js.UndefOr[java.lang.String], 
    rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[rsvpLib.rsvpMod.RSVPNs.PromiseState[js.Any]]]
  ] = js.native
  val asap: js.Function2[
    /* callback */ js.Function1[/* callbackArg */ js.Any, js.Any], 
    /* arg */ js.Any, 
    scala.Unit
  ] = js.native
  val async: js.Any = js.native
  val cast: js.Any = js.native
  val configure: js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit] = js.native
  val defer: js.Function1[/* label */ js.UndefOr[java.lang.String], rsvpLib.rsvpMod.RSVPNs.Deferred[js.Any]] = js.native
  val denodeify: js.Function2[
    /* nodeFunc */ js.Function2[
      /* arg1 */ js.Any, 
      /* callback */ js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit], 
      scala.Unit
    ], 
    /* options */ js.Array[java.lang.String], 
    js.Function1[
      /* arg1 */ js.Any, 
      rsvpLib.rsvpMod.RSVPNs.Promise[rsvpLib.rsvpLibStrings.denodeify with js.Any]
    ]
  ] = js.native
  val filter: js.Function3[
    /* entries */ js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[js.Any]], 
    /* filterFn */ js.Function1[/* item */ js.Any, scala.Boolean], 
    /* label */ js.UndefOr[java.lang.String], 
    rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[js.Any]]
  ] = js.native
  val hash: js.Function2[
    /* object */ rsvpLib.rsvpLibStrings.hash with js.Any, 
    /* label */ js.UndefOr[java.lang.String], 
    rsvpLib.rsvpMod.RSVPNs.Promise[js.Any]
  ] = js.native
  val hashSettled: js.Function2[
    /* object */ rsvpLib.rsvpLibStrings.hashSettled with js.Any, 
    /* label */ js.UndefOr[java.lang.String], 
    rsvpLib.rsvpMod.RSVPNs.Promise[rsvpLib.rsvpLibStrings.hashSettled with js.Any]
  ] = js.native
  val map: js.Function3[
    /* entries */ js.Array[rsvpLib.rsvpMod.RSVPNs.Arg[js.Any]], 
    /* mapFn */ js.Function1[/* item */ js.Any, js.Any], 
    /* label */ js.UndefOr[java.lang.String], 
    rsvpLib.rsvpMod.RSVPNs.Promise[js.Array[_] with rsvpLib.Anon_Length]
  ] = js.native
  val off: js.Any = js.native
  val on: js.Any = js.native
  val race: js.Any = js.native
  val reject: js.Any = js.native
  val resolve: js.Any = js.native
  val rethrow: js.Function1[/* reason */ js.Any, scala.Unit] = js.native
}

