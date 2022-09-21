package typings.raml1Parser

import typings.raml1Parser.datamodelMod.TypeDeclaration
import typings.raml1Parser.spec10CommonMod.Annotable
import typings.raml1Parser.spec10CommonMod.UsesDeclaration
import typings.raml1Parser.spec10MethodsMod.Method10
import typings.raml1Parser.spec10MethodsMod.TemplateReference
import typings.raml1Parser.spec10SecurityMod.SecuritySchemeBase10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spec10ResourcesMod {
  
  trait Resource10
    extends StObject
       with ResourceBase10 {
    
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
      * URI Segments
      */
    var relativeUriPathSegments: js.Array[String]
    
    /**
      * A nested resource is identified as any property whose name begins
      * with a slash (\"/\") and is therefore treated as a relative URI.
      */
    var resources: js.UndefOr[js.Array[Resource10]] = js.undefined
  }
  object Resource10 {
    
    inline def apply(
      absoluteUri: String,
      completeRelativeUri: String,
      relativeUri: String,
      relativeUriPathSegments: js.Array[String]
    ): Resource10 = {
      val __obj = js.Dynamic.literal(absoluteUri = absoluteUri.asInstanceOf[js.Any], completeRelativeUri = completeRelativeUri.asInstanceOf[js.Any], relativeUri = relativeUri.asInstanceOf[js.Any], relativeUriPathSegments = relativeUriPathSegments.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource10]
    }
    
    extension [Self <: Resource10](x: Self) {
      
      inline def setAbsoluteParentUri(value: String): Self = StObject.set(x, "absoluteParentUri", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteParentUriUndefined: Self = StObject.set(x, "absoluteParentUri", js.undefined)
      
      inline def setAbsoluteUri(value: String): Self = StObject.set(x, "absoluteUri", value.asInstanceOf[js.Any])
      
      inline def setCompleteRelativeUri(value: String): Self = StObject.set(x, "completeRelativeUri", value.asInstanceOf[js.Any])
      
      inline def setParentUri(value: String): Self = StObject.set(x, "parentUri", value.asInstanceOf[js.Any])
      
      inline def setParentUriUndefined: Self = StObject.set(x, "parentUri", js.undefined)
      
      inline def setRelativeUri(value: String): Self = StObject.set(x, "relativeUri", value.asInstanceOf[js.Any])
      
      inline def setRelativeUriPathSegments(value: js.Array[String]): Self = StObject.set(x, "relativeUriPathSegments", value.asInstanceOf[js.Any])
      
      inline def setRelativeUriPathSegmentsVarargs(value: String*): Self = StObject.set(x, "relativeUriPathSegments", js.Array(value*))
      
      inline def setResources(value: js.Array[Resource10]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Resource10*): Self = StObject.set(x, "resources", js.Array(value*))
    }
  }
  
  trait ResourceBase10
    extends StObject
       with Annotable {
    
    /**
      * Resource description
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * User readable name of the component
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * A list of the traits to apply to all methods declared
      * (implicitly or explicitly) for this resource.
      * Individual methods may override this declaration
      */
    var is: js.UndefOr[js.Array[TemplateReference]] = js.undefined
    
    /**
      * Methods that are part of this resource type definition
      */
    var methods: js.UndefOr[js.Array[Method10]] = js.undefined
    
    /**
      * The security schemes that apply to all methods declared
      * (implicitly or explicitly) for this resource.
      */
    var securedBy: js.UndefOr[js.Array[SecuritySchemeBase10]] = js.undefined
    
    var `type`: js.UndefOr[TemplateReference] = js.undefined
    
    /**
      * Detailed information about any URI parameters of this resource
      */
    var uriParameters: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
  }
  object ResourceBase10 {
    
    inline def apply(): ResourceBase10 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceBase10]
    }
    
    extension [Self <: ResourceBase10](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIs(value: js.Array[TemplateReference]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIsVarargs(value: TemplateReference*): Self = StObject.set(x, "is", js.Array(value*))
      
      inline def setMethods(value: js.Array[Method10]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: Method10*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setSecuredBy(value: js.Array[SecuritySchemeBase10]): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
      
      inline def setSecuredByUndefined: Self = StObject.set(x, "securedBy", js.undefined)
      
      inline def setSecuredByVarargs(value: SecuritySchemeBase10*): Self = StObject.set(x, "securedBy", js.Array(value*))
      
      inline def setType(value: TemplateReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUriParameters(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
      
      inline def setUriParametersUndefined: Self = StObject.set(x, "uriParameters", js.undefined)
      
      inline def setUriParametersVarargs(value: TypeDeclaration*): Self = StObject.set(x, "uriParameters", js.Array(value*))
    }
  }
  
  trait ResourceType10
    extends StObject
       with ResourceBase10 {
    
    /**
      * Resource type name
      */
    var name: String
    
    /**
      * Instructions on how and when the resource type should be used.
      */
    var usage: js.UndefOr[String] = js.undefined
  }
  object ResourceType10 {
    
    inline def apply(name: String): ResourceType10 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceType10]
    }
    
    extension [Self <: ResourceType10](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.raml1Parser.spec10CommonMod.HasSource because Already inherited
  - typings.raml1Parser.spec10CommonMod.Annotable because Already inherited
  - typings.raml1Parser.spec10CommonMod.FragmentDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations, sourceMap. Inlined uses */ trait ResourceTypeFragment
    extends StObject
       with ResourceType10 {
    
    var uses: js.UndefOr[js.Array[UsesDeclaration]] = js.undefined
  }
  object ResourceTypeFragment {
    
    inline def apply(name: String): ResourceTypeFragment = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceTypeFragment]
    }
    
    extension [Self <: ResourceTypeFragment](x: Self) {
      
      inline def setUses(value: js.Array[UsesDeclaration]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
      
      inline def setUsesVarargs(value: UsesDeclaration*): Self = StObject.set(x, "uses", js.Array(value*))
    }
  }
}
