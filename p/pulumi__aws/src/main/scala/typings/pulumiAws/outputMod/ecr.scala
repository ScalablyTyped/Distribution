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
    
    inline def apply(encryptionType: String, kmsKey: String): GetRepositoryEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(encryptionType = encryptionType.asInstanceOf[js.Any], kmsKey = kmsKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryEncryptionConfiguration]
    }
    
    extension [Self <: GetRepositoryEncryptionConfiguration](x: Self) {
      
      inline def setEncryptionType(value: String): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
      
      inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRepositoryImageScanningConfiguration extends StObject {
    
    /**
      * Indicates whether images are scanned after being pushed to the repository.
      */
    var scanOnPush: Boolean
  }
  object GetRepositoryImageScanningConfiguration {
    
    inline def apply(scanOnPush: Boolean): GetRepositoryImageScanningConfiguration = {
      val __obj = js.Dynamic.literal(scanOnPush = scanOnPush.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryImageScanningConfiguration]
    }
    
    extension [Self <: GetRepositoryImageScanningConfiguration](x: Self) {
      
      inline def setScanOnPush(value: Boolean): Self = StObject.set(x, "scanOnPush", value.asInstanceOf[js.Any])
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
    
    inline def apply(kmsKey: String): RepositoryEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(kmsKey = kmsKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryEncryptionConfiguration]
    }
    
    extension [Self <: RepositoryEncryptionConfiguration](x: Self) {
      
      inline def setEncryptionType(value: String): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
      
      inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
      
      inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryImageScanningConfiguration extends StObject {
    
    /**
      * Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
      */
    var scanOnPush: Boolean
  }
  object RepositoryImageScanningConfiguration {
    
    inline def apply(scanOnPush: Boolean): RepositoryImageScanningConfiguration = {
      val __obj = js.Dynamic.literal(scanOnPush = scanOnPush.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryImageScanningConfiguration]
    }
    
    extension [Self <: RepositoryImageScanningConfiguration](x: Self) {
      
      inline def setScanOnPush(value: Boolean): Self = StObject.set(x, "scanOnPush", value.asInstanceOf[js.Any])
    }
  }
}
