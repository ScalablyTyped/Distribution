package typings.readPkg

import typings.normalizePackageData.mod.Package
import typings.readPkg.readPkgBooleans.`true`
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("read-pkg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readPackage(): js.Promise[NormalizedPackageJson] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackage")().asInstanceOf[js.Promise[NormalizedPackageJson]]
  inline def readPackage(options: NormalizeOptions): js.Promise[NormalizedPackageJson] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackage")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NormalizedPackageJson]]
  inline def readPackage(options: Options): js.Promise[PackageJson] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackage")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PackageJson]]
  
  inline def readPackageSync(): NormalizedPackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageSync")().asInstanceOf[NormalizedPackageJson]
  inline def readPackageSync(options: NormalizeOptions): NormalizedPackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageSync")(options.asInstanceOf[js.Any]).asInstanceOf[NormalizedPackageJson]
  inline def readPackageSync(options: Options): PackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageSync")(options.asInstanceOf[js.Any]).asInstanceOf[PackageJson]
  
  trait NormalizeOptions
    extends StObject
       with Options {
    
    @JSName("normalize")
    val normalize_NormalizeOptions: js.UndefOr[`true`] = js.undefined
  }
  object NormalizeOptions {
    
    inline def apply(): NormalizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizeOptions]
    }
    
    extension [Self <: NormalizeOptions](x: Self) {
      
      inline def setNormalize(value: `true`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  type NormalizedPackageJson = PackageJson & Package
  
  trait Options extends StObject {
    
    /**
    	Current working directory.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[URL | String] = js.undefined
    
    /**
    	[Normalize](https://github.com/npm/normalize-package-data#what-normalization-currently-entails) the package data.
    	@default true
    	*/
    val normalize: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: URL | String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  type PackageJson = typings.typeFest.sourcePackageJsonMod.PackageJson
}
