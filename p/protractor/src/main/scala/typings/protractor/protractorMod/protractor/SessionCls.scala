package typings.protractor.protractorMod.protractor

import typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "protractor.Session")
@js.native
class SessionCls protected () extends Session {
  // region Constructors
  /**
    * @param {string} id The session ID.
    * @param {!(Object|Capabilities)} capabilities The session
    *     capabilities.
    * @constructor
    */
  def this(id: String, capabilities: Capabilities) = this()
}

