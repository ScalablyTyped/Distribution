package typings.reactNativeShare

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeShareComponents extends reactNativeShareProps {
  @scala.inline
  def Button: ComponentType[ButtonProps] = typings.reactNativeShare.buttonMod.default.asInstanceOf[typings.react.mod.ComponentType[ButtonProps]]
  @scala.inline
  def Overlay: ComponentType[OverlayProps] = js.constructorOf[typings.reactNativeShare.overlayMod.default].asInstanceOf[typings.react.mod.ComponentType[OverlayProps]]
  @scala.inline
  def ShareSheet: ComponentType[ShareSheetProps] = js.constructorOf[typings.reactNativeShare.mod.ShareSheet].asInstanceOf[typings.react.mod.ComponentType[ShareSheetProps]]
  @scala.inline
  def Sheet: ComponentType[SheetProps] = js.constructorOf[typings.reactNativeShare.sheetMod.default].asInstanceOf[typings.react.mod.ComponentType[SheetProps]]
}

