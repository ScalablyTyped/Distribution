package typings.sharepoint.SP.UI.ApplicationPages

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectorType extends js.Object

@JSGlobal("SP.UI.ApplicationPages.SelectorType")
@js.native
object SelectorType extends js.Object {
  @js.native
  sealed trait event extends SelectorType
  
  @js.native
  sealed trait none extends SelectorType
  
  @js.native
  sealed trait people extends SelectorType
  
  @js.native
  sealed trait people_And_Resource extends SelectorType
  
  @js.native
  sealed trait resource extends SelectorType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectorType with Double] = js.native
  /* 4 */ @js.native
  object event extends TopLevel[event with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object people extends TopLevel[people with Double]
  
  /* 3 */ @js.native
  object people_And_Resource extends TopLevel[people_And_Resource with Double]
  
  /* 1 */ @js.native
  object resource extends TopLevel[resource with Double]
  
}

