package typings.rrule

import typings.rrule.iterresultMod.default
import typings.rrule.typesMod.IterResultType
import typings.rrule.typesMod.ParsedOptions
import typings.rrule.typesMod.QueryMethodTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule/dist/esm/src/iter", JSImport.Namespace)
@js.native
object iterMod extends js.Object {
  
  def iter[M /* <: QueryMethodTypes */](iterResult: default[M], options: ParsedOptions): IterResultType[M] = js.native
}
