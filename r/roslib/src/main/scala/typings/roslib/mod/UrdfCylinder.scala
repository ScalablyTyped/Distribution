package typings.roslib.mod

import typings.roslib.anon.Xml
import typings.roslib.roslibNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "UrdfCylinder")
@js.native
class UrdfCylinder protected () extends UrdfGeometry {
  /**
    * A Cylinder element in a URDF.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    */
  def this(options: Xml) = this()
  
  var length: Double = js.native
  
  var radius: Double = js.native
  
  var `type`: `2` = js.native
}
