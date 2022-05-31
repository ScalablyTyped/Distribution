package typings.reactSwf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* static members */
  object ReactSWF {
    
    /* was `typeof rswf.ReactSWF` */
    @JSGlobal("ReactSWF")
    @js.native
    class ^ ()
      extends typings.reactSwf.mod.^
    
    @JSGlobal("ReactSWF")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns installed Flash Player version. Result is cached.
      * Must not be called in a non-browser environment.
      * @return {?string} 'X.Y.Z'-version or null.
      */
    inline def getFPVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFPVersion")().asInstanceOf[String]
    
    /**
      * Returns if installed Flash Player meets version requirement.
      * Must not be called in a non-browser environment.
      * @return {boolean} true if supported
      */
    inline def isFPVersionSupported(versionString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFPVersionSupported")(versionString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
