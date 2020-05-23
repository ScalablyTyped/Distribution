package typings.reactAsync.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictmeta
  extends /* prop */ StringDictionary[js.Any] {
  var counter: Double
}

object Dictmeta {
  @scala.inline
  def apply(counter: Double, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictmeta = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictmeta]
  }
}

