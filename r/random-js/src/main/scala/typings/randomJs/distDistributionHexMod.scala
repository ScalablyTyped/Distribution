package typings.randomJs

import typings.randomJs.distTypesMod.StringDistribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistributionHexMod {
  
  @JSImport("random-js/dist/distribution/hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hex(): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")().asInstanceOf[StringDistribution]
  inline def hex(uppercase: Boolean): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(uppercase.asInstanceOf[js.Any]).asInstanceOf[StringDistribution]
}
