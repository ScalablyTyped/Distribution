package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getKeyMod {
  
  @JSImport("@pulumi/aws/apigateway/getKey", "getKey")
  @js.native
  def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] = js.native
  @JSImport("@pulumi/aws/apigateway/getKey", "getKey")
  @js.native
  def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] = js.native
  
  @js.native
  trait GetKeyArgs extends StObject {
    
    /**
      * The ID of the API Key to look up.
      */
    val id: String = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetKeyArgs {
    
    @scala.inline
    def apply(id: String): GetKeyArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetKeyArgs]
    }
    
    @scala.inline
    implicit class GetKeyArgsMutableBuilder[Self <: GetKeyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetKeyResult extends StObject {
    
    /**
      * The date and time when the API Key was created.
      */
    val createdDate: String = js.native
    
    /**
      * The description of the API Key.
      */
    val description: String = js.native
    
    /**
      * Specifies whether the API Key is enabled.
      */
    val enabled: Boolean = js.native
    
    /**
      * Set to the ID of the API Key.
      */
    val id: String = js.native
    
    /**
      * The date and time when the API Key was last updated.
      */
    val lastUpdatedDate: String = js.native
    
    /**
      * Set to the name of the API Key.
      */
    val name: String = js.native
    
    /**
      * A map of tags for the resource.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * Set to the value of the API Key.
      */
    val value: String = js.native
  }
  object GetKeyResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetKeyResultMutableBuilder[Self <: GetKeyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedDate(value: String): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
