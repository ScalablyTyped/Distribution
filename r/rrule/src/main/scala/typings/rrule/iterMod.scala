package typings.rrule

import typings.rrule.iterresultMod.default
import typings.rrule.typesMod.IterResultType
import typings.rrule.typesMod.ParsedOptions
import typings.rrule.typesMod.QueryMethodTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterMod {
  
  @JSImport("rrule/dist/esm/src/iter", "iter")
  @js.native
  def iter[M /* <: QueryMethodTypes */](iterResult: default[M], options: ParsedOptions): IterResultType[M] = js.native
}
