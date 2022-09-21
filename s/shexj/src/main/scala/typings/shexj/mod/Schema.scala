package typings.shexj.mod

import typings.shexj.shexjStrings.httpColonSlashSlashwwwDotw3DotorgSlashnsSlashshexDotjsonld
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  /**
    * JSON-LD <a href="https://www.w3.org/TR/json-ld11/#the-context">@context</a> for ShEx.
    */
  var `@context`: js.UndefOr[httpColonSlashSlashwwwDotw3DotorgSlashnsSlashshexDotjsonld] = js.undefined
  
  /**
    * List of ShEx schemas to <a href="http://shex.io/shex-semantics/#import">import</a> when processing this schema.
    */
  var imports: js.UndefOr[js.Array[IRIREF]] = js.undefined
  
  // +
  /**
    * The list of {@link ShapeDecl}s defined in this schema. Each MUST include and {@link ShapeOr#id}.
    */
  var shapes: js.UndefOr[js.Array[ShapeDecl]] = js.undefined
  
  // +
  /**
    * Identifies default starting shape expression.
    */
  var start: js.UndefOr[shapeExprOrRef] = js.undefined
  
  /**
    * List of semantic actions to be executed when evaluating conformance.
    */
  var startActs: js.UndefOr[js.Array[SemAct]] = js.undefined
  
  /**
    * Mandatory type "Schema".
    */
  var `type`: typings.shexj.shexjStrings.Schema
}
object Schema {
  
  inline def apply(): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Schema")
    __obj.asInstanceOf[Schema]
  }
  
  extension [Self <: Schema](x: Self) {
    
    inline def `set@context`(value: httpColonSlashSlashwwwDotw3DotorgSlashnsSlashshexDotjsonld): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
    
    inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
    
    inline def setImports(value: js.Array[IRIREF]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: IRIREF*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setShapes(value: js.Array[ShapeDecl]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setShapesVarargs(value: ShapeDecl*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setStart(value: shapeExprOrRef): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartActs(value: js.Array[SemAct]): Self = StObject.set(x, "startActs", value.asInstanceOf[js.Any])
    
    inline def setStartActsUndefined: Self = StObject.set(x, "startActs", js.undefined)
    
    inline def setStartActsVarargs(value: SemAct*): Self = StObject.set(x, "startActs", js.Array(value*))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: typings.shexj.shexjStrings.Schema): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
