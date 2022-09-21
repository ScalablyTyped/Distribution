package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArgsTableError extends StObject
@JSImport("@storybook/components", "ArgsTableError")
@js.native
object ArgsTableError extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArgsTableError & String] = js.native
  
  @js.native
  sealed trait ARGS_UNSUPPORTED
    extends StObject
       with ArgsTableError
  /* "Args unsupported. See Args documentation for your framework." */ val ARGS_UNSUPPORTED: typings.storybookComponents.mod.ArgsTableError.ARGS_UNSUPPORTED & String = js.native
  
  @js.native
  sealed trait NO_COMPONENT
    extends StObject
       with ArgsTableError
  /* "No component found." */ val NO_COMPONENT: typings.storybookComponents.mod.ArgsTableError.NO_COMPONENT & String = js.native
}
