package typings.prosemirrorTestBuilder

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorTestBuilder.mod.Tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Eq[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {eq (other : T): boolean} */ js.Any */] extends StObject
  
  trait Flat extends StObject {
    
    var flat: js.Array[Node]
    
    var tag: Tags
  }
  object Flat {
    
    inline def apply(flat: js.Array[Node], tag: Tags): Flat = {
      val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flat]
    }
    
    extension [Self <: Flat](x: Self) {
      
      inline def setFlat(value: js.Array[Node]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatVarargs(value: Node*): Self = StObject.set(x, "flat", js.Array(value*))
      
      inline def setTag(value: Tags): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Schema extends StObject {
    
    var schema: typings.prosemirrorModel.mod.Schema[Any, Any]
  }
  object Schema {
    
    inline def apply(schema: typings.prosemirrorModel.mod.Schema[Any, Any]): Schema = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setSchema(value: typings.prosemirrorModel.mod.Schema[Any, Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
}
