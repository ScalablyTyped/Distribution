package typings.reactAriaModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AriaModal = typings.react.mod.Component[
    typings.reactAriaModal.mod.AriaModalProps with (typings.reactAriaModal.mod.RequiredAriaTypes[
      typings.reactAriaModal.PickAriaModalPropstitleId, 
      typings.reactAriaModal.PickAriaModalPropstitleTe
    ]), 
    js.Object, 
    js.Any
  ]
  type RequiredAriaTypes[T, U] = (typings.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with org.scalablytyped.runtime.TopLevel[T] with org.scalablytyped.runtime.TopLevel[js.Any]) | (typings.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with org.scalablytyped.runtime.TopLevel[js.Any] with org.scalablytyped.runtime.TopLevel[U])
}
