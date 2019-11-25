package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseType extends js.Object {
  var BaseType: Double
  var DefaultItemOpen: Double
  var Direction: String
  var EnableVesioning: Boolean
  var Id: String
}

object Anon_BaseType {
  @scala.inline
  def apply(BaseType: Double, DefaultItemOpen: Double, Direction: String, EnableVesioning: Boolean, Id: String): Anon_BaseType = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], DefaultItemOpen = DefaultItemOpen.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], EnableVesioning = EnableVesioning.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BaseType]
  }
}

