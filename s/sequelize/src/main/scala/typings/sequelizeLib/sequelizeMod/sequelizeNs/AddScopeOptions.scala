package typings
package sequelizeLib.sequelizeMod.sequelizeNs

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
  var `override`: scala.Boolean
}

object AddScopeOptions {
  @scala.inline
  def apply(`override`: scala.Boolean): AddScopeOptions = {
    val __obj = js.Dynamic.literal(`override` = `override`)
  
    __obj.asInstanceOf[AddScopeOptions]
  }
}

