package typings.roslib.mod

import typings.roslib.anon.Xml
import typings.roslib.roslibNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "UrdfSphere")
@js.native
class UrdfSphere protected () extends UrdfGeometry {
  /**
    * A Sphere element in a URDF.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    */
  def this(options: Xml) = this()
  
  var radius: Double = js.native
  
  var `type`: `0` = js.native
}
