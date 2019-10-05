package typings.sharepoint.SP.Taxonomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StringMatchOption extends js.Object

@JSGlobal("SP.Taxonomy.StringMatchOption")
@js.native
object StringMatchOption extends js.Object {
  @js.native
  sealed trait exactMatch extends StringMatchOption
  
  @js.native
  sealed trait startsWith extends StringMatchOption
  
  /* 1 */ val exactMatch: typings.sharepoint.SP.Taxonomy.StringMatchOption.exactMatch with Double = js.native
  /* 0 */ val startsWith: typings.sharepoint.SP.Taxonomy.StringMatchOption.startsWith with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StringMatchOption with Double] = js.native
}

