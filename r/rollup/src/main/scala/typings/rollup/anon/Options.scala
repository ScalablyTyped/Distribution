package typings.rollup.anon

import typings.rollup.distLoadConfigFileMod.BatchWarnings
import typings.rollup.mod.MergedRollupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: js.Array[MergedRollupOptions]
  
  var warnings: BatchWarnings
}
object Options {
  
  inline def apply(options: js.Array[MergedRollupOptions], warnings: BatchWarnings): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: js.Array[MergedRollupOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: MergedRollupOptions*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setWarnings(value: BatchWarnings): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
  }
}
