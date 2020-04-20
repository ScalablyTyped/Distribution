package typings.reactFocusLock

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactFocusLock.mod.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFocusLockComponents extends reactFocusLockProps {
  @scala.inline
  def AutoFocusInside: ComponentType[AutoFocusInsideProps] = js.constructorOf[typings.reactFocusLock.mod.AutoFocusInside].asInstanceOf[ComponentType[AutoFocusInsideProps]]
  @scala.inline
  def FreeFocusInside: ComponentType[FreeFocusInsideProps] = js.constructorOf[typings.reactFocusLock.mod.FreeFocusInside].asInstanceOf[ComponentType[FreeFocusInsideProps]]
  @scala.inline
  def InFocusGuard: ComponentType[InFocusGuardProps] = js.constructorOf[typings.reactFocusLock.mod.InFocusGuard].asInstanceOf[ComponentType[InFocusGuardProps]]
  @scala.inline
  def MoveFocusInside: ComponentType[MoveFocusInsideProps] = js.constructorOf[typings.reactFocusLock.mod.MoveFocusInside].asInstanceOf[ComponentType[MoveFocusInsideProps]]
  @scala.inline
  def ReactFocusLock: ComponentType[ReactFocusLockProps[ReactNode, Record[String, js.Any]]] = default.asInstanceOf[ComponentType[ReactFocusLockProps[ReactNode, Record[String, js.Any]]]]
  @scala.inline
  def Sidecar: ComponentType[js.Object] = typings.reactFocusLock.sidecarMod.default.asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def UI: ComponentType[UIProps] = typings.reactFocusLock.uIMod.default.asInstanceOf[ComponentType[UIProps]]
}

