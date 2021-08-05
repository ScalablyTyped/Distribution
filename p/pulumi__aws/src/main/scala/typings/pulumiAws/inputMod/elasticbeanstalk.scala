package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticbeanstalk {
  
  trait ApplicationAppversionLifecycle extends StObject {
    
    /**
      * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
      */
    var deleteSourceFromS3: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
      */
    var maxAgeInDays: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
      */
    var maxCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
      */
    var serviceRole: Input[String]
  }
  object ApplicationAppversionLifecycle {
    
    inline def apply(serviceRole: Input[String]): ApplicationAppversionLifecycle = {
      val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationAppversionLifecycle]
    }
    
    extension [Self <: ApplicationAppversionLifecycle](x: Self) {
      
      inline def setDeleteSourceFromS3(value: Input[Boolean]): Self = StObject.set(x, "deleteSourceFromS3", value.asInstanceOf[js.Any])
      
      inline def setDeleteSourceFromS3Undefined: Self = StObject.set(x, "deleteSourceFromS3", js.undefined)
      
      inline def setMaxAgeInDays(value: Input[Double]): Self = StObject.set(x, "maxAgeInDays", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeInDaysUndefined: Self = StObject.set(x, "maxAgeInDays", js.undefined)
      
      inline def setMaxCount(value: Input[Double]): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setServiceRole(value: Input[String]): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigurationTemplateSetting extends StObject {
    
    /**
      * A unique name for this Template.
      */
    var name: Input[String]
    
    var namespace: Input[String]
    
    var resource: js.UndefOr[Input[String]] = js.undefined
    
    var value: Input[String]
  }
  object ConfigurationTemplateSetting {
    
    inline def apply(name: Input[String], namespace: Input[String], value: Input[String]): ConfigurationTemplateSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationTemplateSetting]
    }
    
    extension [Self <: ConfigurationTemplateSetting](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvironmentAllSetting extends StObject {
    
    /**
      * A unique name for this Environment. This name is used
      * in the application URL
      */
    var name: Input[String]
    
    var namespace: Input[String]
    
    var resource: js.UndefOr[Input[String]] = js.undefined
    
    var value: Input[String]
  }
  object EnvironmentAllSetting {
    
    inline def apply(name: Input[String], namespace: Input[String], value: Input[String]): EnvironmentAllSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentAllSetting]
    }
    
    extension [Self <: EnvironmentAllSetting](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnvironmentSetting extends StObject {
    
    /**
      * A unique name for this Environment. This name is used
      * in the application URL
      */
    var name: Input[String]
    
    var namespace: Input[String]
    
    var resource: js.UndefOr[Input[String]] = js.undefined
    
    var value: Input[String]
  }
  object EnvironmentSetting {
    
    inline def apply(name: Input[String], namespace: Input[String], value: Input[String]): EnvironmentSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentSetting]
    }
    
    extension [Self <: EnvironmentSetting](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
