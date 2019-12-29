package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
  *     capabilities to initialize this instance from.
  */
class Capabilities ()
  extends typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities {
  def this(other: js.Object) = this()
  def this(other: typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities) = this()
  def this(other: Map[String, _]) = this()
}

/* static members */
@JSImport("selenium-webdriver", "Capabilities")
@js.native
object Capabilities extends js.Object {
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  def chrome(): typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  def edge(): typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  def firefox(): typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  def ie(): typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  def safari(): typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities = js.native
}

