package typings.serverless.classesPluginMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var hooks: StringDictionary[js.Promise[_]]
}

object Plugin {
  @scala.inline
  def apply(hooks: StringDictionary[js.Promise[_]]): Plugin = {
    val __obj = js.Dynamic.literal(hooks = hooks)
  
    __obj.asInstanceOf[Plugin]
  }
}

