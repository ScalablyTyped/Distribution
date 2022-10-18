package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.raml1ParserStrings.RAML10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSpec1Dot0CommonMod {
  
  trait Annotable extends StObject {
    
    var __METADATA__ : Any
    
    /**
      * Most of RAML model elements may have attached annotations decribing
      * additional meta data about this element
      */
    var annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]]
    
    var scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
  }
  object Annotable {
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): Annotable = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Annotable]
    }
    
    extension [Self <: Annotable](x: Self) {
      
      inline def setAnnotations(value: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setScalarsAnnotations(value: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]): Self = StObject.set(x, "scalarsAnnotations", value.asInstanceOf[js.Any])
      
      inline def set__METADATA__(value: Any): Self = StObject.set(x, "__METADATA__", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnnotationInstance extends StObject {
    
    var name: String
    
    var structuredValue: Any
  }
  object AnnotationInstance {
    
    inline def apply(name: String, structuredValue: Any): AnnotationInstance = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], structuredValue = structuredValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationInstance]
    }
    
    extension [Self <: AnnotationInstance](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStructuredValue(value: Any): Self = StObject.set(x, "structuredValue", value.asInstanceOf[js.Any])
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
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): FragmentDeclaration = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[FragmentDeclaration]
    }
    
    extension [Self <: FragmentDeclaration](x: Self) {
      
      inline def setUses(value: js.Array[UsesDeclaration]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
      
      inline def setUsesVarargs(value: UsesDeclaration*): Self = StObject.set(x, "uses", js.Array(value*))
    }
  }
  
  trait RAML10ParseResult extends StObject {
    
    var errors: js.UndefOr[js.Array[Error]] = js.undefined
    
    var ramlVersion: RAML10
    
    var specification: FragmentDeclaration
    
    var `type`: String
  }
  object RAML10ParseResult {
    
    inline def apply(specification: FragmentDeclaration, `type`: String): RAML10ParseResult = {
      val __obj = js.Dynamic.literal(ramlVersion = "RAML10", specification = specification.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RAML10ParseResult]
    }
    
    extension [Self <: RAML10ParseResult](x: Self) {
      
      inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setRamlVersion(value: RAML10): Self = StObject.set(x, "ramlVersion", value.asInstanceOf[js.Any])
      
      inline def setSpecification(value: FragmentDeclaration): Self = StObject.set(x, "specification", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsesDeclaration extends StObject {
    
    var key: String
    
    var value: String
  }
  object UsesDeclaration {
    
    inline def apply(key: String, value: String): UsesDeclaration = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsesDeclaration]
    }
    
    extension [Self <: UsesDeclaration](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
