package typings.readPkgUp

import typings.readPkgUp.readPkgUpBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Read the closest `package.json` file.
  	@example
  	```
  	import readPkgUp = require('read-pkg-up');
  	(async () => {
  		console.log(await readPkgUp());
  		// {
  		// 	packageJson: {
  		// 		name: 'awesome-package',
  		// 		version: '1.0.0',
  		// 		…
  		// 	},
  		// 	path: '/Users/sindresorhus/dev/awesome-package/package.json'
  		// }
  	})();
  	```
  	*/
  @scala.inline
  def apply(): js.Promise[js.UndefOr[NormalizedReadResult]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.UndefOr[NormalizedReadResult]]]
  @scala.inline
  def apply(options: NormalizeOptions): js.Promise[js.UndefOr[NormalizedReadResult]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[NormalizedReadResult]]]
  @scala.inline
  def apply(options: Options): js.Promise[js.UndefOr[ReadResult]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ReadResult]]]
  
  @JSImport("read-pkg-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Synchronously read the closest `package.json` file.
  	@example
  	```
  	import readPkgUp = require('read-pkg-up');
  	console.log(readPkgUp.sync());
  	// {
  	// 	packageJson: {
  	// 		name: 'awesome-package',
  	// 		version: '1.0.0',
  	// 		…
  	// 	},
  	// 	path: '/Users/sindresorhus/dev/awesome-package/package.json'
  	// }
  	```
  	*/
  @scala.inline
  def sync(): js.UndefOr[NormalizedReadResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.UndefOr[NormalizedReadResult]]
  @scala.inline
  def sync(options: NormalizeOptions): js.UndefOr[NormalizedReadResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NormalizedReadResult]]
  @scala.inline
  def sync(options: Options): js.UndefOr[ReadResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReadResult]]
  
  /* Inlined {  cwd :string | undefined} & type-fest.type-fest.Except<read-pkg.read-pkg.NormalizeOptions, 'cwd'> */
  trait NormalizeOptions extends StObject {
    
    /**
    		Directory to start looking for a package.json file.
    		@default process.cwd()
    		*/
    var cwd: js.UndefOr[String] = js.undefined
    
    var normalize: js.UndefOr[`true`] = js.undefined
  }
  object NormalizeOptions {
    
    @scala.inline
    def apply(): NormalizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizeOptions]
    }
    
    @scala.inline
    implicit class NormalizeOptionsMutableBuilder[Self <: NormalizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setNormalize(value: `true`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  type NormalizedPackageJson = typings.readPkg.mod.NormalizedPackageJson
  
  trait NormalizedReadResult extends StObject {
    
    var packageJson: NormalizedPackageJson
    
    var path: String
  }
  object NormalizedReadResult {
    
    @scala.inline
    def apply(packageJson: NormalizedPackageJson, path: String): NormalizedReadResult = {
      val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedReadResult]
    }
    
    @scala.inline
    implicit class NormalizedReadResultMutableBuilder[Self <: NormalizedReadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPackageJson(value: NormalizedPackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  cwd :string | undefined} & type-fest.type-fest.Except<read-pkg.read-pkg.Options, 'cwd'> */
  trait Options extends StObject {
    
    /**
    		Directory to start looking for a package.json file.
    		@default process.cwd()
    		*/
    var cwd: js.UndefOr[String] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  type PackageJson = typings.readPkg.mod.PackageJson
  
  trait ReadResult extends StObject {
    
    var packageJson: PackageJson
    
    var path: String
  }
  object ReadResult {
    
    @scala.inline
    def apply(packageJson: PackageJson, path: String): ReadResult = {
      val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadResult]
    }
    
    @scala.inline
    implicit class ReadResultMutableBuilder[Self <: ReadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
