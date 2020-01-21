package typings.samchonFramework.mod.protocol

import typings.std.Uint8Array
import typings.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol.InvokeParameter")
@js.native
/**
  * Default Constructor.
  */
class InvokeParameter ()
  extends typings.samchon.mod.protocol.InvokeParameter {
  def this(`val`: String) = this()
  def this(`val`: Boolean) = this()
  def this(`val`: Double) = this()
  def this(`val`: Uint8Array) = this()
  def this(`val`: XML) = this()
  def this(name: String, `val`: String) = this()
  /**
    * Construct from variable name and number value.
    *
    * @param name
    * @param val
    */
  def this(name: String, `val`: Boolean) = this()
  def this(name: String, `val`: Double) = this()
  def this(name: String, `val`: Uint8Array) = this()
  def this(name: String, `val`: XML) = this()
}

