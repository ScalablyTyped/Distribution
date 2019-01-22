package typings
package samchonLib.protocolInvokeInvokeParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/invoke/InvokeParameter", "InvokeParameter")
@js.native
/**
  * Default Constructor.
  */
class InvokeParameter ()
  extends samchonLib.protocolEntityEntityMod.Entity {
  def this(`val`: java.lang.String) = this()
  def this(`val`: scala.Boolean) = this()
  def this(`val`: scala.Double) = this()
  def this(`val`: stdLib.Uint8Array) = this()
  def this(`val`: sxmlLib.sxmlMod.XML) = this()
  def this(name: java.lang.String, `val`: java.lang.String) = this()
  /**
    * Construct from variable name and number value.
    *
    * @param name
    * @param val
    */
  def this(name: java.lang.String, `val`: scala.Boolean) = this()
  def this(name: java.lang.String, `val`: scala.Double) = this()
  def this(name: java.lang.String, `val`: stdLib.Uint8Array) = this()
  def this(name: java.lang.String, `val`: sxmlLib.sxmlMod.XML) = this()
  /**
    * Name of the parameter.
    *
    * @details Optional property, can be omitted.
    */
  var name: java.lang.String = js.native
  /**
    * Type of the parameter.
    */
  var `type`: java.lang.String = js.native
  /**
    * Value of the parameter.
    */
  var value: scala.Boolean | scala.Double | java.lang.String | sxmlLib.sxmlMod.XML | stdLib.Uint8Array = js.native
  /**
    * Get name.
    */
  def getName(): java.lang.String = js.native
  /**
    * Get type.
    */
  def getType(): java.lang.String = js.native
  /**
    * Get value.
    */
  def getValue(): js.Any = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def setValue(value: scala.Boolean): scala.Unit = js.native
  def setValue(value: scala.Double): scala.Unit = js.native
  def setValue(value: stdLib.Uint8Array): scala.Unit = js.native
  def setValue(value: sxmlLib.sxmlMod.XML): scala.Unit = js.native
}

