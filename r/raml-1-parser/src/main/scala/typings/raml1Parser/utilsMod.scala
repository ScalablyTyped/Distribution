package typings.raml1Parser

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelASTMod.IParseResult
import typings.raml1Parser.highLevelASTMod.IProperty
import typings.raml1Parser.highLevelASTMod.IStructuredValue
import typings.raml1Parser.highLevelASTMod.ValidationAcceptor
import typings.raml1Parser.highLevelASTMod.ValidationIssue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("raml-1-parser/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/utils", "PointOfViewValidationAcceptorImpl")
  @js.native
  open class PointOfViewValidationAcceptorImpl protected ()
    extends StObject
       with ValidationAcceptor {
    def this(errors: js.Array[ValidationIssue], primaryUnitRoot: IParseResult) = this()
    
    /* CompleteClass */
    override def accept(issue: ValidationIssue): Any = js.native
    
    /* CompleteClass */
    override def acceptUnique(issue: ValidationIssue): Any = js.native
    
    /* CompleteClass */
    override def begin(): Any = js.native
    
    /* private */ var convertConnectingNodeToError: Any = js.native
    
    /* CompleteClass */
    override def end(): Any = js.native
    
    /* protected */ var errors: js.Array[ValidationIssue] = js.native
    
    /* private */ var findIssueTail: Any = js.native
    
    /* private */ var findMasterLinks: Any = js.native
    
    /* private */ var findPathToNodeUnit: Any = js.native
    
    /* private */ var findPathToNodeUnitRecursively: Any = js.native
    
    /* private */ var findUnitLinks: Any = js.native
    
    /* private */ var generateLinkMessageByNode: Any = js.native
    
    /* protected */ var primaryUnitRoot: IParseResult = js.native
    
    def transformIssue(originalIssue: ValidationIssue): Unit = js.native
  }
  
  @JSImport("raml-1-parser/dist/utils", "UnitLink")
  @js.native
  open class UnitLink protected () extends StObject {
    def this(node: IParseResult, targetUnitRoot: IParseResult) = this()
    
    /**
      * Node leading to the outer unit.
      */
    var node: IParseResult = js.native
    
    /**
      * Unit this link points to.
      */
    var targetUnitRoot: IParseResult = js.native
  }
  
  inline def addLoadCallback(x: js.Function1[/* url */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLoadCallback")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def genStructuredValue(name: String, parent: IHighLevelNode, pr: IProperty): String | IStructuredValue = (^.asInstanceOf[js.Dynamic].applyDynamic("genStructuredValue")(name.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], pr.asInstanceOf[js.Any])).asInstanceOf[String | IStructuredValue]
  
  inline def getFragmentDefenitionName(node: IHighLevelNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentDefenitionName")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTransformerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformerNames")().asInstanceOf[js.Array[String]]
  
  inline def hasAsyncRequests(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAsyncRequests")().asInstanceOf[Boolean]
  
  inline def parseUrl(u: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(u.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("raml-1-parser/dist/utils", "updateType")
  @js.native
  def updateType: js.Function1[/* node */ IHighLevelNode, Unit] = js.native
  inline def updateType_=(x: js.Function1[/* node */ IHighLevelNode, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateType")(x.asInstanceOf[js.Any])
}
