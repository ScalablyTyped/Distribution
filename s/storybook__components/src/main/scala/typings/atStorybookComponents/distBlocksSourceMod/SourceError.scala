package typings.atStorybookComponents.distBlocksSourceMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SourceError with String] = js.native
  /* "There\\u2019s no story here." */ @js.native
  object NO_STORY extends TopLevel[NO_STORY with String]
  
  /* "Oh no! The source is not available." */ @js.native
  object SOURCE_UNAVAILABLE extends TopLevel[SOURCE_UNAVAILABLE with String]
  
}

