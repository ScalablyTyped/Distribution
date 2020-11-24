package typings.regeneratorRuntime.mod

import typings.std.GeneratorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regenerator-runtime", "mark")
@js.native
object mark extends js.Object {
  
  def apply[F /* <: js.Function */](genFun: F): F with GeneratorFunction = js.native
}
