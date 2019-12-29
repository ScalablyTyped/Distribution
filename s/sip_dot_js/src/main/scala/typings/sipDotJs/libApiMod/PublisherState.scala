package typings.sipDotJs.libApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "PublisherState")
@js.native
object PublisherState extends js.Object {
  /* "Initial" */ val Initial: typings.sipDotJs.libApiPublisherDashStateMod.PublisherState.Initial with String = js.native
  /* "Published" */ val Published: typings.sipDotJs.libApiPublisherDashStateMod.PublisherState.Published with String = js.native
  /* "Terminated" */ val Terminated: typings.sipDotJs.libApiPublisherDashStateMod.PublisherState.Terminated with String = js.native
  /* "Unpublished" */ val Unpublished: typings.sipDotJs.libApiPublisherDashStateMod.PublisherState.Unpublished with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipDotJs.libApiPublisherDashStateMod.PublisherState with String] = js.native
}

