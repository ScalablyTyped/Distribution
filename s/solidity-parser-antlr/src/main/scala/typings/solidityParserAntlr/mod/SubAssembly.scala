package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait SubAssembly
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_SubAssembly: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly = js.native
}
object SubAssembly {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubAssembly]
  }
  
  @scala.inline
  implicit class SubAssemblyMutableBuilder[Self <: SubAssembly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
