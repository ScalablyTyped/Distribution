package typings.protractor.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "Session")
@js.native
class Session protected ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Session {
  def this(id: String, capabilities: js.Object) = this()
  // region Constructors
  /**
    * @param {string} id The session ID.
    * @param {!(Object|Capabilities)} capabilities The session
    *     capabilities.
    * @constructor
    */
  def this(id: String, capabilities: typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities) = this()
}

