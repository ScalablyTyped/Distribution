package typings.roslib.mod

import typings.roslib.anon.Xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "UrdfJoint")
@js.native
class UrdfJoint protected () extends js.Object {
  /**
    * A Joint element in a URDF.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    */
  def this(options: Xml) = this()
  
  var child: String | Null = js.native
  
  var maxval: Double | Null = js.native
  
  var minval: Double | Null = js.native
  
  var name: String = js.native
  
  var parent: String | Null = js.native
  
  var `type`: String = js.native
}
