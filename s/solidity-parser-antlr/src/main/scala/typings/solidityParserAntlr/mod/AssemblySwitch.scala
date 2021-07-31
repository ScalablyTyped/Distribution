package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssemblySwitch
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_AssemblySwitch: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch
}
object AssemblySwitch {
  
  @scala.inline
  def apply(): AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblySwitch")
    __obj.asInstanceOf[AssemblySwitch]
  }
  
  @scala.inline
  implicit class AssemblySwitchMutableBuilder[Self <: AssemblySwitch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
