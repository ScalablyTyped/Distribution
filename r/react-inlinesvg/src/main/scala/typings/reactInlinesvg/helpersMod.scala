package typings.reactInlinesvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  object STATUS {
    
    @JSImport("react-inlinesvg/lib/helpers", "STATUS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-inlinesvg/lib/helpers", "STATUS.FAILED")
    @js.native
    def FAILED: String = js.native
    @scala.inline
    def FAILED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/lib/helpers", "STATUS.LOADED")
    @js.native
    def LOADED: String = js.native
    @scala.inline
    def LOADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/lib/helpers", "STATUS.LOADING")
    @js.native
    def LOADING: String = js.native
    @scala.inline
    def LOADING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/lib/helpers", "STATUS.PENDING")
    @js.native
    def PENDING: String = js.native
    @scala.inline
    def PENDING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/lib/helpers", "STATUS.READY")
    @js.native
    def READY: String = js.native
    @scala.inline
    def READY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/lib/helpers", "STATUS.UNSUPPORTED")
    @js.native
    def UNSUPPORTED: String = js.native
    @scala.inline
    def UNSUPPORTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-inlinesvg/lib/helpers", "canUseDOM")
  @js.native
  def canUseDOM(): Boolean = js.native
  
  @JSImport("react-inlinesvg/lib/helpers", "isSupportedEnvironment")
  @js.native
  def isSupportedEnvironment(): Boolean = js.native
  
  @JSImport("react-inlinesvg/lib/helpers", "randomString")
  @js.native
  def randomString(length: Double): String = js.native
  
  @JSImport("react-inlinesvg/lib/helpers", "supportsInlineSVG")
  @js.native
  def supportsInlineSVG(): Boolean = js.native
}
