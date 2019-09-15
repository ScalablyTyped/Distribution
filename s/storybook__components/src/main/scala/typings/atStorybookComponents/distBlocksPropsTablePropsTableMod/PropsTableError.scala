package typings.atStorybookComponents.distBlocksPropsTablePropsTableMod

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
  
  /* "No component found" */ val NO_COMPONENT: typings.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError.NO_COMPONENT with String = js.native
  /* "Props unsupported. See Props documentation for your framework." */ val PROPS_UNSUPPORTED: typings.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError.PROPS_UNSUPPORTED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PropsTableError with String] = js.native
}

