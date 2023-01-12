package typings.reactCodesandboxer

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactCodesandboxer.anon.Content
import typings.reactCodesandboxer.anon.IsLoading
import typings.reactCodesandboxer.reactCodesandboxerStrings.`create-react-app-typescript`
import typings.reactCodesandboxer.reactCodesandboxerStrings.`create-react-app`
import typings.reactCodesandboxer.reactCodesandboxerStrings.`vue-cli`
import typings.reactCodesandboxer.reactCodesandboxerStrings.bitbucket
import typings.reactCodesandboxer.reactCodesandboxerStrings.github
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-codesandboxer", JSImport.Default)
  @js.native
  open class default () extends Component[Props, State, Any]
  
  type CodeSandboxDeployer = Component[Props, State, Any]
  
  trait Error extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Error {
    
    inline def apply(name: String): Error = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Files = StringDictionary[Content]
  
  trait GitInfo extends StObject {
    
    var account: String
    
    var branch: js.UndefOr[String] = js.undefined
    
    var host: bitbucket | github
    
    var repository: String
  }
  object GitInfo {
    
    inline def apply(account: String, host: bitbucket | github, repository: String): GitInfo = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GitInfo] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setHost(value: bitbucket | github): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
  
  type ImportReplacement = js.Tuple2[String, String]
  
  trait Package extends StObject {
    
    var dependencies: StringDictionary[String]
    
    var devDependencies: StringDictionary[String]
    
    var name: String
    
    var peerDependencies: StringDictionary[String]
    
    var version: String
  }
  object Package {
    
    inline def apply(
      dependencies: StringDictionary[String],
      devDependencies: StringDictionary[String],
      name: String,
      peerDependencies: StringDictionary[String],
      version: String
    ): Package = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], peerDependencies = peerDependencies.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Package]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
      
      inline def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPeerDependencies(value: StringDictionary[String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var afterDeploy: js.UndefOr[js.Function2[/* sandboxUrl */ String, /* sandboxId */ String, Any]] = js.undefined
    
    var afterDeployError: js.UndefOr[js.Function1[/* error */ Error, Any]] = js.undefined
    
    var autoDeploy: js.UndefOr[Boolean] = js.undefined
    
    def children(obj: IsLoading): ReactNode
    
    var dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var example: js.UndefOr[String | js.Promise[String]] = js.undefined
    
    var examplePath: String
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var gitInfo: GitInfo
    
    var ignoreInternalImports: js.UndefOr[Boolean] = js.undefined
    
    var importReplacements: js.UndefOr[js.Array[ImportReplacement]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onLoadComplete: js.UndefOr[
        js.Function1[
          /* arg */ typings.reactCodesandboxer.anon.Files | typings.reactCodesandboxer.anon.Error, 
          Any
        ]
      ] = js.undefined
    
    var pkgJSON: js.UndefOr[Package | String | (js.Promise[Package | String])] = js.undefined
    
    var preload: js.UndefOr[Boolean] = js.undefined
    
    var providedFiles: js.UndefOr[Files] = js.undefined
    
    var skipRedirect: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var template: js.UndefOr[`create-react-app` | `create-react-app-typescript` | `vue-cli`] = js.undefined
  }
  object Props {
    
    inline def apply(children: IsLoading => ReactNode, examplePath: String, gitInfo: GitInfo): Props = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), examplePath = examplePath.asInstanceOf[js.Any], gitInfo = gitInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAfterDeploy(value: (/* sandboxUrl */ String, /* sandboxId */ String) => Any): Self = StObject.set(x, "afterDeploy", js.Any.fromFunction2(value))
      
      inline def setAfterDeployError(value: /* error */ Error => Any): Self = StObject.set(x, "afterDeployError", js.Any.fromFunction1(value))
      
      inline def setAfterDeployErrorUndefined: Self = StObject.set(x, "afterDeployError", js.undefined)
      
      inline def setAfterDeployUndefined: Self = StObject.set(x, "afterDeploy", js.undefined)
      
      inline def setAutoDeploy(value: Boolean): Self = StObject.set(x, "autoDeploy", value.asInstanceOf[js.Any])
      
      inline def setAutoDeployUndefined: Self = StObject.set(x, "autoDeploy", js.undefined)
      
      inline def setChildren(value: IsLoading => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setExample(value: String | js.Promise[String]): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      inline def setExamplePath(value: String): Self = StObject.set(x, "examplePath", value.asInstanceOf[js.Any])
      
      inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setGitInfo(value: GitInfo): Self = StObject.set(x, "gitInfo", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInternalImports(value: Boolean): Self = StObject.set(x, "ignoreInternalImports", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInternalImportsUndefined: Self = StObject.set(x, "ignoreInternalImports", js.undefined)
      
      inline def setImportReplacements(value: js.Array[ImportReplacement]): Self = StObject.set(x, "importReplacements", value.asInstanceOf[js.Any])
      
      inline def setImportReplacementsUndefined: Self = StObject.set(x, "importReplacements", js.undefined)
      
      inline def setImportReplacementsVarargs(value: ImportReplacement*): Self = StObject.set(x, "importReplacements", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnLoadComplete(
        value: /* arg */ typings.reactCodesandboxer.anon.Files | typings.reactCodesandboxer.anon.Error => Any
      ): Self = StObject.set(x, "onLoadComplete", js.Any.fromFunction1(value))
      
      inline def setOnLoadCompleteUndefined: Self = StObject.set(x, "onLoadComplete", js.undefined)
      
      inline def setPkgJSON(value: Package | String | (js.Promise[Package | String])): Self = StObject.set(x, "pkgJSON", value.asInstanceOf[js.Any])
      
      inline def setPkgJSONUndefined: Self = StObject.set(x, "pkgJSON", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setProvidedFiles(value: Files): Self = StObject.set(x, "providedFiles", value.asInstanceOf[js.Any])
      
      inline def setProvidedFilesUndefined: Self = StObject.set(x, "providedFiles", js.undefined)
      
      inline def setSkipRedirect(value: Boolean): Self = StObject.set(x, "skipRedirect", value.asInstanceOf[js.Any])
      
      inline def setSkipRedirectUndefined: Self = StObject.set(x, "skipRedirect", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTemplate(value: `create-react-app` | `create-react-app-typescript` | `vue-cli`): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var deployPromise: js.UndefOr[js.Promise[Any]] = js.undefined
    
    var error: js.UndefOr[Error] = js.undefined
    
    var fileName: String
    
    var files: js.UndefOr[Files] = js.undefined
    
    var isDeploying: Boolean
    
    var isLoading: Boolean
    
    var parameters: String
    
    var sandboxId: js.UndefOr[String] = js.undefined
    
    var sandboxUrl: js.UndefOr[String] = js.undefined
  }
  object State {
    
    inline def apply(fileName: String, isDeploying: Boolean, isLoading: Boolean, parameters: String): State = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isDeploying = isDeploying.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setDeployPromise(value: js.Promise[Any]): Self = StObject.set(x, "deployPromise", value.asInstanceOf[js.Any])
      
      inline def setDeployPromiseUndefined: Self = StObject.set(x, "deployPromise", js.undefined)
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setIsDeploying(value: Boolean): Self = StObject.set(x, "isDeploying", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setSandboxId(value: String): Self = StObject.set(x, "sandboxId", value.asInstanceOf[js.Any])
      
      inline def setSandboxIdUndefined: Self = StObject.set(x, "sandboxId", js.undefined)
      
      inline def setSandboxUrl(value: String): Self = StObject.set(x, "sandboxUrl", value.asInstanceOf[js.Any])
      
      inline def setSandboxUrlUndefined: Self = StObject.set(x, "sandboxUrl", js.undefined)
    }
  }
}
