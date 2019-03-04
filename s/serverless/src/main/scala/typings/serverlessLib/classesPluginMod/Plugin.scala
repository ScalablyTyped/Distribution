package typings
package serverlessLib.classesPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var hooks: org.scalablytyped.runtime.StringDictionary[js.Promise[_]]
}

object Plugin {
  @scala.inline
  def apply(hooks: org.scalablytyped.runtime.StringDictionary[js.Promise[_]]): Plugin = {
    val __obj = js.Dynamic.literal(hooks = hooks)
  
    __obj.asInstanceOf[Plugin]
  }
}

