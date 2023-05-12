package typings.sigstore

import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TrustedRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTufMod {
  
  @JSImport("sigstore/dist/tuf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTarget(targetName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(targetName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getTarget(targetName: String, options: TUFOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(targetName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getTrustedRoot(): js.Promise[TrustedRoot] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrustedRoot")().asInstanceOf[js.Promise[TrustedRoot]]
  inline def getTrustedRoot(options: TUFOptions): js.Promise[TrustedRoot] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTrustedRoot")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TrustedRoot]]
  
  trait TUFOptions extends StObject {
    
    var cachePath: js.UndefOr[String] = js.undefined
    
    var mirrorURL: js.UndefOr[String] = js.undefined
    
    var rootPath: js.UndefOr[String] = js.undefined
  }
  object TUFOptions {
    
    inline def apply(): TUFOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TUFOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TUFOptions] (val x: Self) extends AnyVal {
      
      inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
      
      inline def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
      
      inline def setMirrorURL(value: String): Self = StObject.set(x, "mirrorURL", value.asInstanceOf[js.Any])
      
      inline def setMirrorURLUndefined: Self = StObject.set(x, "mirrorURL", js.undefined)
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
    }
  }
}
