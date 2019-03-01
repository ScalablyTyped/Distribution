package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Main extends js.Object {
  var main: scala.Boolean
  var routeTableAssociationId: java.lang.String
  var routeTableId: java.lang.String
  var subnetId: java.lang.String
}

object Anon_Main {
  @scala.inline
  def apply(
    main: scala.Boolean,
    routeTableAssociationId: java.lang.String,
    routeTableId: java.lang.String,
    subnetId: java.lang.String
  ): Anon_Main = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("main")(main)
    __obj.updateDynamic("routeTableAssociationId")(routeTableAssociationId)
    __obj.updateDynamic("routeTableId")(routeTableId)
    __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[Anon_Main]
  }
}

