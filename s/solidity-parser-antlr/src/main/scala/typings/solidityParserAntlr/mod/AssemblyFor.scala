package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyFor
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblyFor: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor = js.native
}
object AssemblyFor {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyFor]
  }
  
  @scala.inline
  implicit class AssemblyForMutableBuilder[Self <: AssemblyFor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
