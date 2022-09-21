package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceError extends StObject
@JSImport("@storybook/components", "SourceError")
@js.native
object SourceError extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SourceError & String] = js.native
  
  @js.native
  sealed trait NO_STORY
    extends StObject
       with SourceError
  /* "There\\u2019s no story here." */ val NO_STORY: typings.storybookComponents.mod.SourceError.NO_STORY & String = js.native
  
  @js.native
  sealed trait SOURCE_UNAVAILABLE
    extends StObject
       with SourceError
  /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typings.storybookComponents.mod.SourceError.SOURCE_UNAVAILABLE & String = js.native
}
