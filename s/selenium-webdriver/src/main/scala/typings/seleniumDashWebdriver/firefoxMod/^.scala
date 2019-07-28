package typings.seleniumDashWebdriver.firefoxMod

import typings.seleniumDashWebdriver.remoteMod.DriverService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/firefox", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createWiresService(binary: String): DriverService = js.native
  def createWiresService(binary: js.Any): DriverService = js.native
  def findWires(): String = js.native
  def prepareProfile(profile: String, port: Double): js.Any = js.native
  def prepareProfile(profile: js.Any, port: Double): js.Any = js.native
}

