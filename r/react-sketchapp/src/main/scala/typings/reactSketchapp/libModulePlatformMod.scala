package typings.reactSketchapp

import typings.reactSketchapp.anon.Sketch
import typings.reactSketchapp.reactSketchappStrings.NodeJS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModulePlatformMod {
  
  object Platform {
    
    @JSImport("react-sketchapp/lib/module/Platform", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/Platform", "Platform.OS")
    @js.native
    def OS: String = js.native
    inline def OS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/Platform", "Platform.Version")
    @js.native
    def Version: Double | NodeJS = js.native
    inline def Version_=(x: Double | NodeJS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Version")(x.asInstanceOf[js.Any])
    
    inline def select(obj: Sketch): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
