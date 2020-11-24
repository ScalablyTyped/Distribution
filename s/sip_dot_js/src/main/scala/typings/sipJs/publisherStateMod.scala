package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/publisher-state", JSImport.Namespace)
@js.native
object publisherStateMod extends js.Object {
  
  @js.native
  sealed trait PublisherState extends js.Object
  @js.native
  object PublisherState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PublisherState with String] = js.native
    
    @js.native
    sealed trait Initial extends PublisherState
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    @js.native
    sealed trait Published extends PublisherState
    /* "Published" */ @js.native
    object Published extends TopLevel[Published with String]
    
    @js.native
    sealed trait Terminated extends PublisherState
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
    
    @js.native
    sealed trait Unpublished extends PublisherState
    /* "Unpublished" */ @js.native
    object Unpublished extends TopLevel[Unpublished with String]
  }
}
