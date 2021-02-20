package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDirective
  extends BaseASTNode
     with ASTNode {
  
  var path: String = js.native
  
  var symbolAliases: js.Array[js.Tuple2[String, String]] = js.native
  
  @JSName("type")
  var type_ImportDirective: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective = js.native
  
  var unitAlias: String = js.native
}
object ImportDirective {
  
  @scala.inline
  def apply(
    path: String,
    symbolAliases: js.Array[js.Tuple2[String, String]],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective,
    unitAlias: String
  ): ImportDirective = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDirective]
  }
  
  @scala.inline
  implicit class ImportDirectiveMutableBuilder[Self <: ImportDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolAliases(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "symbolAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolAliasesVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "symbolAliases", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitAlias(value: String): Self = StObject.set(x, "unitAlias", value.asInstanceOf[js.Any])
  }
}
