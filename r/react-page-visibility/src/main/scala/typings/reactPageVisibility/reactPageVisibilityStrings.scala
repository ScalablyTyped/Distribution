package typings.reactPageVisibility

import typings.reactPageVisibility.mod.KnownVisibilityStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactPageVisibilityStrings {
  
  @js.native
  sealed trait hidden
    extends StObject
       with KnownVisibilityStates
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait prerender
    extends StObject
       with KnownVisibilityStates
  inline def prerender: prerender = "prerender".asInstanceOf[prerender]
  
  @js.native
  sealed trait unloaded
    extends StObject
       with KnownVisibilityStates
  inline def unloaded: unloaded = "unloaded".asInstanceOf[unloaded]
  
  @js.native
  sealed trait visible
    extends StObject
       with KnownVisibilityStates
  inline def visible: visible = "visible".asInstanceOf[visible]
}
