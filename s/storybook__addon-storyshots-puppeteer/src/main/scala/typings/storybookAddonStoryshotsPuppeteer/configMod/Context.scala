package typings.storybookAddonStoryshotsPuppeteer.configMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var kind: String
  var parameters: StringDictionary[js.Any]
  var story: String
}

object Context {
  @scala.inline
  def apply(kind: String, parameters: StringDictionary[js.Any], story: String): Context = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

