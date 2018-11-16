package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppInstanceErrorSource extends js.Object

@JSGlobal("SP.AppInstanceErrorSource")
@js.native
object AppInstanceErrorSource extends js.Object {
  @js.native
  sealed trait appWeb
    extends sharepointLib.SPNs.AppInstanceErrorSource
  
  @js.native
  sealed trait common
    extends sharepointLib.SPNs.AppInstanceErrorSource
  
  @js.native
  sealed trait database
    extends sharepointLib.SPNs.AppInstanceErrorSource
  
  @js.native
  sealed trait eventCallouts
    extends sharepointLib.SPNs.AppInstanceErrorSource
  
  @js.native
  sealed trait finalization
    extends sharepointLib.SPNs.AppInstanceErrorSource
  
  @js.native
  sealed trait officeExtension
    extends sharepointLib.SPNs.AppInstanceErrorSource
  
  @js.native
  sealed trait parentWeb
    extends sharepointLib.SPNs.AppInstanceErrorSource
  
  @js.native
  sealed trait remoteWebSite
    extends sharepointLib.SPNs.AppInstanceErrorSource
  
  val appWeb: appWeb with java.lang.String = js.native
  val common: common with java.lang.String = js.native
  val database: database with java.lang.String = js.native
  val eventCallouts: eventCallouts with java.lang.String = js.native
  val finalization: finalization with java.lang.String = js.native
  val officeExtension: officeExtension with java.lang.String = js.native
  val parentWeb: parentWeb with java.lang.String = js.native
  val remoteWebSite: remoteWebSite with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.AppInstanceErrorSource with java.lang.String] = js.native
}

