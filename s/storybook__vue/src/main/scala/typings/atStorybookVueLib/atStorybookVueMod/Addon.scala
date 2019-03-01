package typings
package atStorybookVueLib.atStorybookVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addon
  extends /* addonName */ org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* storyName */ java.lang.String, /* storyFn */ StoryFunction, scala.Unit]
    ]

object Addon {
  @scala.inline
  def apply(
    StringDictionary: /* addonName */ org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* storyName */ java.lang.String, /* storyFn */ StoryFunction, scala.Unit]
    ] = null
  ): Addon = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Addon]
  }
}

