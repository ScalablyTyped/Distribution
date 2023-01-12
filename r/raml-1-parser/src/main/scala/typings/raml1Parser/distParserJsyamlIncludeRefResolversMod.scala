package typings.raml1Parser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserJsyamlIncludeRefResolversMod {
  
  @JSImport("raml-1-parser/dist/parser/jsyaml/includeRefResolvers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def completeReference(includePath: String, includeReference: IncludeReference, content: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("completeReference")(includePath.asInstanceOf[js.Any], includeReference.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getIncludePath(includeString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIncludePath")(includeString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIncludeReference(includeString: String): IncludeReference = ^.asInstanceOf[js.Dynamic].applyDynamic("getIncludeReference")(includeString.asInstanceOf[js.Any]).asInstanceOf[IncludeReference]
  
  inline def getIncludeReferenceResolvers(): js.Array[IncludeReferenceResolver] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIncludeReferenceResolvers")().asInstanceOf[js.Array[IncludeReferenceResolver]]
  
  inline def resolve(includePath: String, includeReference: IncludeReference, content: String): ResolvedReference = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(includePath.asInstanceOf[js.Any], includeReference.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[ResolvedReference]
  
  inline def resolveContents(includeString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveContents")(includeString.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def resolveContents(includeString: String, content: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContents")(includeString.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @js.native
  trait IncludeReference extends StObject {
    
    def asString(): String = js.native
    
    def encodedName(): String = js.native
    def encodedName(withExtention: Boolean): String = js.native
    
    def getFragments(): js.Array[String] = js.native
    
    def getIncludePath(): String = js.native
  }
  
  trait IncludeReferenceResolver extends StObject {
    
    /**
      * Proposes potential completion for the reference.
      * @param content
      * @param reference
      */
    def completeReference(content: String, reference: IncludeReference): js.Array[String]
    
    /**
      * Checks whether this resolver is applicable to the content
      * @param includePath - main portion of include path, should not contain the reference
      * @param content - include's contents
      */
    def isApplicable(includePath: String, content: String): Boolean
    
    /**
      * Resolves include reference.
      * @param content
      * @param reference
      */
    def resolveReference(content: String, reference: IncludeReference): ResolvedReference
  }
  object IncludeReferenceResolver {
    
    inline def apply(
      completeReference: (String, IncludeReference) => js.Array[String],
      isApplicable: (String, String) => Boolean,
      resolveReference: (String, IncludeReference) => ResolvedReference
    ): IncludeReferenceResolver = {
      val __obj = js.Dynamic.literal(completeReference = js.Any.fromFunction2(completeReference), isApplicable = js.Any.fromFunction2(isApplicable), resolveReference = js.Any.fromFunction2(resolveReference))
      __obj.asInstanceOf[IncludeReferenceResolver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncludeReferenceResolver] (val x: Self) extends AnyVal {
      
      inline def setCompleteReference(value: (String, IncludeReference) => js.Array[String]): Self = StObject.set(x, "completeReference", js.Any.fromFunction2(value))
      
      inline def setIsApplicable(value: (String, String) => Boolean): Self = StObject.set(x, "isApplicable", js.Any.fromFunction2(value))
      
      inline def setResolveReference(value: (String, IncludeReference) => ResolvedReference): Self = StObject.set(x, "resolveReference", js.Any.fromFunction2(value))
    }
  }
  
  trait ResolvedReference extends StObject {
    
    /**
      * For textual resolvers should be a string,
      * for code references should return AST fragment.
      */
    var content: Any
    
    /**
      * Validation results. Empty if no errors occured.
      */
    var validation: js.Array[ValidationIssue]
  }
  object ResolvedReference {
    
    inline def apply(content: Any, validation: js.Array[ValidationIssue]): ResolvedReference = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedReference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedReference] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setValidation(value: js.Array[ValidationIssue]): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      inline def setValidationVarargs(value: ValidationIssue*): Self = StObject.set(x, "validation", js.Array(value*))
    }
  }
  
  trait ValidationIssue extends StObject {
    
    var message: String
  }
  object ValidationIssue {
    
    inline def apply(message: String): ValidationIssue = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationIssue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationIssue] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
