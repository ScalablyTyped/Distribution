package typings.reactPopper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Modifier[Name, Options /* <: js.Object */] = (typings.std.Partial[typings.popperjsCore.typesMod.Modifier[Name, Options]]) | typings.reactPopper.mod.StrictModifier[Name]
  
  type RefHandler = js.Function1[/* ref */ typings.std.HTMLElement | scala.Null, scala.Unit]
  
  /* Inlined react-popper.react-popper.UnionWhere<@popperjs/core.@popperjs/core.StrictModifiers, {  name :Name | undefined}> */
  type StrictModifier[Name /* <: typings.reactPopper.mod.StrictModifierNames */] = typings.reactPopper.reactPopperStrings.name
  
  type StrictModifierNames = typings.std.NonNullable[
    js.UndefOr[
      typings.reactPopper.reactPopperStrings.offset | typings.reactPopper.reactPopperStrings.applyStyles | typings.reactPopper.reactPopperStrings.arrow | typings.reactPopper.reactPopperStrings.hide | typings.reactPopper.reactPopperStrings.computeStyles | typings.reactPopper.reactPopperStrings.eventListeners | typings.reactPopper.reactPopperStrings.flip | typings.reactPopper.reactPopperStrings.preventOverflow | typings.reactPopper.reactPopperStrings.popperOffsets
    ]
  ]
  
  // Utility type
  type UnionWhere[U, M] = U
}
