package typings.reactVis.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var source: Double | StringDictionary[js.Any]
  var target: Double | StringDictionary[js.Any]
}

object Source {
  @scala.inline
  def apply(source: Double | StringDictionary[js.Any], target: Double | StringDictionary[js.Any]): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

