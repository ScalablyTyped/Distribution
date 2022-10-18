package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distTypingsNewFormatRamlMod.RAMLParseResult
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0ApiMod.Api10
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0ApiMod.Extension
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0ApiMod.Overlay
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod.ExampleFragment
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod.TypeDeclarationFragment
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0MethodsMod.TraitFragment
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0ResourcesMod.ResourceTypeFragment
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0SecurityMod.SecuritySchemeFragment
import typings.raml1Parser.raml1ParserStrings.RAML10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsNewFormatSpec1Dot0CommonMod {
  
  trait Annotable
    extends StObject
       with HasSource {
    
    /**
      * Most of RAML model elements may have attached annotations decribing
      * additional meta data about this element
      */
    var annotations: js.UndefOr[js.Array[AnnotationInstance]] = js.undefined
    
    var scalarsAnnotations: js.UndefOr[StringDictionary[js.Array[js.Array[AnnotationInstance]]]] = js.undefined
  }
  object Annotable {
    
    inline def apply(): Annotable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Annotable]
    }
    
    extension [Self <: Annotable](x: Self) {
      
      inline def setAnnotations(value: js.Array[AnnotationInstance]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: AnnotationInstance*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setScalarsAnnotations(value: StringDictionary[js.Array[js.Array[AnnotationInstance]]]): Self = StObject.set(x, "scalarsAnnotations", value.asInstanceOf[js.Any])
      
      inline def setScalarsAnnotationsUndefined: Self = StObject.set(x, "scalarsAnnotations", js.undefined)
    }
  }
  
  trait AnnotationInstance
    extends StObject
       with Annotable {
    
    var name: String
    
    var value: Any
  }
  object AnnotationInstance {
    
    inline def apply(name: String, value: Any): AnnotationInstance = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationInstance]
    }
    
    extension [Self <: AnnotationInstance](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementSourceInfo
    extends StObject
       with SourceInfo {
    
    /**
      * Source information for fields which are defined in another file rather then their owning component.
      * If all scalar fields of the component are defined in the same file, the 'scalarsSources' field is undefined.
      */
    var scalarsSources: js.UndefOr[StringDictionary[js.Array[SourceInfo]]] = js.undefined
  }
  object ElementSourceInfo {
    
    inline def apply(): ElementSourceInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementSourceInfo]
    }
    
    extension [Self <: ElementSourceInfo](x: Self) {
      
      inline def setScalarsSources(value: StringDictionary[js.Array[SourceInfo]]): Self = StObject.set(x, "scalarsSources", value.asInstanceOf[js.Any])
      
      inline def setScalarsSourcesUndefined: Self = StObject.set(x, "scalarsSources", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    /**
      * IssueCode
      */
    var code: String
    
    /**
      * Whether the message is warning or not
      */
    var isWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Message text
      */
    var message: String
    
    /**
      * File path
      */
    var path: String
    
    var range: ErrorRange
    
    var trace: js.UndefOr[js.Array[Error]] = js.undefined
  }
  object Error {
    
    inline def apply(code: String, message: String, path: String, range: ErrorRange): Error = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
      
      inline def setIsWarningUndefined: Self = StObject.set(x, "isWarning", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRange(value: ErrorRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: js.Array[Error]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setTraceVarargs(value: Error*): Self = StObject.set(x, "trace", js.Array(value*))
    }
  }
  
  trait ErrorPosition extends StObject {
    
    /**
      * Column number, starting at 0
      */
    var column: Double
    
    /**
      * Line number, starting at 0
      */
    var line: Double
    
    /**
      * Position in characters from the beginning of the document, starting at 0
      */
    var position: Double
  }
  object ErrorPosition {
    
    inline def apply(column: Double, line: Double, position: Double): ErrorPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorPosition]
    }
    
    extension [Self <: ErrorPosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorRange extends StObject {
    
    var end: ErrorPosition
    
    var start: ErrorPosition
  }
  object ErrorRange {
    
    inline def apply(end: ErrorPosition, start: ErrorPosition): ErrorRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorRange]
    }
    
    extension [Self <: ErrorRange](x: Self) {
      
      inline def setEnd(value: ErrorPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: ErrorPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait FragmentDeclaration
    extends StObject
       with Annotable {
    
    var uses: js.UndefOr[js.Array[UsesDeclaration]] = js.undefined
  }
  object FragmentDeclaration {
    
    inline def apply(): FragmentDeclaration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FragmentDeclaration]
    }
    
    extension [Self <: FragmentDeclaration](x: Self) {
      
      inline def setUses(value: js.Array[UsesDeclaration]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
      
      inline def setUsesVarargs(value: UsesDeclaration*): Self = StObject.set(x, "uses", js.Array(value*))
    }
  }
  
  trait HasSource extends StObject {
    
    var __METADATA__ : js.UndefOr[Any] = js.undefined
    
    var sourceMap: js.UndefOr[ElementSourceInfo] = js.undefined
  }
  object HasSource {
    
    inline def apply(): HasSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasSource]
    }
    
    extension [Self <: HasSource](x: Self) {
      
      inline def setSourceMap(value: ElementSourceInfo): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def set__METADATA__(value: Any): Self = StObject.set(x, "__METADATA__", value.asInstanceOf[js.Any])
      
      inline def set__METADATA__Undefined: Self = StObject.set(x, "__METADATA__", js.undefined)
    }
  }
  
  trait RAML10ParseResult
    extends StObject
       with RAMLParseResult {
    
    var errors: js.UndefOr[js.Array[Error]] = js.undefined
    
    var ramlVersion: RAML10
    
    var specification: Api10 | Overlay | Extension | ResourceTypeFragment | TraitFragment | SecuritySchemeFragment | TypeDeclarationFragment | ExampleFragment
    
    var `type`: String
  }
  object RAML10ParseResult {
    
    inline def apply(
      specification: Api10 | Overlay | Extension | ResourceTypeFragment | TraitFragment | SecuritySchemeFragment | TypeDeclarationFragment | ExampleFragment,
      `type`: String
    ): RAML10ParseResult = {
      val __obj = js.Dynamic.literal(ramlVersion = "RAML10", specification = specification.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RAML10ParseResult]
    }
    
    extension [Self <: RAML10ParseResult](x: Self) {
      
      inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setRamlVersion(value: RAML10): Self = StObject.set(x, "ramlVersion", value.asInstanceOf[js.Any])
      
      inline def setSpecification(
        value: Api10 | Overlay | Extension | ResourceTypeFragment | TraitFragment | SecuritySchemeFragment | TypeDeclarationFragment | ExampleFragment
      ): Self = StObject.set(x, "specification", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceInfo extends StObject {
    
    /**
      * Namespace of defining library if any
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      * Path to file which contains definition
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object SourceInfo {
    
    inline def apply(): SourceInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceInfo]
    }
    
    extension [Self <: SourceInfo](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait UsesDeclaration
    extends StObject
       with Annotable {
    
    var key: String
    
    var usage: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object UsesDeclaration {
    
    inline def apply(key: String, value: String): UsesDeclaration = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsesDeclaration]
    }
    
    extension [Self <: UsesDeclaration](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
