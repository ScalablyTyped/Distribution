package typings.proj4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceProjection extends js.Object {
  var b: Double = js.native
  var datum: String = js.native
  var e: Double = js.native
  var ep2: Double = js.native
  var es: Double = js.native
  var rf: Double = js.native
  var sphere: Double = js.native
  def forward(coordinates: TemplateCoordinates): js.Array[Double] = js.native
  def inverse(coordinates: TemplateCoordinates): js.Array[Double] = js.native
}

object InterfaceProjection {
  @scala.inline
  def apply(
    b: Double,
    datum: String,
    e: Double,
    ep2: Double,
    es: Double,
    forward: TemplateCoordinates => js.Array[Double],
    inverse: TemplateCoordinates => js.Array[Double],
    rf: Double,
    sphere: Double
  ): InterfaceProjection = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], ep2 = ep2.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any], forward = js.Any.fromFunction1(forward), inverse = js.Any.fromFunction1(inverse), rf = rf.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceProjection]
  }
  @scala.inline
  implicit class InterfaceProjectionOps[Self <: InterfaceProjection] (val x: Self) extends AnyVal {
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
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatum(value: String): Self = this.set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setEp2(value: Double): Self = this.set("ep2", value.asInstanceOf[js.Any])
    @scala.inline
    def setEs(value: Double): Self = this.set("es", value.asInstanceOf[js.Any])
    @scala.inline
    def setForward(value: TemplateCoordinates => js.Array[Double]): Self = this.set("forward", js.Any.fromFunction1(value))
    @scala.inline
    def setInverse(value: TemplateCoordinates => js.Array[Double]): Self = this.set("inverse", js.Any.fromFunction1(value))
    @scala.inline
    def setRf(value: Double): Self = this.set("rf", value.asInstanceOf[js.Any])
    @scala.inline
    def setSphere(value: Double): Self = this.set("sphere", value.asInstanceOf[js.Any])
  }
  
}

