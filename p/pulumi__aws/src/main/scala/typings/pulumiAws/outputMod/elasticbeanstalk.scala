package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticbeanstalk {
  
  trait ApplicationAppversionLifecycle extends StObject {
    
    /**
      * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
      */
    var deleteSourceFromS3: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
      */
    var maxAgeInDays: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
      */
    var maxCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
      */
    var serviceRole: String
  }
  object ApplicationAppversionLifecycle {
    
    inline def apply(serviceRole: String): ApplicationAppversionLifecycle = {
      val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationAppversionLifecycle]
    }
    
    extension [Self <: ApplicationAppversionLifecycle](x: Self) {
      
      inline def setDeleteSourceFromS3(value: Boolean): Self = StObject.set(x, "deleteSourceFromS3", value.asInstanceOf[js.Any])
      
      inline def setDeleteSourceFromS3Undefined: Self = StObject.set(x, "deleteSourceFromS3", js.undefined)
      
      inline def setMaxAgeInDays(value: Double): Self = StObject.set(x, "maxAgeInDays", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeInDaysUndefined: Self = StObject.set(x, "maxAgeInDays", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigurationTemplateSetting extends StObject {
    
    /**
      * A unique name for this Template.
      */
    var name: String
    
    var namespace: String
    
    var resource: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object ConfigurationTemplateSetting {
    
    inline def apply(name: String, namespace: String, value: String): ConfigurationTemplateSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationTemplateSetting]
    }
    
    extension [Self <: ConfigurationTemplateSetting](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvironmentAllSetting extends StObject {
    
    /**
      * A unique name for this Environment. This name is used
      * in the application URL
      */
    var name: String
    
    var namespace: String
    
    var resource: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object EnvironmentAllSetting {
    
    inline def apply(name: String, namespace: String, value: String): EnvironmentAllSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentAllSetting]
    }
    
    extension [Self <: EnvironmentAllSetting](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvironmentSetting extends StObject {
    
    /**
      * A unique name for this Environment. This name is used
      * in the application URL
      */
    var name: String
    
    var namespace: String
    
    var resource: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object EnvironmentSetting {
    
    inline def apply(name: String, namespace: String, value: String): EnvironmentSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentSetting]
    }
    
    extension [Self <: EnvironmentSetting](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetApplicationAppversionLifecycle extends StObject {
    
    /**
      * Specifies whether delete a version's source bundle from S3 when the application version is deleted.
      */
    var deleteSourceFromS3: Boolean
    
    /**
      * The number of days to retain an application version.
      */
    var maxAgeInDays: Double
    
    /**
      * The maximum number of application versions to retain.
      */
    var maxCount: Double
    
    /**
      * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
      */
    var serviceRole: String
  }
  object GetApplicationAppversionLifecycle {
    
    inline def apply(deleteSourceFromS3: Boolean, maxAgeInDays: Double, maxCount: Double, serviceRole: String): GetApplicationAppversionLifecycle = {
      val __obj = js.Dynamic.literal(deleteSourceFromS3 = deleteSourceFromS3.asInstanceOf[js.Any], maxAgeInDays = maxAgeInDays.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApplicationAppversionLifecycle]
    }
    
    extension [Self <: GetApplicationAppversionLifecycle](x: Self) {
      
      inline def setDeleteSourceFromS3(value: Boolean): Self = StObject.set(x, "deleteSourceFromS3", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeInDays(value: Double): Self = StObject.set(x, "maxAgeInDays", value.asInstanceOf[js.Any])
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    }
  }
}
