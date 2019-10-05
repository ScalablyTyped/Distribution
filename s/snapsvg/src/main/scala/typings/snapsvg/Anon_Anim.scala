package typings.snapsvg

import typings.mina.mina.AnimationDescriptor
import typings.snapsvg.snapsvgMod.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Anim extends js.Object {
  var anim: Animation = js.native
  var curStatus: Double = js.native
  var mina: AnimationDescriptor = js.native
  def status(): Double = js.native
  def status(n: Double): Double = js.native
  def stop(): Unit = js.native
}

