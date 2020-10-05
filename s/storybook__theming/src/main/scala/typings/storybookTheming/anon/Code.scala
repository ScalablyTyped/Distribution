package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Code extends js.Object {
  var code: Double = js.native
  var l1: Double = js.native
  var l2: Double = js.native
  var l3: Double = js.native
  var m1: Double = js.native
  var m2: Double = js.native
  var m3: Double = js.native
  var s1: Double = js.native
  var s2: Double = js.native
  var s3: Double = js.native
}

object Code {
  @scala.inline
  def apply(
    code: Double,
    l1: Double,
    l2: Double,
    l3: Double,
    m1: Double,
    m2: Double,
    m3: Double,
    s1: Double,
    s2: Double,
    s3: Double
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], l1 = l1.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], l3 = l3.asInstanceOf[js.Any], m1 = m1.asInstanceOf[js.Any], m2 = m2.asInstanceOf[js.Any], m3 = m3.asInstanceOf[js.Any], s1 = s1.asInstanceOf[js.Any], s2 = s2.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setL1(value: Double): Self = this.set("l1", value.asInstanceOf[js.Any])
    @scala.inline
    def setL2(value: Double): Self = this.set("l2", value.asInstanceOf[js.Any])
    @scala.inline
    def setL3(value: Double): Self = this.set("l3", value.asInstanceOf[js.Any])
    @scala.inline
    def setM1(value: Double): Self = this.set("m1", value.asInstanceOf[js.Any])
    @scala.inline
    def setM2(value: Double): Self = this.set("m2", value.asInstanceOf[js.Any])
    @scala.inline
    def setM3(value: Double): Self = this.set("m3", value.asInstanceOf[js.Any])
    @scala.inline
    def setS1(value: Double): Self = this.set("s1", value.asInstanceOf[js.Any])
    @scala.inline
    def setS2(value: Double): Self = this.set("s2", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3(value: Double): Self = this.set("s3", value.asInstanceOf[js.Any])
  }
  
}

