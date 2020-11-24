package typings.reactSpringShared.anon

import typings.allocTypes.mod.OneOrMore
import typings.fluids.mod.FluidValue
import typings.reactSpringShared.typesMod.InterpolatorArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[In, Out](source: OneOrMore[FluidValue[_, _]], args: InterpolatorArgs[In, Out]): FluidValue[Out, _] = js.native
}
