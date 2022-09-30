package typings.readPkgUp

import typings.readPkg.mod.NormalizedPackageJson
import typings.readPkg.mod.PackageJson
import typings.readPkgUp.readPkgUpBooleans.`true`
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("read-pkg-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readPackageUp(): js.Promise[js.UndefOr[NormalizedReadResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUp")().asInstanceOf[js.Promise[js.UndefOr[NormalizedReadResult]]]
  inline def readPackageUp(options: NormalizeOptions): js.Promise[js.UndefOr[NormalizedReadResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUp")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[NormalizedReadResult]]]
  inline def readPackageUp(options: Options): js.Promise[js.UndefOr[ReadResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUp")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ReadResult]]]
  
  inline def readPackageUpSync(): js.UndefOr[NormalizedReadResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUpSync")().asInstanceOf[js.UndefOr[NormalizedReadResult]]
  inline def readPackageUpSync(options: NormalizeOptions): js.UndefOr[NormalizedReadResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUpSync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NormalizedReadResult]]
  inline def readPackageUpSync(options: Options): js.UndefOr[ReadResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageUpSync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReadResult]]
  
  /* Inlined {  cwd :std.URL | string | undefined} & type-fest.type-fest.Except<read-pkg.read-pkg.NormalizeOptions, 'cwd'> */
  trait NormalizeOptions extends StObject {
    
    /**
    	The directory to start looking for a package.json file.
    	@default process.cwd()
    	*/
    var cwd: js.UndefOr[URL | String] = js.undefined
    
    var normalize: js.UndefOr[`true`] = js.undefined
  }
  object NormalizeOptions {
    
    inline def apply(): NormalizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizeOptions]
    }
    
    extension [Self <: NormalizeOptions](x: Self) {
      
      inline def setCwd(value: URL | String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setNormalize(value: `true`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  trait NormalizedReadResult extends StObject {
    
    var packageJson: NormalizedPackageJson
    
    var path: String
  }
  object NormalizedReadResult {
    
    inline def apply(packageJson: NormalizedPackageJson, path: String): NormalizedReadResult = {
      val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedReadResult]
    }
    
    extension [Self <: NormalizedReadResult](x: Self) {
      
      inline def setPackageJson(value: NormalizedPackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  cwd :std.URL | string | undefined} & type-fest.type-fest.Except<read-pkg.read-pkg.Options, 'cwd'> */
  trait Options extends StObject {
    
    /**
    	The directory to start looking for a package.json file.
    	@default process.cwd()
    	*/
    var cwd: js.UndefOr[URL | String] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
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
  
  trait ReadResult extends StObject {
    
    var packageJson: PackageJson
    
    var path: String
  }
  object ReadResult {
    
    inline def apply(packageJson: PackageJson, path: String): ReadResult = {
      val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadResult]
    }
    
    extension [Self <: ReadResult](x: Self) {
      
      inline def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
