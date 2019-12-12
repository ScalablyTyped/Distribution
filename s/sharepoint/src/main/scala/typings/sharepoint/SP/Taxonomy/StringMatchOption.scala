package typings.sharepoint.SP.Taxonomy

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Taxonomy.StringMatchOption.exactMatch
import typings.sharepoint.SP.Taxonomy.StringMatchOption.startsWith
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StringMatchOption with Double] = js.native
  /* 1 */ @js.native
  object exactMatch extends TopLevel[exactMatch with Double]
  
  /* 0 */ @js.native
  object startsWith extends TopLevel[startsWith with Double]
  
}

