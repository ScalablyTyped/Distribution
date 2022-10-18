package typings.sipJs.mod.Core

import typings.sipJs.libCoreUserAgentCoreUserAgentCoreConfigurationMod.UserAgentCoreConfiguration
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreDelegateMod.UserAgentCoreDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.UserAgentCore")
@js.native
open class UserAgentCore protected ()
  extends typings.sipJs.libCoreMod.UserAgentCore {
  /**
    * Constructor.
    * @param configuration - Configuration.
    * @param delegate - Delegate.
    */
  def this(configuration: UserAgentCoreConfiguration) = this()
  def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
}
