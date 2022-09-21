package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.anon.Errors
import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.highLevelImplMod.OverlayMergeMode
import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import typings.raml1Parser.lowLevelASTMod.ILowLevelASTNode
import typings.raml1Parser.lowLevelASTProxyMod.LowLevelCompositeNode
import typings.raml1Parser.raml10parserapiMod.Api
import typings.raml1Parser.raml10parserapiMod.Library
import typings.raml1Parser.referencePatcherLLMod.ReferencePatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expanderLLMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/expanderLL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/ast.core/expanderLL", "DefaultTransformer")
  @js.native
  open class DefaultTransformer protected () extends ValueTransformer {
    def this(owner: LowLevelCompositeNode, delegate: ValueTransformer, unitsChain: js.Array[ICompilationUnit]) = this()
    
    var delegate: ValueTransformer = js.native
    
    /* private */ var initParams: Any = js.native
    
    var owner: LowLevelCompositeNode = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/expanderLL", "LibraryExpander")
  @js.native
  open class LibraryExpander () extends StObject {
    
    def expandLibraries(_api: IHighLevelNode): IHighLevelNode = js.native
    
    def expandLibrary(_lib: IHighLevelNode): IHighLevelNode = js.native
    
    def processNode(rp: ReferencePatcher, hlNode: IHighLevelNode): Unit = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/expanderLL", "TraitsAndResourceTypesExpander")
  @js.native
  open class TraitsAndResourceTypesExpander () extends StObject {
    
    /* private */ var collectResourceData: Any = js.native
    
    def createHighLevelNode(_api: IHighLevelNode): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Boolean, rp: Unit, forceProxy: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Boolean, rp: Unit, forceProxy: Boolean, doInit: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Boolean, rp: Unit, forceProxy: Unit, doInit: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Boolean, rp: ReferencePatcher): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Boolean, rp: ReferencePatcher, forceProxy: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Boolean, rp: ReferencePatcher, forceProxy: Boolean, doInit: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Boolean, rp: ReferencePatcher, forceProxy: Unit, doInit: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Unit, rp: Unit, forceProxy: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Unit, rp: Unit, forceProxy: Boolean, doInit: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Unit, rp: Unit, forceProxy: Unit, doInit: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Unit, rp: ReferencePatcher): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Unit, rp: ReferencePatcher, forceProxy: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Unit, rp: ReferencePatcher, forceProxy: Boolean, doInit: Boolean): IHighLevelNode = js.native
    def createHighLevelNode(_api: IHighLevelNode, merge: Unit, rp: ReferencePatcher, forceProxy: Unit, doInit: Boolean): IHighLevelNode = js.native
    
    /* private */ var defaultMediaType: Any = js.native
    
    def expandHighLevelNode(hlNode: IHighLevelNode, rp: ReferencePatcher, api: IHighLevelNode): IHighLevelNode = js.native
    def expandHighLevelNode(hlNode: IHighLevelNode, rp: ReferencePatcher, api: IHighLevelNode, forceExpand: Boolean): IHighLevelNode = js.native
    
    def expandTraitsAndResourceTypes(api: IHighLevelNode): IHighLevelNode = js.native
    def expandTraitsAndResourceTypes(api: IHighLevelNode, rp: Unit, forceProxy: Boolean): IHighLevelNode = js.native
    def expandTraitsAndResourceTypes(api: IHighLevelNode, rp: Unit, forceProxy: Boolean, merge: Boolean): IHighLevelNode = js.native
    def expandTraitsAndResourceTypes(api: IHighLevelNode, rp: Unit, forceProxy: Unit, merge: Boolean): IHighLevelNode = js.native
    def expandTraitsAndResourceTypes(api: IHighLevelNode, rp: ReferencePatcher): IHighLevelNode = js.native
    def expandTraitsAndResourceTypes(api: IHighLevelNode, rp: ReferencePatcher, forceProxy: Boolean): IHighLevelNode = js.native
    def expandTraitsAndResourceTypes(api: IHighLevelNode, rp: ReferencePatcher, forceProxy: Boolean, merge: Boolean): IHighLevelNode = js.native
    def expandTraitsAndResourceTypes(api: IHighLevelNode, rp: ReferencePatcher, forceProxy: Unit, merge: Boolean): IHighLevelNode = js.native
    
    /* private */ var extractTraits: Any = js.native
    
    def init(api: IHighLevelNode): Unit = js.native
    
    /* private */ var mergeBodies: Any = js.native
    
    /* private */ var mergeBodiesForMethod: Any = js.native
    
    /* private */ var namespaceResolver: Any = js.native
    
    /* private */ var processResource: Any = js.native
    
    /* private */ var ramlVersion: Any = js.native
    
    /* private */ var readGenerictData: Any = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/ast.core/expanderLL", "ValueTransformer")
  @js.native
  open class ValueTransformer protected ()
    extends StObject
       with typings.raml1Parser.lowLevelASTProxyMod.ValueTransformer {
    def this(templateKind: String, templateName: String, unitsChain: js.Array[ICompilationUnit]) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: StringDictionary[String]
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: StringDictionary[String],
      scalarParams: StringDictionary[ILowLevelASTNode]
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: Unit,
      scalarParams: StringDictionary[ILowLevelASTNode]
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: StringDictionary[String],
      scalarParams: StringDictionary[ILowLevelASTNode],
      structuredParams: StringDictionary[ILowLevelASTNode]
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: StringDictionary[String],
      scalarParams: Unit,
      structuredParams: StringDictionary[ILowLevelASTNode]
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: Unit,
      scalarParams: StringDictionary[ILowLevelASTNode],
      structuredParams: StringDictionary[ILowLevelASTNode]
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: Unit,
      scalarParams: Unit,
      structuredParams: StringDictionary[ILowLevelASTNode]
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: StringDictionary[String],
      scalarParams: StringDictionary[ILowLevelASTNode],
      structuredParams: StringDictionary[ILowLevelASTNode],
      vDelegate: ValueTransformer
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: StringDictionary[String],
      scalarParams: StringDictionary[ILowLevelASTNode],
      structuredParams: Unit,
      vDelegate: ValueTransformer
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: StringDictionary[String],
      scalarParams: Unit,
      structuredParams: StringDictionary[ILowLevelASTNode],
      vDelegate: ValueTransformer
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: StringDictionary[String],
      scalarParams: Unit,
      structuredParams: Unit,
      vDelegate: ValueTransformer
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: Unit,
      scalarParams: StringDictionary[ILowLevelASTNode],
      structuredParams: StringDictionary[ILowLevelASTNode],
      vDelegate: ValueTransformer
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: Unit,
      scalarParams: StringDictionary[ILowLevelASTNode],
      structuredParams: Unit,
      vDelegate: ValueTransformer
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: Unit,
      scalarParams: Unit,
      structuredParams: StringDictionary[ILowLevelASTNode],
      vDelegate: ValueTransformer
    ) = this()
    def this(
      templateKind: String,
      templateName: String,
      unitsChain: js.Array[ICompilationUnit],
      scalarParamValues: Unit,
      scalarParams: Unit,
      structuredParams: Unit,
      vDelegate: ValueTransformer
    ) = this()
    
    def _definingUnitSequence(str: String): js.Array[ICompilationUnit] = js.native
    
    /* private */ var paramName: Any = js.native
    
    /* private */ var paramUpperBound: Any = js.native
    
    var scalarParamValues: js.UndefOr[StringDictionary[String]] = js.native
    
    var scalarParams: js.UndefOr[StringDictionary[ILowLevelASTNode]] = js.native
    
    var structuredParams: js.UndefOr[StringDictionary[ILowLevelASTNode]] = js.native
    
    def substitutionNode(node: ILowLevelASTNode): Any = js.native
    def substitutionNode(node: ILowLevelASTNode, chain: js.Array[ILowLevelASTNode]): Any = js.native
    def substitutionNode(node: ILowLevelASTNode, chain: js.Array[ILowLevelASTNode], inKey: Boolean): Any = js.native
    def substitutionNode(node: ILowLevelASTNode, chain: Unit, inKey: Boolean): Any = js.native
    
    var templateKind: String = js.native
    
    var templateName: String = js.native
    
    def transform(obj: Any, toString: Boolean, doBreak: js.Function0[Boolean]): Errors = js.native
    def transform(
      obj: Any,
      toString: Boolean,
      doBreak: js.Function0[Boolean],
      callback: js.Function2[/* obj */ Any, /* transformer */ DefaultTransformer, Any]
    ): Errors = js.native
    def transform(
      obj: Any,
      toString: Boolean,
      doBreak: Unit,
      callback: js.Function2[/* obj */ Any, /* transformer */ DefaultTransformer, Any]
    ): Errors = js.native
    def transform(obj: Any, toString: Unit, doBreak: js.Function0[Boolean]): Errors = js.native
    def transform(
      obj: Any,
      toString: Unit,
      doBreak: js.Function0[Boolean],
      callback: js.Function2[/* obj */ Any, /* transformer */ DefaultTransformer, Any]
    ): Errors = js.native
    def transform(
      obj: Any,
      toString: Unit,
      doBreak: Unit,
      callback: js.Function2[/* obj */ Any, /* transformer */ DefaultTransformer, Any]
    ): Errors = js.native
    
    var unitsChain: js.Array[ICompilationUnit] = js.native
    
    var vDelegate: js.UndefOr[ValueTransformer] = js.native
  }
  
  inline def expandLibraries(api: Api): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("expandLibraries")(api.asInstanceOf[js.Any]).asInstanceOf[Api]
  
  inline def expandLibrariesHL(api: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("expandLibrariesHL")(api.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  
  inline def expandLibrary(lib: Library): Library = ^.asInstanceOf[js.Dynamic].applyDynamic("expandLibrary")(lib.asInstanceOf[js.Any]).asInstanceOf[Library]
  
  inline def expandLibraryHL(lib: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("expandLibraryHL")(lib.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  
  inline def expandTraitsAndResourceTypes[T](api: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expandTraitsAndResourceTypes")(api.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def expandTraitsAndResourceTypes[T](api: T, merge: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expandTraitsAndResourceTypes")(api.asInstanceOf[js.Any], merge.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def expandTraitsAndResourceTypesHL(api: IHighLevelNode): IHighLevelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("expandTraitsAndResourceTypesHL")(api.asInstanceOf[js.Any]).asInstanceOf[IHighLevelNode]
  inline def expandTraitsAndResourceTypesHL(api: IHighLevelNode, merge: Boolean): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("expandTraitsAndResourceTypesHL")(api.asInstanceOf[js.Any], merge.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def getTransformNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformNames")().asInstanceOf[js.Array[String]]
  
  inline def getTransformersForOccurence(occurence: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformersForOccurence")(occurence.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def isPossibleMethodName(n: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isPossibleMethodName")(n.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def mergeAPIs(
    masterUnit: ICompilationUnit,
    extensionsAndOverlays: js.Array[ICompilationUnit],
    mergeMode: OverlayMergeMode
  ): IHighLevelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAPIs")(masterUnit.asInstanceOf[js.Any], extensionsAndOverlays.asInstanceOf[js.Any], mergeMode.asInstanceOf[js.Any])).asInstanceOf[IHighLevelNode]
  
  inline def parseMediaType(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMediaType")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toUnits(node: ILowLevelASTNode): js.Array[ICompilationUnit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnits")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[ICompilationUnit]]
}
