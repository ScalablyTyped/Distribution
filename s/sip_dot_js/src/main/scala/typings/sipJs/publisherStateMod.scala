package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherStateMod {
  
  @js.native
  sealed trait PublisherState extends StObject
  @JSImport("sip.js/lib/api/publisher-state", "PublisherState")
  @js.native
  object PublisherState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PublisherState & String] = js.native
    
    @js.native
    sealed trait Initial
      extends StObject
         with PublisherState
    /* "Initial" */ val Initial: typings.sipJs.publisherStateMod.PublisherState.Initial & String = js.native
    
    @js.native
    sealed trait Published
      extends StObject
         with PublisherState
    /* "Published" */ val Published: typings.sipJs.publisherStateMod.PublisherState.Published & String = js.native
    
    @js.native
    sealed trait Terminated
      extends StObject
         with PublisherState
    /* "Terminated" */ val Terminated: typings.sipJs.publisherStateMod.PublisherState.Terminated & String = js.native
    
    @js.native
    sealed trait Unpublished
      extends StObject
         with PublisherState
    /* "Unpublished" */ val Unpublished: typings.sipJs.publisherStateMod.PublisherState.Unpublished & String = js.native
  }
}
