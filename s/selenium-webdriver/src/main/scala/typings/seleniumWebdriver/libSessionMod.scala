package typings.seleniumWebdriver

import typings.seleniumWebdriver.libCapabilitiesMod.Capabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSessionMod {
  
  @JSImport("selenium-webdriver/lib/session", "Session")
  @js.native
  open class Session protected () extends StObject {
    /**
      * @param {string} id The session ID.
      * @param {!./capabilities.Capabilities} capabilities
      *     The session capabilities.
      */
    def this(id: String, capabilities: Capabilities) = this()
    
    /**
      * @return {!Capabilities} This session's capabilities.
      */
    def getCapabilities(): Capabilities = js.native
    
    /**
      * Retrieves the value of a specific capability.
      * @param {string} key The capability to retrieve.
      * @return {*} The capability value.
      */
    def getCapability(key: String): Any = js.native
    
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
}
