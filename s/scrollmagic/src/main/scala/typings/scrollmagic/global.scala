package typings.scrollmagic

import typings.scrollmagic.mod.ControllerConstructorOptions
import typings.scrollmagic.mod.SceneConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ScrollMagic {
    
    @JSGlobal("ScrollMagic.Controller")
    @js.native
    open class Controller ()
      extends typings.scrollmagic.mod.Controller {
      def this(options: ControllerConstructorOptions) = this()
    }
    
    @JSGlobal("ScrollMagic.Scene")
    @js.native
    open class Scene ()
      extends typings.scrollmagic.mod.Scene {
      def this(options: SceneConstructorOptions) = this()
    }
    
    @JSGlobal("ScrollMagic.version")
    @js.native
    val version: String = js.native
  }
}
