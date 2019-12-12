package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.UrlZone.custom
import typings.sharepoint.SP.UrlZone.defaultZone
import typings.sharepoint.SP.UrlZone.extranet
import typings.sharepoint.SP.UrlZone.internet
import typings.sharepoint.SP.UrlZone.intranet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UrlZone extends js.Object

@JSGlobal("SP.UrlZone")
@js.native
object UrlZone extends js.Object {
  @js.native
  sealed trait custom extends UrlZone
  
  @js.native
  sealed trait defaultZone extends UrlZone
  
  @js.native
  sealed trait extranet extends UrlZone
  
  @js.native
  sealed trait internet extends UrlZone
  
  @js.native
  sealed trait intranet extends UrlZone
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UrlZone with Double] = js.native
  /* 3 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 0 */ @js.native
  object defaultZone extends TopLevel[defaultZone with Double]
  
  /* 4 */ @js.native
  object extranet extends TopLevel[extranet with Double]
  
  /* 2 */ @js.native
  object internet extends TopLevel[internet with Double]
  
  /* 1 */ @js.native
  object intranet extends TopLevel[intranet with Double]
  
}

