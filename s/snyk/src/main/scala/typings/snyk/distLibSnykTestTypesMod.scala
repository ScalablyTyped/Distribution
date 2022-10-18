package typings.snyk

import typings.snyk.anon.Authorization
import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibProjectMetadataTypesMod.ContainerTarget
import typings.snyk.distLibProjectMetadataTypesMod.GitTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSnykTestTypesMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify legacyApi.DepTree * / any */ trait DepTreeFromResolveDeps extends StObject {
    
    var numDependencies: Double
    
    var pluck: Any
  }
  object DepTreeFromResolveDeps {
    
    inline def apply(numDependencies: Double, pluck: Any): DepTreeFromResolveDeps = {
      val __obj = js.Dynamic.literal(numDependencies = numDependencies.asInstanceOf[js.Any], pluck = pluck.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepTreeFromResolveDeps]
    }
    
    extension [Self <: DepTreeFromResolveDeps](x: Self) {
      
      inline def setNumDependencies(value: Double): Self = StObject.set(x, "numDependencies", value.asInstanceOf[js.Any])
      
      inline def setPluck(value: Any): Self = StObject.set(x, "pluck", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload extends StObject {
    
    var body: js.UndefOr[PayloadBody | TestDependenciesRequest] = js.undefined
    
    var headers: Authorization
    
    var json: Boolean
    
    var method: String
    
    var modules: js.UndefOr[DepTreeFromResolveDeps] = js.undefined
    
    var qs: js.UndefOr[js.Object | Null] = js.undefined
    
    var url: String
  }
  object Payload {
    
    inline def apply(headers: Authorization, json: Boolean, method: String, url: String): Payload = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setBody(value: PayloadBody | TestDependenciesRequest): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Authorization): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setModules(value: DepTreeFromResolveDeps): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsNull: Self = StObject.set(x, "qs", null)
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PayloadBody extends StObject {
    
    var callGraph: js.UndefOr[Any] = js.undefined
    
    var depGraph: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraph */ Any
      ] = js.undefined
    
    var displayTargetFile: js.UndefOr[String] = js.undefined
    
    var docker: js.UndefOr[Any] = js.undefined
    
    var foundProjectCount: js.UndefOr[Double] = js.undefined
    
    var hasDevDependencies: js.UndefOr[Boolean] = js.undefined
    
    var originalProjectName: js.UndefOr[String] = js.undefined
    
    var policy: js.UndefOr[String] = js.undefined
    
    var projectNameOverride: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[GitTarget | ContainerTarget | Null] = js.undefined
    
    var targetFile: js.UndefOr[String] = js.undefined
    
    var targetFileRelativePath: js.UndefOr[String] = js.undefined
    
    var targetReference: js.UndefOr[String] = js.undefined
  }
  object PayloadBody {
    
    inline def apply(): PayloadBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayloadBody]
    }
    
    extension [Self <: PayloadBody](x: Self) {
      
      inline def setCallGraph(value: Any): Self = StObject.set(x, "callGraph", value.asInstanceOf[js.Any])
      
      inline def setCallGraphUndefined: Self = StObject.set(x, "callGraph", js.undefined)
      
      inline def setDepGraph(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraph */ Any
      ): Self = StObject.set(x, "depGraph", value.asInstanceOf[js.Any])
      
      inline def setDepGraphUndefined: Self = StObject.set(x, "depGraph", js.undefined)
      
      inline def setDisplayTargetFile(value: String): Self = StObject.set(x, "displayTargetFile", value.asInstanceOf[js.Any])
      
      inline def setDisplayTargetFileUndefined: Self = StObject.set(x, "displayTargetFile", js.undefined)
      
      inline def setDocker(value: Any): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
      
      inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
      
      inline def setFoundProjectCount(value: Double): Self = StObject.set(x, "foundProjectCount", value.asInstanceOf[js.Any])
      
      inline def setFoundProjectCountUndefined: Self = StObject.set(x, "foundProjectCount", js.undefined)
      
      inline def setHasDevDependencies(value: Boolean): Self = StObject.set(x, "hasDevDependencies", value.asInstanceOf[js.Any])
      
      inline def setHasDevDependenciesUndefined: Self = StObject.set(x, "hasDevDependencies", js.undefined)
      
      inline def setOriginalProjectName(value: String): Self = StObject.set(x, "originalProjectName", value.asInstanceOf[js.Any])
      
      inline def setOriginalProjectNameUndefined: Self = StObject.set(x, "originalProjectName", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setProjectNameOverride(value: String): Self = StObject.set(x, "projectNameOverride", value.asInstanceOf[js.Any])
      
      inline def setProjectNameOverrideUndefined: Self = StObject.set(x, "projectNameOverride", js.undefined)
      
      inline def setTarget(value: GitTarget | ContainerTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
      
      inline def setTargetFileRelativePath(value: String): Self = StObject.set(x, "targetFileRelativePath", value.asInstanceOf[js.Any])
      
      inline def setTargetFileRelativePathUndefined: Self = StObject.set(x, "targetFileRelativePath", js.undefined)
      
      inline def setTargetFileUndefined: Self = StObject.set(x, "targetFile", js.undefined)
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetReference(value: String): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
      
      inline def setTargetReferenceUndefined: Self = StObject.set(x, "targetReference", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait TestDependenciesRequest extends StObject {
    
    var scanResult: ScanResult
  }
  object TestDependenciesRequest {
    
    inline def apply(scanResult: ScanResult): TestDependenciesRequest = {
      val __obj = js.Dynamic.literal(scanResult = scanResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestDependenciesRequest]
    }
    
    extension [Self <: TestDependenciesRequest](x: Self) {
      
      inline def setScanResult(value: ScanResult): Self = StObject.set(x, "scanResult", value.asInstanceOf[js.Any])
    }
  }
}
