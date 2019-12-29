package typings.sharepoint.SP.Publishing.Navigation

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StandardNavigationSource extends js.Object

@JSGlobal("SP.Publishing.Navigation.StandardNavigationSource")
@js.native
object StandardNavigationSource extends js.Object {
  @js.native
  sealed trait inheritFromParentWeb extends StandardNavigationSource
  
  @js.native
  sealed trait portalProvider extends StandardNavigationSource
  
  @js.native
  sealed trait taxonomyProvider extends StandardNavigationSource
  
  @js.native
  sealed trait unknown extends StandardNavigationSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StandardNavigationSource with Double] = js.native
  /* 3 */ @js.native
  object inheritFromParentWeb extends TopLevel[inheritFromParentWeb with Double]
  
  /* 1 */ @js.native
  object portalProvider extends TopLevel[portalProvider with Double]
  
  /* 2 */ @js.native
  object taxonomyProvider extends TopLevel[taxonomyProvider with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

