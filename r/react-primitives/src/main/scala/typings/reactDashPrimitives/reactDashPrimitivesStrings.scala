package typings.reactDashPrimitives

import typings.reactDashPrimitives.reactDashPrimitivesMod._PlatformOSType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashPrimitivesStrings {
  @js.native
  sealed trait PlatformStatic extends js.Object
  
  @js.native
  sealed trait disk extends js.Object
  
  @js.native
  sealed trait `disk/memory` extends js.Object
  
  @js.native
  sealed trait memory extends js.Object
  
  @js.native
  sealed trait sketch extends _PlatformOSType
  
  @js.native
  sealed trait vr extends _PlatformOSType
  
  @scala.inline
  def PlatformStatic: PlatformStatic = "PlatformStatic".asInstanceOf[PlatformStatic]
  @scala.inline
  def disk: disk = "disk".asInstanceOf[disk]
  @scala.inline
  def `disk/memory`: `disk/memory` = "disk/memory".asInstanceOf[`disk/memory`]
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  @scala.inline
  def sketch: sketch = "sketch".asInstanceOf[sketch]
  @scala.inline
  def vr: vr = "vr".asInstanceOf[vr]
}

