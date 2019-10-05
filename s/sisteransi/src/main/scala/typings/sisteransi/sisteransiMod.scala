package typings.sisteransi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sisteransi", JSImport.Namespace)
@js.native
object sisteransiMod extends js.Object {
  val beep: String = js.native
  val clear: String = js.native
  @js.native
  object cursor extends js.Object {
    val hide: String = js.native
    val left: String = js.native
    val restore: String = js.native
    val save: String = js.native
    val show: String = js.native
    def backward(count: Double): String = js.native
    def down(count: Double): String = js.native
    def forward(count: Double): String = js.native
    def move(x: Double, y: Double): String = js.native
    def nextLine(count: Double): String = js.native
    def prevLine(count: Double): String = js.native
    def to(x: Double, y: Double): String = js.native
    def up(count: Double): String = js.native
  }
  
  @js.native
  object erase extends js.Object {
    val line: String = js.native
    val lineEnd: String = js.native
    val lineStart: String = js.native
    val screen: String = js.native
    def down(count: Double): String = js.native
    def lines(count: Double): String = js.native
    def up(count: Double): String = js.native
  }
  
  @js.native
  object scroll extends js.Object {
    def down(count: Double): String = js.native
    def up(count: Double): String = js.native
  }
  
}

