package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppInstanceErrorSource extends StObject
@JSGlobal("SP.AppInstanceErrorSource")
@js.native
object AppInstanceErrorSource extends StObject {
  
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
