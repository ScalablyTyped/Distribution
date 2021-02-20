package typings.sharepoint.SP.Taxonomy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StringMatchOption extends StObject
@JSGlobal("SP.Taxonomy.StringMatchOption")
@js.native
object StringMatchOption extends StObject {
  
  @js.native
  sealed trait exactMatch extends StringMatchOption
  
  @js.native
  sealed trait startsWith extends StringMatchOption
}
