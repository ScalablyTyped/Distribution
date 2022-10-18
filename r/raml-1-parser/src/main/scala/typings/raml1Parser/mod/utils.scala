package typings.raml1Parser.mod

import typings.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typings.raml1Parser.distParserHighLevelASTMod.ValidationIssue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("raml-1-parser", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "utils.PointOfViewValidationAcceptorImpl")
  @js.native
  open class PointOfViewValidationAcceptorImpl protected ()
    extends typings.raml1Parser.distUtilsMod.PointOfViewValidationAcceptorImpl {
    def this(
      errors: js.Array[ValidationIssue],
      primaryUnitRoot: typings.raml1Parser.distParserHighLevelASTMod.IParseResult
    ) = this()
  }
  
  @JSImport("raml-1-parser", "utils.UnitLink")
  @js.native
  open class UnitLink protected ()
    extends typings.raml1Parser.distUtilsMod.UnitLink {
    def this(
      node: typings.raml1Parser.distParserHighLevelASTMod.IParseResult,
      targetUnitRoot: typings.raml1Parser.distParserHighLevelASTMod.IParseResult
    ) = this()
  }
  
  inline def addLoadCallback(x: js.Function1[/* url */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLoadCallback")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def genStructuredValue(
    name: String,
    parent: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode,
    pr: typings.raml1Parser.distParserHighLevelASTMod.IProperty
  ): String | IStructuredValue = (^.asInstanceOf[js.Dynamic].applyDynamic("genStructuredValue")(name.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], pr.asInstanceOf[js.Any])).asInstanceOf[String | IStructuredValue]
  
  inline def getFragmentDefenitionName(node: typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentDefenitionName")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTransformerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformerNames")().asInstanceOf[js.Array[String]]
  
  inline def hasAsyncRequests(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAsyncRequests")().asInstanceOf[Boolean]
  
  inline def parseUrl(u: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(u.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("raml-1-parser", "utils.updateType")
  @js.native
  def updateType: js.Function1[/* node */ typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, Unit] = js.native
  inline def updateType_=(x: js.Function1[/* node */ typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateType")(x.asInstanceOf[js.Any])
}
