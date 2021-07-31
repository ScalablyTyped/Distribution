package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecr {
  
  trait RepositoryEncryptionConfiguration extends StObject {
    
    /**
      * The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
      */
    var encryptionType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the KMS key to use when `encryptionType` is `KMS`. If not specified, uses the default AWS managed key for ECR.
      */
    var kmsKey: js.UndefOr[Input[String]] = js.undefined
  }
  object RepositoryEncryptionConfiguration {
    
    @scala.inline
    def apply(): RepositoryEncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryEncryptionConfiguration]
    }
    
    @scala.inline
    implicit class RepositoryEncryptionConfigurationMutableBuilder[Self <: RepositoryEncryptionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionType(value: Input[String]): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
      
      @scala.inline
      def setKmsKey(value: Input[String]): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    }
  }
  
  trait RepositoryImageScanningConfiguration extends StObject {
    
    /**
      * Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
      */
    var scanOnPush: Input[Boolean]
  }
  object RepositoryImageScanningConfiguration {
    
    @scala.inline
    def apply(scanOnPush: Input[Boolean]): RepositoryImageScanningConfiguration = {
      val __obj = js.Dynamic.literal(scanOnPush = scanOnPush.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryImageScanningConfiguration]
    }
    
    @scala.inline
    implicit class RepositoryImageScanningConfigurationMutableBuilder[Self <: RepositoryImageScanningConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScanOnPush(value: Input[Boolean]): Self = StObject.set(x, "scanOnPush", value.asInstanceOf[js.Any])
    }
  }
}
