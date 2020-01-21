package typings.reactAriaModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AriaModal = typings.react.mod.Component[
    typings.reactAriaModal.mod.AriaModalProps with (typings.reactAriaModal.mod.RequiredAriaTypes[
      typings.std.Pick[
        typings.reactAriaModal.mod.AriaModalProps, 
        typings.reactAriaModal.reactAriaModalStrings.titleId
      ], 
      typings.std.Pick[
        typings.reactAriaModal.mod.AriaModalProps, 
        typings.reactAriaModal.reactAriaModalStrings.titleText
      ]
    ]), 
    js.Object, 
    js.Any
  ]
  type RequiredAriaTypes[T, U] = (typings.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with T with js.Any) | (typings.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with js.Any with U)
}
