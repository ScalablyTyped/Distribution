package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeartifact {
  
  @js.native
  trait RepositoryExternalConnections extends StObject {
    
    /**
      * The name of the external connection associated with a repository.
      */
    var externalConnectionName: String = js.native
    
    var packageFormat: String = js.native
    
    var status: String = js.native
  }
  object RepositoryExternalConnections {
    
    @scala.inline
    def apply(externalConnectionName: String, packageFormat: String, status: String): RepositoryExternalConnections = {
      val __obj = js.Dynamic.literal(externalConnectionName = externalConnectionName.asInstanceOf[js.Any], packageFormat = packageFormat.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryExternalConnections]
    }
    
    @scala.inline
    implicit class RepositoryExternalConnectionsMutableBuilder[Self <: RepositoryExternalConnections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternalConnectionName(value: String): Self = StObject.set(x, "externalConnectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageFormat(value: String): Self = StObject.set(x, "packageFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RepositoryUpstream extends StObject {
    
    /**
      * The name of an upstream repository.
      */
    var repositoryName: String = js.native
  }
  object RepositoryUpstream {
    
    @scala.inline
    def apply(repositoryName: String): RepositoryUpstream = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryUpstream]
    }
    
    @scala.inline
    implicit class RepositoryUpstreamMutableBuilder[Self <: RepositoryUpstream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
