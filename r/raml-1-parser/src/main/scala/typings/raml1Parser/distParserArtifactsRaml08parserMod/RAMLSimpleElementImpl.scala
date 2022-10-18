package typings.raml1Parser.distParserArtifactsRaml08parserMod

import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserWrappedAstParserCoreMod.BasicNodeImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "RAMLSimpleElementImpl")
@js.native
open class RAMLSimpleElementImpl protected () extends BasicNodeImpl {
  /**
    * @hidden
    **/
  def this(_node: IHighLevelNode) = this()
  def this(_node: IHighLevelNode, setAsWrapper: Boolean) = this()
}
/* static members */
object RAMLSimpleElementImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "RAMLSimpleElementImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
