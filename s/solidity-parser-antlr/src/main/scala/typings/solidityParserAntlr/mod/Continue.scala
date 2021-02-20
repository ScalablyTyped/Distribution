package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Continue
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_Continue: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue = js.native
}
object Continue {
  
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue): Continue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Continue]
  }
  
  @scala.inline
  implicit class ContinueMutableBuilder[Self <: Continue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
