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
  
  val event: event with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val people: people with java.lang.String = js.native
  val people_And_Resource: people_And_Resource with java.lang.String = js.native
  val resource: resource with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UINs.ApplicationPagesNs.SelectorType with java.lang.String] = js.native
}

