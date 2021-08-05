package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getKeyMod {
  
  @JSImport("@pulumi/aws/apigateway/getKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetKeyResult]]
  inline def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetKeyResult]]
  
  trait GetKeyArgs extends StObject {
    
    /**
      * The ID of the API Key to look up.
      */
    val id: String
    
    /**
      * A map of tags for the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetKeyArgs {
    
    inline def apply(id: String): GetKeyArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetKeyArgs]
    }
    
    extension [Self <: GetKeyArgs](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetKeyResult extends StObject {
    
    /**
      * The date and time when the API Key was created.
      */
    val createdDate: String
    
    /**
      * The description of the API Key.
      */
    val description: String
    
    /**
      * Specifies whether the API Key is enabled.
      */
    val enabled: Boolean
    
    /**
      * Set to the ID of the API Key.
      */
    val id: String
    
    /**
      * The date and time when the API Key was last updated.
      */
    val lastUpdatedDate: String
    
    /**
      * Set to the name of the API Key.
      */
    val name: String
    
    /**
      * A map of tags for the resource.
      */
    val tags: StringDictionary[String]
    
    /**
      * Set to the value of the API Key.
      */
    val value: String
  }
  object GetKeyResult {
    
    inline def apply(
      createdDate: String,
      description: String,
      enabled: Boolean,
      id: String,
      lastUpdatedDate: String,
      name: String,
      tags: StringDictionary[String],
      value: String
    ): GetKeyResult = {
      val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetKeyResult]
    }
    
    extension [Self <: GetKeyResult](x: Self) {
      
      inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedDate(value: String): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
