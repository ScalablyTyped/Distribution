package typings.seleniumWebdriver.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
  *     capabilities to initialize this instance from.
  */
open class Capabilities ()
  extends typings.seleniumWebdriver.libCapabilitiesMod.Capabilities {
  def this(other: js.Object) = this()
  def this(other: typings.seleniumWebdriver.libCapabilitiesMod.Capabilities) = this()
  def this(other: Map[String, Any]) = this()
}
/* static members */
object Capabilities {
  
  @JSImport("selenium-webdriver", "Capabilities")
  @js.native
  val ^ : js.Any = js.native
  
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  inline def chrome(): typings.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("chrome")().asInstanceOf[typings.seleniumWebdriver.libCapabilitiesMod.Capabilities]
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  inline def edge(): typings.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("edge")().asInstanceOf[typings.seleniumWebdriver.libCapabilitiesMod.Capabilities]
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  inline def firefox(): typings.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("firefox")().asInstanceOf[typings.seleniumWebdriver.libCapabilitiesMod.Capabilities]
  
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  inline def ie(): typings.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("ie")().asInstanceOf[typings.seleniumWebdriver.libCapabilitiesMod.Capabilities]
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  inline def safari(): typings.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("safari")().asInstanceOf[typings.seleniumWebdriver.libCapabilitiesMod.Capabilities]
}
