package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/ts3.9/_modules/@types-prettier-index", "AstPath")
@js.native
open class AstPath[T] protected () extends StObject {
  def this(value: T) = this()
  
  def call[U](callback: js.Function1[/* path */ this.type, U], names: PropertyKey*): U = js.native
  
  def callParent[U](callback: js.Function1[/* path */ this.type, U]): U = js.native
  def callParent[U](callback: js.Function1[/* path */ this.type, U], count: Double): U = js.native
  
  def each(
    callback: js.Function3[/* path */ this.type, /* index */ Double, /* value */ Any, Unit],
    names: PropertyKey*
  ): Unit = js.native
  
  def getName(): PropertyKey | Null = js.native
  
  def getNode(): T | Null = js.native
  def getNode(count: Double): T | Null = js.native
  
  def getParentNode(): T | Null = js.native
  def getParentNode(count: Double): T | Null = js.native
  
  def getValue(): T = js.native
  
  def map[U](
    callback: js.Function3[/* path */ this.type, /* index */ Double, /* value */ Any, U],
    names: PropertyKey*
  ): js.Array[U] = js.native
  
  def `match`(
    predicates: (js.Function3[/* node */ Any, /* name */ String | Null, /* number */ Double | Null, Boolean])*
  ): Boolean = js.native
  
  var stack: js.Array[T] = js.native
}
