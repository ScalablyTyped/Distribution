package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workbox extends StObject {
  
  def copyWorkboxLibraries(wwwDir: String): js.Promise[Any]
  
  def generateFileManifest(): js.Promise[Any]
  
  def generateSW(swConfig: Any): js.Promise[Any]
  
  def getFileManifestEntries(): js.Promise[Any]
  
  def injectManifest(swConfig: Any): js.Promise[Any]
}
object Workbox {
  
  inline def apply(
    copyWorkboxLibraries: String => js.Promise[Any],
    generateFileManifest: () => js.Promise[Any],
    generateSW: Any => js.Promise[Any],
    getFileManifestEntries: () => js.Promise[Any],
    injectManifest: Any => js.Promise[Any]
  ): Workbox = {
    val __obj = js.Dynamic.literal(copyWorkboxLibraries = js.Any.fromFunction1(copyWorkboxLibraries), generateFileManifest = js.Any.fromFunction0(generateFileManifest), generateSW = js.Any.fromFunction1(generateSW), getFileManifestEntries = js.Any.fromFunction0(getFileManifestEntries), injectManifest = js.Any.fromFunction1(injectManifest))
    __obj.asInstanceOf[Workbox]
  }
  
  extension [Self <: Workbox](x: Self) {
    
    inline def setCopyWorkboxLibraries(value: String => js.Promise[Any]): Self = StObject.set(x, "copyWorkboxLibraries", js.Any.fromFunction1(value))
    
    inline def setGenerateFileManifest(value: () => js.Promise[Any]): Self = StObject.set(x, "generateFileManifest", js.Any.fromFunction0(value))
    
    inline def setGenerateSW(value: Any => js.Promise[Any]): Self = StObject.set(x, "generateSW", js.Any.fromFunction1(value))
    
    inline def setGetFileManifestEntries(value: () => js.Promise[Any]): Self = StObject.set(x, "getFileManifestEntries", js.Any.fromFunction0(value))
    
    inline def setInjectManifest(value: Any => js.Promise[Any]): Self = StObject.set(x, "injectManifest", js.Any.fromFunction1(value))
  }
}
