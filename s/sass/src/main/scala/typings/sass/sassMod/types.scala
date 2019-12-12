package typings.sass.sassMod

import org.scalablytyped.runtime.TopLevel
import typings.sass.sassMod.types.Boolean
import typings.sass.sassMod.types.Null
import typings.sass.sassMod.types.SassType
import typings.sass.sassNumbers.`false`
import typings.sass.sassNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sass", "types")
@js.native
object types extends js.Object {
  @js.native
  class Boolean[T /* <: scala.Boolean */] protected () extends SassType {
    def this(value: T) = this()
    def getValue(): T = js.native
  }
  
  @js.native
  class Color protected () extends SassType {
    def this(r: Double, g: Double, b: Double) = this()
    def this(r: Double, g: Double, b: Double, a: Double) = this()
    def getA(): Double = js.native
    def getB(): Double = js.native
    def getG(): Double = js.native
    def getR(): Double = js.native
    def setA(value: Double): Unit = js.native
    def setB(value: Double): Unit = js.native
    def setG(value: Double): Unit = js.native
    def setR(value: Double): Unit = js.native
  }
  
  @js.native
  class List[T /* <: SassType */] protected () extends SassType {
    def this(length: Double) = this()
    def this(length: Double, commaSeparator: scala.Boolean) = this()
    def getLength(): Double = js.native
    def getSeparator(): scala.Boolean = js.native
    def getValue(index: Double): js.UndefOr[T] = js.native
    def setSeparator(isComma: scala.Boolean): Unit = js.native
    def setValue(index: Double, value: T): Unit = js.native
  }
  
  @js.native
  class Map[K /* <: SassType */, V /* <: SassType */] protected () extends SassType {
    def this(length: Double) = this()
    def getKey(index: Double): K = js.native
    def getLength(): Double = js.native
    def getValue(index: Double): V = js.native
    def setKey(index: Double, key: K): Unit = js.native
    def setValue(index: Double, value: V): Unit = js.native
  }
  
  @js.native
  trait Null extends SassType {
    var NULL: Null = js.native
  }
  
  @js.native
  class Number protected () extends SassType {
    def this(value: Double) = this()
    def this(value: Double, unit: java.lang.String) = this()
    def getUnit(): java.lang.String = js.native
    def getValue(): Double = js.native
    def setUnit(unit: java.lang.String): Unit = js.native
    def setValue(value: Double): Unit = js.native
  }
  
  @js.native
  abstract class SassType () extends js.Object
  
  @js.native
  class String protected () extends SassType {
    def this(value: java.lang.String) = this()
    def getValue(): java.lang.String = js.native
    def setValue(value: java.lang.String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Boolean extends js.Object {
    val FALSE: Boolean[`false`] = js.native
    val TRUE: Boolean[`true`] = js.native
  }
  
  @js.native
  object Null extends TopLevel[Null]
  
}

