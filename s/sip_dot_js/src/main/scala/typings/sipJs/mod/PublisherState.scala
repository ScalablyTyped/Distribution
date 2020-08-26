package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "PublisherState")
@js.native
object PublisherState extends js.Object {
  /* "Initial" */ val Initial: typings.sipJs.publisherStateMod.PublisherState.Initial with String = js.native
  /* "Published" */ val Published: typings.sipJs.publisherStateMod.PublisherState.Published with String = js.native
  /* "Terminated" */ val Terminated: typings.sipJs.publisherStateMod.PublisherState.Terminated with String = js.native
  /* "Unpublished" */ val Unpublished: typings.sipJs.publisherStateMod.PublisherState.Unpublished with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.publisherStateMod.PublisherState with String] = js.native
}

