package typings.semanticUiReactEventStack

import typings.semanticUiReactEventStack.anon.Name
import typings.semanticUiReactEventStack.anon.Pool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@semantic-ui-react/event-stack", JSImport.Default)
  @js.native
  open class default ()
    extends typings.semanticUiReactEventStack.libTypesEventStackMod.default
  /* static members */
  object default {
    
    @JSImport("@semantic-ui-react/event-stack", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@semantic-ui-react/event-stack", "default.defaultProps")
    @js.native
    def defaultProps: Pool = js.native
    inline def defaultProps_=(x: Pool): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@semantic-ui-react/event-stack", "default.propTypes")
    @js.native
    def propTypes: Name = js.native
    inline def propTypes_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@semantic-ui-react/event-stack", "instance")
  @js.native
  val instance: typings.semanticUiReactEventStack.libTypesLibEventStackMod.default = js.native
}
