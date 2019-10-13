package typings.atStorybookClientDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Kind extends js.Object {
  var kind: String
  var stories: js.Array[_]
}

object Anon_Kind {
  @scala.inline
  def apply(kind: String, stories: js.Array[_]): Anon_Kind = {
    val __obj = js.Dynamic.literal(kind = kind, stories = stories)
  
    __obj.asInstanceOf[Anon_Kind]
  }
}

