package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AddScope Options for Model.addScope
  */
trait AddScopeOptions extends js.Object {
  /**
    * If a scope of the same name already exists, should it be overwritten?
    */
  var `override`: Boolean
}

object AddScopeOptions {
  @scala.inline
  def apply(`override`: Boolean): AddScopeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScopeOptions]
  }
}

