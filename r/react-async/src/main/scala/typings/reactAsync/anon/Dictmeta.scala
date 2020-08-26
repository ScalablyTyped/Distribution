package typings.reactAsync.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictmeta
  extends /* prop */ StringDictionary[js.Any] {
  var counter: Double = js.native
}

object Dictmeta {
  @scala.inline
  def apply(counter: Double): Dictmeta = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictmeta]
  }
  @scala.inline
  implicit class DictmetaOps[Self <: Dictmeta] (val x: Self) extends AnyVal {
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
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
  }
  
}

