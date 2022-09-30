package typings.reactThreeFiber.anon

import typings.reactThreeFiber.storeMod.Size
import typings.reactThreeFiber.utilsMod.Camera
import typings.std.Parameters
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-three/fiber.@react-three/fiber/dist/declarations/src/core/store.Viewport & {getCurrentViewport (camera : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.Camera | undefined, target : three.three.Vector3 | std.Parameters<three.three.Vector3['set']> | undefined, size : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/store.Size | undefined): std.Omit<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/store.Viewport, 'dpr' | 'initialDpr'>} */
@js.native
trait ViewportgetCurrentViewpor extends StObject {
  
  var aspect: Double = js.native
  
  var distance: Double = js.native
  
  var dpr: Double = js.native
  
  var factor: Double = js.native
  
  def getCurrentViewport(): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Unit, target: Unit, size: Size): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Unit, target: Parameters[FnCall]): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Unit, target: Parameters[FnCall], size: Size): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Unit, target: Vector3): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Unit, target: Vector3, size: Size): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Camera): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Camera, target: Unit, size: Size): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Camera, target: Parameters[FnCall]): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Camera, target: Parameters[FnCall], size: Size): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Camera, target: Vector3): OmitViewportdprinitialDpr = js.native
  def getCurrentViewport(camera: Camera, target: Vector3, size: Size): OmitViewportdprinitialDpr = js.native
  
  var height: Double = js.native
  
  var initialDpr: Double = js.native
  
  var left: Double = js.native
  
  var top: Double = js.native
  
  var updateStyle: js.UndefOr[Boolean] = js.native
  
  var width: Double = js.native
}
