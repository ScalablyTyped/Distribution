package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait IndexAccess
  extends Expression
     with BaseASTNode {
  
  var base: Expression = js.native
  
  var index: Expression = js.native
  
  @JSName("type")
  var type_IndexAccess: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess = js.native
}
object IndexAccess {
  
  @scala.inline
  def apply(
    base: Expression,
    index: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess
  ): IndexAccess = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexAccess]
  }
  
  @scala.inline
  implicit class IndexAccessMutableBuilder[Self <: IndexAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Expression): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
