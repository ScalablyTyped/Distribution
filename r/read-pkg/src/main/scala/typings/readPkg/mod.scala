package typings.readPkg

import typings.normalizePackageData.mod.Package
import typings.readPkg.readPkgBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	@returns The parsed JSON.
  	@example
  	```
  	import readPkg = require('read-pkg');
  	(async () => {
  		console.log(await readPkg());
  		//=> {name: 'read-pkg', …}
  		console.log(await readPkg({cwd: 'some-other-directory'});
  		//=> {name: 'unicorn', …}
  	})();
  	```
  	*/
  @JSImport("read-pkg", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[NormalizedPackageJson] = js.native
  @JSImport("read-pkg", JSImport.Namespace)
  @js.native
  def apply(options: NormalizeOptions): js.Promise[NormalizedPackageJson] = js.native
  @JSImport("read-pkg", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[PackageJson] = js.native
  
  /**
  	@returns The parsed JSON.
  	@example
  	```
  	import readPkg = require('read-pkg');
  	console.log(readPkg.sync());
  	//=> {name: 'read-pkg', …}
  	console.log(readPkg.sync({cwd: 'some-other-directory'});
  	//=> {name: 'unicorn', …}
  	```
  	*/
  @JSImport("read-pkg", "sync")
  @js.native
  def sync(): NormalizedPackageJson = js.native
  @JSImport("read-pkg", "sync")
  @js.native
  def sync(options: NormalizeOptions): NormalizedPackageJson = js.native
  @JSImport("read-pkg", "sync")
  @js.native
  def sync(options: Options): PackageJson = js.native
  
  @js.native
  trait NormalizeOptions extends Options {
    
    @JSName("normalize")
    val normalize_NormalizeOptions: js.UndefOr[`true`] = js.native
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
      def setNormalize(value: `true`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  type NormalizedPackageJson = PackageJson with Package
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Current working directory.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[String] = js.native
    
    /**
    		[Normalize](https://github.com/npm/normalize-package-data#what-normalization-currently-entails) the package data.
    		@default true
    		*/
    val normalize: js.UndefOr[Boolean] = js.native
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
  
  type PackageJson = typings.typeFest.packageJsonMod.PackageJson
}
