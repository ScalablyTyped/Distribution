package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Action extends StObject
/**
  * Actions represent the type of change to a location value.
  *
  * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#action
  */
@JSImport("@storybook/router", "Action")
@js.native
object Action extends StObject {
  
  /**
    * A POP indicates a change to an arbitrary index in the history stack, such
    * as a back or forward navigation. It does not describe the direction of the
    * navigation, only that the current index changed.
    *
    * Note: This is the default action for newly created history objects.
    */
  @js.native
  sealed trait Pop
    extends StObject
       with Action
  
  /**
    * A PUSH indicates a new entry being added to the history stack, such as when
    * a link is clicked and a new page loads. When this happens, all subsequent
    * entries in the stack are lost.
    */
  @js.native
  sealed trait Push
    extends StObject
       with Action
  
  /**
    * A REPLACE indicates the entry at the current index in the history stack
    * being replaced by a new one.
    */
  @js.native
  sealed trait Replace
    extends StObject
       with Action
}
