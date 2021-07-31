package typings.randomJs

import typings.randomJs.typesMod.StringDistribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexMod {
  
  @JSImport("random-js/dist/distribution/hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hex(): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")().asInstanceOf[StringDistribution]
  @scala.inline
  def hex(uppercase: Boolean): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(uppercase.asInstanceOf[js.Any]).asInstanceOf[StringDistribution]
}
