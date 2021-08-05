package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getComponentMod {
  
  @JSImport("@pulumi/aws/imagebuilder/getComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComponent(args: GetComponentArgs): js.Promise[GetComponentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetComponentResult]]
  inline def getComponent(args: GetComponentArgs, opts: InvokeOptions): js.Promise[GetComponentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetComponentResult]]
  
  trait GetComponentArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the component.
      */
    val arn: String
    
    /**
      * Key-value map of resource tags for the component.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetComponentArgs {
    
    inline def apply(arn: String): GetComponentArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetComponentArgs]
    }
    
    extension [Self <: GetComponentArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetComponentResult extends StObject {
    
    val arn: String
    
    /**
      * Change description of the component.
      */
    val changeDescription: String
    
    /**
      * Data of the component.
      */
    val data: String
    
    /**
      * Date the component was created.
      */
    val dateCreated: String
    
    /**
      * Description of the component.
      */
    val description: String
    
    /**
      * Encryption status of the component.
      */
    val encrypted: Boolean
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
      */
    val kmsKeyId: String
    
    /**
      * Name of the component.
      */
    val name: String
    
    /**
      * Owner of the component.
      */
    val owner: String
    
    /**
      * Platform of the component.
      */
    val platform: String
    
    /**
      * Operating Systems (OSes) supported by the component.
      */
    val supportedOsVersions: js.Array[String]
    
    /**
      * Key-value map of resource tags for the component.
      */
    val tags: StringDictionary[String]
    
    /**
      * Type of the component.
      */
    val `type`: String
    
    /**
      * Version of the component.
      */
    val version: String
  }
  object GetComponentResult {
    
    inline def apply(
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
    
    extension [Self <: GetComponentResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setChangeDescription(value: String): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSupportedOsVersions(value: js.Array[String]): Self = StObject.set(x, "supportedOsVersions", value.asInstanceOf[js.Any])
      
      inline def setSupportedOsVersionsVarargs(value: String*): Self = StObject.set(x, "supportedOsVersions", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
