package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storyMod {
  type ErrorProps = typings.storybookComponents.AnonError with typings.storybookComponents.storyMod.CommonProps
  type IFrameStoryProps = typings.storybookComponents.storyMod.CommonProps
  type InlineStoryProps = typings.storybookComponents.AnonStoryFn with typings.storybookComponents.storyMod.CommonProps
  type StoryProps = (typings.storybookComponents.storyMod.InlineStoryProps | typings.storybookComponents.storyMod.IFrameStoryProps | typings.storybookComponents.storyMod.ErrorProps) with typings.storybookComponents.AnonInline
}
