package typings
package sisteransiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sisteransi", JSImport.Namespace)
@js.native
object sisteransiMod extends js.Object {
  val beep: java.lang.String = js.native
  val clear: java.lang.String = js.native
  @JSName("cursor")
  @js.native
  object cursorNs extends js.Object {
    val hide: java.lang.String = js.native
    val left: java.lang.String = js.native
    val restore: java.lang.String = js.native
    val save: java.lang.String = js.native
    val show: java.lang.String = js.native
    def backward(count: scala.Double): java.lang.String = js.native
    def down(count: scala.Double): java.lang.String = js.native
    def forward(count: scala.Double): java.lang.String = js.native
    def move(x: scala.Double, y: scala.Double): java.lang.String = js.native
    def nextLine(count: scala.Double): java.lang.String = js.native
    def prevLine(count: scala.Double): java.lang.String = js.native
    def to(x: scala.Double, y: scala.Double): java.lang.String = js.native
    def up(count: scala.Double): java.lang.String = js.native
  }
  
  @JSName("erase")
  @js.native
  object eraseNs extends js.Object {
    val line: java.lang.String = js.native
    val lineEnd: java.lang.String = js.native
    val lineStart: java.lang.String = js.native
    val screen: java.lang.String = js.native
    def down(count: scala.Double): java.lang.String = js.native
    def lines(count: scala.Double): java.lang.String = js.native
    def up(count: scala.Double): java.lang.String = js.native
  }
  
  @JSName("scroll")
  @js.native
  object scrollNs extends js.Object {
    def down(count: scala.Double): java.lang.String = js.native
    def up(count: scala.Double): java.lang.String = js.native
  }
  
}

