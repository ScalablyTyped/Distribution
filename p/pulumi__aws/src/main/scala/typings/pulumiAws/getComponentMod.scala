package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getComponentMod {
  
  @JSImport("@pulumi/aws/imagebuilder/getComponent", "getComponent")
  @js.native
  def getComponent(args: GetComponentArgs): js.Promise[GetComponentResult] = js.native
  @JSImport("@pulumi/aws/imagebuilder/getComponent", "getComponent")
  @js.native
  def getComponent(args: GetComponentArgs, opts: InvokeOptions): js.Promise[GetComponentResult] = js.native
  
  @js.native
  trait GetComponentArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the component.
      */
    val arn: String = js.native
    
    /**
      * Key-value map of resource tags for the component.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetComponentArgs {
    
    @scala.inline
    def apply(arn: String): GetComponentArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetComponentArgs]
    }
    
    @scala.inline
    implicit class GetComponentArgsMutableBuilder[Self <: GetComponentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetComponentResult extends StObject {
    
    val arn: String = js.native
    
    /**
      * Change description of the component.
      */
    val changeDescription: String = js.native
    
    /**
      * Data of the component.
      */
    val data: String = js.native
    
    /**
      * Date the component was created.
      */
    val dateCreated: String = js.native
    
    /**
      * Description of the component.
      */
    val description: String = js.native
    
    /**
      * Encryption status of the component.
      */
    val encrypted: Boolean = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
      */
    val kmsKeyId: String = js.native
    
    /**
      * Name of the component.
      */
    val name: String = js.native
    
    /**
      * Owner of the component.
      */
    val owner: String = js.native
    
    /**
      * Platform of the component.
      */
    val platform: String = js.native
    
    /**
      * Operating Systems (OSes) supported by the component.
      */
    val supportedOsVersions: js.Array[String] = js.native
    
    /**
      * Key-value map of resource tags for the component.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * Type of the component.
      */
    val `type`: String = js.native
    
    /**
      * Version of the component.
      */
    val version: String = js.native
  }
  object GetComponentResult {
    
    @scala.inline
    def apply(
      arn: String,
      changeDescription: String,
      data: String,
      dateCreated: String,
      description: String,
      encrypted: Boolean,
      id: String,
      kmsKeyId: String,
      name: String,
      owner: String,
      platform: String,
      supportedOsVersions: js.Array[String],
      tags: StringDictionary[String],
      `type`: String,
      version: String
    ): GetComponentResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], changeDescription = changeDescription.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], supportedOsVersions = supportedOsVersions.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetComponentResult]
    }
    
    @scala.inline
    implicit class GetComponentResultMutableBuilder[Self <: GetComponentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeDescription(value: String): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOsVersions(value: js.Array[String]): Self = StObject.set(x, "supportedOsVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOsVersionsVarargs(value: String*): Self = StObject.set(x, "supportedOsVersions", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
