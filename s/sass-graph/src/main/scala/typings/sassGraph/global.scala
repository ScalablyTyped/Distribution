package typings.sassGraph

import typings.sassGraph.mod.Graph
import typings.sassGraph.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object SassGraph {
    
    @JSGlobal("SassGraph")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseDir(dirpath: String): Graph = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDir")(dirpath.asInstanceOf[js.Any]).asInstanceOf[Graph]
    inline def parseDir(dirpath: String, options: Options): Graph = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDir")(dirpath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Graph]
    
    inline def parseFile(filepath: String): Graph = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[Graph]
    inline def parseFile(filepath: String, options: Options): Graph = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Graph]
  }
}
