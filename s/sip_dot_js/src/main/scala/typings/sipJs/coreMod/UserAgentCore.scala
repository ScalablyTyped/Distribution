package typings.sipJs.coreMod

import typings.sipJs.userAgentCoreConfigurationMod.UserAgentCoreConfiguration
import typings.sipJs.userAgentCoreDelegateMod.UserAgentCoreDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "UserAgentCore")
@js.native
class UserAgentCore protected ()
  extends typings.sipJs.userAgentCoreMod.UserAgentCore {
  /**
    * Constructor.
    * @param configuration - Configuration.
    * @param delegate - Delegate.
    */
  def this(configuration: UserAgentCoreConfiguration) = this()
  def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
}
