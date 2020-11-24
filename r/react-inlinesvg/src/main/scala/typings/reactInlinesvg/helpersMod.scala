package typings.reactInlinesvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-inlinesvg/lib/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  def canUseDOM(): Boolean = js.native
  
  def isSupportedEnvironment(): Boolean = js.native
  
  def randomString(length: Double): String = js.native
  
  def supportsInlineSVG(): Boolean = js.native
  
  @js.native
  object STATUS extends js.Object {
    
    var FAILED: String = js.native
    
    var LOADED: String = js.native
    
    var LOADING: String = js.native
    
    var PENDING: String = js.native
    
    var READY: String = js.native
    
    var UNSUPPORTED: String = js.native
  }
}
