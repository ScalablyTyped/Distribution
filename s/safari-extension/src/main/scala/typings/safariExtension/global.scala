package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object safari extends js.Object {
    
    var application: SafariApplication = js.native
    
    var extension: SafariExtension = js.native
    
    var self: SafariExtensionGlobalPage | SafariExtensionBar = js.native
  }
}
