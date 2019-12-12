package typings.atStorybookComponents.distBlocksPropsTablePropsTableMod

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError.NO_COMPONENT
import typings.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError.PROPS_UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropsTableError extends js.Object

@JSImport("@storybook/components/dist/blocks/PropsTable/PropsTable", "PropsTableError")
@js.native
object PropsTableError extends js.Object {
  @js.native
  sealed trait NO_COMPONENT extends PropsTableError
  
  @js.native
  sealed trait PROPS_UNSUPPORTED extends PropsTableError
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PropsTableError with String] = js.native
  /* "No component found" */ @js.native
  object NO_COMPONENT extends TopLevel[NO_COMPONENT with String]
  
  /* "Props unsupported. See Props documentation for your framework." */ @js.native
  object PROPS_UNSUPPORTED extends TopLevel[PROPS_UNSUPPORTED with String]
  
}

