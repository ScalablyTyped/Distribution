package typings.reactDates.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dates", "toMomentObject")
@js.native
object toMomentObject extends js.Object {
  
  def apply(dateString: MomentInput): Moment | Null = js.native
  def apply(dateString: MomentInput, customFormat: MomentFormatSpecification): Moment | Null = js.native
}
