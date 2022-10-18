package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIacDriftOutputMod {
  
  @JSImport("snyk/dist/lib/iac/drift/output", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHumanReadableAnalysis(
    option: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DescribeOptions */ Any,
    analysis: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftAnalysis */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHumanReadableAnalysis")(option.asInstanceOf[js.Any], analysis.asInstanceOf[js.Any])).asInstanceOf[String]
}
