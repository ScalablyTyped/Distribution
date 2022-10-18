package typings.random

import typings.random.distCjsRandomMod.Random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsDistributionsUniformBooleanMod {
  
  @JSImport("random/dist/cjs/distributions/uniform-boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(random: Random): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(random.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Boolean]]
}
