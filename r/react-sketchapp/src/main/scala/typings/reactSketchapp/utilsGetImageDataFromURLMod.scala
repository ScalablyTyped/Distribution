package typings.reactSketchapp

import typings.reactSketchapp.anon.Sha1
import typings.reactSketchapp.libTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsGetImageDataFromURLMod {
  
  @JSImport("react-sketchapp/lib/utils/getImageDataFromURL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getImageDataFromURL(bridge: PlatformBridge): js.Function1[/* url */ js.UndefOr[String], Sha1] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageDataFromURL")(bridge.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* url */ js.UndefOr[String], Sha1]]
}
