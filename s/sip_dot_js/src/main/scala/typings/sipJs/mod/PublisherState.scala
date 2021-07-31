package typings.sipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "PublisherState")
@js.native
object PublisherState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.publisherStateMod.PublisherState & String] = js.native
  
  /* "Initial" */ val Initial: typings.sipJs.publisherStateMod.PublisherState.Initial & String = js.native
  
  /* "Published" */ val Published: typings.sipJs.publisherStateMod.PublisherState.Published & String = js.native
  
  /* "Terminated" */ val Terminated: typings.sipJs.publisherStateMod.PublisherState.Terminated & String = js.native
  
  /* "Unpublished" */ val Unpublished: typings.sipJs.publisherStateMod.PublisherState.Unpublished & String = js.native
}
