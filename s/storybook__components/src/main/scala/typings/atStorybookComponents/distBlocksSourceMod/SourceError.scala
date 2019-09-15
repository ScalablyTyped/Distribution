package typings.atStorybookComponents.distBlocksSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SourceError extends js.Object

@JSImport("@storybook/components/dist/blocks/Source", "SourceError")
@js.native
object SourceError extends js.Object {
  @js.native
  sealed trait NO_STORY extends SourceError
  
  @js.native
  sealed trait SOURCE_UNAVAILABLE extends SourceError
  
  /* "There\\u2019s no story here." */ val NO_STORY: typings.atStorybookComponents.distBlocksSourceMod.SourceError.NO_STORY with String = js.native
  /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typings.atStorybookComponents.distBlocksSourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SourceError with String] = js.native
}

