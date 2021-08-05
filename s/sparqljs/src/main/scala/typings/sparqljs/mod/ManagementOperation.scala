package typings.sparqljs.mod

import typings.sparqljs.sparqljsBooleans.`false`
import typings.sparqljs.sparqljsStrings.add
import typings.sparqljs.sparqljsStrings.clear
import typings.sparqljs.sparqljsStrings.copy
import typings.sparqljs.sparqljsStrings.drop
import typings.sparqljs.sparqljsStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.CopyMoveAddOperation
  - typings.sparqljs.mod.LoadOperation
  - typings.sparqljs.mod.CreateOperation
  - typings.sparqljs.mod.ClearDropOperation
*/
trait ManagementOperation
  extends StObject
     with UpdateOperation
object ManagementOperation {
  
  inline def ClearDropOperation(graph: GraphReference, silent: Boolean, `type`: clear | drop): typings.sparqljs.mod.ClearDropOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sparqljs.mod.ClearDropOperation]
  }
  
  inline def CopyMoveAddOperation(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): typings.sparqljs.mod.CopyMoveAddOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sparqljs.mod.CopyMoveAddOperation]
  }
  
  inline def CreateOperation(graph: IriTerm, silent: Boolean): typings.sparqljs.mod.CreateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[typings.sparqljs.mod.CreateOperation]
  }
  
  inline def LoadOperation(destination: IriTerm | `false`, silent: Boolean, source: IriTerm): typings.sparqljs.mod.LoadOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("load")
    __obj.asInstanceOf[typings.sparqljs.mod.LoadOperation]
  }
}
