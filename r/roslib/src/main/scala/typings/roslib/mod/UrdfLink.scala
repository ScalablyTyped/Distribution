package typings.roslib.mod

import typings.roslib.anon.Xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "UrdfLink")
@js.native
class UrdfLink protected () extends js.Object {
  /**
    * A Link element in a URDF.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    */
  def this(options: Xml) = this()
  var name: String = js.native
  var visuals: js.Array[UrdfVisual] = js.native
}

