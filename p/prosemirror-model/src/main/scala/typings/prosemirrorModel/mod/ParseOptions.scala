package typings.prosemirrorModel.mod

import typings.prosemirrorModel.prosemirrorModelStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions[S /* <: Schema[js.Any, js.Any] */] extends StObject {
  
  /**
    * A set of additional nodes to count as
    * [context](#model.ParseRule.context) when parsing, above the
    * given [top node](#model.ParseOptions.topNode).
    */
  var context: js.UndefOr[ResolvedPos[S] | Null] = js.undefined
  
  /**
    * When given, the parser will, beside parsing the content,
    * record the document positions of the given DOM positions. It
    * will do so by writing to the objects, adding a `pos` property
    * that holds the document position. DOM positions that are not
    * in the parsed content will not be written to.
    */
  var findPositions: js.UndefOr[js.Array[typings.prosemirrorModel.anon.Node] | Null] = js.undefined
  
  /**
    * The child node index to start parsing from.
    */
  var from: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * By default, whitespace is collapsed as per HTML's rules. Pass
    * `true` to preserve whitespace, but normalize newlines to
    * spaces, and `"full"` to preserve whitespace entirely.
    */
  var preserveWhitespace: js.UndefOr[Boolean | full | Null] = js.undefined
  
  /**
    * The child node index to stop parsing at.
    */
  var to: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Provide the starting content match that content parsed into the
    * top node is matched against.
    */
  var topMatch: js.UndefOr[ContentMatch[js.Any] | Null] = js.undefined
  
  /**
    * By default, the content is parsed into the schema's default
    * [top node type](#model.Schema.topNodeType). You can pass this
    * option to use the type and attributes from a different node
    * as the top container.
    */
  var topNode: js.UndefOr[ProsemirrorNode[S] | Null] = js.undefined
}
object ParseOptions {
  
  inline def apply[S /* <: Schema[js.Any, js.Any] */](): ParseOptions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions[S]]
  }
  
  extension [Self <: ParseOptions[?], S /* <: Schema[js.Any, js.Any] */](x: Self & ParseOptions[S]) {
    
    inline def setContext(value: ResolvedPos[S]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setFindPositions(value: js.Array[typings.prosemirrorModel.anon.Node]): Self = StObject.set(x, "findPositions", value.asInstanceOf[js.Any])
    
    inline def setFindPositionsNull: Self = StObject.set(x, "findPositions", null)
    
    inline def setFindPositionsUndefined: Self = StObject.set(x, "findPositions", js.undefined)
    
    inline def setFindPositionsVarargs(value: typings.prosemirrorModel.anon.Node*): Self = StObject.set(x, "findPositions", js.Array(value :_*))
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setPreserveWhitespace(value: Boolean | full): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespaceNull: Self = StObject.set(x, "preserveWhitespace", null)
    
    inline def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setTopMatch(value: ContentMatch[js.Any]): Self = StObject.set(x, "topMatch", value.asInstanceOf[js.Any])
    
    inline def setTopMatchNull: Self = StObject.set(x, "topMatch", null)
    
    inline def setTopMatchUndefined: Self = StObject.set(x, "topMatch", js.undefined)
    
    inline def setTopNode(value: ProsemirrorNode[S]): Self = StObject.set(x, "topNode", value.asInstanceOf[js.Any])
    
    inline def setTopNodeNull: Self = StObject.set(x, "topNode", null)
    
    inline def setTopNodeUndefined: Self = StObject.set(x, "topNode", js.undefined)
  }
}
