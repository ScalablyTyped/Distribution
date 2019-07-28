package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Main extends js.Object {
  var main: Boolean
  var routeTableAssociationId: String
  var routeTableId: String
  var subnetId: String
}

object Anon_Main {
  @scala.inline
  def apply(main: Boolean, routeTableAssociationId: String, routeTableId: String, subnetId: String): Anon_Main = {
    val __obj = js.Dynamic.literal(main = main, routeTableAssociationId = routeTableAssociationId, routeTableId = routeTableId, subnetId = subnetId)
  
    __obj.asInstanceOf[Anon_Main]
  }
}

