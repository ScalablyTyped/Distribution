package typings.raml1Parser

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserHighLevelASTMod.IParseResult
import typings.raml1Parser.distParserHighLevelASTMod.IProperty
import typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition
import typings.raml1Parser.distParserHighLevelASTMod.ValidationAcceptor
import typings.raml1Parser.distParserHighLevelASTMod.ValidationIssue
import typings.raml1Parser.distParserHighLevelImplMod.BasicASTNode
import typings.raml1Parser.distParserHighLevelImplMod.StructuredValue
import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.RangeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserAstDotcoreLinterMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/linter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/ast.core/linter", "ExampleAndDefaultValueValidator")
  @js.native
  open class ExampleAndDefaultValueValidator ()
    extends StObject
       with PropertyValidator {
    
    def aquireSchema(node: IAttribute): IShema = js.native
    
    /* private */ var findParentSchemaOrTypeAttribute: Any = js.native
    
    def getSchemaFromModel(node: IAttribute): IShema = js.native
    
    /* private */ var isExampleNode: Any = js.native
    
    /* private */ var isExampleNodeInMultipleDecl: Any = js.native
    
    /* private */ var isSingleExampleNode: Any = js.native
    
    /* private */ var isStrict: Any = js.native
    
    def parseObject(node: IAttribute, cb: ValidationAcceptor, strictValidation: Boolean): Any = js.native
    
    def testDublication(h: IAttribute, v: ILowLevelASTNode, cb: ValidationAcceptor): Unit = js.native
    
    def toObject(h: IAttribute, v: StructuredValue, cb: ValidationAcceptor): Any = js.native
    
    /* private */ var typeValidator: Any = js.native
    
    /* CompleteClass */
    override def validate(node: IAttribute, cb: ValidationAcceptor): Any = js.native
  }
  
  object RESERVED_TEMPLATE_PARAMETERS {
    
    @JSImport("raml-1-parser/dist/parser/ast.core/linter", "RESERVED_TEMPLATE_PARAMETERS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/linter", "RESERVED_TEMPLATE_PARAMETERS.methodName")
    @js.native
    def methodName: String = js.native
    inline def methodName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("methodName")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/ast.core/linter", "RESERVED_TEMPLATE_PARAMETERS.resourcePath")
    @js.native
    def resourcePath: String = js.native
    
    @JSImport("raml-1-parser/dist/parser/ast.core/linter", "RESERVED_TEMPLATE_PARAMETERS.resourcePathName")
    @js.native
    def resourcePathName: String = js.native
    inline def resourcePathName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resourcePathName")(x.asInstanceOf[js.Any])
    
    inline def resourcePath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resourcePath")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/linter", "UrlParameterNameValidator")
  @js.native
  open class UrlParameterNameValidator ()
    extends StObject
       with PropertyValidator {
    
    /* private */ var checkBaseUri: Any = js.native
    
    def parseUrl(value: String): js.Array[String] = js.native
    
    /* CompleteClass */
    override def validate(node: IAttribute, cb: ValidationAcceptor): Any = js.native
  }
  
  inline def applyTemplate(messageEntry: Message, params: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTemplate")(messageEntry.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createIssue(issueCode: String, message: String, node: IParseResult): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(issueCode: String, message: String, node: IParseResult, isWarning: Boolean): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Boolean,
    internalRange: Unit,
    forceScalar: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Boolean,
    internalRange: Unit,
    forceScalar: Boolean,
    inKey: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any], inKey.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Boolean,
    internalRange: Unit,
    forceScalar: Unit,
    inKey: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any], inKey.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Boolean,
    internalRange: RangeObject
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Boolean,
    internalRange: RangeObject,
    forceScalar: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Boolean,
    internalRange: RangeObject,
    forceScalar: Boolean,
    inKey: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any], inKey.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Boolean,
    internalRange: RangeObject,
    forceScalar: Unit,
    inKey: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any], inKey.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Unit,
    internalRange: Unit,
    forceScalar: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Unit,
    internalRange: Unit,
    forceScalar: Boolean,
    inKey: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any], inKey.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Unit,
    internalRange: Unit,
    forceScalar: Unit,
    inKey: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any], inKey.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Unit,
    internalRange: RangeObject
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Unit,
    internalRange: RangeObject,
    forceScalar: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Unit,
    internalRange: RangeObject,
    forceScalar: Boolean,
    inKey: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any], inKey.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue(
    issueCode: String,
    message: String,
    node: IParseResult,
    isWarning: Unit,
    internalRange: RangeObject,
    forceScalar: Unit,
    inKey: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any], forceScalar.asInstanceOf[js.Any], inKey.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  
  inline def createIssue1(messageEntry: Any, parameters: Any, node: IParseResult): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue1")(messageEntry.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue1(messageEntry: Any, parameters: Any, node: IParseResult, isWarning: Boolean): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue1")(messageEntry.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue1(
    messageEntry: Any,
    parameters: Any,
    node: IParseResult,
    isWarning: Boolean,
    internalRange: RangeObject
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue1")(messageEntry.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createIssue1(
    messageEntry: Any,
    parameters: Any,
    node: IParseResult,
    isWarning: Unit,
    internalRange: RangeObject
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createIssue1")(messageEntry.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], node.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  
  inline def createLLIssue(issueCode: String, message: String, node: ILowLevelASTNode, rootCalculationAnchor: IParseResult): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createLLIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], rootCalculationAnchor.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createLLIssue(
    issueCode: String,
    message: String,
    node: ILowLevelASTNode,
    rootCalculationAnchor: IParseResult,
    isWarning: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createLLIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], rootCalculationAnchor.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createLLIssue(
    issueCode: String,
    message: String,
    node: ILowLevelASTNode,
    rootCalculationAnchor: IParseResult,
    isWarning: Boolean,
    p: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createLLIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], rootCalculationAnchor.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createLLIssue(
    issueCode: String,
    message: String,
    node: ILowLevelASTNode,
    rootCalculationAnchor: IParseResult,
    isWarning: Boolean,
    p: Boolean,
    internalRange: RangeObject
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createLLIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], rootCalculationAnchor.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], p.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createLLIssue(
    issueCode: String,
    message: String,
    node: ILowLevelASTNode,
    rootCalculationAnchor: IParseResult,
    isWarning: Boolean,
    p: Unit,
    internalRange: RangeObject
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createLLIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], rootCalculationAnchor.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], p.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createLLIssue(
    issueCode: String,
    message: String,
    node: ILowLevelASTNode,
    rootCalculationAnchor: IParseResult,
    isWarning: Unit,
    p: Boolean
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createLLIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], rootCalculationAnchor.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createLLIssue(
    issueCode: String,
    message: String,
    node: ILowLevelASTNode,
    rootCalculationAnchor: IParseResult,
    isWarning: Unit,
    p: Boolean,
    internalRange: RangeObject
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createLLIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], rootCalculationAnchor.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], p.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  inline def createLLIssue(
    issueCode: String,
    message: String,
    node: ILowLevelASTNode,
    rootCalculationAnchor: IParseResult,
    isWarning: Unit,
    p: Unit,
    internalRange: RangeObject
  ): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("createLLIssue")(issueCode.asInstanceOf[js.Any], message.asInstanceOf[js.Any], node.asInstanceOf[js.Any], rootCalculationAnchor.asInstanceOf[js.Any], isWarning.asInstanceOf[js.Any], p.asInstanceOf[js.Any], internalRange.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  
  inline def getHumanReadableNodeName(astNode: IParseResult): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getHumanReadableNodeName")(astNode.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getMediaType(node: IAttribute): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMediaType")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isJson(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJson")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValid(t: ITypeDefinition, h: IHighLevelNode, value: Any, p: IProperty): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(t.asInstanceOf[js.Any], h.asInstanceOf[js.Any], value.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def isValid(t: ITypeDefinition, h: IHighLevelNode, value: Any, p: IProperty, attr: IAttribute): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(t.asInstanceOf[js.Any], h.asInstanceOf[js.Any], value.asInstanceOf[js.Any], p.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isXML(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXML")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toIssue(error: Any, node: IHighLevelNode): ValidationIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("toIssue")(error.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[ValidationIssue]
  
  inline def typeOfContainingTemplate(h: IParseResult): typings.ramlDefinitionSystem.mod.ITypeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOfContainingTemplate")(h.asInstanceOf[js.Any]).asInstanceOf[typings.ramlDefinitionSystem.mod.ITypeDefinition]
  
  inline def validate(node: IParseResult, v: ValidationAcceptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(node.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateBasic(node: BasicASTNode, v: ValidationAcceptor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateBasic")(node.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateBasic(node: BasicASTNode, v: ValidationAcceptor, requiredOnly: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateBasic")(node.asInstanceOf[js.Any], v.asInstanceOf[js.Any], requiredOnly.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateBasicFlat(node: BasicASTNode, v: ValidationAcceptor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateBasicFlat")(node.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validateBasicFlat(node: BasicASTNode, v: ValidationAcceptor, requiredOnly: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateBasicFlat")(node.asInstanceOf[js.Any], v.asInstanceOf[js.Any], requiredOnly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateResponseString(v: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("validateResponseString")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait IShema extends StObject {
    
    def validate(pObje: Any, cb: ValidationAcceptor, strict: Boolean): Any
  }
  object IShema {
    
    inline def apply(validate: (Any, ValidationAcceptor, Boolean) => Any): IShema = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
      __obj.asInstanceOf[IShema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IShema] (val x: Self) extends AnyVal {
      
      inline def setValidate(value: (Any, ValidationAcceptor, Boolean) => Any): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    }
  }
  
  trait Message extends StObject {
    
    var code: Double
    
    var func: js.UndefOr[js.Function1[/* x */ Any, String]] = js.undefined
    
    var message: String
  }
  object Message {
    
    inline def apply(code: Double, message: String): Message = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFunc(value: /* x */ Any => String): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
      
      inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropertyValidator extends StObject {
    
    def validate(node: IAttribute, cb: ValidationAcceptor): Any
  }
  object PropertyValidator {
    
    inline def apply(validate: (IAttribute, ValidationAcceptor) => Any): PropertyValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[PropertyValidator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertyValidator] (val x: Self) extends AnyVal {
      
      inline def setValidate(value: (IAttribute, ValidationAcceptor) => Any): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
}
