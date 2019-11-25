package typings.reactDashNativeDashNavigation

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElementId extends js.Object {
  var elementId: Validator[String]
  var resizeMode: Requireable[String]
}

object Anon_ElementId {
  @scala.inline
  def apply(elementId: Validator[String], resizeMode: Requireable[String]): Anon_ElementId = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ElementId]
  }
}

