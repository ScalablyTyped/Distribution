package typings
package reactDashIconsLib.libEsmIconBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconTree extends js.Object {
  var attr: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var child: js.Array[IconTree]
  var tag: java.lang.String
}

object IconTree {
  @scala.inline
  def apply(
    attr: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    child: js.Array[IconTree],
    tag: java.lang.String
  ): IconTree = {
    val __obj = js.Dynamic.literal(attr = attr, child = child, tag = tag)
  
    __obj.asInstanceOf[IconTree]
  }
}

