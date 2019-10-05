package typings.sharepoint.SP

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
  
  /* 1 */ val appWeb: typings.sharepoint.SP.AppInstanceErrorSource.appWeb with Double = js.native
  /* 0 */ val common: typings.sharepoint.SP.AppInstanceErrorSource.common with Double = js.native
  /* 4 */ val database: typings.sharepoint.SP.AppInstanceErrorSource.database with Double = js.native
  /* 6 */ val eventCallouts: typings.sharepoint.SP.AppInstanceErrorSource.eventCallouts with Double = js.native
  /* 7 */ val finalization: typings.sharepoint.SP.AppInstanceErrorSource.finalization with Double = js.native
  /* 5 */ val officeExtension: typings.sharepoint.SP.AppInstanceErrorSource.officeExtension with Double = js.native
  /* 2 */ val parentWeb: typings.sharepoint.SP.AppInstanceErrorSource.parentWeb with Double = js.native
  /* 3 */ val remoteWebSite: typings.sharepoint.SP.AppInstanceErrorSource.remoteWebSite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstanceErrorSource with Double] = js.native
}

