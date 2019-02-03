package typings
package sassLib.sassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sass", "types")
@js.native
object typesNs extends js.Object {
  @js.native
  class Boolean[T /* <: scala.Boolean */] protected () extends SassType {
    def this(value: T) = this()
    def getValue(): T = js.native
  }
  
  @js.native
  class Color protected () extends SassType {
    def this(r: scala.Double, g: scala.Double, b: scala.Double) = this()
    def this(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double) = this()
    def getA(): scala.Double = js.native
    def getB(): scala.Double = js.native
    def getG(): scala.Double = js.native
    def getR(): scala.Double = js.native
    def setA(value: scala.Double): scala.Unit = js.native
    def setB(value: scala.Double): scala.Unit = js.native
    def setG(value: scala.Double): scala.Unit = js.native
    def setR(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  class List[T /* <: SassType */] protected () extends SassType {
    def this(length: scala.Double) = this()
    def this(length: scala.Double, commaSeparator: scala.Boolean) = this()
    def getLength(): scala.Double = js.native
    def getSeparator(): scala.Boolean = js.native
    def getValue(index: scala.Double): js.UndefOr[T] = js.native
    def setSeparator(isComma: scala.Boolean): scala.Unit = js.native
    def setValue(index: scala.Double, value: T): scala.Unit = js.native
  }
  
  @js.native
  class Map[K /* <: SassType */, V /* <: SassType */] protected () extends SassType {
    def this(length: scala.Double) = this()
    def getKey(index: scala.Double): K = js.native
    def getLength(): scala.Double = js.native
    def getValue(index: scala.Double): V = js.native
    def setKey(index: scala.Double, key: K): scala.Unit = js.native
    def setValue(index: scala.Double, value: V): scala.Unit = js.native
  }
  
  @js.native
  trait Null extends SassType {
    var NULL: Null = js.native
  }
  
  @js.native
  class Number protected () extends SassType {
    def this(value: scala.Double) = this()
    def this(value: scala.Double, unit: java.lang.String) = this()
    def getUnit(): java.lang.String = js.native
    def getValue(): scala.Double = js.native
    def setUnit(unit: java.lang.String): scala.Unit = js.native
    def setValue(value: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  abstract class SassType () extends js.Object
  
  @js.native
  class String protected () extends SassType {
    def this(value: java.lang.String) = this()
    def getValue(): java.lang.String = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
  }
  
  val Null: Null = js.native
  /* static members */
  @js.native
  object Boolean extends js.Object {
    val FALSE: sassLib.sassMod.typesNs.Boolean[sassLib.sassLibNumbers.`false`] = js.native
    val TRUE: sassLib.sassMod.typesNs.Boolean[sassLib.sassLibNumbers.`true`] = js.native
  }
  
}

