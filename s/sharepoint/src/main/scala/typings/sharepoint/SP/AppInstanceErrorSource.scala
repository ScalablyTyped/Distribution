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
  
}

