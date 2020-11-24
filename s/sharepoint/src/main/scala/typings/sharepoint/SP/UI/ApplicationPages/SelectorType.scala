package typings.sharepoint.SP.UI.ApplicationPages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
