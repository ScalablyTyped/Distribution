package typings.sentryTypes

import typings.sentryTypes.packageMod.Package
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkinfoMod {
  
  trait SdkInfo extends StObject {
    
    var integrations: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var packages: js.UndefOr[js.Array[Package]] = js.undefined
    
    var version: String
  }
  object SdkInfo {
    
    @scala.inline
    def apply(name: String, version: String): SdkInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SdkInfo]
    }
    
    @scala.inline
    implicit class SdkInfoMutableBuilder[Self <: SdkInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntegrations(value: js.Array[String]): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      @scala.inline
      def setIntegrationsVarargs(value: String*): Self = StObject.set(x, "integrations", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackages(value: js.Array[Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      @scala.inline
      def setPackagesVarargs(value: Package*): Self = StObject.set(x, "packages", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
