package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupBuild extends js.Object {
  
  var cache: js.UndefOr[RollupCache] = js.native
  
  def generate(outputOptions: OutputOptions): js.Promise[RollupOutput] = js.native
  
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.native
  
  var watchFiles: js.Array[String] = js.native
  
  def write(options: OutputOptions): js.Promise[RollupOutput] = js.native
}
object RollupBuild {
  
  @scala.inline
  def apply(
    generate: OutputOptions => js.Promise[RollupOutput],
    watchFiles: js.Array[String],
    write: OutputOptions => js.Promise[RollupOutput]
  ): RollupBuild = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), watchFiles = watchFiles.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RollupBuild]
  }
  
  @scala.inline
  implicit class RollupBuildOps[Self <: RollupBuild] (val x: Self) extends AnyVal {
    
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
    def setGenerate(value: OutputOptions => js.Promise[RollupOutput]): Self = this.set("generate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWatchFilesVarargs(value: String*): Self = this.set("watchFiles", js.Array(value :_*))
    
    @scala.inline
    def setWatchFiles(value: js.Array[String]): Self = this.set("watchFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: OutputOptions => js.Promise[RollupOutput]): Self = this.set("write", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCache(value: RollupCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setGetTimings(value: () => SerializedTimings): Self = this.set("getTimings", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTimings: Self = this.set("getTimings", js.undefined)
  }
}
