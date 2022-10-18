package typings.snyk

import typings.snyk.distLibEcosystemsTypesMod.Ecosystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsCommonMod {
  
  @JSImport("snyk/dist/lib/ecosystems/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUnmanagedEcosystem(ecosystem: Ecosystem): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnmanagedEcosystem")(ecosystem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
