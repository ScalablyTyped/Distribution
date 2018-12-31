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
  val all: rsvpLib.Anon_Values = js.native
  val allSettled: rsvpLib.Anon_EntriesLabel = js.native
  val asap: rsvpLib.Anon_Callback = js.native
  val async: rsvpLib.Anon_Callback = js.native
  val cast: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Promise.cast */ js.Any = js.native
  val configure: rsvpLib.Anon_Name = js.native
  val defer: rsvpLib.Anon_Label = js.native
  val denodeify: rsvpLib.Anon_NodeFunc = js.native
  val filter: rsvpLib.Anon_EntriesFilterFn = js.native
  val hash: rsvpLib.Anon_Object = js.native
  val hashSettled: rsvpLib.Anon_ObjectLabel = js.native
  val map: rsvpLib.Anon_Entries = js.native
  val off: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.off */ js.Any = js.native
  val on: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.on */ js.Any = js.native
  val race: rsvpLib.Anon_ValuesT = js.native
  val reject: rsvpLib.Anon_Reason = js.native
  val resolve: rsvpLib.Anon_Value = js.native
  val rethrow: js.Function1[/* reason */ js.Any, scala.Unit] = js.native
}

