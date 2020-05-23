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
  
}

