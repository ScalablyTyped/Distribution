package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod.UserAgentCoreConfiguration
import typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashDelegateMod.UserAgentCoreDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.UserAgentCore")
@js.native
class UserAgentCore protected ()
  extends typings.sipDotJs.libCoreMod.UserAgentCore {
  /**
    * Constructor.
    * @param configuration - Configuration.
    * @param delegate - Delegate.
    */
  def this(configuration: UserAgentCoreConfiguration) = this()
  def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
}

