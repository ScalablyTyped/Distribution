package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.AppInstanceErrorSource.appWeb
import typings.sharepoint.SP.AppInstanceErrorSource.common
import typings.sharepoint.SP.AppInstanceErrorSource.database
import typings.sharepoint.SP.AppInstanceErrorSource.eventCallouts
import typings.sharepoint.SP.AppInstanceErrorSource.finalization
import typings.sharepoint.SP.AppInstanceErrorSource.officeExtension
import typings.sharepoint.SP.AppInstanceErrorSource.parentWeb
import typings.sharepoint.SP.AppInstanceErrorSource.remoteWebSite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppInstanceErrorSource extends js.Object

@JSGlobal("SP.AppInstanceErrorSource")
@js.native
object AppInstanceErrorSource extends js.Object {
  @js.native
  sealed trait appWeb extends AppInstanceErrorSource
  
  @js.native
  sealed trait common extends AppInstanceErrorSource
  
  @js.native
  sealed trait database extends AppInstanceErrorSource
  
  @js.native
  sealed trait eventCallouts extends AppInstanceErrorSource
  
  @js.native
  sealed trait finalization extends AppInstanceErrorSource
  
  @js.native
  sealed trait officeExtension extends AppInstanceErrorSource
  
  @js.native
  sealed trait parentWeb extends AppInstanceErrorSource
  
  @js.native
  sealed trait remoteWebSite extends AppInstanceErrorSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstanceErrorSource with Double] = js.native
  /* 1 */ @js.native
  object appWeb extends TopLevel[appWeb with Double]
  
  /* 0 */ @js.native
  object common extends TopLevel[common with Double]
  
  /* 4 */ @js.native
  object database extends TopLevel[database with Double]
  
  /* 6 */ @js.native
  object eventCallouts extends TopLevel[eventCallouts with Double]
  
  /* 7 */ @js.native
  object finalization extends TopLevel[finalization with Double]
  
  /* 5 */ @js.native
  object officeExtension extends TopLevel[officeExtension with Double]
  
  /* 2 */ @js.native
  object parentWeb extends TopLevel[parentWeb with Double]
  
  /* 3 */ @js.native
  object remoteWebSite extends TopLevel[remoteWebSite with Double]
  
}

