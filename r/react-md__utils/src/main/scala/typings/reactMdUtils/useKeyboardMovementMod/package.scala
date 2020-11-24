package typings.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useKeyboardMovementMod {
  
  type ItemRef[E /* <: typings.std.HTMLElement */] = typings.react.mod.MutableRefObject[E | scala.Null]
  
  type ItemRefList[E /* <: typings.std.HTMLElement */] = js.Array[typings.reactMdUtils.useKeyboardMovementMod.ItemRef[E]]
  
  type KeyboardMovementProviders[CE /* <: typings.std.HTMLElement */, IE /* <: typings.std.HTMLElement */] = js.Tuple2[
    /**
    * A list of mutable ref objects that must be applied to each focusable item
    * within the list. This list will automatically be generated based on the
    * number of items provided to the `useKeyboardMovement` hook
    */
  typings.reactMdUtils.useKeyboardMovementMod.ItemRefList[IE], 
    /**
    * The keydown event handler to apply to a "container" element that has custom
    * keyboard focus.
    */
  typings.reactMdUtils.useKeyboardMovementMod.MovementHandler[CE]
  ]
  
  type MovementHandler[E /* <: typings.std.HTMLElement */] = typings.react.mod.KeyboardEventHandler[E]
}
