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
  
  inline def parsePackage(packageFile: String): NormalizedPackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePackage")(packageFile.asInstanceOf[js.Any]).asInstanceOf[NormalizedPackageJson]
  inline def parsePackage(packageFile: String, options: NormalizeParseOptions): NormalizedPackageJson = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePackage")(packageFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NormalizedPackageJson]
  inline def parsePackage(packageFile: String, options: ParseOptions): PackageJson = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePackage")(packageFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PackageJson]
  inline def parsePackage(packageFile: PackageJson): NormalizedPackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePackage")(packageFile.asInstanceOf[js.Any]).asInstanceOf[NormalizedPackageJson]
  inline def parsePackage(packageFile: PackageJson, options: NormalizeParseOptions): NormalizedPackageJson = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePackage")(packageFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NormalizedPackageJson]
  inline def parsePackage(packageFile: PackageJson, options: ParseOptions): PackageJson = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePackage")(packageFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PackageJson]
  
  inline def readPackage(): js.Promise[NormalizedPackageJson] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackage")().asInstanceOf[js.Promise[NormalizedPackageJson]]
  inline def readPackage(options: NormalizeOptions): js.Promise[NormalizedPackageJson] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackage")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NormalizedPackageJson]]
  inline def readPackage(options: Options): js.Promise[PackageJson] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackage")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PackageJson]]
  
  inline def readPackageSync(): NormalizedPackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageSync")().asInstanceOf[NormalizedPackageJson]
  inline def readPackageSync(options: NormalizeOptions): NormalizedPackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageSync")(options.asInstanceOf[js.Any]).asInstanceOf[NormalizedPackageJson]
  inline def readPackageSync(options: Options): PackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageSync")(options.asInstanceOf[js.Any]).asInstanceOf[PackageJson]
  
  trait NormalizeOptions
    extends StObject
       with _NormalizeOptions
       with Options {
    
    /**
    	[Normalize](https://github.com/npm/normalize-package-data#what-normalization-currently-entails) the package data.
    	@default true
    	*/
    /* InferMemberOverrides */
    override val normalize: js.UndefOr[Boolean] & js.UndefOr[`true`] = js.undefined
  }
  object NormalizeOptions {
    
    inline def apply(normalize: js.UndefOr[Boolean] & js.UndefOr[`true`]): NormalizeOptions = {
      val __obj = js.Dynamic.literal(normalize = normalize.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalizeOptions] (val x: Self) extends AnyVal {
      
      inline def setNormalize(value: js.UndefOr[Boolean] & js.UndefOr[`true`]): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined read-pkg.read-pkg._NormalizeOptions & read-pkg.read-pkg.ParseOptions */
  trait NormalizeParseOptions extends StObject {
    
    val normalize: js.UndefOr[`true`] = js.undefined
  }
  object NormalizeParseOptions {
    
    inline def apply(): NormalizeParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizeParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalizeParseOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: URL | String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  type PackageJson = typings.typeFest.sourcePackageJsonMod.PackageJson
  
  /* Inlined std.Omit<read-pkg.read-pkg.Options, 'cwd'> */
  trait ParseOptions extends StObject {
    
    var normalize: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  // eslint-disable-next-line @typescript-eslint/naming-convention
  trait _NormalizeOptions extends StObject {
    
    val normalize: js.UndefOr[`true`] = js.undefined
  }
  object _NormalizeOptions {
    
    inline def apply(): _NormalizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_NormalizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _NormalizeOptions] (val x: Self) extends AnyVal {
      
      inline def setNormalize(value: `true`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
}
