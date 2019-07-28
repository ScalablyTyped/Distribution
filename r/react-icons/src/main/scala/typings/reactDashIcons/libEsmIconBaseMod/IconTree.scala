package typings.reactDashIcons.libEsmIconBaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconTree extends js.Object {
  var attr: StringDictionary[String]
  var child: js.Array[IconTree]
  var tag: String
}

object IconTree {
  @scala.inline
  def apply(attr: StringDictionary[String], child: js.Array[IconTree], tag: String): IconTree = {
    val __obj = js.Dynamic.literal(attr = attr, child = child, tag = tag)
  
    __obj.asInstanceOf[IconTree]
  }
}

