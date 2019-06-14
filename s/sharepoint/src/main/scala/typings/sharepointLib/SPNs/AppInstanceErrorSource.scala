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
  
  /* 1 */ val appWeb: appWeb with scala.Double = js.native
  /* 0 */ val common: common with scala.Double = js.native
  /* 4 */ val database: database with scala.Double = js.native
  /* 6 */ val eventCallouts: eventCallouts with scala.Double = js.native
  /* 7 */ val finalization: finalization with scala.Double = js.native
  /* 5 */ val officeExtension: officeExtension with scala.Double = js.native
  /* 2 */ val parentWeb: parentWeb with scala.Double = js.native
  /* 3 */ val remoteWebSite: remoteWebSite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.AppInstanceErrorSource with scala.Double] = js.native
}

