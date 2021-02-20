package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVaultMod {
  
  @JSImport("@pulumi/aws/backup/getVault", "getVault")
  @js.native
  def getVault(args: GetVaultArgs): js.Promise[GetVaultResult] = js.native
  @JSImport("@pulumi/aws/backup/getVault", "getVault")
  @js.native
  def getVault(args: GetVaultArgs, opts: InvokeOptions): js.Promise[GetVaultResult] = js.native
  
  @js.native
  trait GetVaultArgs extends StObject {
    
    /**
      * The name of the backup vault.
      */
    val name: String = js.native
    
    /**
      * Metadata that you can assign to help organize the resources that you create.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetVaultArgs {
    
    @scala.inline
    def apply(name: String): GetVaultArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVaultArgs]
    }
    
    @scala.inline
    implicit class GetVaultArgsMutableBuilder[Self <: GetVaultArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetVaultResult extends StObject {
    
    /**
      * The ARN of the vault.
      */
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The server-side encryption key that is used to protect your backups.
      */
    val kmsKeyArn: String = js.native
    
    val name: String = js.native
    
    /**
      * The number of recovery points that are stored in a backup vault.
      */
    val recoveryPoints: Double = js.native
    
    /**
      * Metadata that you can assign to help organize the resources that you create.
      */
    val tags: StringDictionary[String] = js.native
  }
  object GetVaultResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetVaultResultMutableBuilder[Self <: GetVaultResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoveryPoints(value: Double): Self = StObject.set(x, "recoveryPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
