package typings.rollupPluginTypescript2.ioptionsMod

import typings.rollupPluginTypescript2.anon.TypeoftsTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  var abortOnError: Boolean = js.native
  
  var cacheRoot: String = js.native
  
  var check: Boolean = js.native
  
  var clean: Boolean = js.native
  
  var cwd: String = js.native
  
  var exclude: String | js.Array[String] = js.native
  
  var include: String | js.Array[String] = js.native
  
  var objectHashIgnoreUnknownHack: Boolean = js.native
  
  var rollupCommonJSResolveHack: Boolean = js.native
  
  def sourceMapCallback(id: String, map: String): Unit = js.native
  
  var transformers: js.Array[TransformerFactoryCreator] = js.native
  
  var tsconfig: js.UndefOr[String] = js.native
  
  var tsconfigDefaults: js.Any = js.native
  
  var tsconfigOverride: js.Any = js.native
  
  var typescript: TypeoftsTypes = js.native
  
  var useTsconfigDeclarationDir: Boolean = js.native
  
  var verbosity: Double = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    abortOnError: Boolean,
    cacheRoot: String,
    check: Boolean,
    clean: Boolean,
    cwd: String,
    exclude: String | js.Array[String],
    include: String | js.Array[String],
    objectHashIgnoreUnknownHack: Boolean,
    rollupCommonJSResolveHack: Boolean,
    sourceMapCallback: (String, String) => Unit,
    transformers: js.Array[TransformerFactoryCreator],
    tsconfigDefaults: js.Any,
    tsconfigOverride: js.Any,
    typescript: TypeoftsTypes,
    useTsconfigDeclarationDir: Boolean,
    verbosity: Double
  ): IOptions = {
    val __obj = js.Dynamic.literal(abortOnError = abortOnError.asInstanceOf[js.Any], cacheRoot = cacheRoot.asInstanceOf[js.Any], check = check.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], objectHashIgnoreUnknownHack = objectHashIgnoreUnknownHack.asInstanceOf[js.Any], rollupCommonJSResolveHack = rollupCommonJSResolveHack.asInstanceOf[js.Any], sourceMapCallback = js.Any.fromFunction2(sourceMapCallback), transformers = transformers.asInstanceOf[js.Any], tsconfigDefaults = tsconfigDefaults.asInstanceOf[js.Any], tsconfigOverride = tsconfigOverride.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], useTsconfigDeclarationDir = useTsconfigDeclarationDir.asInstanceOf[js.Any], verbosity = verbosity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbortOnError(value: Boolean): Self = this.set("abortOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheRoot(value: String): Self = this.set("cacheRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck(value: Boolean): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: String | js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectHashIgnoreUnknownHack(value: Boolean): Self = this.set("objectHashIgnoreUnknownHack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollupCommonJSResolveHack(value: Boolean): Self = this.set("rollupCommonJSResolveHack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapCallback(value: (String, String) => Unit): Self = this.set("sourceMapCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformersVarargs(value: TransformerFactoryCreator*): Self = this.set("transformers", js.Array(value :_*))
    
    @scala.inline
    def setTransformers(value: js.Array[TransformerFactoryCreator]): Self = this.set("transformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsconfigDefaults(value: js.Any): Self = this.set("tsconfigDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsconfigOverride(value: js.Any): Self = this.set("tsconfigOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypescript(value: TypeoftsTypes): Self = this.set("typescript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTsconfigDeclarationDir(value: Boolean): Self = this.set("useTsconfigDeclarationDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbosity(value: Double): Self = this.set("verbosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsconfig(value: String): Self = this.set("tsconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTsconfig: Self = this.set("tsconfig", js.undefined)
  }
}
