package typings.reactFocusLock

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFocusLockComponents extends reactFocusLockProps {
  @scala.inline
  def AutoFocusInside: ComponentType[AutoFocusInsideProps] = js.constructorOf[typings.reactFocusLock.mod.AutoFocusInside].asInstanceOf[typings.react.mod.ComponentType[AutoFocusInsideProps]]
  @scala.inline
  def FreeFocusInside: ComponentType[FreeFocusInsideProps] = js.constructorOf[typings.reactFocusLock.mod.FreeFocusInside].asInstanceOf[typings.react.mod.ComponentType[FreeFocusInsideProps]]
  @scala.inline
  def InFocusGuard: ComponentType[InFocusGuardProps] = js.constructorOf[typings.reactFocusLock.mod.InFocusGuard].asInstanceOf[typings.react.mod.ComponentType[InFocusGuardProps]]
  @scala.inline
  def MoveFocusInside: ComponentType[MoveFocusInsideProps] = js.constructorOf[typings.reactFocusLock.mod.MoveFocusInside].asInstanceOf[typings.react.mod.ComponentType[MoveFocusInsideProps]]
  @scala.inline
  def ReactFocusLock: ComponentType[ReactFocusLockProps[ReactNode, Record[String, js.Any]]] = typings.reactFocusLock.mod.default.asInstanceOf[typings.react.mod.ComponentType[
  ReactFocusLockProps[typings.react.mod.ReactNode, typings.std.Record[java.lang.String, js.Any]]]]
  @scala.inline
  def Sidecar: ComponentType[js.Object] = typings.reactFocusLock.sidecarMod.default.asInstanceOf[typings.react.mod.ComponentType[js.Object]]
  @scala.inline
  def UI: ComponentType[
    (typings.reactFocusLock.interfacesMod.ReactFocusLockProps[ReactNode, Record[String, js.Any]]) with AnonSideCar
  ] = typings.reactFocusLock.uIMod.default.asInstanceOf[typings.react.mod.ComponentType[
  (typings.reactFocusLock.interfacesMod.ReactFocusLockProps[typings.react.mod.ReactNode, typings.std.Record[java.lang.String, js.Any]]) with typings.reactFocusLock.AnonSideCar]]
}

