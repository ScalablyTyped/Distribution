package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface describes the capabilities of a VRDisplay — its features can be used to perform VR device capability tests, for example can it return position information. */
trait VRDisplayCapabilities extends js.Object {
  val canPresent: scala.Boolean
  val hasExternalDisplay: scala.Boolean
  val hasOrientation: scala.Boolean
  val hasPosition: scala.Boolean
  val maxLayers: Double
}

@JSGlobal("VRDisplayCapabilities")
@js.native
object VRDisplayCapabilities extends Instantiable0[VRDisplayCapabilities]

