package typings.raml1Parser

import typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.Annotable
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.FragmentDeclaration
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod.TypeDeclaration
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0MethodsMod.Trait10
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0ResourcesMod.Resource10
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0ResourcesMod.ResourceType10
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0SecurityMod.SecuritySchemeBase10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsNewFormatSpec1Dot0ApiMod {
  
  trait Api10
    extends StObject
       with LibraryBase10 {
    
    /**
      * A URI that's to be used as the base of all the resources' URIs.
      * Often used as the base of the URL of each resource, containing
      * the location of the API. Can be a template URI.
      */
    var baseUri: js.UndefOr[String] = js.undefined
    
    /**
      * Named parameters used in the baseUri (template)
      */
    var baseUriParameters: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
    
    /**
      * A substantial, human-friendly description of the API.
      * Its value is a string and MAY be formatted using markdown.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Additional overall documentation for the API
      */
    var documentation: js.UndefOr[js.Array[DocumentationItem]] = js.undefined
    
    /**
      * The default media type to use for request and response bodies (payloads),
      * e.g. \"application/json\"
      */
    var mediaType: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The protocols supported by the API
      */
    var protocols: js.Array[String]
    
    /**
      * The resources of the API, identified as relative URIs that
      * begin with a slash (/). Every property whose key begins with a slash (/),
      * and is either at the root of the API definition or is the child property
      * of a resource property, is a resource property, e.g.: /users, /{groupId}, etc
      */
    var resources: js.UndefOr[js.Array[Resource10]] = js.undefined
    
    /**
      * The security schemes that apply to every resource and method in the API
      */
    var securedBy: js.UndefOr[js.Array[SecuritySchemeBase10]] = js.undefined
    
    /**
      * Short plain-text label for the API
      */
    var title: String
    
    /**
      * The version of the API, e.g. 'v1'
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object Api10 {
    
    inline def apply(protocols: js.Array[String], title: String): Api10 = {
      val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Api10] (val x: Self) extends AnyVal {
      
      inline def setBaseUri(value: String): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
      
      inline def setBaseUriParameters(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
      
      inline def setBaseUriParametersUndefined: Self = StObject.set(x, "baseUriParameters", js.undefined)
      
      inline def setBaseUriParametersVarargs(value: TypeDeclaration*): Self = StObject.set(x, "baseUriParameters", js.Array(value*))
      
      inline def setBaseUriUndefined: Self = StObject.set(x, "baseUri", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDocumentation(value: js.Array[DocumentationItem]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setDocumentationVarargs(value: DocumentationItem*): Self = StObject.set(x, "documentation", js.Array(value*))
      
      inline def setMediaType(value: js.Array[String]): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setMediaTypeVarargs(value: String*): Self = StObject.set(x, "mediaType", js.Array(value*))
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setResources(value: js.Array[Resource10]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Resource10*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setSecuredBy(value: js.Array[SecuritySchemeBase10]): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
      
      inline def setSecuredByUndefined: Self = StObject.set(x, "securedBy", js.undefined)
      
      inline def setSecuredByVarargs(value: SecuritySchemeBase10*): Self = StObject.set(x, "securedBy", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait DocumentationItem
    extends StObject
       with Annotable {
    
    /**
      * Content of documentation section
      */
    var content: String
    
    /**
      * Title of documentation section
      */
    var title: String
  }
  object DocumentationItem {
    
    inline def apply(content: String, title: String): DocumentationItem = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentationItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentationItem] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extension
    extends StObject
       with Api10 {
    
    /**
      * Location of a valid RAML API definition (or overlay or extension), the extension is applied to
      */
    var `extends`: String
    
    /**
      * Contains description of why the extension exist
      */
    var usage: js.UndefOr[String] = js.undefined
  }
  object Extension {
    
    inline def apply(`extends`: String, protocols: js.Array[String], title: String): Extension = {
      val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  trait Library
    extends StObject
       with LibraryBase10 {
    
    /**
      * Namespace which the library is imported under
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Contains description of why the library exists
      */
    var usage: js.UndefOr[String] = js.undefined
  }
  object Library {
    
    inline def apply(): Library = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Library]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Library] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  trait LibraryBase10
    extends StObject
       with FragmentDeclaration {
    
    /**
      * Declarations of annotation types for use by annotations
      */
    var annotationTypes: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
    
    /**
      * Declarations of resource types for use within this API
      */
    var resourceTypes: js.UndefOr[js.Array[ResourceType10]] = js.undefined
    
    /**
      * Declarations of security schemes for use within this API.
      */
    var securitySchemes: js.UndefOr[js.Array[SecuritySchemeBase10]] = js.undefined
    
    /**
      * Declarations of traits for use within this API
      */
    var traits: js.UndefOr[js.Array[Trait10]] = js.undefined
    
    /**
      * Declarations of (data) types for use within this API
      */
    var types: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
  }
  object LibraryBase10 {
    
    inline def apply(): LibraryBase10 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LibraryBase10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LibraryBase10] (val x: Self) extends AnyVal {
      
      inline def setAnnotationTypes(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "annotationTypes", value.asInstanceOf[js.Any])
      
      inline def setAnnotationTypesUndefined: Self = StObject.set(x, "annotationTypes", js.undefined)
      
      inline def setAnnotationTypesVarargs(value: TypeDeclaration*): Self = StObject.set(x, "annotationTypes", js.Array(value*))
      
      inline def setResourceTypes(value: js.Array[ResourceType10]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
      
      inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
      
      inline def setResourceTypesVarargs(value: ResourceType10*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
      
      inline def setSecuritySchemes(value: js.Array[SecuritySchemeBase10]): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
      
      inline def setSecuritySchemesUndefined: Self = StObject.set(x, "securitySchemes", js.undefined)
      
      inline def setSecuritySchemesVarargs(value: SecuritySchemeBase10*): Self = StObject.set(x, "securitySchemes", js.Array(value*))
      
      inline def setTraits(value: js.Array[Trait10]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
      
      inline def setTraitsVarargs(value: Trait10*): Self = StObject.set(x, "traits", js.Array(value*))
      
      inline def setTypes(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: TypeDeclaration*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait Overlay
    extends StObject
       with Api10 {
    
    /**
      * Location of a valid RAML API definition (or overlay or extension), the overlay is applied to.
      */
    var `extends`: String
    
    /**
      * Contains description of why the overlay exists
      */
    var usage: js.UndefOr[String] = js.undefined
  }
  object Overlay {
    
    inline def apply(`extends`: String, protocols: js.Array[String], title: String): Overlay = {
      val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Overlay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Overlay] (val x: Self) extends AnyVal {
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
}
