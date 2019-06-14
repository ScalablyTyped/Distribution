package typings
package sharepointLib.SPNs.UINs.ApplicationPagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectorType extends js.Object

@JSGlobal("SP.UI.ApplicationPages.SelectorType")
@js.native
object SelectorType extends js.Object {
  @js.native
  sealed trait event
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.SelectorType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.SelectorType
  
  @js.native
  sealed trait people
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.SelectorType
  
  @js.native
  sealed trait people_And_Resource
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.SelectorType
  
  @js.native
  sealed trait resource
    extends sharepointLib.SPNs.UINs.ApplicationPagesNs.SelectorType
  
  /* 4 */ val event: event with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val people: people with scala.Double = js.native
  /* 3 */ val people_And_Resource: people_And_Resource with scala.Double = js.native
  /* 1 */ val resource: resource with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UINs.ApplicationPagesNs.SelectorType with scala.Double] = js.native
}

