package typings.raml1Parser

import typings.raml1Parser.distTypingsNewFormatSpec0Dot8CommonMod.HasSource
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8MethodsMod.Method08
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8MethodsMod.TemplateReference
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8ParametersMod.Parameter08
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8SecurityMod.AbstractSecurityScheme08
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsNewFormatSpec0Dot8ResourcesMod {
  
  trait Resource08
    extends StObject
       with ResourceBase08 {
    
    /**
      * For nested resources, absolute URI of the parent resource.
      * For top level resources it is base URI of the Api or empty string if base Uri is undefined.
      */
    var absoluteParentUri: js.UndefOr[String] = js.undefined
    
    /**
      * Absolute URI of the resource
      */
    var absoluteUri: String
    
    /**
      * URI relative to base URI of the Api
      */
    var completeRelativeUri: String
    
    /**
      * For nested resources, URI of the parent resource relative to base URI of the Api.
      * For top level resources it is empty string
      */
    var parentUri: js.UndefOr[String] = js.undefined
    
    /**
      * Relative URL of this resource from the parent resource
      */
    var relativeUri: String
    
    /**
      * Instantiation of applyed resource type
      */
    var relativeUriPathSegments: js.Array[String]
    
    /**
      * Children resources
      */
    var resources: js.UndefOr[js.Array[Resource08]] = js.undefined
  }
  object Resource08 {
    
    inline def apply(
      absoluteUri: String,
      completeRelativeUri: String,
      relativeUri: String,
      relativeUriPathSegments: js.Array[String]
    ): Resource08 = {
      val __obj = js.Dynamic.literal(absoluteUri = absoluteUri.asInstanceOf[js.Any], completeRelativeUri = completeRelativeUri.asInstanceOf[js.Any], relativeUri = relativeUri.asInstanceOf[js.Any], relativeUriPathSegments = relativeUriPathSegments.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource08]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Resource08] (val x: Self) extends AnyVal {
      
      inline def setAbsoluteParentUri(value: String): Self = StObject.set(x, "absoluteParentUri", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteParentUriUndefined: Self = StObject.set(x, "absoluteParentUri", js.undefined)
      
      inline def setAbsoluteUri(value: String): Self = StObject.set(x, "absoluteUri", value.asInstanceOf[js.Any])
      
      inline def setCompleteRelativeUri(value: String): Self = StObject.set(x, "completeRelativeUri", value.asInstanceOf[js.Any])
      
      inline def setParentUri(value: String): Self = StObject.set(x, "parentUri", value.asInstanceOf[js.Any])
      
      inline def setParentUriUndefined: Self = StObject.set(x, "parentUri", js.undefined)
      
      inline def setRelativeUri(value: String): Self = StObject.set(x, "relativeUri", value.asInstanceOf[js.Any])
      
      inline def setRelativeUriPathSegments(value: js.Array[String]): Self = StObject.set(x, "relativeUriPathSegments", value.asInstanceOf[js.Any])
      
      inline def setRelativeUriPathSegmentsVarargs(value: String*): Self = StObject.set(x, "relativeUriPathSegments", js.Array(value*))
      
      inline def setResources(value: js.Array[Resource08]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Resource08*): Self = StObject.set(x, "resources", js.Array(value*))
    }
  }
  
  trait ResourceBase08
    extends StObject
       with HasSource {
    
    /**
      * A resource or a method can override a base URI template's values.
      * This is useful to restrict or change the default or parameter selection
      * in the base URI. The baseUriParameters property MAY be used to override
      * any or all parameters defined at the root level baseUriParameters
      * property, as well as base URI parameters not specified at the root level.
      */
    var baseUriParameters: js.UndefOr[js.Array[Parameter08]] = js.undefined
    
    /**
      * The description attribute describes the intended use or meaning of the $self.
      * This value MAY be formatted using Markdown.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * An alternate, human-friendly name for the resource type
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * Instantiation of applyed traits
      */
    var is: js.UndefOr[js.Array[TemplateReference]] = js.undefined
    
    /**
      * Methods that can be called on this resource
      */
    var methods: js.UndefOr[js.Array[Method08]] = js.undefined
    
    /**
      * securityScheme may also be applied to a resource by using the
      * securedBy key, which is equivalent to applying the securityScheme
      * to all methods that may be declared, explicitly or implicitly,
      * by defining the resourceTypes or traits property for that resource.
      * To indicate that the method may be called without applying any
      * securityScheme, the method may be annotated with the null securityScheme.
      */
    var securedBy: js.UndefOr[js.Array[AbstractSecurityScheme08]] = js.undefined
    
    var `type`: js.UndefOr[TemplateReference] = js.undefined
    
    /**
      * Uri parameters of this resource
      */
    var uriParameters: js.UndefOr[js.Array[Parameter08]] = js.undefined
  }
  object ResourceBase08 {
    
    inline def apply(): ResourceBase08 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceBase08]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceBase08] (val x: Self) extends AnyVal {
      
      inline def setBaseUriParameters(value: js.Array[Parameter08]): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
      
      inline def setBaseUriParametersUndefined: Self = StObject.set(x, "baseUriParameters", js.undefined)
      
      inline def setBaseUriParametersVarargs(value: Parameter08*): Self = StObject.set(x, "baseUriParameters", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIs(value: js.Array[TemplateReference]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIsVarargs(value: TemplateReference*): Self = StObject.set(x, "is", js.Array(value*))
      
      inline def setMethods(value: js.Array[Method08]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: Method08*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setSecuredBy(value: js.Array[AbstractSecurityScheme08]): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
      
      inline def setSecuredByUndefined: Self = StObject.set(x, "securedBy", js.undefined)
      
      inline def setSecuredByVarargs(value: AbstractSecurityScheme08*): Self = StObject.set(x, "securedBy", js.Array(value*))
      
      inline def setType(value: TemplateReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUriParameters(value: js.Array[Parameter08]): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
      
      inline def setUriParametersUndefined: Self = StObject.set(x, "uriParameters", js.undefined)
      
      inline def setUriParametersVarargs(value: Parameter08*): Self = StObject.set(x, "uriParameters", js.Array(value*))
    }
  }
  
  trait ResourceType08
    extends StObject
       with ResourceBase08 {
    
    /**
      * Name of the resource type
      */
    var name: String
    
    /**
      * Instructions on how and when the resource type should be used.
      */
    var usage: js.UndefOr[String] = js.undefined
  }
  object ResourceType08 {
    
    inline def apply(name: String): ResourceType08 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceType08]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceType08] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
}
