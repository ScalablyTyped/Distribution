package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Session")
@js.native
class Session protected () extends js.Object {
  def this(id: java.lang.String, capabilities: js.Object) = this()
  // region Constructors
  /**
    * @param {string} id The session ID.
    * @param {!(Object|Capabilities)} capabilities The session
    *     capabilities.
    * @constructor
    */
  def this(id: java.lang.String, capabilities: Capabilities) = this()
  /**
    * @return {!Capabilities} This session's capabilities.
    */
  def getCapabilities(): Capabilities = js.native
  /**
    * Retrieves the value of a specific capability.
    * @param {string} key The capability to retrieve.
    * @return {*} The capability value.
    */
  def getCapability(key: java.lang.String): js.Any = js.native
  // endregion
  // region Methods
  /**
    * @return {string} This session's ID.
    */
  def getId(): java.lang.String = js.native
  /**
    * Returns the JSON representation of this object, which is just the string
    * session ID.
    * @return {string} The JSON representation of this Session.
    */
  def toJSON(): java.lang.String = js.native
}

