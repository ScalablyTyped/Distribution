package typings.roslib.mod

import typings.roslib.anon.String
import typings.roslib.anon.StringString
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "UrdfModel")
@js.native
class UrdfModel protected () extends js.Object {
  /**
    * A URDF Model can be used to parse a given URDF into the appropriate elements.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    *  * string - the XML element to parse as a string
    */
  def this(options: String) = this()
  def this(options: StringString) = this()
  
  var joints: Record[java.lang.String, UrdfJoint] = js.native
  
  var links: Record[java.lang.String, UrdfLink] = js.native
  
  var materials: Record[java.lang.String, UrdfMaterial] = js.native
}
