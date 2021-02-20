package typings.protractor.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
  *     capabilities to initialize this instance from.
  */
class Capabilities ()
  extends typings.seleniumWebdriver.mod.Capabilities {
  def this(other: js.Object) = this()
  def this(other: typings.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
  def this(other: Map[String, _]) = this()
}
/* static members */
object Capabilities {
  
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  @JSImport("protractor", "Capabilities.chrome")
  @js.native
  def chrome(): typings.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  @JSImport("protractor", "Capabilities.edge")
  @js.native
  def edge(): typings.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  @JSImport("protractor", "Capabilities.firefox")
  @js.native
  def firefox(): typings.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  @JSImport("protractor", "Capabilities.ie")
  @js.native
  def ie(): typings.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  @JSImport("protractor", "Capabilities.safari")
  @js.native
  def safari(): typings.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
}
