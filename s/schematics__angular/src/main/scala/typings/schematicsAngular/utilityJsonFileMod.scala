package typings.schematicsAngular

import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitSchematics.mod.Tree
import typings.schematicsAngular.schematicsAngularBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityJsonFileMod {
  
  @JSImport("@schematics/angular/utility/json-file", "JSONFile")
  @js.native
  open class JSONFile protected () extends StObject {
    def this(host: Tree, path: String) = this()
    
    /* private */ def JsonAst: Any = js.native
    
    /* private */ var _jsonAst: Any = js.native
    
    var content: String = js.native
    
    def get(jsonPath: JSONPath): Any = js.native
    
    /* private */ val host: Any = js.native
    
    def modify(jsonPath: JSONPath): Unit = js.native
    def modify(jsonPath: JSONPath, value: Unit, insertInOrder: InsertionIndex): Unit = js.native
    def modify(jsonPath: JSONPath, value: JsonValue): Unit = js.native
    def modify(jsonPath: JSONPath, value: JsonValue, insertInOrder: InsertionIndex): Unit = js.native
    @JSName("modify")
    def modify_false(jsonPath: JSONPath, value: Unit, insertInOrder: `false`): Unit = js.native
    @JSName("modify")
    def modify_false(jsonPath: JSONPath, value: JsonValue, insertInOrder: `false`): Unit = js.native
    
    /* private */ val path: Any = js.native
    
    def remove(jsonPath: JSONPath): Unit = js.native
  }
  
  type InsertionIndex = js.Function1[/* properties */ js.Array[String], Double]
  
  type JSONPath = js.Array[String | Double]
}
