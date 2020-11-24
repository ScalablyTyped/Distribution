package typings.storybookComponents.argsTableArgsTableMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArgsTableError extends js.Object
@JSImport("@storybook/components/dist/blocks/ArgsTable/ArgsTable", "ArgsTableError")
@js.native
object ArgsTableError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArgsTableError with String] = js.native
  
  @js.native
  sealed trait ARGS_UNSUPPORTED extends ArgsTableError
  /* "Args unsupported. See Args documentation for your framework." */ @js.native
  object ARGS_UNSUPPORTED extends TopLevel[ARGS_UNSUPPORTED with String]
  
  @js.native
  sealed trait NO_COMPONENT extends ArgsTableError
  /* "No component found." */ @js.native
  object NO_COMPONENT extends TopLevel[NO_COMPONENT with String]
}
