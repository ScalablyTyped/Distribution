package typings.readPkgUp

import typings.readPkg.mod.NormalizedPackageJson
import typings.readPkg.mod.PackageJson
import typings.readPkgUp.anon.Cwd
import typings.readPkgUp.readPkgUpStrings.cwd
import typings.typeFest.anon.RequireExactProps
import typings.typeFest.sourceExceptMod.Except
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("read-pkg-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readPackageUp(): js.Promise[js.UndefOr[NormalizedReadResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUp")().asInstanceOf[js.Promise[js.UndefOr[NormalizedReadResult]]]
  inline def readPackageUp(options: NormalizeOptions | Options): js.Promise[js.UndefOr[NormalizedReadResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUp")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[NormalizedReadResult]]]
  
  inline def readPackageUpSync(): js.UndefOr[NormalizedReadResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUpSync")().asInstanceOf[js.UndefOr[NormalizedReadResult]]
  inline def readPackageUpSync(options: NormalizeOptions | Options): js.UndefOr[NormalizedReadResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUpSync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NormalizedReadResult]]
  
  type NormalizeOptions = Cwd & (Except[typings.readPkg.mod.NormalizeOptions, cwd, RequireExactProps])
  
  trait NormalizedReadResult extends StObject {
    
    var packageJson: NormalizedPackageJson
    
    var path: String
  }
  object NormalizedReadResult {
    
    inline def apply(packageJson: NormalizedPackageJson, path: String): NormalizedReadResult = {
      val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedReadResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalizedReadResult] (val x: Self) extends AnyVal {
      
      inline def setPackageJson(value: NormalizedPackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = Cwd & (Except[typings.readPkg.mod.Options, cwd, RequireExactProps])
  
  trait ReadResult extends StObject {
    
    var packageJson: PackageJson
    
    var path: String
  }
  object ReadResult {
    
    inline def apply(packageJson: PackageJson, path: String): ReadResult = {
      val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadResult] (val x: Self) extends AnyVal {
      
      inline def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
