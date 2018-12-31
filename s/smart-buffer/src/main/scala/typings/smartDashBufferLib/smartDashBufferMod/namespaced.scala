package typings
package smartDashBufferLib.smartDashBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smart-buffer", JSImport.Namespace)
@js.native
/**
  * Creates a new SmartBuffer instance (defaults to utf8 encoding)
  */
class namespaced () extends SmartBuffer {
  /**
    * Creates a new SmartBuffer instance
    *
    * @param arg1 { Buffer } An existing buffer instance to copy to this smart buffer instance
    * @param arg2 { String } The string encoding to use for reading/writing strings (defaults to utf8)
    */
  def this(buffer: nodeLib.Buffer) = this()
  def this(encoding: java.lang.String) = this()
  /**
    * Creates a new SmartBuffer instance
    *
    * @param arg1 { Number } The size the underlying buffer instance should be instantiated to (defaults to 4096)
    * @param arg2 { String } The string encoding to use for reading/writing strings (defaults to utf8)
    */
  def this(size: scala.Double) = this()
  def this(buffer: nodeLib.Buffer, encoding: java.lang.String) = this()
  def this(size: scala.Double, encoding: java.lang.String) = this()
}

