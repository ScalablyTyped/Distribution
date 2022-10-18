package typings.snyk

import typings.snyk.anon.PartialOptionsTestOptionsAdvertiseSubprojectsCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIsMultiProjectScanMod {
  
  @JSImport("snyk/dist/lib/is-multi-project-scan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMultiProjectScan(options: PartialOptionsTestOptionsAdvertiseSubprojectsCount): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiProjectScan")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
