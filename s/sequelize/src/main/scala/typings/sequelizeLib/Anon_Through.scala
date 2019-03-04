package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Through[TJoinTableAttributes] extends js.Object {
  var through: TJoinTableAttributes
}

object Anon_Through {
  @scala.inline
  def apply[TJoinTableAttributes](through: TJoinTableAttributes): Anon_Through[TJoinTableAttributes] = {
    val __obj = js.Dynamic.literal(through = through.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Through[TJoinTableAttributes]]
  }
}

