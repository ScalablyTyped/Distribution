package typings.roslib.mod

import typings.roslib.anon.Xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "UrdfColor")
@js.native
class UrdfColor protected () extends js.Object {
  /**
    * A Color element in a URDF.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    */
  def this(options: Xml) = this()
  
  var a: Double = js.native
  
  var b: Double = js.native
  
  var g: Double = js.native
  
  var r: Double = js.native
}
