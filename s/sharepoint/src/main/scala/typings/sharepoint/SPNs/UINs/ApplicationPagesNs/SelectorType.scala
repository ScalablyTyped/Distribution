package typings.sharepoint.SPNs.UINs.ApplicationPagesNs

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
  
  /* 4 */ val event: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.SelectorType.event with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.SelectorType.none with Double = js.native
  /* 2 */ val people: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.SelectorType.people with Double = js.native
  /* 3 */ val people_And_Resource: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.SelectorType.people_And_Resource with Double = js.native
  /* 1 */ val resource: typings.sharepoint.SPNs.UINs.ApplicationPagesNs.SelectorType.resource with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectorType with Double] = js.native
}

