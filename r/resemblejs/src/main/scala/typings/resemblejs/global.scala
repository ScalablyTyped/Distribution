package typings.resemblejs

import typings.resemblejs.mod.OutputSettings_
import typings.resemblejs.mod.ResembleAnalysis
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object resemble {
    
    /**
      * Retrieve basic analysis for a single image (add compareTo to compare with another).
      */
    inline def apply(image: String): ResembleAnalysis = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[ResembleAnalysis]
    inline def apply(image: ImageData): ResembleAnalysis = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[ResembleAnalysis]
    
    @JSGlobal("resemble")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Set the resemblance image output style
      */
    inline def outputSettings(settings: OutputSettings_): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("outputSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
