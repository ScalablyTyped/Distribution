package typings.reactNativeCanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
}

object A {
  @scala.inline
  def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  @scala.inline
  implicit class AOps[Self <: A] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setC(value: Double): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(value: Double): Self = this.set("f", value.asInstanceOf[js.Any])
  }
  
}

