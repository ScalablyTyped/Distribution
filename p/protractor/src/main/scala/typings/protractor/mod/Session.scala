package typings.protractor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor", "Session")
@js.native
open class Session protected ()
  extends typings.seleniumWebdriver.mod.Session {
  def this(id: String, capabilities: js.Object) = this()
  // region Constructors
  /**
    * @param {string} id The session ID.
    * @param {!(Object|Capabilities)} capabilities The session
    *     capabilities.
    */
  def this(id: String, capabilities: typings.seleniumWebdriver.libCapabilitiesMod.Capabilities) = this()
}
