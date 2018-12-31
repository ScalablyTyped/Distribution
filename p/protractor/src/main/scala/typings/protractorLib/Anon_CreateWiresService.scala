package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateWiresService extends js.Object {
  var Binary: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.firefoxMod.Binary] = js.native
  var Driver: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.firefoxMod.Driver] = js.native
  var Options: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.firefoxMod.Options] = js.native
  var Profile: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.firefoxMod.Profile] = js.native
  var ServiceBuilder: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.firefoxMod.ServiceBuilder] = js.native
  def createWiresService(binary: java.lang.String): seleniumDashWebdriverLib.remoteMod.DriverService = js.native
  def createWiresService(binary: js.Any): seleniumDashWebdriverLib.remoteMod.DriverService = js.native
  def findWires(): java.lang.String = js.native
  def prepareProfile(profile: java.lang.String, port: scala.Double): js.Any = js.native
  def prepareProfile(profile: js.Any, port: scala.Double): js.Any = js.native
}

