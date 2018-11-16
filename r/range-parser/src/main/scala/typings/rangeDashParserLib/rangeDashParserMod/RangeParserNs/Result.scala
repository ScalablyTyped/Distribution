package typings
package rangeDashParserLib.rangeDashParserMod.RangeParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Result extends js.Object

@JSImport("range-parser/RangeParser", "Result")
@js.native
object Result extends js.Object {
  @js.native
  sealed trait invaild
    extends rangeDashParserLib.rangeDashParserMod.RangeParserNs.Result
  
  @js.native
  sealed trait unsatisifiable
    extends rangeDashParserLib.rangeDashParserMod.RangeParserNs.Result
  
}

