package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeartifact {
  
  trait RepositoryExternalConnections extends StObject {
    
    /**
      * The name of the external connection associated with a repository.
      */
    var externalConnectionName: Input[String]
    
    var packageFormat: js.UndefOr[Input[String]] = js.undefined
    
    var status: js.UndefOr[Input[String]] = js.undefined
  }
  object RepositoryExternalConnections {
    
    inline def apply(externalConnectionName: Input[String]): RepositoryExternalConnections = {
      val __obj = js.Dynamic.literal(externalConnectionName = externalConnectionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryExternalConnections]
    }
    
    extension [Self <: RepositoryExternalConnections](x: Self) {
      
      inline def setExternalConnectionName(value: Input[String]): Self = StObject.set(x, "externalConnectionName", value.asInstanceOf[js.Any])
      
      inline def setPackageFormat(value: Input[String]): Self = StObject.set(x, "packageFormat", value.asInstanceOf[js.Any])
      
      inline def setPackageFormatUndefined: Self = StObject.set(x, "packageFormat", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait RepositoryUpstream extends StObject {
    
    /**
      * The name of an upstream repository.
      */
    var repositoryName: Input[String]
  }
  object RepositoryUpstream {
    
    inline def apply(repositoryName: Input[String]): RepositoryUpstream = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryUpstream]
    }
    
    extension [Self <: RepositoryUpstream](x: Self) {
      
      inline def setRepositoryName(value: Input[String]): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
