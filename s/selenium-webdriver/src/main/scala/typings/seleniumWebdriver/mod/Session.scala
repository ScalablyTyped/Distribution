package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Session")
@js.native
open class Session protected () extends StObject {
  def this(id: String, capabilities: js.Object) = this()
  // region Constructors
  /**
    * @param {string} id The session ID.
    * @param {!(Object|Capabilities)} capabilities The session
    *     capabilities.
    * @constructor
    */
  def this(id: String, capabilities: typings.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
  
  /**
    * @return {!Capabilities} This session's capabilities.
    */
  def getCapabilities(): typings.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  
  /**
    * Retrieves the value of a specific capability.
    * @param {string} key The capability to retrieve.
    * @return {*} The capability value.
    */
  def getCapability(key: String): Any = js.native
  
  // endregion
  // region Methods
  /**
    * @return {string} This session's ID.
    */
  def getId(): String = js.native
  
  /**
    * Returns the JSON representation of this object, which is just the string
    * session ID.
    * @return {string} The JSON representation of this Session.
    */
  def toJSON(): String = js.native
}
