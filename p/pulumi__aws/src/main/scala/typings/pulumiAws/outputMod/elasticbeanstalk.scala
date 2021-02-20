package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticbeanstalk {
  
  @js.native
  trait ApplicationAppversionLifecycle extends StObject {
    
    /**
      * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
      */
    var deleteSourceFromS3: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
      */
    var maxAgeInDays: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
      */
    var maxCount: js.UndefOr[Double] = js.native
    
    /**
      * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
      */
    var serviceRole: String = js.native
  }
  object ApplicationAppversionLifecycle {
    
    @scala.inline
    def apply(serviceRole: String): ApplicationAppversionLifecycle = {
      val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationAppversionLifecycle]
    }
    
    @scala.inline
    implicit class ApplicationAppversionLifecycleMutableBuilder[Self <: ApplicationAppversionLifecycle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteSourceFromS3(value: Boolean): Self = StObject.set(x, "deleteSourceFromS3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteSourceFromS3Undefined: Self = StObject.set(x, "deleteSourceFromS3", js.undefined)
      
      @scala.inline
      def setMaxAgeInDays(value: Double): Self = StObject.set(x, "maxAgeInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeInDaysUndefined: Self = StObject.set(x, "maxAgeInDays", js.undefined)
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfigurationTemplateSetting extends StObject {
    
    /**
      * A unique name for this Template.
      */
    var name: String = js.native
    
    var namespace: String = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var value: String = js.native
  }
  object ConfigurationTemplateSetting {
    
    @scala.inline
    def apply(name: String, namespace: String, value: String): ConfigurationTemplateSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationTemplateSetting]
    }
    
    @scala.inline
    implicit class ConfigurationTemplateSettingMutableBuilder[Self <: ConfigurationTemplateSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnvironmentAllSetting extends StObject {
    
    /**
      * A unique name for this Environment. This name is used
      * in the application URL
      */
    var name: String = js.native
    
    var namespace: String = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var value: String = js.native
  }
  object EnvironmentAllSetting {
    
    @scala.inline
    def apply(name: String, namespace: String, value: String): EnvironmentAllSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentAllSetting]
    }
    
    @scala.inline
    implicit class EnvironmentAllSettingMutableBuilder[Self <: EnvironmentAllSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnvironmentSetting extends StObject {
    
    /**
      * A unique name for this Environment. This name is used
      * in the application URL
      */
    var name: String = js.native
    
    var namespace: String = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var value: String = js.native
  }
  object EnvironmentSetting {
    
    @scala.inline
    def apply(name: String, namespace: String, value: String): EnvironmentSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentSetting]
    }
    
    @scala.inline
    implicit class EnvironmentSettingMutableBuilder[Self <: EnvironmentSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetApplicationAppversionLifecycle extends StObject {
    
    /**
      * Specifies whether delete a version's source bundle from S3 when the application version is deleted.
      */
    var deleteSourceFromS3: Boolean = js.native
    
    /**
      * The number of days to retain an application version.
      */
    var maxAgeInDays: Double = js.native
    
    /**
      * The maximum number of application versions to retain.
      */
    var maxCount: Double = js.native
    
    /**
      * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
      */
    var serviceRole: String = js.native
  }
  object GetApplicationAppversionLifecycle {
    
    @scala.inline
    def apply(deleteSourceFromS3: Boolean, maxAgeInDays: Double, maxCount: Double, serviceRole: String): GetApplicationAppversionLifecycle = {
      val __obj = js.Dynamic.literal(deleteSourceFromS3 = deleteSourceFromS3.asInstanceOf[js.Any], maxAgeInDays = maxAgeInDays.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApplicationAppversionLifecycle]
    }
    
    @scala.inline
    implicit class GetApplicationAppversionLifecycleMutableBuilder[Self <: GetApplicationAppversionLifecycle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteSourceFromS3(value: Boolean): Self = StObject.set(x, "deleteSourceFromS3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeInDays(value: Double): Self = StObject.set(x, "maxAgeInDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceRole(value: String): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    }
  }
}
