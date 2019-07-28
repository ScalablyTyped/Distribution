package typings.atStorybookAddons.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var kind: String
  var story: String
}

object Context {
  @scala.inline
  def apply(kind: String, story: String): Context = {
    val __obj = js.Dynamic.literal(kind = kind, story = story)
  
    __obj.asInstanceOf[Context]
  }
}

