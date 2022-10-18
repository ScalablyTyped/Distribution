package typings.snyk

import typings.snyk.distLibPolicyFindAndLoadPolicyMod.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIacDriftMod {
  
  @JSImport("snyk/dist/lib/iac/drift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/iac/drift", "DescribeExclusiveArgs")
  @js.native
  val DescribeExclusiveArgs: js.Array[String] = js.native
  
  @JSImport("snyk/dist/lib/iac/drift", "DescribeRequiredArgs")
  @js.native
  val DescribeRequiredArgs: js.Array[String] = js.native
  
  inline def driftignoreFromPolicy(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("driftignoreFromPolicy")().asInstanceOf[js.Array[String]]
  inline def driftignoreFromPolicy(policy: Policy): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("driftignoreFromPolicy")(policy.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def parseDriftAnalysisResults(input: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDriftAnalysisResults")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def processAnalysis(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DescribeOptions */ Any,
    describe: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftctlExecutionResult */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processAnalysis")(options.asInstanceOf[js.Any], describe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def processHTMLOutput(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DescribeOptions */ Any,
    stdout: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processHTMLOutput")(options.asInstanceOf[js.Any], stdout.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def updateExcludeInPolicy(
    policy: Policy,
    analysis: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftAnalysis */ Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GenDriftIgnoreOptions */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateExcludeInPolicy")(policy.asInstanceOf[js.Any], analysis.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateArgs(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftCTLOptions */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateArgs")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
