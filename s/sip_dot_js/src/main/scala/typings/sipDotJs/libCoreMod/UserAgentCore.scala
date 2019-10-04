package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod.UserAgentCoreConfiguration
import typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashDelegateMod.UserAgentCoreDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "UserAgentCore")
@js.native
class UserAgentCore protected ()
  extends typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore {
  /**
    * Constructor.
    * @param configuration - Configuration.
    * @param delegate - Delegate.
    */
  def this(configuration: UserAgentCoreConfiguration) = this()
  def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
}

