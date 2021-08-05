package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeartifact {
  
  trait RepositoryExternalConnections extends StObject {
    
    /**
      * The name of the external connection associated with a repository.
      */
    var externalConnectionName: String
    
    var packageFormat: String
    
    var status: String
  }
  object RepositoryExternalConnections {
    
    inline def apply(externalConnectionName: String, packageFormat: String, status: String): RepositoryExternalConnections = {
      val __obj = js.Dynamic.literal(externalConnectionName = externalConnectionName.asInstanceOf[js.Any], packageFormat = packageFormat.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryExternalConnections]
    }
    
    extension [Self <: RepositoryExternalConnections](x: Self) {
      
      inline def setExternalConnectionName(value: String): Self = StObject.set(x, "externalConnectionName", value.asInstanceOf[js.Any])
      
      inline def setPackageFormat(value: String): Self = StObject.set(x, "packageFormat", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryUpstream extends StObject {
    
    /**
      * The name of an upstream repository.
      */
    var repositoryName: String
  }
  object RepositoryUpstream {
    
    inline def apply(repositoryName: String): RepositoryUpstream = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryUpstream]
    }
    
    extension [Self <: RepositoryUpstream](x: Self) {
      
      inline def setRepositoryName(value: String): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
