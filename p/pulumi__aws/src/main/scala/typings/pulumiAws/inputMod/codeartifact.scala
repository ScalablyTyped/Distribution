package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
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
    var externalConnectionName: Input[String] = js.native
    
    var packageFormat: js.UndefOr[Input[String]] = js.native
    
    var status: js.UndefOr[Input[String]] = js.native
  }
  object RepositoryExternalConnections {
    
    @scala.inline
    def apply(externalConnectionName: Input[String]): RepositoryExternalConnections = {
      val __obj = js.Dynamic.literal(externalConnectionName = externalConnectionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryExternalConnections]
    }
    
    @scala.inline
    implicit class RepositoryExternalConnectionsMutableBuilder[Self <: RepositoryExternalConnections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternalConnectionName(value: Input[String]): Self = StObject.set(x, "externalConnectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageFormat(value: Input[String]): Self = StObject.set(x, "packageFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageFormatUndefined: Self = StObject.set(x, "packageFormat", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait RepositoryUpstream extends StObject {
    
    /**
      * The name of an upstream repository.
      */
    var repositoryName: Input[String] = js.native
  }
  object RepositoryUpstream {
    
    @scala.inline
    def apply(repositoryName: Input[String]): RepositoryUpstream = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryUpstream]
    }
    
    @scala.inline
    implicit class RepositoryUpstreamMutableBuilder[Self <: RepositoryUpstream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepositoryName(value: Input[String]): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    }
  }
}
