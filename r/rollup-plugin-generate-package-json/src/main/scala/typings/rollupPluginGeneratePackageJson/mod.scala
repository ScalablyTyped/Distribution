package typings.rollupPluginGeneratePackageJson

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.mod.Plugin
import typings.rollupPluginGeneratePackageJson.anon.DictmoduleName
import typings.rollupPluginGeneratePackageJson.anon.Directory
import typings.rollupPluginGeneratePackageJson.anon.Email
import typings.rollupPluginGeneratePackageJson.anon.Install
import typings.rollupPluginGeneratePackageJson.anon.Optional
import typings.rollupPluginGeneratePackageJson.anon.Type
import typings.rollupPluginGeneratePackageJson.anon.TypeUrl
import typings.rollupPluginGeneratePackageJson.anon.Url
import typings.rollupPluginGeneratePackageJson.mod.PackageJson.JSPMConfiguration
import typings.rollupPluginGeneratePackageJson.mod.PackageJson.NonStandardEntryPoints
import typings.rollupPluginGeneratePackageJson.mod.PackageJson.PackageJsonStandard
import typings.rollupPluginGeneratePackageJson.mod.PackageJson.TypeScriptConfiguration
import typings.rollupPluginGeneratePackageJson.mod.PackageJson.YarnConfiguration
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonBooleans.`false`
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Dot
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkaix
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkarm
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkarm64
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkdarwin
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkfreebsd
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkia32
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarklinux
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkmips
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkmipsel
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkopenbsd
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkppc
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkppc64
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarks390
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarks390x
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarksunos
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkwin32
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkx32
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.Exclamationmarkx64
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.`import`
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.`node-addons`
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.`react-native`
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.aix
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.arm
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.arm64
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.browser
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.commonjs
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.darwin
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.default
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.deno
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.electron
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.freebsd
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.ia32
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.linux
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.mips
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.mipsel
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.module
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.node
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.openbsd
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.ppc
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.ppc64
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.public
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.require
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.restricted
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.s390
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.s390x
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.sunos
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.win32
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.x32
import typings.rollupPluginGeneratePackageJson.rollupPluginGeneratePackageJsonStrings.x64
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: GeneratePackageJsonOptions): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("rollup-plugin-generate-package-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GeneratePackageJsonOptions extends StObject {
    
    var additionalDependencies: js.UndefOr[js.Array[String] | (Record[String, String])] = js.undefined
    
    var baseContents: js.UndefOr[PackageJson | (js.Function1[/* pkg */ PackageJson, PackageJson])] = js.undefined
    
    var inputFolder: js.UndefOr[String] = js.undefined
    
    var outputFolder: js.UndefOr[String] = js.undefined
  }
  object GeneratePackageJsonOptions {
    
    inline def apply(): GeneratePackageJsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneratePackageJsonOptions]
    }
    
    extension [Self <: GeneratePackageJsonOptions](x: Self) {
      
      inline def setAdditionalDependencies(value: js.Array[String] | (Record[String, String])): Self = StObject.set(x, "additionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDependenciesUndefined: Self = StObject.set(x, "additionalDependencies", js.undefined)
      
      inline def setAdditionalDependenciesVarargs(value: String*): Self = StObject.set(x, "additionalDependencies", js.Array(value*))
      
      inline def setBaseContents(value: PackageJson | (js.Function1[/* pkg */ PackageJson, PackageJson])): Self = StObject.set(x, "baseContents", value.asInstanceOf[js.Any])
      
      inline def setBaseContentsFunction1(value: /* pkg */ PackageJson => PackageJson): Self = StObject.set(x, "baseContents", js.Any.fromFunction1(value))
      
      inline def setBaseContentsUndefined: Self = StObject.set(x, "baseContents", js.undefined)
      
      inline def setInputFolder(value: String): Self = StObject.set(x, "inputFolder", value.asInstanceOf[js.Any])
      
      inline def setInputFolderUndefined: Self = StObject.set(x, "inputFolder", js.undefined)
      
      inline def setOutputFolder(value: String): Self = StObject.set(x, "outputFolder", value.asInstanceOf[js.Any])
      
      inline def setOutputFolderUndefined: Self = StObject.set(x, "outputFolder", js.undefined)
    }
  }
  
  /**
    * Allows creating a union type by combining primitive types and literal types without sacrificing auto-completion in IDEs for the literal type part of the union.
    * Currently, when a union type of a primitive type is combined with literal types, TypeScript loses all information about the combined literals.
    * Thus, when such type is used in an IDE with autocompletion, no suggestions are made for the declared literals.
    * This type is a workaround for [Microsoft/TypeScript#29729](https://github.com/Microsoft/TypeScript/issues/29729). It will be removed as soon as it's not needed anymore.
    * @example
    * ```
    * import type {LiteralUnion} from 'type-fest';
    * // Before
    * type Pet = 'dog' | 'cat' | string;
    * const pet: Pet = '';
    * // Start typing in your TypeScript-enabled IDE.
    * // You **will not** get auto-completion for `dog` and `cat` literals.
    * // After
    * type Pet2 = LiteralUnion<'dog' | 'cat', string>;
    * const pet: Pet2 = '';
    * // You **will** get auto-completion for `dog` and `cat` literals.
    * ```
    * @category Type
    */
  type LiteralUnion[LiteralType, BaseType /* <: Primitive */] = LiteralType | (BaseType & (Record[scala.Nothing, scala.Nothing]))
  
  /**
    * Type for [npm's `package.json` file](https://docs.npmjs.com/creating-a-package-json-file). Also includes types for fields used by other popular projects, like TypeScript and Yarn.
    * @category File
    */
  trait PackageJson
    extends StObject
       with PackageJsonStandard
       with NonStandardEntryPoints
       with TypeScriptConfiguration
       with YarnConfiguration
       with JSPMConfiguration
  object PackageJson {
    
    inline def apply(): PackageJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageJson]
    }
    
    type BugsLocation = String | Url
    
    /**
      * Dependencies of the package. The version range is a string which has one or more space-separated descriptors. Dependencies can also be identified with a tarball or Git URL.
      */
    type Dependency = Partial[Record[String, String]]
    
    trait DirectoryLocations
      extends StObject
         with /**
      * Additional, less common properties from the [npm docs on `publishConfig`](https://docs.npmjs.com/cli/v7/configuring-npm/package-json#publishconfig).
      */
    /* additionalProperties */ StringDictionary[Any] {
      
      /**
        * Location for executable scripts. Sugar to generate entries in the `bin` property by walking the folder.
        */
      var bin: js.UndefOr[String] = js.undefined
      
      /**
        * Location for Markdown files.
        */
      var doc: js.UndefOr[String] = js.undefined
      
      /**
        * Location for example scripts.
        */
      var example: js.UndefOr[String] = js.undefined
      
      /**
        * Location for the bulk of the library.
        */
      var lib: js.UndefOr[String] = js.undefined
      
      /**
        * Location for man pages. Sugar to generate a `man` array by walking the folder.
        */
      var man: js.UndefOr[String] = js.undefined
      
      /**
        * Location for test files.
        */
      var test: js.UndefOr[String] = js.undefined
    }
    object DirectoryLocations {
      
      inline def apply(): DirectoryLocations = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DirectoryLocations]
      }
      
      extension [Self <: DirectoryLocations](x: Self) {
        
        inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
        
        inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
        
        inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
        
        inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
        
        inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
        
        inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
        
        inline def setLib(value: String): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
        
        inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
        
        inline def setMan(value: String): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
        
        inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
        
        inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
        
        inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      }
    }
    
    /**
      * Conditions which provide a way to resolve a package entry point based on the environment.
      */
    type ExportCondition = LiteralUnion[
        `import` | require | node | `node-addons` | deno | browser | electron | `react-native` | default, 
        String
      ]
    
    /**
      * Entry points of a module, optionally with conditions and subpath exports.
      */
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Exports = null | string | std.Array<string> | {[ key in rollup-plugin-generate-package-json.rollup-plugin-generate-package-json.PackageJson.ExportCondition ]: rollup-plugin-generate-package-json.rollup-plugin-generate-package-json.PackageJson.Exports} | {[key: string] : rollup-plugin-generate-package-json.rollup-plugin-generate-package-json.PackageJson.Exports}
    }}}
    to avoid circular code involving: 
    - rollup-plugin-generate-package-json.rollup-plugin-generate-package-json.PackageJson.Exports
    */
    type Exports = Null | String | js.Array[String] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in rollup-plugin-generate-package-json.rollup-plugin-generate-package-json.PackageJson.ExportCondition ]: any} */ js.Any) | StringDictionary[Any]
    
    // eslint-disable-line @typescript-eslint/consistent-indexed-object-style
    /**
      * Import map entries of a module, optionally with conditions.
      */
    type Imports = // eslint-disable-line @typescript-eslint/consistent-indexed-object-style
    StringDictionary[
        String | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in rollup-plugin-generate-package-json.rollup-plugin-generate-package-json.PackageJson.ExportCondition ]: rollup-plugin-generate-package-json.rollup-plugin-generate-package-json.PackageJson.Exports} */ js.Any)
      ]
    
    trait JSPMConfiguration extends StObject {
      
      /**
        * JSPM configuration.
        */
      var jspm: js.UndefOr[PackageJson] = js.undefined
    }
    object JSPMConfiguration {
      
      inline def apply(): JSPMConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JSPMConfiguration]
      }
      
      extension [Self <: JSPMConfiguration](x: Self) {
        
        inline def setJspm(value: PackageJson): Self = StObject.set(x, "jspm", value.asInstanceOf[js.Any])
        
        inline def setJspmUndefined: Self = StObject.set(x, "jspm", js.undefined)
      }
    }
    
    trait NonStandardEntryPoints extends StObject {
      
      /**
        * A hint to JavaScript bundlers or component tools when packaging modules for client side use.
        */
      var browser: js.UndefOr[String | (Partial[Record[String, String | `false`]])] = js.undefined
      
      /**
        * A module ID with untranspiled code that is the primary entry point to the program.
        */
      var esnext: js.UndefOr[String | DictmoduleName] = js.undefined
      
      /**
        * An ECMAScript module ID that is the primary entry point to the program.
        */
      var module: js.UndefOr[String] = js.undefined
      
      /**
        * Denote which files in your project are "pure" and therefore safe for Webpack to prune if unused.
        * [Read more.](https://webpack.js.org/guides/tree-shaking/)
        */
      var sideEffects: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    }
    object NonStandardEntryPoints {
      
      inline def apply(): NonStandardEntryPoints = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NonStandardEntryPoints]
      }
      
      extension [Self <: NonStandardEntryPoints](x: Self) {
        
        inline def setBrowser(value: String | (Partial[Record[String, String | `false`]])): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
        
        inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
        
        inline def setEsnext(value: String | DictmoduleName): Self = StObject.set(x, "esnext", value.asInstanceOf[js.Any])
        
        inline def setEsnextUndefined: Self = StObject.set(x, "esnext", js.undefined)
        
        inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
        
        inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
        
        inline def setSideEffects(value: Boolean | js.Array[String]): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
        
        inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
        
        inline def setSideEffectsVarargs(value: String*): Self = StObject.set(x, "sideEffects", js.Array(value*))
      }
    }
    
    /**
      * Type for [npm's `package.json` file](https://docs.npmjs.com/creating-a-package-json-file). Containing standard npm properties.
      */
    trait PackageJsonStandard extends StObject {
      
      var author: js.UndefOr[Person] = js.undefined
      
      /**
        * The executable files that should be installed into the `PATH`.
        */
      var bin: js.UndefOr[String | (Partial[Record[String, String]])] = js.undefined
      
      /**
        * The URL to the package's issue tracker and/or the email address to which issues should be reported.
        */
      var bugs: js.UndefOr[BugsLocation] = js.undefined
      
      /**
        * Alias of `bundledDependencies`.
        */
      var bundleDependencies: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Package names that are bundled when the package is published.
        */
      var bundledDependencies: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Is used to set configuration parameters used in package scripts that persist across upgrades.
        */
      var config: js.UndefOr[Record[String, Any]] = js.undefined
      
      /**
        * A list of people who contributed to the package.
        */
      var contributors: js.UndefOr[js.Array[Person]] = js.undefined
      
      /**
        * CPU architectures the module runs on.
        */
      var cpu: js.UndefOr[
            js.Array[
              LiteralUnion[
                arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
                String
              ]
            ]
          ] = js.undefined
      
      /**
        * The dependencies of the package.
        */
      var dependencies: js.UndefOr[Dependency] = js.undefined
      
      /**
        * Package description, listed in `npm search`.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * Additional tooling dependencies that are not required for the package to work. Usually test, build, or documentation tooling.
        */
      var devDependencies: js.UndefOr[Dependency] = js.undefined
      
      /**
        * Indicates the structure of the package.
        */
      var directories: js.UndefOr[DirectoryLocations] = js.undefined
      
      /**
        * @deprecated
        */
      var engineStrict: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Engines that this package runs on.
        */
      var engines: js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: {[ EngineName in 'npm' | 'node' | string ]:? string} */ js.Any
          ] = js.undefined
      
      /**
        * Subpath exports to define entry points of the package.
        * [Read more.](https://nodejs.org/api/packages.html#subpath-exports)
        */
      var exports: js.UndefOr[Exports] = js.undefined
      
      /**
        * The files included in the package.
        */
      var files: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Describes and notifies consumers of a package's monetary support information.
        * [Read more.](https://github.com/npm/rfcs/blob/latest/accepted/0017-add-funding-support.md)
        */
      var funding: js.UndefOr[String | TypeUrl] = js.undefined
      
      /**
        * The URL to the package's homepage.
        */
      var homepage: js.UndefOr[LiteralUnion[Dot, String]] = js.undefined
      
      /**
        * Subpath imports to define internal package import maps that only apply to import specifiers from within the package itself.
        * [Read more.](https://nodejs.org/api/packages.html#subpath-imports)
        */
      var imports: js.UndefOr[Imports] = js.undefined
      
      /**
        * Keywords associated with package, listed in `npm search`.
        */
      var keywords: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The license for the package.
        */
      var license: js.UndefOr[String] = js.undefined
      
      /**
        * The licenses for the package.
        */
      var licenses: js.UndefOr[js.Array[Type]] = js.undefined
      
      /**
        * The module ID that is the primary entry point to the program.
        */
      var main: js.UndefOr[String] = js.undefined
      
      /**
        * A list of people who maintain the package.
        */
      var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
      
      /**
        * Filenames to put in place for the `man` program to find.
        */
      var man: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /**
        * The name of the package.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Dependencies that are skipped if they fail to install.
        */
      var optionalDependencies: js.UndefOr[Dependency] = js.undefined
      
      /**
        * Operating systems the module runs on.
        */
      var os: js.UndefOr[
            js.Array[
              LiteralUnion[
                aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
                String
              ]
            ]
          ] = js.undefined
      
      /**
        * Dependencies that will usually be required by the package user directly or via another dependency.
        */
      var peerDependencies: js.UndefOr[Dependency] = js.undefined
      
      /**
        * Indicate peer dependencies that are optional.
        */
      var peerDependenciesMeta: js.UndefOr[Partial[Record[String, Optional]]] = js.undefined
      
      /**
        * If set to `true`, a warning will be shown if package is installed locally. Useful if the package is primarily a command-line application that should be installed globally.
        * @deprecated
        */
      var preferGlobal: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If set to `true`, then npm will refuse to publish it.
        */
      var `private`: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A set of config values that will be used at publish-time.
        * It's especially handy to set the tag, registry or access, to ensure that a given package is not tagged with 'latest',
        * published to the global public registry or that a scoped module is private by default.
        */
      var publishConfig: js.UndefOr[PublishConfig] = js.undefined
      
      /**
        * Location for the code repository.
        */
      var repository: js.UndefOr[String | Directory] = js.undefined
      
      /**
        * Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
        */
      var scripts: js.UndefOr[Scripts] = js.undefined
      
      /**
        * Resolution algorithm for importing ".js" files from the package's scope.
        * [Read more.](https://nodejs.org/api/esm.html#esm_package_json_type_field)
        */
      var `type`: js.UndefOr[module | commonjs] = js.undefined
      
      /**
        * Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
        */
      var version: js.UndefOr[String] = js.undefined
    }
    object PackageJsonStandard {
      
      inline def apply(): PackageJsonStandard = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PackageJsonStandard]
      }
      
      extension [Self <: PackageJsonStandard](x: Self) {
        
        inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        inline def setBin(value: String | (Partial[Record[String, String]])): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
        
        inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
        
        inline def setBugs(value: BugsLocation): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
        
        inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
        
        inline def setBundleDependencies(value: js.Array[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
        
        inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
        
        inline def setBundleDependenciesVarargs(value: String*): Self = StObject.set(x, "bundleDependencies", js.Array(value*))
        
        inline def setBundledDependencies(value: js.Array[String]): Self = StObject.set(x, "bundledDependencies", value.asInstanceOf[js.Any])
        
        inline def setBundledDependenciesUndefined: Self = StObject.set(x, "bundledDependencies", js.undefined)
        
        inline def setBundledDependenciesVarargs(value: String*): Self = StObject.set(x, "bundledDependencies", js.Array(value*))
        
        inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
        
        inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
        
        inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
        
        inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value*))
        
        inline def setCpu(
          value: js.Array[
                  LiteralUnion[
                    arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
                    String
                  ]
                ]
        ): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
        
        inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
        
        inline def setCpuVarargs(
          value: (LiteralUnion[
                  arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
                  String
                ])*
        ): Self = StObject.set(x, "cpu", js.Array(value*))
        
        inline def setDependencies(value: Dependency): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
        
        inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setDevDependencies(value: Dependency): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
        
        inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
        
        inline def setDirectories(value: DirectoryLocations): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
        
        inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
        
        inline def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
        
        inline def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
        
        inline def setEngines(
          value: /* import warning: importer.ImportType#apply Failed type conversion: {[ EngineName in 'npm' | 'node' | string ]:? string} */ js.Any
        ): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
        
        inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
        
        inline def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
        
        inline def setExportsNull: Self = StObject.set(x, "exports", null)
        
        inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
        
        inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
        
        inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        
        inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
        
        inline def setFunding(value: String | TypeUrl): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
        
        inline def setFundingUndefined: Self = StObject.set(x, "funding", js.undefined)
        
        inline def setHomepage(value: LiteralUnion[Dot, String]): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
        
        inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
        
        inline def setImports(value: Imports): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
        
        inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
        
        inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
        
        inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
        
        inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
        
        inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
        
        inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
        
        inline def setLicenses(value: js.Array[Type]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
        
        inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
        
        inline def setLicensesVarargs(value: Type*): Self = StObject.set(x, "licenses", js.Array(value*))
        
        inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
        
        inline def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
        
        inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
        
        inline def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value*))
        
        inline def setMan(value: String | js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
        
        inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
        
        inline def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setOptionalDependencies(value: Dependency): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
        
        inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
        
        inline def setOs(
          value: js.Array[
                  LiteralUnion[
                    aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
                    String
                  ]
                ]
        ): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
        
        inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
        
        inline def setOsVarargs(
          value: (LiteralUnion[
                  aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
                  String
                ])*
        ): Self = StObject.set(x, "os", js.Array(value*))
        
        inline def setPeerDependencies(value: Dependency): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
        
        inline def setPeerDependenciesMeta(value: Partial[Record[String, Optional]]): Self = StObject.set(x, "peerDependenciesMeta", value.asInstanceOf[js.Any])
        
        inline def setPeerDependenciesMetaUndefined: Self = StObject.set(x, "peerDependenciesMeta", js.undefined)
        
        inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
        
        inline def setPreferGlobal(value: Boolean): Self = StObject.set(x, "preferGlobal", value.asInstanceOf[js.Any])
        
        inline def setPreferGlobalUndefined: Self = StObject.set(x, "preferGlobal", js.undefined)
        
        inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
        
        inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
        
        inline def setPublishConfig(value: PublishConfig): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
        
        inline def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
        
        inline def setRepository(value: String | Directory): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
        
        inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
        
        inline def setScripts(value: Scripts): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
        
        inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
        
        inline def setType(value: module | commonjs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * A person who has been involved in creating or maintaining the package.
      */
    type Person = String | Email
    
    trait PublishConfig
      extends StObject
         with /**
      * Additional, less common properties from the [npm docs on `publishConfig`](https://docs.npmjs.com/cli/v7/configuring-npm/package-json#publishconfig).
      */
    /* additionalProperties */ StringDictionary[Any] {
      
      /**
        * When publishing scoped packages, the access level defaults to restricted.
        * If you want your scoped package to be publicly viewable (and installable) set `--access=public`. The only valid values for access are public and restricted.
        * Unscoped packages always have an access level of public.
        */
      var access: js.UndefOr[public | restricted] = js.undefined
      
      /**
        * The base URL of the npm registry.
        * Default: `'https://registry.npmjs.org/'`
        */
      var registry: js.UndefOr[String] = js.undefined
      
      /**
        * The tag to publish the package under.
        * Default: `'latest'`
        */
      var tag: js.UndefOr[String] = js.undefined
    }
    object PublishConfig {
      
      inline def apply(): PublishConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PublishConfig]
      }
      
      extension [Self <: PublishConfig](x: Self) {
        
        inline def setAccess(value: public | restricted): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
        
        inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
        
        inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
    
    type Scripts = Install & (Partial[Record[String, String]])
    
    trait TypeScriptConfiguration extends StObject {
      
      /**
        * Location of the bundled TypeScript declaration file.
        */
      var types: js.UndefOr[String] = js.undefined
      
      /**
        * Version selection map of TypeScript.
        */
      var typesVersions: js.UndefOr[Partial[Record[String, Partial[Record[String, js.Array[String]]]]]] = js.undefined
      
      /**
        * Location of the bundled TypeScript declaration file. Alias of `types`.
        */
      @JSName("typings")
      var typings_ : js.UndefOr[String] = js.undefined
    }
    object TypeScriptConfiguration {
      
      inline def apply(): TypeScriptConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TypeScriptConfiguration]
      }
      
      extension [Self <: TypeScriptConfiguration](x: Self) {
        
        inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
        
        inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
        
        inline def setTypesVersions(value: Partial[Record[String, Partial[Record[String, js.Array[String]]]]]): Self = StObject.set(x, "typesVersions", value.asInstanceOf[js.Any])
        
        inline def setTypesVersionsUndefined: Self = StObject.set(x, "typesVersions", js.undefined)
        
        inline def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
        
        inline def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
      }
    }
    
    /**
      * An alternative configuration for Yarn workspaces.
      */
    trait WorkspaceConfig extends StObject {
      
      /**
        * Designed to solve the problem of packages which break when their `node_modules` are moved to the root workspace directory - a process known as hoisting.
        * For these packages, both within your workspace, and also some that have been installed via `node_modules`,
        * it is important to have a mechanism for preventing the default Yarn workspace behavior.
        * By adding workspace pattern strings here, Yarn will resume non-workspace behavior for any package which matches the defined patterns.
        * [Read more](https://classic.yarnpkg.com/blog/2018/02/15/nohoist/)
        */
      var nohoist: js.UndefOr[js.Array[WorkspacePattern]] = js.undefined
      
      /**
        * An array of workspace pattern strings which contain the workspace packages.
        */
      var packages: js.UndefOr[js.Array[WorkspacePattern]] = js.undefined
    }
    object WorkspaceConfig {
      
      inline def apply(): WorkspaceConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WorkspaceConfig]
      }
      
      extension [Self <: WorkspaceConfig](x: Self) {
        
        inline def setNohoist(value: js.Array[WorkspacePattern]): Self = StObject.set(x, "nohoist", value.asInstanceOf[js.Any])
        
        inline def setNohoistUndefined: Self = StObject.set(x, "nohoist", js.undefined)
        
        inline def setNohoistVarargs(value: WorkspacePattern*): Self = StObject.set(x, "nohoist", js.Array(value*))
        
        inline def setPackages(value: js.Array[WorkspacePattern]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
        
        inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
        
        inline def setPackagesVarargs(value: WorkspacePattern*): Self = StObject.set(x, "packages", js.Array(value*))
      }
    }
    
    /**
      * A workspace pattern points to a directory or group of directories which contain packages that should be included in the workspace installation process.
      * The patterns are handled with [minimatch](https://github.com/isaacs/minimatch).
      * @example
      * `docs` → Include the docs directory and install its dependencies.
      * `packages/ *` → Include all nested directories within the packages directory, like `packages/cli` and `packages/core`.
      */
    type WorkspacePattern = String
    
    trait YarnConfiguration extends StObject {
      
      /**
        * If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command-line, set this to `true`.
        * Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an app),
        * those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
        */
      var flat: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
        */
      var resolutions: js.UndefOr[Dependency] = js.undefined
      
      /**
        * Used to configure [Yarn workspaces](https://classic.yarnpkg.com/docs/workspaces/).
        * Workspaces allow you to manage multiple packages within the same repository in such a way that you only need to run `yarn install` once to install all of them in a single pass.
        * Please note that the top-level `private` property of `package.json` **must** be set to `true` in order to use workspaces.
        */
      var workspaces: js.UndefOr[js.Array[WorkspacePattern] | WorkspaceConfig] = js.undefined
    }
    object YarnConfiguration {
      
      inline def apply(): YarnConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[YarnConfiguration]
      }
      
      extension [Self <: YarnConfiguration](x: Self) {
        
        inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
        
        inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
        
        inline def setResolutions(value: Dependency): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
        
        inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
        
        inline def setWorkspaces(value: js.Array[WorkspacePattern] | WorkspaceConfig): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
        
        inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
        
        inline def setWorkspacesVarargs(value: WorkspacePattern*): Self = StObject.set(x, "workspaces", js.Array(value*))
      }
    }
  }
  
  // Copied from https://github.com/sindresorhus/type-fest
  /**
    * Matches any [primitive value](https://developer.mozilla.org/en-US/docs/Glossary/Primitive).
    * @category Type
    */
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]
}
