package typings.snyk

import typings.snyk.distLibEcosystemsTypesMod.Ecosystem
import typings.snyk.distLibSnykTestTypesMod.Payload
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.PolicyOptions
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSnykTestAssemblePayloadsMod {
  
  @JSImport("snyk/dist/lib/snyk-test/assemble-payloads", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleEcosystemPayloads(ecosystem: Ecosystem, options: Options & TestOptions & PolicyOptions): js.Promise[js.Array[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleEcosystemPayloads")(ecosystem.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Payload]]]
}
