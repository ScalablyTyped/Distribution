package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVaultMod {
  
  @JSImport("@pulumi/aws/backup/getVault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVault(args: GetVaultArgs): js.Promise[GetVaultResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVault")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVaultResult]]
  inline def getVault(args: GetVaultArgs, opts: InvokeOptions): js.Promise[GetVaultResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVault")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVaultResult]]
  
  trait GetVaultArgs extends StObject {
    
    /**
      * The name of the backup vault.
      */
    val name: String
    
    /**
      * Metadata that you can assign to help organize the resources that you create.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetVaultArgs {
    
    inline def apply(name: String): GetVaultArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVaultArgs]
    }
    
    extension [Self <: GetVaultArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetVaultResult extends StObject {
    
    /**
      * The ARN of the vault.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The server-side encryption key that is used to protect your backups.
      */
    val kmsKeyArn: String
    
    val name: String
    
    /**
      * The number of recovery points that are stored in a backup vault.
      */
    val recoveryPoints: Double
    
    /**
      * Metadata that you can assign to help organize the resources that you create.
      */
    val tags: StringDictionary[String]
  }
  object GetVaultResult {
    
    inline def apply(
      arn: String,
      id: String,
      kmsKeyArn: String,
      name: String,
      recoveryPoints: Double,
      tags: StringDictionary[String]
    ): GetVaultResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recoveryPoints = recoveryPoints.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVaultResult]
    }
    
    extension [Self <: GetVaultResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRecoveryPoints(value: Double): Self = StObject.set(x, "recoveryPoints", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
