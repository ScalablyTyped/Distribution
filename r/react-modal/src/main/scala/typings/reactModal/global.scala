package typings.reactModal

import typings.reactModal.mod.Styles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactModal {
    
    @JSGlobal("ReactModal")
    @js.native
    open class ^ ()
      extends typings.reactModal.mod.^
    
    @JSGlobal("ReactModal")
    @js.native
    val ^ : js.Any = js.native
    
    /* Override base styles for all instances of this component. */
    /* static member */
    @JSGlobal("ReactModal.defaultStyles")
    @js.native
    def defaultStyles: Styles = js.native
    inline def defaultStyles_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(x.asInstanceOf[js.Any])
    
    /**
      * Call this to properly hide your application from assistive screenreaders
      * and other assistive technologies while the modal is open.
      */
    /* static member */
    inline def setAppElement(appElement: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppElement")(appElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setAppElement(appElement: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppElement")(appElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
