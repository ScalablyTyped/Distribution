package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecr {
  
  trait GetRepositoryEncryptionConfiguration extends StObject {
    
    /**
      * The encryption type to use for the repository, either `AES256` or `KMS`.
      */
    var encryptionType: String
    
    /**
      * If `encryptionType` is `KMS`, the ARN of the KMS key used.
      */
    var kmsKey: String
  }
  object GetRepositoryEncryptionConfiguration {
    
    @scala.inline
    def apply(encryptionType: String, kmsKey: String): GetRepositoryEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(encryptionType = encryptionType.asInstanceOf[js.Any], kmsKey = kmsKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryEncryptionConfiguration]
    }
    
    @scala.inline
    implicit class GetRepositoryEncryptionConfigurationMutableBuilder[Self <: GetRepositoryEncryptionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionType(value: String): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRepositoryImageScanningConfiguration extends StObject {
    
    /**
      * Indicates whether images are scanned after being pushed to the repository.
      */
    var scanOnPush: Boolean
  }
  object GetRepositoryImageScanningConfiguration {
    
    @scala.inline
    def apply(scanOnPush: Boolean): GetRepositoryImageScanningConfiguration = {
      val __obj = js.Dynamic.literal(scanOnPush = scanOnPush.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryImageScanningConfiguration]
    }
    
    @scala.inline
    implicit class GetRepositoryImageScanningConfigurationMutableBuilder[Self <: GetRepositoryImageScanningConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScanOnPush(value: Boolean): Self = StObject.set(x, "scanOnPush", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryEncryptionConfiguration extends StObject {
    
    /**
      * The encryption type to use for the repository. Valid values are `AES256` or `KMS`. Defaults to `AES256`.
      */
    var encryptionType: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of the KMS key to use when `encryptionType` is `KMS`. If not specified, uses the default AWS managed key for ECR.
      */
    var kmsKey: String
  }
  object RepositoryEncryptionConfiguration {
    
    @scala.inline
    def apply(kmsKey: String): RepositoryEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(kmsKey = kmsKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryEncryptionConfiguration]
    }
    
    @scala.inline
    implicit class RepositoryEncryptionConfigurationMutableBuilder[Self <: RepositoryEncryptionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionType(value: String): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
      
      @scala.inline
      def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryImageScanningConfiguration extends StObject {
    
    /**
      * Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
      */
    var scanOnPush: Boolean
  }
  object RepositoryImageScanningConfiguration {
    
    @scala.inline
    def apply(scanOnPush: Boolean): RepositoryImageScanningConfiguration = {
      val __obj = js.Dynamic.literal(scanOnPush = scanOnPush.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryImageScanningConfiguration]
    }
    
    @scala.inline
    implicit class RepositoryImageScanningConfigurationMutableBuilder[Self <: RepositoryImageScanningConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScanOnPush(value: Boolean): Self = StObject.set(x, "scanOnPush", value.asInstanceOf[js.Any])
    }
  }
}
