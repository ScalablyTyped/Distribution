package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attr extends Node {
  val localName: java.lang.String = js.native
  val name: java.lang.String = js.native
  val ownerElement: Element | scala.Null = js.native
  val prefix: java.lang.String | scala.Null = js.native
  val specified: scala.Boolean = js.native
  var value: java.lang.String = js.native
}

@JSGlobal("Attr")
@js.native
object Attr
  extends org.scalablytyped.runtime.Instantiable0[Attr]

