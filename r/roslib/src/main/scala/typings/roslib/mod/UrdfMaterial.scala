package typings.roslib.mod

import typings.roslib.anon.Xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "UrdfMaterial")
@js.native
class UrdfMaterial protected () extends js.Object {
  /**
    * A Material element in a URDF.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    */
  def this(options: Xml) = this()
  var color: UrdfColor | Null = js.native
  var name: String = js.native
  var textureFilename: String | Null = js.native
  def isLink(): Boolean = js.native
}

