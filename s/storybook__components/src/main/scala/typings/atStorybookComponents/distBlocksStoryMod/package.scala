package typings.atStorybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distBlocksStoryMod {
  import typings.atStorybookComponents.Anon_Error
  import typings.atStorybookComponents.Anon_Inline
  import typings.atStorybookComponents.Anon_StoryFn

  type ErrorProps = Anon_Error with CommonProps
  type IFrameStoryProps = CommonProps
  type InlineStoryProps = Anon_StoryFn with CommonProps
  type StoryProps = (InlineStoryProps | IFrameStoryProps | ErrorProps) with Anon_Inline
}
