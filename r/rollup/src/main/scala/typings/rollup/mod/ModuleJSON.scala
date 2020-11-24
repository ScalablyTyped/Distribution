package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleJSON extends TransformModuleJSON {
  
  var alwaysRemovedCode: js.Array[js.Tuple2[Double, Double]] = js.native
  
  @JSName("ast")
  var ast_ModuleJSON: AcornNode = js.native
  
  var dependencies: js.Array[String] = js.native
  
  var id: String = js.native
  
  var transformFiles: js.UndefOr[js.Array[EmittedFile]] = js.native
}
object ModuleJSON {
  
  @scala.inline
  def apply(
    alwaysRemovedCode: js.Array[js.Tuple2[Double, Double]],
    ast: AcornNode,
    code: String,
    customTransformCache: Boolean,
    dependencies: js.Array[String],
    id: String,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    transformDependencies: js.Array[String]
  ): ModuleJSON = {
    val __obj = js.Dynamic.literal(alwaysRemovedCode = alwaysRemovedCode.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], customTransformCache = customTransformCache.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourcemapChain = sourcemapChain.asInstanceOf[js.Any], transformDependencies = transformDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleJSON]
  }
  
  @scala.inline
  implicit class ModuleJSONOps[Self <: ModuleJSON] (val x: Self) extends AnyVal {
    
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
    def setAlwaysRemovedCodeVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("alwaysRemovedCode", js.Array(value :_*))
    
    @scala.inline
    def setAlwaysRemovedCode(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("alwaysRemovedCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAst(value: AcornNode): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformFilesVarargs(value: EmittedFile*): Self = this.set("transformFiles", js.Array(value :_*))
    
    @scala.inline
    def setTransformFiles(value: js.Array[EmittedFile]): Self = this.set("transformFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformFiles: Self = this.set("transformFiles", js.undefined)
  }
}
