package typings.roslib.mod

import typings.roslib.anon.Xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "UrdfVisual")
@js.native
class UrdfVisual protected () extends js.Object {
  /**
    * A Visual element in a URDF.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    */
  def this(options: Xml) = this()
  
  var geometry: UrdfGeometry | Null = js.native
  
  var material: UrdfMaterial | Null = js.native
  
  var origin: Pose | Null = js.native
}
