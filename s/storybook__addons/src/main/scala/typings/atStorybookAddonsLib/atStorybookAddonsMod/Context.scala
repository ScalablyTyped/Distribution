package typings
package atStorybookAddonsLib.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var kind: java.lang.String
  var story: java.lang.String
}

object Context {
  @scala.inline
  def apply(kind: java.lang.String, story: java.lang.String): Context = {
    val __obj = js.Dynamic.literal(kind = kind, story = story)
  
    __obj.asInstanceOf[Context]
  }
}

