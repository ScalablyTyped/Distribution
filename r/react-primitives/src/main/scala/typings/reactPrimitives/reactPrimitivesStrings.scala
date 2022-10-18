package typings.reactPrimitives

import typings.reactPrimitives.mod._PlatformOSType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactPrimitivesStrings {
  
  @js.native
  sealed trait disk extends StObject
  inline def disk: disk = "disk".asInstanceOf[disk]
  
  @js.native
  sealed trait diskSlashmemory extends StObject
  inline def diskSlashmemory: diskSlashmemory = "disk/memory".asInstanceOf[diskSlashmemory]
  
  @js.native
  sealed trait memory extends StObject
  inline def memory: memory = "memory".asInstanceOf[memory]
  
  @js.native
  sealed trait sketch
    extends StObject
       with _PlatformOSType
  inline def sketch: sketch = "sketch".asInstanceOf[sketch]
  
  @js.native
  sealed trait vr
    extends StObject
       with _PlatformOSType
  inline def vr: vr = "vr".asInstanceOf[vr]
}
