package typings.sipDotJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/publisher-state", JSImport.Namespace)
@js.native
object libApiPublisherDashStateMod extends js.Object {
  @js.native
  sealed trait PublisherState extends js.Object
  
  @js.native
  object PublisherState extends js.Object {
    @js.native
    sealed trait Initial extends PublisherState
    
    @js.native
    sealed trait Published extends PublisherState
    
    @js.native
    sealed trait Terminated extends PublisherState
    
    @js.native
    sealed trait Unpublished extends PublisherState
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PublisherState with String] = js.native
    /* "Initial" */ @js.native
    object Initial extends TopLevel[Initial with String]
    
    /* "Published" */ @js.native
    object Published extends TopLevel[Published with String]
    
    /* "Terminated" */ @js.native
    object Terminated extends TopLevel[Terminated with String]
    
    /* "Unpublished" */ @js.native
    object Unpublished extends TopLevel[Unpublished with String]
    
  }
  
}

