package typings.reactAriaModal

import typings.react.mod.ComponentType
import typings.reactAriaModal.mod.AriaModalProps
import typings.reactAriaModal.mod.RequiredAriaTypes
import typings.reactAriaModal.reactAriaModalStrings.titleId
import typings.reactAriaModal.reactAriaModalStrings.titleText
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactAriaModalComponents extends reactAriaModalProps {
  @scala.inline
  def ReactAriaModal: ComponentType[
    AriaModalProps with (RequiredAriaTypes[Pick[AriaModalProps, titleId], Pick[AriaModalProps, titleText]])
  ] = js.constructorOf[typings.reactAriaModal.mod.default].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactAriaModal.mod.AriaModalProps with (typings.reactAriaModal.mod.RequiredAriaTypes[
    typings.std.Pick[
      typings.reactAriaModal.mod.AriaModalProps, 
      typings.reactAriaModal.reactAriaModalStrings.titleId
    ], 
    typings.std.Pick[
      typings.reactAriaModal.mod.AriaModalProps, 
      typings.reactAriaModal.reactAriaModalStrings.titleText
    ]
  ])]]
}

