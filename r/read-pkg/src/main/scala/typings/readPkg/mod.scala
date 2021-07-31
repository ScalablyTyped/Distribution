package typings.readPkg

import typings.readPkg.readPkgBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(): js.Promise[NormalizedPackageJson] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[NormalizedPackageJson]]
  @scala.inline
  def apply(options: NormalizeOptions): js.Promise[NormalizedPackageJson] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NormalizedPackageJson]]
  @scala.inline
  def apply(options: Options): js.Promise[PackageJson] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PackageJson]]
  
  @JSImport("read-pkg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def sync(): NormalizedPackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[NormalizedPackageJson]
  @scala.inline
  def sync(options: NormalizeOptions): NormalizedPackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[NormalizedPackageJson]
  @scala.inline
  def sync(options: Options): PackageJson = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[PackageJson]
  
  trait NormalizeOptions
    extends StObject
       with Options {
    
    @JSName("normalize")
    val normalize_NormalizeOptions: js.UndefOr[`true`] = js.undefined
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StObject because Already inherited
  - org.scalablytyped.runtime.StringDictionary because Already inherited
  - typings.normalizePackageData.mod.Package because var conflicts: author, bin, bugs, bundleDependencies, contributors, dependencies, description, devDependencies, engines, files, homepage, keywords, license, maintainers, man, name, optionalDependencies, repository, scripts, version. Inlined _id, readme */ trait NormalizedPackageJson
    extends StObject
       with typings.typeFest.packageJsonMod.PackageJson {
    
    var _id: String
    
    var readme: String
  }
  object NormalizedPackageJson {
    
    @scala.inline
    def apply(_id: String, readme: String): NormalizedPackageJson = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedPackageJson]
    }
    
    @scala.inline
    implicit class NormalizedPackageJsonMutableBuilder[Self <: NormalizedPackageJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
    		Current working directory.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[String] = js.undefined
    
    /**
    		[Normalize](https://github.com/npm/normalize-package-data#what-normalization-currently-entails) the package data.
    		@default true
    		*/
    val normalize: js.UndefOr[Boolean] = js.undefined
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
