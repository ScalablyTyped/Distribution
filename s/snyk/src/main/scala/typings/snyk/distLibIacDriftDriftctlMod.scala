package typings.snyk

import typings.snyk.anon.DriftIgnore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIacDriftDriftctlMod {
  
  @JSImport("snyk/dist/lib/iac/drift/driftctl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DCTL_EXIT_CODES {
    
    @JSImport("snyk/dist/lib/iac/drift/driftctl", "DCTL_EXIT_CODES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/iac/drift/driftctl", "DCTL_EXIT_CODES.EXIT_ERROR")
    @js.native
    def EXIT_ERROR: Double = js.native
    inline def EXIT_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXIT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/iac/drift/driftctl", "DCTL_EXIT_CODES.EXIT_IN_SYNC")
    @js.native
    def EXIT_IN_SYNC: Double = js.native
    inline def EXIT_IN_SYNC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXIT_IN_SYNC")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/iac/drift/driftctl", "DCTL_EXIT_CODES.EXIT_NOT_IN_SYNC")
    @js.native
    def EXIT_NOT_IN_SYNC: Double = js.native
    inline def EXIT_NOT_IN_SYNC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXIT_NOT_IN_SYNC")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("snyk/dist/lib/iac/drift/driftctl", "driftctlVersion")
  @js.native
  val driftctlVersion: /* "v0.36.0" */ String = js.native
  
  inline def generateArgs(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftCTLOptions */ Any
  ): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateArgs")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def generateArgs(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftCTLOptions */ Any,
    driftIgnore: js.Array[String]
  ): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateArgs")(options.asInstanceOf[js.Any], driftIgnore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def runDriftCTL(hasOptionsDriftIgnoreInputStdio: DriftIgnore): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftctlExecutionResult */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("runDriftCTL")(hasOptionsDriftIgnoreInputStdio.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftctlExecutionResult */ Any
  ]]
  
  inline def translateExitCode(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("translateExitCode")().asInstanceOf[Double]
  inline def translateExitCode(exitCode: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("translateExitCode")(exitCode.asInstanceOf[js.Any]).asInstanceOf[Double]
}
