package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupBuild extends StObject {
  
  var cache: js.UndefOr[RollupCache] = js.undefined
  
  def generate(outputOptions: OutputOptions): js.Promise[RollupOutput]
  
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.undefined
  
  var watchFiles: js.Array[String]
  
  def write(options: OutputOptions): js.Promise[RollupOutput]
}
object RollupBuild {
  
  inline def apply(
    generate: OutputOptions => js.Promise[RollupOutput],
    watchFiles: js.Array[String],
    write: OutputOptions => js.Promise[RollupOutput]
  ): RollupBuild = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), watchFiles = watchFiles.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RollupBuild]
  }
  
  extension [Self <: RollupBuild](x: Self) {
    
    inline def setCache(value: RollupCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setGenerate(value: OutputOptions => js.Promise[RollupOutput]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
    
    inline def setGetTimings(value: () => SerializedTimings): Self = StObject.set(x, "getTimings", js.Any.fromFunction0(value))
    
    inline def setGetTimingsUndefined: Self = StObject.set(x, "getTimings", js.undefined)
    
    inline def setWatchFiles(value: js.Array[String]): Self = StObject.set(x, "watchFiles", value.asInstanceOf[js.Any])
    
    inline def setWatchFilesVarargs(value: String*): Self = StObject.set(x, "watchFiles", js.Array(value :_*))
    
    inline def setWrite(value: OutputOptions => js.Promise[RollupOutput]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
