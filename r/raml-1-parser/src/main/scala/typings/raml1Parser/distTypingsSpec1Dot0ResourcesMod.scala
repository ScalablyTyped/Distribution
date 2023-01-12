package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.Annotable
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.AnnotationInstance
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.UsesDeclaration
import typings.raml1Parser.distTypingsSpec1Dot0DatamodelMod.TypeReference10
import typings.raml1Parser.distTypingsSpec1Dot0MethodsMod.Method10
import typings.raml1Parser.distTypingsSpec1Dot0MethodsMod.TraitRef10
import typings.raml1Parser.distTypingsSpec1Dot0SecurityMod.SecuritySchemeRef10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSpec1Dot0ResourcesMod {
  
  trait Resource10
    extends StObject
       with ResourceBase10 {
    
    var absoluteUri: String
    
    /**
      * Resource name
      */
    var displayName: js.UndefOr[String] = js.undefined
    
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
      __METADATA__ : Any,
      absoluteUri: String,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      relativeUri: String,
      relativeUriPathSegments: js.Array[String],
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): Resource10 = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], absoluteUri = absoluteUri.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], relativeUri = relativeUri.asInstanceOf[js.Any], relativeUriPathSegments = relativeUriPathSegments.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Resource10] (val x: Self) extends AnyVal {
      
      inline def setAbsoluteUri(value: String): Self = StObject.set(x, "absoluteUri", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
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
      * A list of the traits to apply to all methods declared
      * (implicitly or explicitly) for this resource.
      * Individual methods may override this declaration
      */
    var is: js.UndefOr[js.Array[TraitRef10]] = js.undefined
    
    /**
      * Methods that are part of this resource type definition
      */
    var methods: js.UndefOr[js.Array[Method10]] = js.undefined
    
    /**
      * The security schemes that apply to all methods declared
      * (implicitly or explicitly) for this resource.
      */
    var securedBy: js.UndefOr[SecuritySchemeRef10] = js.undefined
    
    var `type`: js.UndefOr[ResourceTypeRef10] = js.undefined
    
    /**
      * Detailed information about any URI parameters of this resource
      */
    var uriParameters: js.UndefOr[StringDictionary[TypeReference10]] = js.undefined
  }
  object ResourceBase10 {
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): ResourceBase10 = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceBase10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceBase10] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIs(value: js.Array[TraitRef10]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIsVarargs(value: TraitRef10*): Self = StObject.set(x, "is", js.Array(value*))
      
      inline def setMethods(value: js.Array[Method10]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: Method10*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setSecuredBy(value: SecuritySchemeRef10): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
      
      inline def setSecuredByUndefined: Self = StObject.set(x, "securedBy", js.undefined)
      
      inline def setType(value: ResourceTypeRef10): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUriParameters(value: StringDictionary[TypeReference10]): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
      
      inline def setUriParametersUndefined: Self = StObject.set(x, "uriParameters", js.undefined)
    }
  }
  
  trait ResourceType10
    extends StObject
       with ResourceBase10 {
    
    var delete: js.UndefOr[Method10] = js.undefined
    
    /**
      * Resource name
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    var get: js.UndefOr[Method10] = js.undefined
    
    /**
      * Resource name
      */
    var name: String
    
    var options: js.UndefOr[Method10] = js.undefined
    
    var patch: js.UndefOr[Method10] = js.undefined
    
    var post: js.UndefOr[Method10] = js.undefined
    
    var put: js.UndefOr[Method10] = js.undefined
    
    /**
      * Instructions on how and when the resource type should be used.
      */
    var usage: js.UndefOr[String] = js.undefined
  }
  object ResourceType10 {
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      name: String,
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): ResourceType10 = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceType10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceType10] (val x: Self) extends AnyVal {
      
      inline def setDelete(value: Method10): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setGet(value: Method10): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Method10): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPatch(value: Method10): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPost(value: Method10): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPut(value: Method10): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.raml1Parser.distTypingsSpec1Dot0CommonMod.Annotable because Already inherited
  - typings.raml1Parser.distTypingsSpec1Dot0CommonMod.FragmentDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations. Inlined uses */ trait ResourceTypeFragment
    extends StObject
       with ResourceType10 {
    
    var uses: js.UndefOr[js.Array[UsesDeclaration]] = js.undefined
  }
  object ResourceTypeFragment {
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      name: String,
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): ResourceTypeFragment = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceTypeFragment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceTypeFragment] (val x: Self) extends AnyVal {
      
      inline def setUses(value: js.Array[UsesDeclaration]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
      
      inline def setUsesVarargs(value: UsesDeclaration*): Self = StObject.set(x, "uses", js.Array(value*))
    }
  }
  
  type ResourceTypeRef10 = String | StringDictionary[Any]
}
